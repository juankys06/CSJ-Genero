package com.ability.genero;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.naming.InitialContext;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.portlet.PortletFileUpload;
import org.apache.commons.io.IOUtils;


import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimpleXlsxReportConfiguration;

import com.ability.genero.server.model.auditoria;
import com.ability.genero.server.model.casoLV;
import com.ability.genero.server.model.subcategoria;
import com.ability.genero.server.service.auditoriaLocalServiceUtil;
import com.ability.genero.server.service.casoLVLocalServiceUtil;
import com.ability.genero.server.service.categoriaLocalServiceUtil;
import com.ability.genero.server.service.subcategoriaLocalServiceUtil;
import com.ability.modelo.consultas;
import com.ability.modelo.modelo;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.liferay.util.json.JSONFactoryUtil;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLBoundOperation.ANONYMOUS;

/**
 * Portlet implementation class genero
 */
public class genero extends MVCPortlet {
	
	@Override
	public void serveResource(ResourceRequest resourceRequest,ResourceResponse resourceResponse) throws IOException,PortletException {
		HttpServletRequest request = PortalUtil.getOriginalServletRequest(PortalUtil.getHttpServletRequest(resourceRequest));
		HttpServletResponse response = PortalUtil.getHttpServletResponse(resourceResponse);
		
		int tipoSolicitud = ParamUtil.getInteger(request, "tipoSolicitud");
		int tipoSol = ParamUtil.getInteger(resourceRequest, "tipoSolicitud");
		String tipo = ParamUtil.getString(resourceRequest, "tipo");
		
		if(tipoSolicitud==1){
			String respuestas = ParamUtil.getString(request, "respuestas");
			String[] respuesta = respuestas.split("-");
			int si=0,no=0;
			JSONArray arra = JSONFactoryUtil.createJSONArray();
			for(String r : respuesta){
				String[] resp = r.split("/");
				if(resp[0].equalsIgnoreCase("1")){
					si++;
				}
				if(resp[0].equalsIgnoreCase("2")){
					no++;
				}
			}
			JSONObject json = JSONFactoryUtil.createJSONObject();
			json.put("si", si);
			json.put("no", no);
			arra.put(json);
			response.getWriter().println(arra.toString());
		}
		if(tipoSolicitud==2){
			int idCat = ParamUtil.getInteger(request, "idCategoria");
			try {
				List<subcategoria> subCategorias = subcategoriaLocalServiceUtil.findBysubCatXCat(idCat);
				JSONArray arra = JSONFactoryUtil.createJSONArray();
				for(subcategoria sc : subCategorias){
					JSONObject json = JSONFactoryUtil.createJSONObject();
					json.put("id", sc.getId());
					json.put("subCat", sc.getSubcategoria());
					arra.put(json);
				}
				response.getWriter().println(arra.toString());
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(tipoSolicitud == 4){
			System.out.println("entro a 4");
			String despachoR = ParamUtil.getString(request, "despachoR");
			String anhioR = ParamUtil.getString(request, "anhioR");
			String fechaI = ParamUtil.getString(request, "fechaI");
			String fechaF = ParamUtil.getString(request, "fechaF");
			String ciudad = ParamUtil.getString(request, "ciudad");
			String categoria = ParamUtil.getString(request, "categoria");
			String subcategoria = ParamUtil.getString(request, "subcategoria");
			String distrito = ParamUtil.getString(request, "distrito");
			String nombre = ParamUtil.getString(request, "nombre");
			String comite = ParamUtil.getString(request, "comite");
			
			if(anhioR.equalsIgnoreCase("") || anhioR.equalsIgnoreCase("todos"))
				anhioR="-1";			
			if(fechaI.equalsIgnoreCase(""))
				fechaI="-1";
			if(fechaF.equalsIgnoreCase(""))
				fechaF = "-1";
			if(ciudad.equalsIgnoreCase("") || ciudad.equalsIgnoreCase("todas"))
				ciudad = "-1";
			if(categoria.equalsIgnoreCase("") || categoria.equalsIgnoreCase("todas"))
				categoria = "-1";
			if(subcategoria.equalsIgnoreCase("") || subcategoria.equalsIgnoreCase("todas"))
				subcategoria = "-1";
			if(distrito.equalsIgnoreCase("") || distrito.equalsIgnoreCase("todos"))
				distrito = "-1";
			if(nombre.equalsIgnoreCase(""))
				nombre = "-1";
			if(comite.equalsIgnoreCase("-1")){
				List<modelo> dis = consultas.getDistritos();
				for(modelo d : dis){
					comite+=d.getId()+",";
				}
				comite = comite.substring(0, comite.length()-1);
			}
			
			
			
			File archivoPDF = new File("C:\\reportes\\reporteGenero.pdf");
			archivoPDF=reporteCasos(anhioR, fechaI, fechaF, ciudad, categoria, subcategoria, distrito, nombre, despachoR, archivoPDF, comite);
		}
		if(tipoSolicitud == 5){
			System.out.println("entro a 5");
			String despachoR = ParamUtil.getString(request, "despachoR");
			String anhioR = ParamUtil.getString(request, "anhioR");
			String fechaI = ParamUtil.getString(request, "fechaI");
			String fechaF = ParamUtil.getString(request, "fechaF");
			String ciudad = ParamUtil.getString(request, "ciudad");
			String categoria = ParamUtil.getString(request, "categoria");
			String subcategoria = ParamUtil.getString(request, "subcategoria");
			String distrito = ParamUtil.getString(request, "distrito");
			String nombre = ParamUtil.getString(request, "nombre");
			String numeroCasos = ParamUtil.getString(request, "numeroCasos");
			String completa = ParamUtil.getString(request, "completa");
			String parcial = ParamUtil.getString(request, "parcial");
			String noCompleta = ParamUtil.getString(request, "noCompleta");
			String cantidadAplican = ParamUtil.getString(request, "cantidadAplican");
			String cantidadNoAplican = ParamUtil.getString(request, "cantidadNoAplican");
			String cantidadTotal = ParamUtil.getString(request, "cantidadTotal");
			String respuestas1 = ParamUtil.getString(request, "respuestas1");
			String respuestas2 = ParamUtil.getString(request, "respuestas2");
			String categorias1 = ParamUtil.getString(request, "categorias1");
			
			if(anhioR.equalsIgnoreCase("") || anhioR.equalsIgnoreCase("todos"))
				anhioR="-1";			
			if(fechaI.equalsIgnoreCase(""))
				fechaI="-1";
			if(fechaF.equalsIgnoreCase(""))
				fechaF = "-1";
			if(ciudad.equalsIgnoreCase("") || ciudad.equalsIgnoreCase("todas"))
				ciudad = "-1";
			if(categoria.equalsIgnoreCase("") || categoria.equalsIgnoreCase("todas"))
				categoria = "-1";
			if(subcategoria.equalsIgnoreCase("") || subcategoria.equalsIgnoreCase("todas"))
				subcategoria = "-1";
			if(distrito.equalsIgnoreCase("") || distrito.equalsIgnoreCase("todos"))
				distrito = "-1";
			if(nombre.equalsIgnoreCase(""))
				nombre = "-1";
			
			File archivoPDF = new File("C:\\reportes\\reporteGenero.pdf");
			archivoPDF = reporteEstadisticos(anhioR, fechaI, fechaF, ciudad, categoria, subcategoria, distrito, nombre, despachoR, archivoPDF, numeroCasos, completa, parcial, noCompleta, cantidadAplican, cantidadNoAplican, cantidadTotal, respuestas1, respuestas2, categorias1);
		}
		if(tipoSolicitud == 6){
			System.out.println("entro a 6");
			String despachoR = ParamUtil.getString(request, "despachoR");
			String anhioR = ParamUtil.getString(request, "anhioR");
			String fechaI = ParamUtil.getString(request, "fechaI");
			String fechaF = ParamUtil.getString(request, "fechaF");
			String ciudad = ParamUtil.getString(request, "ciudad");
			String categoria = ParamUtil.getString(request, "categoria");
			String subcategoria = ParamUtil.getString(request, "subcategoria");
			String distrito = ParamUtil.getString(request, "distrito");
			String nombre = ParamUtil.getString(request, "nombre");
			String comite = ParamUtil.getString(request, "comite");
			
			if(anhioR.equalsIgnoreCase("") || anhioR.equalsIgnoreCase("todos"))
				anhioR="-1";			
			if(fechaI.equalsIgnoreCase(""))
				fechaI="-1";
			if(fechaF.equalsIgnoreCase(""))
				fechaF = "-1";
			if(ciudad.equalsIgnoreCase("") || ciudad.equalsIgnoreCase("todas"))
				ciudad = "-1";
			if(categoria.equalsIgnoreCase("") || categoria.equalsIgnoreCase("todas"))
				categoria = "-1";
			if(subcategoria.equalsIgnoreCase("") || subcategoria.equalsIgnoreCase("todas"))
				subcategoria = "-1";
			if(distrito.equalsIgnoreCase("") || distrito.equalsIgnoreCase("todos"))
				distrito = "-1";
			if(nombre.equalsIgnoreCase(""))
				nombre = "-1";
			if(comite.equalsIgnoreCase("-1")){
				List<modelo> dis = consultas.getDistritos();
				for(modelo d : dis){
					comite+=d.getId()+",";
				}
				comite = comite.substring(0, comite.length()-1);
			}
			
			
			File archivoPDF = new File("C:\\reportes\\genero.xlsx");
			archivoPDF.createNewFile();
			archivoPDF=reporteCasosExcel(anhioR, fechaI, fechaF, ciudad, categoria, subcategoria, distrito, nombre, despachoR, archivoPDF, comite);
			
			
		}
		if(tipoSolicitud == 7){
			System.out.println("entro a 7");
			String despachoR = ParamUtil.getString(request, "despachoR");
			String anhioR = ParamUtil.getString(request, "anhioR");
			String fechaI = ParamUtil.getString(request, "fechaI");
			String fechaF = ParamUtil.getString(request, "fechaF");
			String ciudad = ParamUtil.getString(request, "ciudad");
			String categoria = ParamUtil.getString(request, "categoria");
			String subcategoria = ParamUtil.getString(request, "subcategoria");
			String distrito = ParamUtil.getString(request, "distrito");
			String nombre = ParamUtil.getString(request, "nombre");
			String numeroCasos = ParamUtil.getString(request, "numeroCasos");
			String completa = ParamUtil.getString(request, "completa");
			String parcial = ParamUtil.getString(request, "parcial");
			String noCompleta = ParamUtil.getString(request, "noCompleta");
			String cantidadAplican = ParamUtil.getString(request, "cantidadAplican");
			String cantidadNoAplican = ParamUtil.getString(request, "cantidadNoAplican");
			String cantidadTotal = ParamUtil.getString(request, "cantidadTotal");
			String respuestas1 = ParamUtil.getString(request, "respuestas1");
			String respuestas2 = ParamUtil.getString(request, "respuestas2");
			String categorias1 = ParamUtil.getString(request, "categorias1");
			
			if(anhioR.equalsIgnoreCase("") || anhioR.equalsIgnoreCase("todos"))
				anhioR="-1";			
			if(fechaI.equalsIgnoreCase(""))
				fechaI="-1";
			if(fechaF.equalsIgnoreCase(""))
				fechaF = "-1";
			if(ciudad.equalsIgnoreCase("") || ciudad.equalsIgnoreCase("todas"))
				ciudad = "-1";
			if(categoria.equalsIgnoreCase("") || categoria.equalsIgnoreCase("todas"))
				categoria = "-1";
			if(subcategoria.equalsIgnoreCase("") || subcategoria.equalsIgnoreCase("todas"))
				subcategoria = "-1";
			if(distrito.equalsIgnoreCase("") || distrito.equalsIgnoreCase("todos"))
				distrito = "-1";
			if(nombre.equalsIgnoreCase(""))
				nombre = "-1";
			
			File archivoPDF = null;
			try{
			archivoPDF = new File("C:\\reportes\\genero.xlsx");
			}catch (Exception e) {
				e.printStackTrace();
			}
			archivoPDF.createNewFile();
			reporteEstadisticosExcel(anhioR, fechaI, fechaF, ciudad, categoria, subcategoria, distrito, nombre, despachoR, archivoPDF, numeroCasos, completa, parcial, noCompleta, cantidadAplican, cantidadNoAplican, cantidadTotal, respuestas1, respuestas2, categorias1);
			
			
		}
		if (tipoSolicitud==8) {
			String ciudad = ParamUtil.getString(request, "ciudad1");
			System.out.println(ciudad);
			resourceRequest.getPortletSession().setAttribute("ciudad", ciudad);
			try {
				JSONArray arra = JSONFactoryUtil.createJSONArray();
				JSONObject json = JSONFactoryUtil.createJSONObject();
				json.put("id", "hola");
				arra.put(json);
				response.getWriter().println(arra.toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(tipoSolicitud == 0 && tipo.equalsIgnoreCase("1") ){
			System.out.println("pdf");
			resourceResponse.setContentType("application/pdf");
			HttpServletResponse res = PortalUtil.getHttpServletResponse(resourceResponse);
			res.setHeader("Content-Disposition", "attachment; filename=ReporteGenero.pdf");
			OutputStream out = resourceResponse.getPortletOutputStream();
			InputStream in = new FileInputStream(new File("C:\\reportes\\reporteGenero.pdf"));
			IOUtils.copy(in, out);
			out.flush();
			in.close();
			out.close();
		}
		if(tipoSolicitud == 0 && tipo.equalsIgnoreCase("2") ){
			System.out.println("xls");
			resourceResponse.setContentType("application/application/vnd.openxmlformats-officedocument.spreadsheetml.shee");
			HttpServletResponse res = PortalUtil.getHttpServletResponse(resourceResponse);
			res.setHeader("Content-Disposition", "attachment; filename=ReporteGenero.xlsx");
			OutputStream out = resourceResponse.getPortletOutputStream();
			InputStream in = new FileInputStream(new File("C:\\reportes\\genero.xlsx"));
			IOUtils.copy(in, out);
			out.flush();
			in.close();
			out.close();
		}
		if(tipoSolicitud == 9){
			String radicacion = ParamUtil.getString(request, "radicacion");
			List<casoLV> casos;
			try {
				casos = casoLVLocalServiceUtil.getcasoLVs(-1, -1);
			
			int si=0;
			JSONArray arra = JSONFactoryUtil.createJSONArray();
			for(casoLV r : casos){
				if(r.getRadicacion().equalsIgnoreCase(radicacion)){
					si=1;
				}
			}
			JSONObject json = JSONFactoryUtil.createJSONObject();
			json.put("si", si);
			arra.put(json);
			response.getWriter().println(arra.toString());
			
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if (tipoSolicitud==10) {
			String cat = ParamUtil.getString(request, "cat");
			String subcat = ParamUtil.getString(request, "subcat");
			resourceRequest.getPortletSession().setAttribute("categ", cat);
			resourceRequest.getPortletSession().setAttribute("subcat", subcat);
			try {
				JSONArray arra = JSONFactoryUtil.createJSONArray();
				JSONObject json = JSONFactoryUtil.createJSONObject();
				json.put("id", "hola");
				arra.put(json);
				response.getWriter().println(arra.toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (tipoSol==11) {
			String ruta = ParamUtil.getString(resourceRequest, "ruta");
			System.out.println(ruta);
			resourceResponse.setContentType("application/pdf");
			OutputStream out = resourceResponse.getPortletOutputStream();
//			InputStream in = new FileInputStream(new File("C:\\casur_liferay\\reporteActividades.pdf"));
			InputStream in = new FileInputStream(new File(ruta));
//			InputStream in = new FileInputStream(new File("/u01/apps/casur_files/reporteRevistaEstados.pdf"));
			IOUtils.copy(in, out);
			HttpServletResponse res = PortalUtil.getHttpServletResponse(resourceResponse);
			res.setHeader("Content-disposition","attachment; filename=sentencia/auto.pdf");
			out.flush();
			in.close();
			out.close();
		}
		if (tipoSolicitud==12) {
			String distrito = ParamUtil.getString(request, "distrito");
			resourceRequest.getPortletSession().setAttribute("distrito", distrito);
			try {
				JSONArray arra = JSONFactoryUtil.createJSONArray();
				JSONObject json = JSONFactoryUtil.createJSONObject();
				json.put("id", "hola");
				arra.put(json);
				response.getWriter().println(arra.toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
 	}
	
	public void limpiarFiltros(ActionRequest request, ActionResponse response){
		request.getPortletSession().removeAttribute("fechainicio");
		request.getPortletSession().removeAttribute("fechafin");
		request.getPortletSession().removeAttribute("ano");
		request.getPortletSession().removeAttribute("ciudad");
		request.getPortletSession().removeAttribute("categ");
		request.getPortletSession().removeAttribute("subcat");
		request.getPortletSession().removeAttribute("distrito");
		request.getPortletSession().removeAttribute("nombre");
		SessionMessages.add(request, "as");
		
	}
	
	public void filtroRan(ActionRequest request, ActionResponse response){
		String fechainicio = ParamUtil.getString(request, "fechainicio");
		String fechafin = ParamUtil.getString(request, "fechafin");
		request.getPortletSession().setAttribute("fechainicio", fechainicio);
		request.getPortletSession().setAttribute("fechafin", fechafin);
		request.getPortletSession().removeAttribute("ano");
		SessionMessages.add(request, "as");
		
	}
	
	public void filtroAno(ActionRequest request, ActionResponse response){
		String ano = ParamUtil.getString(request, "ano");
		request.getPortletSession().removeAttribute("fechainicio");
		request.getPortletSession().removeAttribute("fechafin");
		request.getPortletSession().setAttribute("ano",ano);
		SessionMessages.add(request, "as");
	}
	
	public void filtroNombre(ActionRequest request, ActionResponse response){
		String nombre = ParamUtil.getString(request, "nombre");
		request.getPortletSession().setAttribute("nombre",nombre);
		SessionMessages.add(request, "as");
	}
	
	public void modificar(ActionRequest actionRequest,ActionResponse actionResponse) throws Exception{
		if(PortletFileUpload.isMultipartContent(actionRequest)){
			DiskFileItemFactory factory = new DiskFileItemFactory();
			factory.setSizeThreshold(20000000); // bytes

			File repositoryPath = new File("/tmp");
			factory.setRepository(repositoryPath);
			PortletFileUpload upload = new PortletFileUpload(factory);
			upload.setSizeMax(20000000); // bytes

			List fileItemsList = upload.parseRequest(actionRequest);
			ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);	
			User user = themeDisplay.getUser();
			FileItem fileItem = (FileItem) fileItemsList.get(2);
			String id = fileItem.getString("UTF-8");
			fileItem = (FileItem) fileItemsList.get(3);
			String despacho = fileItem.getString("UTF-8");
			fileItem = (FileItem) fileItemsList.get(4);
			String radicacion = fileItem.getString("UTF-8");
			fileItem = (FileItem) fileItemsList.get(5);
			String demandante = fileItem.getString("UTF-8");
			fileItem = (FileItem) fileItemsList.get(7);
			String demandado = fileItem.getString("UTF-8");
			fileItem = (FileItem) fileItemsList.get(6);
			String generoDemandante = fileItem.getString("UTF-8");
			fileItem = (FileItem) fileItemsList.get(8);
			String generoDemandado = fileItem.getString("UTF-8");
			fileItem = (FileItem) fileItemsList.get(9);
			String claseProceso1 = fileItem.getString("UTF-8");
			fileItem = (FileItem) fileItemsList.get(10);
			String claseProceso2 = fileItem.getString("UTF-8");
			fileItem = (FileItem) fileItemsList.get(11);
			String tipoDecision = fileItem.getString("UTF-8");
			fileItem = (FileItem) fileItemsList.get(13);
			String ponente = fileItem.getString("UTF-8");
			fileItem = (FileItem) fileItemsList.get(14);
			String fecha = fileItem.getString("UTF-8");
			fileItem = (FileItem) fileItemsList.get(15);
			String categoria = fileItem.getString("UTF-8");
			fileItem = (FileItem) fileItemsList.get(16);
			String subCategoria = fileItem.getString("UTF-8");
			fileItem = (FileItem) fileItemsList.get(17);
			String respuestas1 = fileItem.getString("UTF-8");
			fileItem = (FileItem) fileItemsList.get(18);
			String respuestas2 = fileItem.getString("UTF-8");
			SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
			SimpleDateFormat formatoAnhio = new SimpleDateFormat("yyyy");
			Date fechaData = null;
			try {
				fechaData = formato.parse(fecha);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			fileItem = (FileItem) fileItemsList.get(12);
			String nombreArchivo = fileItem.getName();
			if(!nombreArchivo.isEmpty()){
//				String archivo = "//172.28.146.22/h/portal_repository_pruebas/genero/"+radicacion+"-"+nombreArchivo;
				String archivo = "//csjportalrep01/portal_repository/genero/"+radicacion+"-"+nombreArchivo;
//				String archivo = "C:/genero/"+radicacion+"-"+nombreArchivo;
				File file = new File(archivo);
				fileItem.write(file);
				if ( file.exists() ) {
					try {
						casoLV casoNuevo = casoLVLocalServiceUtil.getcasoLV(Integer.parseInt(id));
						casoNuevo.setDespacho(despacho);
						casoNuevo.setRadicacion(radicacion);
						casoNuevo.setDemandante(demandante);
						casoNuevo.setDemandado(demandado);
						casoNuevo.setGeneroDemandante(generoDemandante);
						casoNuevo.setGeneroDemandado(generoDemandado);
						if(claseProceso2.equalsIgnoreCase("")){
							casoNuevo.setClaseProceso(claseProceso1);
						}else{
							casoNuevo.setClaseProceso(claseProceso1+"-"+claseProceso2);
						}
						casoNuevo.setTipoDecision(tipoDecision);
						casoNuevo.setPonente(ponente);
						casoNuevo.setFecha(fechaData);
						casoNuevo.setCategoria(categoria);
						casoNuevo.setSubCategoria(subCategoria);
						casoNuevo.setRespuestas1(respuestas1);
						casoNuevo.setRespuestas2(respuestas2);
						casoNuevo.setAnhio(formatoAnhio.format(fechaData));
						casoNuevo.setArchivo(archivo);
						
						casoLVLocalServiceUtil.updatecasoLV(casoNuevo);
						
						String log="";
						log="El usuario: "+user.getFullName().toUpperCase()+" modifico el caso de perspectiva de genero del despacho con codigo "+despacho+" y con número de radicación: "+radicacion;
						auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
						audi.setFecha(new Date());
						audi.setEvento("MODIFICAR");
						audi.setTabla("GENERO_LV_CASO");
						audi.setLogs(log);
						audi.setIdUser(user.getUserId());
						auditoriaLocalServiceUtil.addauditoria(audi);
					} catch (SystemException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} 
			}else{
				try {
					casoLV casoNuevo = casoLVLocalServiceUtil.getcasoLV(Integer.parseInt(id));
					casoNuevo.setDespacho(despacho);
					casoNuevo.setRadicacion(radicacion);
					casoNuevo.setDemandante(demandante);
					casoNuevo.setDemandado(demandado);
					casoNuevo.setGeneroDemandante(generoDemandante);
					casoNuevo.setGeneroDemandado(generoDemandado);
					if(claseProceso2.equalsIgnoreCase("")){
						casoNuevo.setClaseProceso(claseProceso1);
					}else{
						casoNuevo.setClaseProceso(claseProceso1+"-"+claseProceso2);
					}
					casoNuevo.setTipoDecision(tipoDecision);
					casoNuevo.setPonente(ponente);
					casoNuevo.setFecha(fechaData);
					casoNuevo.setCategoria(categoria);
					casoNuevo.setSubCategoria(subCategoria);
					casoNuevo.setRespuestas1(respuestas1);
					casoNuevo.setRespuestas2(respuestas2);
					casoNuevo.setAnhio(formatoAnhio.format(fechaData));
					
					casoLVLocalServiceUtil.updatecasoLV(casoNuevo);
					
					String log="";
					log="El usuario: "+user.getFullName().toUpperCase()+" modifico el caso de perspectiva de genero del despacho con codigo "+despacho+" y con número de radicación: "+radicacion;
					auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
					audi.setFecha(new Date());
					audi.setEvento("MODIFICAR");
					audi.setTabla("GENERO_LV_CASO");
					audi.setLogs(log);
					audi.setIdUser(user.getUserId());
					auditoriaLocalServiceUtil.addauditoria(audi);
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public void guardar(ActionRequest actionRequest,ActionResponse actionResponse) throws Exception{
		if(PortletFileUpload.isMultipartContent(actionRequest)){
			DiskFileItemFactory factory = new DiskFileItemFactory();
			factory.setSizeThreshold(20000000); // bytes

			File repositoryPath = new File("/tmp");
			factory.setRepository(repositoryPath);
			PortletFileUpload upload = new PortletFileUpload(factory);
			upload.setSizeMax(20000000); // bytes

			List fileItemsList = upload.parseRequest(actionRequest);
			ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);	
			User user = themeDisplay.getUser();
			FileItem fileItem = (FileItem) fileItemsList.get(1);
			String despacho = fileItem.getString("UTF-8");
			fileItem = (FileItem) fileItemsList.get(2);
			String radicacion = fileItem.getString("UTF-8");
			fileItem = (FileItem) fileItemsList.get(3);
			String demandante = fileItem.getString("UTF-8");
			fileItem = (FileItem) fileItemsList.get(5);
			String demandado = fileItem.getString("UTF-8");
			fileItem = (FileItem) fileItemsList.get(4);
			String generoDemandante = fileItem.getString("UTF-8");
			fileItem = (FileItem) fileItemsList.get(6);
			String generoDemandado = fileItem.getString("UTF-8");
			fileItem = (FileItem) fileItemsList.get(7);
			String claseProceso1 = fileItem.getString("UTF-8");
			fileItem = (FileItem) fileItemsList.get(8);
			String claseProceso2 = fileItem.getString("UTF-8");
			fileItem = (FileItem) fileItemsList.get(9);
			String tipoDecision = fileItem.getString("UTF-8");
			fileItem = (FileItem) fileItemsList.get(11);
			String ponente = fileItem.getString("UTF-8");
			fileItem = (FileItem) fileItemsList.get(12);
			String fecha = fileItem.getString("UTF-8");
			fileItem = (FileItem) fileItemsList.get(13);
			String categoria = fileItem.getString("UTF-8");
			fileItem = (FileItem) fileItemsList.get(14);
			String subCategoria = fileItem.getString("UTF-8");
			fileItem = (FileItem) fileItemsList.get(15);
			String respuestas1 = fileItem.getString("UTF-8");
			fileItem = (FileItem) fileItemsList.get(16);
			String respuestas2 = fileItem.getString("UTF-8");
			SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
			SimpleDateFormat formatoAnhio = new SimpleDateFormat("yyyy");
			Date fechaData = null;
			try {
				fechaData = formato.parse(fecha);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			fileItem = (FileItem) fileItemsList.get(10);
			String nombreArchivo = fileItem.getName();
			if(!nombreArchivo.isEmpty()){
//				String archivo = "//172.28.146.22/h/portal_repository_pruebas/genero/"+radicacion+"-"+nombreArchivo;
				String archivo = "//csjportalrep01/portal_repository/genero/"+radicacion+"-"+nombreArchivo;
//				String archivo = "C:/genero/"+radicacion+"-"+nombreArchivo;
				File file = new File(archivo);
				fileItem.write(file);
				if ( file.exists() ) {
					try {
						casoLV casoNuevo = casoLVLocalServiceUtil.createcasoLV((int)CounterLocalServiceUtil.increment(casoLV.class.getName()));
						casoNuevo.setDespacho(despacho);
						casoNuevo.setRadicacion(radicacion);
						casoNuevo.setDemandante(demandante);
						casoNuevo.setDemandado(demandado);
						casoNuevo.setGeneroDemandante(generoDemandante);
						casoNuevo.setGeneroDemandado(generoDemandado);
						if(claseProceso2.equalsIgnoreCase("")){
							casoNuevo.setClaseProceso(claseProceso1);
						}else{
							casoNuevo.setClaseProceso(claseProceso1+"-"+claseProceso2);
						}
						casoNuevo.setTipoDecision(tipoDecision);
						casoNuevo.setPonente(ponente);
						casoNuevo.setFecha(fechaData);
						casoNuevo.setCategoria(categoria);
						casoNuevo.setSubCategoria(subCategoria);
						casoNuevo.setRespuestas1(respuestas1);
						casoNuevo.setRespuestas2(respuestas2);
						casoNuevo.setAnhio(formatoAnhio.format(fechaData));
						casoNuevo.setArchivo(archivo);
						
						casoLVLocalServiceUtil.addcasoLV(casoNuevo);
						
						String log="";
						log="El usuario: "+user.getFullName().toUpperCase()+" registro un caso de perspectiva de genero con número de radicación: "+radicacion;
						auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
						audi.setFecha(new Date());
						audi.setEvento("AGREGAR");
						audi.setTabla("GENERO_LV_CASO");
						audi.setLogs(log);
						audi.setIdUser(user.getUserId());
						auditoriaLocalServiceUtil.addauditoria(audi);
					} catch (SystemException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} 
			}else{
				try {
					casoLV casoNuevo = casoLVLocalServiceUtil.createcasoLV((int)CounterLocalServiceUtil.increment(casoLV.class.getName()));
					casoNuevo.setDespacho(despacho);
					casoNuevo.setRadicacion(radicacion);
					casoNuevo.setDemandante(demandante);
					casoNuevo.setDemandado(demandado);
					casoNuevo.setGeneroDemandante(generoDemandante);
					casoNuevo.setGeneroDemandado(generoDemandado);
					if(claseProceso2.equalsIgnoreCase("")){
						casoNuevo.setClaseProceso(claseProceso1);
					}else{
						casoNuevo.setClaseProceso(claseProceso1+"-"+claseProceso2);
					}
					casoNuevo.setTipoDecision(tipoDecision);
					casoNuevo.setPonente(ponente);
					casoNuevo.setFecha(fechaData);
					casoNuevo.setCategoria(categoria);
					casoNuevo.setSubCategoria(subCategoria);
					casoNuevo.setRespuestas1(respuestas1);
					casoNuevo.setRespuestas2(respuestas2);
					casoNuevo.setAnhio(formatoAnhio.format(fechaData));
					
					casoLVLocalServiceUtil.addcasoLV(casoNuevo);
					
					String log="";
					log="El usuario: "+user.getFullName().toUpperCase()+" registro un caso de perspectiva de genero con número de radicación: "+radicacion;
					auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
					audi.setFecha(new Date());
					audi.setEvento("AGREGAR");
					audi.setTabla("GENERO_LV_CASO");
					audi.setLogs(log);
					audi.setIdUser(user.getUserId());
					auditoriaLocalServiceUtil.addauditoria(audi);
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public void eliminarCaso(ActionRequest request,ActionResponse response) throws NumberFormatException, PortalException, SystemException{
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);	
		User user = themeDisplay.getUser();
		
		
		String id = ParamUtil.getString(request, "id");
		casoLV caso = casoLVLocalServiceUtil.getcasoLV(Integer.parseInt(id));
		casoLVLocalServiceUtil.deletecasoLV(caso);
		
		String log="";
		log="Se elimino el caso con numero de radicacion: "+caso.getRadicacion();
		auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
		audi.setFecha(new Date());
		audi.setEvento("ELIMINAR");
		audi.setTabla("GENERO_LV_CASO");
		audi.setLogs(log);
		audi.setIdUser(user.getUserId());
		auditoriaLocalServiceUtil.addauditoria(audi);
	}
	
	public void editarCaso(ActionRequest request,ActionResponse response){
		String id = ParamUtil.getString(request, "id");
		casoLV caso = null;
		try {
			caso= casoLVLocalServiceUtil.getcasoLV(Integer.valueOf(id));
			request.getPortletSession().setAttribute("casoEditar", caso);
			response.setRenderParameter("mvcPath", "/html/genero/nuevoCaso.jsp");
			SessionMessages.add(request, "notiene");
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void detalleCaso(ActionRequest request,ActionResponse response){
		String id = ParamUtil.getString(request, "id");
		casoLV caso = null;
		try {
			caso= casoLVLocalServiceUtil.getcasoLV(Integer.valueOf(id));
			request.getPortletSession().setAttribute("casoEditar", caso);
			response.setRenderParameter("mvcPath", "/html/genero/detalleCaso.jsp");
			SessionMessages.add(request, "notiene");
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void filtro(ActionRequest request, ActionResponse response){
		String anhio = ParamUtil.getString(request, "ano");
		request.getPortletSession().setAttribute("ano", anhio);
		HttpServletRequest request1 = PortalUtil.getOriginalServletRequest(PortalUtil.getHttpServletRequest(request));
		HttpServletResponse response1 = PortalUtil.getHttpServletResponse(response);
		try {
			response1.getWriter().println("hola");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public File reporteCasos(String ano, String fechaI, String fechaF, String ciudad, String categoria, String subcategoria, String distrito, String nombre, String despacho, File archivo, String comite){
		try{
			String ciudadNombre = consultas.getCiudadNombre(ciudad);
			String distritoNombre = distrito.equals("-1")?"":distrito;//consultas.getDistritoNombre(distrito);
			String categoriaNombre = "";
			String subcategoriaNombre = "";
			String nombreDespacho = "";
			if(!categoria.equals("-1"))
				categoriaNombre=categoriaLocalServiceUtil.getcategoria(Integer.parseInt(categoria)).getCategoria();
			if(!subcategoria.equals("-1"))
				subcategoriaNombre=subcategoriaLocalServiceUtil.getsubcategoria(Integer.parseInt(subcategoria)).getSubcategoria();
			if(!despacho.equals("-1"))
				nombreDespacho = consultas.getNombreDespacho(despacho);
			System.out.println(nombreDespacho);
			Map<String, Object> parametros = new HashMap<String, Object>();	
			parametros.put("anhio", ano);
			parametros.put("fechaI", fechaI);
			parametros.put("fechaF", fechaF);
			parametros.put("ciudad", ciudad);
			parametros.put("categoria", categoria);
			parametros.put("subCategoria", subcategoria);
			parametros.put("distrito", distrito);
			parametros.put("nombre", nombre);
			parametros.put("despacho", despacho);
			parametros.put("ciudadNombre", ciudadNombre);
			parametros.put("distritoNombre", distritoNombre);
			parametros.put("categoriaNombre", categoriaNombre);
			parametros.put("subcategoriaNombre", subcategoriaNombre);
			parametros.put("nombreDespacho", nombreDespacho);
			parametros.put("distritosComite", comite);
			
			InputStream report = null;
			report  = getClass().getResourceAsStream("/com/ability/pdf/reporteCasosAdmin.jasper");
			
			InitialContext ic = new InitialContext();
			DataSource ds =   (DataSource) ic.lookup("java:comp/env/jdbc/base_datos_csj");
			Connection c = ds.getConnection();
			JasperPrint jasperPrint = JasperFillManager.fillReport(report, parametros,c);
			JRPdfExporter exporter = new JRPdfExporter();
			exporter.setParameter(JRExporterParameter.JASPER_PRINT,jasperPrint);
			exporter.setParameter(JRExporterParameter.OUTPUT_FILE, archivo);
			exporter.exportReport();
			c.close();
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		return archivo;
	}
	
	/*public File reporteCasosRango(String codigo, String nombre, String fechai, String fechaf, File archivo){
		System.out.println("entro a reporte por rango de fechas" + fechai + fechaf);
		try{
		Map<String, Object> parametros = new HashMap<String, Object>();	
		parametros.put("nombreDespacho", nombre);
		parametros.put("fechainicio", fechai);
		parametros.put("fechanfin", fechaf);
		parametros.put("codigoDespacho", codigo);
		InputStream report = null;
		if(codigo.equalsIgnoreCase("-1")){
			System.out.println("entro a admin");
			report  = getClass().getResourceAsStream("/com/ability/pdf/reporteCasosAdminrango.jasper");
		}else{
			System.out.println("entro a normal");
			report  = getClass().getResourceAsStream("/com/ability/pdf/reporteCasosrango.jasper");
		}
		
		System.out.println("cargo reporte");
		InitialContext ic = new InitialContext();
		DataSource ds =   (DataSource) ic.lookup("java:comp/env/jdbc/base_datos_csj");
		Connection c = ds.getConnection();
		System.out.println("abrio conexion");
		JasperPrint jasperPrint = JasperFillManager.fillReport(report, parametros,c);
		JRPdfExporter exporter = new JRPdfExporter();
		exporter.setParameter(JRExporterParameter.JASPER_PRINT,jasperPrint);
		exporter.setParameter(JRExporterParameter.OUTPUT_FILE, archivo);
		exporter.exportReport();
		c.close();
		System.out.println("creo reporte");
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("retorno");
		return archivo;
	}
	*/
	
	public File reporteEstadisticos(String ano, String fechaI, String fechaF, String ciudad, String categoria, String subcategoria, String distrito, String nombre, String despacho, File archivo, String numeroCasos, String completa, String parcial, String noCompleta, String cantidadAplican, String cantidadNoAplican, String cantidadTotal, String respuestas1, String respuestas2, String categorias1){
		System.out.println("entro a metodo");
		try{
			String ciudadNombre = consultas.getCiudadNombre(ciudad);
			String distritoNombre = distrito.equals("-1")?"":distrito;//consultas.getDistritoNombre(distrito);
			String categoriaNombre = "";
			String subcategoriaNombre = "";
			String nombreDespacho = "";
			if(!categoria.equals("-1"))
				categoriaNombre=categoriaLocalServiceUtil.getcategoria(Integer.parseInt(categoria)).getCategoria();
			if(!subcategoria.equals("-1"))
				subcategoriaNombre=subcategoriaLocalServiceUtil.getsubcategoria(Integer.parseInt(subcategoria)).getSubcategoria();
			if(!despacho.equals("-1"))
				nombreDespacho = consultas.getNombreDespacho(despacho);
			System.out.println(nombreDespacho);
			Map<String, Object> parametros = new HashMap<String, Object>();	
			parametros.put("anhio", ano);
			parametros.put("fechaI", fechaI);
			parametros.put("fechaF", fechaF);
			parametros.put("ciudad", ciudad);
			parametros.put("categoria", categoria);
			parametros.put("subCategoria", subcategoria);
			parametros.put("distrito", distrito);
			parametros.put("nombre", nombre);
			parametros.put("despacho", despacho);
			parametros.put("ciudadNombre", ciudadNombre);
			parametros.put("distritoNombre", distritoNombre);
			parametros.put("categoriaNombre", categoriaNombre);
			parametros.put("subcategoriaNombre", subcategoriaNombre);
			parametros.put("numeroCasos", numeroCasos);
			parametros.put("completa", completa);
			parametros.put("parcial", parcial);
			parametros.put("noCompleta", noCompleta);
			parametros.put("cantidadAplican", cantidadAplican);
			parametros.put("cantidadNoAplican", cantidadNoAplican);
			parametros.put("cantidadTotal", cantidadTotal);
			parametros.put("respuestas1", respuestas1);
			parametros.put("respuestas2", respuestas2);
			parametros.put("categorias1", categorias1);
			parametros.put("nombreDespacho", nombreDespacho);
			
			InputStream report = null;
			report  = getClass().getResourceAsStream("/com/ability/pdf/reporteEstadisticas.jasper");
			
			InitialContext ic = new InitialContext();
			DataSource ds =   (DataSource) ic.lookup("java:comp/env/jdbc/base_datos_csj");
			Connection c = ds.getConnection();
			JasperPrint jasperPrint = JasperFillManager.fillReport(report, parametros,c);
			JRPdfExporter exporter = new JRPdfExporter();
			exporter.setParameter(JRExporterParameter.JASPER_PRINT,jasperPrint);
			exporter.setParameter(JRExporterParameter.OUTPUT_FILE, archivo);
			exporter.exportReport();
			c.close();
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		return archivo;
	}
	
	/*public File reporteEstadisticosrango(String codigo, String nombre, String fechaini, String fechafin, File archivo, String numeroCasos, String completa, String parcial, String noCompleta, String cantidadAplican, String cantidadNoAplican, String cantidadTotal, String respuestas1, String respuestas2, String categorias1){
		System.out.println("entro a metodo");
		try{
		Map<String, Object> parametros = new HashMap<String, Object>();	
		parametros.put("nombreDespacho", nombre);
		parametros.put("fechainicio", fechaini);
		parametros.put("fechanfin", fechafin);
		parametros.put("codigoDespacho", codigo);
		parametros.put("numeroCasos", numeroCasos);
		parametros.put("completa", completa);
		parametros.put("parcial", parcial);
		parametros.put("noCompleta", noCompleta);
		parametros.put("cantidadAplican", cantidadAplican);
		parametros.put("cantidadNoAplican", cantidadNoAplican);
		parametros.put("cantidadTotal", cantidadTotal);
		parametros.put("respuestas1", respuestas1);
		parametros.put("respuestas2", respuestas2);
		parametros.put("categorias1", categorias1);
		InputStream report = null;
		report  = getClass().getResourceAsStream("/com/ability/pdf/reporteEstadisticasrango.jasper");
		
		
		System.out.println("cargo reporte");
		InitialContext ic = new InitialContext();
		DataSource ds =   (DataSource) ic.lookup("java:comp/env/jdbc/base_datos_csj");
		Connection c = ds.getConnection();
		System.out.println("abrio conexion");
		JasperPrint jasperPrint = JasperFillManager.fillReport(report, parametros,c);
		JRPdfExporter exporter = new JRPdfExporter();
		exporter.setParameter(JRExporterParameter.JASPER_PRINT,jasperPrint);
		exporter.setParameter(JRExporterParameter.OUTPUT_FILE, archivo);
		exporter.exportReport();
		c.close();
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		return archivo;
	}
	*/
	
	public File reporteCasosExcel(String ano, String fechaI, String fechaF, String ciudad, String categoria, String subcategoria, String distrito, String nombre, String despacho, File archivo, String comite){
		try{
			String ciudadNombre = consultas.getCiudadNombre(ciudad);
			String distritoNombre = distrito.equals("-1")?"":distrito;//consultas.getDistritoNombre(distrito);
			String categoriaNombre = "";
			String subcategoriaNombre = "";
			String nombreDespacho = "";
			if(!categoria.equals("-1"))
				categoriaNombre=categoriaLocalServiceUtil.getcategoria(Integer.parseInt(categoria)).getCategoria();
			if(!subcategoria.equals("-1"))
				subcategoriaNombre=subcategoriaLocalServiceUtil.getsubcategoria(Integer.parseInt(subcategoria)).getSubcategoria();
			if(!despacho.equals("-1"))
				nombreDespacho = consultas.getNombreDespacho(despacho);
			System.out.println(nombreDespacho);
			Map<String, Object> parametros = new HashMap<String, Object>();	
			parametros.put("anhio", ano);
			parametros.put("fechaI", fechaI);
			parametros.put("fechaF", fechaF);
			parametros.put("ciudad", ciudad);
			parametros.put("categoria", categoria);
			parametros.put("subCategoria", subcategoria);
			parametros.put("distrito", distrito);
			parametros.put("nombre", nombre);
			parametros.put("despacho", despacho);
			parametros.put("ciudadNombre", ciudadNombre);
			parametros.put("distritoNombre", distritoNombre);
			parametros.put("categoriaNombre", categoriaNombre);
			parametros.put("subcategoriaNombre", subcategoriaNombre);
			parametros.put("nombreDespacho", nombreDespacho);
			parametros.put("distritosComite", comite);
			
			InputStream report = null;
			report  = getClass().getResourceAsStream("/com/ability/pdf/reporteCasosAdminExel.jasper");
			
			
			
			InitialContext ic = new InitialContext();
			DataSource ds =   (DataSource) ic.lookup("java:comp/env/jdbc/base_datos_csj");
			Connection c = ds.getConnection();
			JasperPrint jasperPrint = JasperFillManager.fillReport(report, parametros,c);
			JRXlsxExporter exporter = new JRXlsxExporter();
			exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
			exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(archivo));
			SimpleXlsxReportConfiguration configuration = new SimpleXlsxReportConfiguration(); 
			configuration.setDetectCellType(true);//Set configuration as you like it!!
			configuration.setCollapseRowSpan(false);
			configuration.setRemoveEmptySpaceBetweenRows(true);
			exporter.setConfiguration(configuration);
			exporter.exportReport();
			c.close();
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		return archivo;
	}
	
	/*public File reporteCasos1rango(String codigo, String nombre, String fechai, String fechaf, File archivo){
		System.out.println("entro a metodo");
		try{
		Map<String, Object> parametros = new HashMap<String, Object>();	
		parametros.put("nombreDespacho", nombre);
		parametros.put("fechainicio", fechai);
		parametros.put("fechanfin", fechaf);
		parametros.put("codigoDespacho", codigo);
		InputStream report = null;
		if(codigo.equalsIgnoreCase("-1")){
			report  = getClass().getResourceAsStream("/com/ability/pdf/reporteCasosAdminExelrango.jasper");
			System.out.println("a");
		}else{
			report  = getClass().getResourceAsStream("/com/ability/pdf/reporteCasosExelrango.jasper");
			System.out.println("b");
		}
		
		System.out.println("cargo reporte");
		InitialContext ic = new InitialContext();
		DataSource ds =   (DataSource) ic.lookup("java:comp/env/jdbc/base_datos_csj");
		Connection c = ds.getConnection();
		System.out.println("abrio conexion");
		JasperPrint jasperPrint = JasperFillManager.fillReport(report, parametros,c);
		JRXlsxExporter exporter = new JRXlsxExporter();
		exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
		exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(archivo));
		SimpleXlsxReportConfiguration configuration = new SimpleXlsxReportConfiguration(); 
		configuration.setDetectCellType(true);//Set configuration as you like it!!
		configuration.setCollapseRowSpan(false);
		exporter.setConfiguration(configuration);
		exporter.exportReport();
		c.close();
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		return archivo;
	}
	*/
	
	public File reporteEstadisticosExcel(String ano, String fechaI, String fechaF, String ciudad, String categoria, String subcategoria, String distrito, String nombre, String despacho, File archivo, String numeroCasos, String completa, String parcial, String noCompleta, String cantidadAplican, String cantidadNoAplican, String cantidadTotal, String respuestas1, String respuestas2, String categorias1){
		System.out.println("entro a metodo");
		try{
			String ciudadNombre = consultas.getCiudadNombre(ciudad);
			String distritoNombre = distrito.equals("-1")?"":distrito;//consultas.getDistritoNombre(distrito);
			String categoriaNombre = "";
			String subcategoriaNombre = "";
			String nombreDespacho = "";
			if(!categoria.equals("-1"))
				categoriaNombre=categoriaLocalServiceUtil.getcategoria(Integer.parseInt(categoria)).getCategoria();
			if(!subcategoria.equals("-1"))
				subcategoriaNombre=subcategoriaLocalServiceUtil.getsubcategoria(Integer.parseInt(subcategoria)).getSubcategoria();
			if(!despacho.equals("-1"))
				nombreDespacho = consultas.getNombreDespacho(despacho);
			System.out.println(nombreDespacho);
			Map<String, Object> parametros = new HashMap<String, Object>();	
			parametros.put("anhio", ano);
			parametros.put("fechaI", fechaI);
			parametros.put("fechaF", fechaF);
			parametros.put("ciudad", ciudad);
			parametros.put("categoria", categoria);
			parametros.put("subCategoria", subcategoria);
			parametros.put("distrito", distrito);
			parametros.put("nombre", nombre);
			parametros.put("despacho", despacho);
			parametros.put("ciudadNombre", ciudadNombre);
			parametros.put("distritoNombre", distritoNombre);
			parametros.put("categoriaNombre", categoriaNombre);
			parametros.put("subcategoriaNombre", subcategoriaNombre);
			parametros.put("numeroCasos", numeroCasos);
			parametros.put("completa", completa);
			parametros.put("parcial", parcial);
			parametros.put("noCompleta", noCompleta);
			parametros.put("cantidadAplican", cantidadAplican);
			parametros.put("cantidadNoAplican", cantidadNoAplican);
			parametros.put("cantidadTotal", cantidadTotal);
			parametros.put("respuestas1", respuestas1);
			parametros.put("respuestas2", respuestas2);
			parametros.put("categorias1", categorias1);
			parametros.put("nombreDespacho", nombreDespacho);
		
			InputStream report = null;
			report  = getClass().getResourceAsStream("/com/ability/pdf/reporteEstadisticasExel.jasper");
			
			InitialContext ic = new InitialContext();
			DataSource ds =   (DataSource) ic.lookup("java:comp/env/jdbc/base_datos_csj");
			Connection c = ds.getConnection();
			JasperPrint jasperPrint = JasperFillManager.fillReport(report, parametros,c);
			JRXlsxExporter exporter = new JRXlsxExporter();
			exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
			exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(archivo));
			SimpleXlsxReportConfiguration configuration = new SimpleXlsxReportConfiguration(); 
			configuration.setDetectCellType(true);//Set configuration as you like it!!
			configuration.setCollapseRowSpan(false);
			exporter.setConfiguration(configuration);
			exporter.exportReport();
			c.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return archivo;
	}
	
	/*public File reporteEstadisticos1rango(String codigo, String nombre, String fechai, String fechaf, File archivo, String numeroCasos, String completa, String parcial, String noCompleta, String cantidadAplican, String cantidadNoAplican, String cantidadTotal, String respuestas1, String respuestas2, String categorias1){
		System.out.println("entro a metodo");
		try{
		Map<String, Object> parametros = new HashMap<String, Object>();	
		parametros.put("nombreDespacho", nombre);
		parametros.put("fechainicio", fechai);
		parametros.put("fechanfin", fechaf);
		parametros.put("codigoDespacho", codigo);
		parametros.put("numeroCasos", numeroCasos);
		parametros.put("completa", completa);
		parametros.put("parcial", parcial);
		parametros.put("noCompleta", noCompleta);
		parametros.put("cantidadAplican", cantidadAplican);
		parametros.put("cantidadNoAplican", cantidadNoAplican);
		parametros.put("cantidadTotal", cantidadTotal);
		parametros.put("respuestas1", respuestas1);
		parametros.put("respuestas2", respuestas2);
		parametros.put("categorias1", categorias1);
		InputStream report = null;
		report  = getClass().getResourceAsStream("/com/ability/pdf/reporteEstadisticasExelrango.jasper");
		
		
		System.out.println("cargo reporte");
		InitialContext ic = new InitialContext();
		DataSource ds =   (DataSource) ic.lookup("java:comp/env/jdbc/base_datos_csj");
		Connection c = ds.getConnection();
		System.out.println("abrio conexion");
		JasperPrint jasperPrint = JasperFillManager.fillReport(report, parametros,c);
		JRXlsxExporter exporter = new JRXlsxExporter();
		exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
		exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(archivo));
		SimpleXlsxReportConfiguration configuration = new SimpleXlsxReportConfiguration(); 
		configuration.setDetectCellType(true);//Set configuration as you like it!!
		configuration.setCollapseRowSpan(false);
		exporter.setConfiguration(configuration);
		exporter.exportReport();
		c.close();
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		return archivo;
	}
	*/
	
}
