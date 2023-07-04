package com.ability.administracion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;

import com.ability.genero.server.model.auditoria;
import com.ability.genero.server.model.generoUsuario;
import com.ability.genero.server.service.auditoriaLocalServiceUtil;
import com.ability.modelo.consultas;
import com.ability.modelo.modelo;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.UserLocalServiceUtil;


public enum exporterUtil {
    INSTANCE;
    
    public Workbook exportAuditoriaGenero(String ini , String fin, String tabla) throws SystemException, ParseException {
        HSSFWorkbook wb = new HSSFWorkbook();
        Sheet sheet1 = wb.createSheet("Auditoria Perspectivas de Genero");
        
        CellStyle styleC = wb.createCellStyle();
        Font font = wb.createFont();
        font.setBoldweight((short)700);
        styleC.setFont(font);
        
        CellStyle styleCc = wb.createCellStyle();
        styleCc.setBorderBottom(HSSFCellStyle.BORDER_THIN);
        styleCc.setBorderTop(HSSFCellStyle.BORDER_THIN);
        styleCc.setBorderRight(HSSFCellStyle.BORDER_THIN);
        styleCc.setBorderLeft(HSSFCellStyle.BORDER_THIN);
    	
    	String fechaInicial = "";
    	String fechaFinal = "";
    	
    	fechaInicial = ini+" 00:00";
    	fechaFinal =  fin+" 23:59";
    	
    	SimpleDateFormat SIMPLE_DATE_FORMAT=new SimpleDateFormat("dd-MM-yyyy HH:mm");
    	List<auditoria> audi = new ArrayList<auditoria>();
    	Date fInicial, fFinal;
    	try{
    		fInicial=SIMPLE_DATE_FORMAT.parse(fechaInicial);
    	}catch(Exception e){
    		fInicial=SIMPLE_DATE_FORMAT.parse("01-01-1900 00:00");
    	}
    	try{
    		fFinal=SIMPLE_DATE_FORMAT.parse(fechaFinal);
    	}catch(Exception e){
    		fFinal=SIMPLE_DATE_FORMAT.parse("31-12-2050 23:59");
    	}

    	
    	for(auditoria iterator: auditoriaLocalServiceUtil.getauditorias(-1, -1)){
    		if(tabla==null){
    			if(iterator.getFecha().after(fInicial) && iterator.getFecha().before(fFinal)){
    				audi.add(iterator);
    			}
    		}else{
    			if(iterator.getFecha().after(fInicial) && iterator.getFecha().before(fFinal) && iterator.getTabla().equals(tabla)){
    				audi.add(iterator);
    			}
    		}
    	}
        
        this.addHeadersEstadisticosGenero((Object)sheet1,fInicial,fFinal,tabla,styleC);
        this.generateTableRecordsEstadisticosGeneroCat((Object)sheet1, audi,styleCc);
        for (int columnNumber = 0; columnNumber <= 5; ++columnNumber) {
            sheet1.autoSizeColumn(columnNumber);
        }
        
        return wb;
    }
    
    private void addHeadersEstadisticosGenero(Object element, Date ini , Date fin, String tabla, CellStyle sty) {
        if (element instanceof Sheet) {
        	SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        	
            Row headerRow = ((Sheet)element).createRow(0);
            headerRow.createCell(0).setCellValue((RichTextString)new HSSFRichTextString("Filtros Utilizados"));
            ((Sheet) element).addMergedRegion(new CellRangeAddress(0, 0, 0, 5));
            headerRow.getCell(0).setCellStyle(sty);
            
            String fi ="";
            String ff="";
            if(!formato.format(ini).equals("1900-01-01")){
            	fi=formato.format(ini);
            }
            if(!formato.format(fin).equals("2050-12-31")){
            	ff=formato.format(fin);
            }
            
            headerRow = ((Sheet)element).createRow(1);
            headerRow.createCell(0).setCellValue((RichTextString)new HSSFRichTextString("Fecha Inicio: "+fi));
            ((Sheet) element).addMergedRegion(new CellRangeAddress(1, 1, 0, 5));
            
            headerRow = ((Sheet)element).createRow(2);
            headerRow.createCell(0).setCellValue((RichTextString)new HSSFRichTextString("Fecha Final: "+ff));
            ((Sheet) element).addMergedRegion(new CellRangeAddress(2, 2, 0, 5));
            
            headerRow = ((Sheet)element).createRow(3);
            headerRow.createCell(0).setCellValue((RichTextString)new HSSFRichTextString("Tabla: "+tabla));
            ((Sheet) element).addMergedRegion(new CellRangeAddress(3, 3, 0, 5));
            
        }
    }
    
    private void generateTableRecordsEstadisticosGeneroCat(Object element, List<auditoria> audi, CellStyle sty) {
        if (element instanceof Sheet) {
        	SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        	
        	int i = 0;
        	
            Sheet sheet = (Sheet)element;
            
            Row headerRow = ((Sheet)element).createRow(5);
            headerRow.createCell(0).setCellValue((RichTextString)new HSSFRichTextString("Id"));
            headerRow.createCell(1).setCellValue((RichTextString)new HSSFRichTextString("Fecha"));
            headerRow.createCell(2).setCellValue((RichTextString)new HSSFRichTextString("Acción"));
            headerRow.createCell(3).setCellValue((RichTextString)new HSSFRichTextString("Tabla"));
            headerRow.createCell(4).setCellValue((RichTextString)new HSSFRichTextString("Log"));
            headerRow.createCell(5).setCellValue((RichTextString)new HSSFRichTextString("Usuario"));
            headerRow.getCell(0).setCellStyle(sty);
            headerRow.getCell(1).setCellStyle(sty);
            headerRow.getCell(2).setCellStyle(sty);
            headerRow.getCell(3).setCellStyle(sty);
            headerRow.getCell(4).setCellStyle(sty);
            headerRow.getCell(5).setCellStyle(sty);
            
            for (auditoria a : audi) {
                Row contentRow = sheet.createRow(i + 6);
                contentRow.createCell(0).setCellValue((RichTextString)new HSSFRichTextString(String.valueOf(a.getId())));
                contentRow.createCell(1).setCellValue((RichTextString)new HSSFRichTextString(formato.format(a.getFecha())));
                contentRow.createCell(2).setCellValue((RichTextString)new HSSFRichTextString(a.getEvento()));
                contentRow.createCell(3).setCellValue((RichTextString)new HSSFRichTextString(a.getTabla()));
                contentRow.createCell(4).setCellValue((RichTextString)new HSSFRichTextString(a.getLogs()));
                String correo = "";
				try{
					correo = UserLocalServiceUtil.getUserById(a.getIdUser()).getEmailAddress();
				}catch(Exception e){
					correo = "Usuario eliminado del portal";
				}
                contentRow.createCell(5).setCellValue((RichTextString)new HSSFRichTextString(correo));
                contentRow.getCell(0).setCellStyle(sty);
                contentRow.getCell(1).setCellStyle(sty);
                contentRow.getCell(2).setCellStyle(sty);
                contentRow.getCell(3).setCellStyle(sty);
                contentRow.getCell(4).setCellStyle(sty);
                contentRow.getCell(5).setCellStyle(sty);
                i++;
            }
        }
    }
    
    public Workbook exportUsuariosGenero(List<generoUsuario> usuarios) throws SystemException, ParseException {
        HSSFWorkbook wb = new HSSFWorkbook();
        Sheet sheet1 = wb.createSheet("Usuarios Perspectivas de Genero");
        
        CellStyle styleC = wb.createCellStyle();
        Font font = wb.createFont();
        font.setBoldweight((short)700);
        styleC.setFont(font);
        
        CellStyle styleCc = wb.createCellStyle();
        styleCc.setBorderBottom(HSSFCellStyle.BORDER_THIN);
        styleCc.setBorderTop(HSSFCellStyle.BORDER_THIN);
        styleCc.setBorderRight(HSSFCellStyle.BORDER_THIN);
        styleCc.setBorderLeft(HSSFCellStyle.BORDER_THIN);

        this.generateTableRecordsUsuariosGeneroCat((Object)sheet1, usuarios,styleCc);
        for (int columnNumber = 0; columnNumber <= 6; ++columnNumber) {
            sheet1.autoSizeColumn(columnNumber);
        }
        
        return wb;
    }
    
    private void generateTableRecordsUsuariosGeneroCat(Object element, List<generoUsuario> usu, CellStyle sty) {
        if (element instanceof Sheet) {        	
        	int i = 0;
        	consultas consul = new consultas();
        	List<modelo> entiGEnero = consul.getEntidades();
        	List<modelo> ciudaGenero = consul.getCiudades();
        	List<modelo> especiaGenero = consul.getEspecialidades();
        	List<modelo> despachosGenero = consul.getDespachosTodos();
            Sheet sheet = (Sheet)element;
            
            Row headerRow = ((Sheet)element).createRow(0);
            headerRow.createCell(0).setCellValue((RichTextString)new HSSFRichTextString("Nombre"));
            headerRow.createCell(1).setCellValue((RichTextString)new HSSFRichTextString("Correo electrónico"));
            headerRow.createCell(2).setCellValue((RichTextString)new HSSFRichTextString("Ciudad"));
            headerRow.createCell(3).setCellValue((RichTextString)new HSSFRichTextString("Entidad"));
            headerRow.createCell(4).setCellValue((RichTextString)new HSSFRichTextString("Especilaidad"));
            headerRow.createCell(5).setCellValue((RichTextString)new HSSFRichTextString("Nombre Despacho"));
            headerRow.createCell(6).setCellValue((RichTextString)new HSSFRichTextString("Codigo Despacho"));
            headerRow.getCell(0).setCellStyle(sty);
            headerRow.getCell(1).setCellStyle(sty);
            headerRow.getCell(2).setCellStyle(sty);
            headerRow.getCell(3).setCellStyle(sty);
            headerRow.getCell(4).setCellStyle(sty);
            headerRow.getCell(5).setCellStyle(sty);
            headerRow.getCell(6).setCellStyle(sty);
            
            for (generoUsuario a : usu) {
                Row contentRow = sheet.createRow(i + 1);
                String nom = "Usuario eliminado del portal"; 
				String correo = "Usuario eliminado del portal"; 
				try{
					nom = UserLocalServiceUtil.getUser(Long.parseLong(a.getUserId())).getFirstName()+" "+UserLocalServiceUtil.getUser(Long.parseLong(a.getUserId())).getLastName(); 
					correo = UserLocalServiceUtil.getUser(Long.parseLong(a.getUserId())).getEmailAddress();
				}catch(Exception e){}		

				String ciudad="",entidad="",especialidad="",despacho="";
		       for(modelo c : ciudaGenero){
		    	   if(a.getDespacho().substring(0, 5).equalsIgnoreCase(c.getId()))
		    		   ciudad=c.getNombre();
		       }
		       for(modelo e : entiGEnero){
		    	   if(e.getId().length()==1)
		    		   e.setId("0"+e.getId());
		    	   if(a.getDespacho().substring(5, 7).equalsIgnoreCase(e.getId()))
		    		   entidad=e.getNombre();
		       }
		       for(modelo e : especiaGenero){
		    	   if(e.getId().length()==1)
		    		   e.setId("0"+e.getId());
		    	   if(a.getDespacho().substring(7, 9).equalsIgnoreCase(e.getId()))
		    		   especialidad=e.getNombre();
		       }
		       for(modelo d : despachosGenero){
		    	   if(a.getDespacho().equalsIgnoreCase(d.getId()))
		    		   despacho=d.getNombre();
		       }
                contentRow.createCell(0).setCellValue((RichTextString)new HSSFRichTextString(nom));
                contentRow.createCell(1).setCellValue((RichTextString)new HSSFRichTextString(correo));
                contentRow.createCell(2).setCellValue((RichTextString)new HSSFRichTextString(ciudad));
                contentRow.createCell(3).setCellValue((RichTextString)new HSSFRichTextString(entidad));
                contentRow.createCell(4).setCellValue((RichTextString)new HSSFRichTextString(especialidad));
                contentRow.createCell(5).setCellValue((RichTextString)new HSSFRichTextString(despacho));
                contentRow.createCell(6).setCellValue((RichTextString)new HSSFRichTextString(a.getDespacho()));
                contentRow.getCell(0).setCellStyle(sty);
                contentRow.getCell(1).setCellStyle(sty);
                contentRow.getCell(2).setCellStyle(sty);
                contentRow.getCell(3).setCellStyle(sty);
                contentRow.getCell(4).setCellStyle(sty);
                contentRow.getCell(5).setCellStyle(sty);
                contentRow.getCell(6).setCellStyle(sty);
                i++;
            }
        }
    }
    
}
