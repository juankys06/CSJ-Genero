package com.ability.modelo;

import com.ability.genero.server.model.casoLV;
import com.ability.genero.server.model.generoUsuario;
import com.ability.genero.server.service.casoLVLocalServiceUtil;
import com.ability.genero.server.service.generoUsuarioLocalServiceUtil;
import com.ability.modelo.modelo;
import com.ability.persistence.PersistenceUtil;
import com.ability.usuarios.usuarios;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class consultas {
	
    public static List<modelo> getCiudades() {
        ArrayList<modelo> lista = new ArrayList<modelo>();
        String sql = "select ciu.cod_dane_departamento+ciu.cod_dane,ciu.nombre+' ('+dep.nombre+')' from adm_localizacion ciu join adm_localizacion dep on (ciu.cod_dane_departamento = dep.cod_dane) where ciu.cod_dane != ciu.cod_dane_departamento and ciu.nombre !='' and ciu.estado='1' order by ciu.nombre asc";

        try {
            ResultSet result = PersistenceUtil.realizaConsultaDespachos(sql);
            if (result != null) {
                while (result.next()) {
                    modelo aux = new modelo(result.getString(1), result.getString(2));
                    lista.add(aux);
                }
            } else {
                System.out.println("No hay  registro cargadas en la base de datos ");
            }
            PersistenceUtil.terminaOperacion();
        }
        catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error de conexion a la bd  " + ex.getMessage());
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error  excepcion  " + ex);
        }
        return lista;
    }
    
    public static String getCiudadNombre(String cod) {
        String lista = "";
        String sql = "select ciu.nombre+' ('+dep.nombre+')' from adm_localizacion ciu join adm_localizacion dep on (ciu.cod_dane_departamento = dep.cod_dane) where ciu.cod_dane != ciu.cod_dane_departamento and ciu.nombre !='' and ciu.estado='1' and ciu.COD_DANE_DEPARTAMENTO+ciu.COD_DANE='"+cod+"' order by ciu.nombre asc";

        try {
            ResultSet result = PersistenceUtil.realizaConsultaDespachos(sql);
            if (result != null) {
                while (result.next()) {
                    lista = result.getString(1);
                }
            } else {
                System.out.println("No hay  registro cargadas en la base de datos ");
            }
            PersistenceUtil.terminaOperacion();
        }
        catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error de conexion a la bd  " + ex.getMessage());
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error  excepcion  " + ex);
        }
        return lista;
    }

    public List<modelo> getEntidades() {
        ArrayList<modelo> lista = new ArrayList<modelo>();
        String sql = "select codigo,nombre from adm_entidad where estado='1' order by nombre asc";

        try {
            ResultSet result = PersistenceUtil.realizaConsultaDespachos(sql);
            if (result != null) {
                while (result.next()) {
                    modelo aux = new modelo(result.getString(1), result.getString(2));
                    lista.add(aux);
                }
            } else {
                System.out.println("No hay  registro cargadas en la base de datos ");
            }
            PersistenceUtil.terminaOperacion();
        }
        catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error de conexion a la bd  " + ex.getMessage());
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error  excepcion  " + ex);
        }
        return lista;
    }

    public List<modelo> getEspecialidades() {
        ArrayList<modelo> lista = new ArrayList<modelo>();
        String sql = "select codigo,nombre from adm_especialidad where estado='1' order by nombre asc";

        try {
            ResultSet result = PersistenceUtil.realizaConsultaDespachos(sql);
            if (result != null) {
                while (result.next()) {
                    modelo aux = new modelo(result.getString(1), result.getString(2));
                    lista.add(aux);
                }
            } else {
                System.out.println("No hay  registro cargadas en la base de datos ");
            }
            PersistenceUtil.terminaOperacion();
        }
        catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error de conexion a la bd  " + ex.getMessage());
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error  excepcion  " + ex);
        }
        return lista;
    }

    public static modelo getEspecialidades(String cod) {
        modelo lista = new modelo("", "");
        String sql = "select codigo,nombre from adm_especialidad where estado='1' and codigo='"+cod+"'";

        try {
            ResultSet result = PersistenceUtil.realizaConsultaDespachos(sql);
            if (result != null) {
                while (result.next()) {
                    lista = new modelo(result.getString(1), result.getString(2));
                }
            } else {
                System.out.println("No hay  registro cargadas en la base de datos ");
            }
            PersistenceUtil.terminaOperacion();
        }
        catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error de conexion a la bd  " + ex.getMessage());
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error  excepcion  " + ex);
        }
        return lista;
    }
    
    public List<modelo> getDespachos(String cod) {
        ArrayList<modelo> lista = new ArrayList<modelo>();
        String sql = "select codigo,nombre from DIRECTORIO_PORTAL where codigo like '" + cod + "%' order by nombre asc";

        try {
            ResultSet result = PersistenceUtil.realizaConsultaAppsportal(sql);
            if (result != null) {
                while (result.next()) {
                    modelo aux = new modelo(result.getString(1), result.getString(2));
                    lista.add(aux);
                }
            } else {
                System.out.println("No hay  registro cargadas en la base de datos ");
            }
            PersistenceUtil.terminaOperacion();
        }
        catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error de conexion a la bd  " + ex.getMessage());
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error  excepcion  " + ex);
        }
        return lista;
    }
    
    public List<modelo> getDespachosTodos() {
        ArrayList<modelo> lista = new ArrayList<modelo>();
        String sql = "select codigo,nombre from DIRECTORIO_PORTAL order by nombre asc";

        try {
            ResultSet result = PersistenceUtil.realizaConsultaAppsportal(sql);
            if (result != null) {
                while (result.next()) {
                    modelo aux = new modelo(result.getString(1), result.getString(2));
                    lista.add(aux);
                }
            } else {
                System.out.println("No hay  registro cargadas en la base de datos ");
            }
            PersistenceUtil.terminaOperacion();
        }
        catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error de conexion a la bd  " + ex.getMessage());
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error  excepcion  " + ex);
        }
        return lista;
    }

    public static List<modelo> getNombreDistrito(String CodDespacho) {
        ArrayList<modelo> lista = new ArrayList<modelo>();
//        String sql = 	"select despa.NOMBRE 'nombre despacho',distri.NOMBRE 'distrito' "+
//		        		"from DIRECTORIO_PORTAL despa join despacho_pru.dbo.ADM_ENTIDAD enti on (SUBSTRING(despa.CODIGO,6,2)=enti.CODIGO) "+ 
//				        "join despacho_pru.dbo.ADM_MAPA_JUDICIAL mapa on (mapa.FK_DANEMUNI_TO_MAPA=SUBSTRING(despa.CODIGO,3,3) and mapa.FK_DANEDEPAR_TO_MAPA=SUBSTRING(despa.CODIGO,1,2) and mapa.FK_JURIDICCION_TO_MAPA=enti.FK_ENTIDAD_TO_JURIDICCION) "+ 
//				        "join despacho_pru.dbo.ADM_CIRCUITO circu on (circu.id=mapa.FK_CIRCUITO_TO_MAPA) "+
//				        "join despacho_pru.dbo.ADM_DISTRITO distri on (circu.FK_DISTRITO_TO_CIRCUITO=distri.id) "+ 
//				        "where despa.codigo = '"+CodDespacho+"' ";
        String sql = 	"select despa.NOMBRE 'nombre despacho',gdm.nombre_mascara 'distrito' "+
		        		"from DIRECTORIO_PORTAL despa join despacho_pru.dbo.ADM_ENTIDAD enti on (SUBSTRING(despa.CODIGO,6,2)=enti.CODIGO) "+ 
				        "join despacho_pru.dbo.ADM_MAPA_JUDICIAL mapa on (mapa.FK_DANEMUNI_TO_MAPA=SUBSTRING(despa.CODIGO,3,3) and mapa.FK_DANEDEPAR_TO_MAPA=SUBSTRING(despa.CODIGO,1,2) and mapa.FK_JURIDICCION_TO_MAPA=enti.FK_ENTIDAD_TO_JURIDICCION) "+ 
				        "join despacho_pru.dbo.ADM_CIRCUITO circu on (circu.id=mapa.FK_CIRCUITO_TO_MAPA) "+
				        "join despacho_pru.dbo.ADM_DISTRITO distri on (circu.FK_DISTRITO_TO_CIRCUITO=distri.id) "+
				        "join genero_distritos_mascaras gdm on (distri.nombre = gdm.nombre) "+
				        "where despa.codigo = '"+CodDespacho+"' ";

        try {
            ResultSet result = PersistenceUtil.realizaConsultaAppsportal(sql);
            if (result != null) {
                while (result.next()) {
                    modelo aux = new modelo(result.getString(1), result.getString(2));
                    lista.add(aux);
                }
            } else {
                System.out.println("No hay  registro cargadas en la base de datos ");
            }
            PersistenceUtil.terminaOperacion();
        }
        catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error de conexion a la bd  " + ex.getMessage());
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error  excepcion  " + ex);
        }
        return lista;
    }

    public static List<String> getAnhios(String CodDespacho){
    	ArrayList<String> lista = new ArrayList<String>();
        String sql = "select distinct(anhio) from genero_lv_caso where 1=1 ";
        
        if(CodDespacho.length()>0)
        	sql+=" and despacho='"+CodDespacho+"'";
        
        sql+=" order by 1 asc";
        try {
            ResultSet result = PersistenceUtil.realizaConsultaAppsportal(sql);
            if (result != null) {
                while (result.next()) {
                    lista.add(result.getString(1));
                }
            } else {
                System.out.println("No hay  registro cargadas en la base de datos ");
            }
            PersistenceUtil.terminaOperacion();
        }
        catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error de conexion a la bd  " + ex.getMessage());
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error  excepcion  " + ex);
        }
        return lista;
    }

    public static List<casoLV> getCasos(String anhio, String fechaI, String fechaF, String ciudad, String Cat, String SubCat, String CodDespacho,String distrito,String nombre, String distritosComite){
    	SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
    	
    	if(anhio==null)
    		anhio="";
    	if(fechaI==null)
    		fechaI="";
    	if(fechaF==null)
    		fechaF="";
    	if(ciudad==null)
    		ciudad="";
    	if(Cat==null)
    		Cat="";
    	if(SubCat==null)
    		SubCat="";
    	if(Cat.equals("todas"))
    		Cat="";
    	if(SubCat.equals("todas"))
    		SubCat="";
    	if(anhio.equals("todos"))
    		anhio="";
    	if(ciudad.equals("todas"))
    		ciudad="";
    	if(distrito==null)
    		distrito="";
    	if(distrito.equals("todos"))
    		distrito="";
    	if(nombre==null)
    		nombre="";
    	
    	ArrayList<casoLV> lista = new ArrayList<casoLV>();
        String sql = 	"select lv.* "+ 
		        		"from genero_lv_caso lv join DIRECTORIO_PORTAL despa on (lv.despacho=despa.CODIGO) "+
				        "join despacho_pru.dbo.ADM_ENTIDAD enti on (SUBSTRING(despa.CODIGO,6,2)=enti.CODIGO) "+
				        "join despacho_pru.dbo.ADM_MAPA_JUDICIAL mapa on (mapa.FK_DANEMUNI_TO_MAPA=SUBSTRING(despa.CODIGO,3,3) and mapa.FK_DANEDEPAR_TO_MAPA=SUBSTRING(despa.CODIGO,1,2) and mapa.FK_JURIDICCION_TO_MAPA=enti.FK_ENTIDAD_TO_JURIDICCION) "+ 
				        "join despacho_pru.dbo.ADM_CIRCUITO circu on (circu.id=mapa.FK_CIRCUITO_TO_MAPA) "+
				        "join despacho_pru.dbo.ADM_DISTRITO distri on (circu.FK_DISTRITO_TO_CIRCUITO=distri.id) "+
				        "join genero_distritos_mascaras gdm on (distri.nombre = gdm.nombre)"+
				        "where 1=1 ";
        
        if(CodDespacho.length()>0)
        	sql+=" and lv.despacho='"+CodDespacho+"'";
        if(anhio.length()>0)
        	sql+=" and lv.anhio='"+anhio+"'";
        if(ciudad.length()>0)
        	sql+=" and SUBSTRING(lv.despacho,1,5)='"+ciudad+"'";
        if(Cat.length()>0)
        	sql+=" and lv.categoria='"+Cat+"'";
        if(SubCat.length()>0)
        	sql+=" and lv.subcategoria='"+SubCat+"'";
        if(fechaI.length()>0)
        	sql+=" and lv.fecha>='"+fechaI+" 00:00:00.000'";
        if(fechaF.length()>0)
        	sql+=" and lv.fecha<='"+fechaF+" 23:59:59.000'";
        if(distrito.length()>0)
        	sql+=" and gdm.nombre_mascara='"+distrito+"'";
        if(nombre.length()>0)
        	sql+=" and despa.nombre like '%"+nombre+"%'";
        if(distritosComite.length()>0)
        	sql+=" and distri.id in ("+distritosComite+")";
        
        sql+=" order by lv.fecha desc";
        
        System.out.println(sql);
        try {
            ResultSet result = PersistenceUtil.realizaConsultaAppsportal(sql);
            if (result != null) {
                while (result.next()) {
                    casoLV c = casoLVLocalServiceUtil.createcasoLV(result.getInt(1));
                    c.setDespacho(result.getString(2));
                    c.setRadicacion(result.getString(3));
                    c.setDemandante(result.getString(4));
                    c.setDemandado(result.getString(5));
                    c.setClaseProceso(result.getString(6));
                    c.setTipoDecision(result.getString(7));
                    c.setPonente(result.getString(8));
                    c.setFecha(formato.parse(result.getString(9)));
                    c.setCategoria(result.getString(10));
                    c.setSubCategoria(result.getString(11));
                    c.setRespuestas1(result.getString(12));
                    c.setRespuestas2(result.getString(13));
                    c.setAnhio(result.getString(14));
                    c.setGeneroDemandante(result.getString(15));
                    c.setGeneroDemandado(result.getString(16));
                    c.setArchivo(result.getString(17));
                    lista.add(c);
                }
            } else {
                System.out.println("No hay  registro cargadas en la base de datos ");
            }
            PersistenceUtil.terminaOperacion();
        }
        catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error de conexion a la bd  " + ex.getMessage());
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error  excepcion  " + ex);
        }
        return lista;
    }
    
    public static List<modelo> getDistritos() {
        ArrayList<modelo> lista = new ArrayList<modelo>();
        //String sql = "select dis.id,dis.NOMBRE+' ('+jur.NOMBRE+')' from adm_distrito dis join ADM_JURISDICCION jur on (dis.FK_JURISDICCION_DISTRITO=jur.ID) order by 2 asc";
        String sql = "select dis.id,gdm.nombre_mascara+' ('+jur.NOMBRE+')' from DESPACHO_PRU.dbo.adm_distrito dis join DESPACHO_PRU.dbo.ADM_JURISDICCION jur on (dis.FK_JURISDICCION_DISTRITO=jur.ID) join genero_distritos_mascaras gdm on (dis.NOMBRE = gdm.nombre) order by 2 asc";
        try {
            ResultSet result = PersistenceUtil.realizaConsultaAppsportal(sql);
            if (result != null) {
                while (result.next()) {
                    modelo aux = new modelo(result.getString(1), result.getString(2));
                    lista.add(aux);
                }
            } else {
                System.out.println("No hay  registro cargadas en la base de datos ");
            }
            PersistenceUtil.terminaOperacion();
        }
        catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error de conexion a la bd  " + ex.getMessage());
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error  excepcion  " + ex);
        }
        return lista;
    }
    
    public static String getDistritoNombre(String cod) {
    	String lista = "";
        //String sql = "select dis.NOMBRE+' ('+jur.NOMBRE+')' from adm_distrito dis join ADM_JURISDICCION jur on (dis.FK_JURISDICCION_DISTRITO=jur.ID) where dis.id = '"+cod+"'";
    	String sql = "select gdm.nombre_mascara+' ('+jur.NOMBRE+')' from DESPACHO_PRU.dbo.adm_distrito dis join DESPACHO_PRU.dbo.ADM_JURISDICCION jur on (dis.FK_JURISDICCION_DISTRITO=jur.ID) join genero_distritos_mascaras gdm on (dis.NOMBRE = gdm.nombre) where dis.id = '"+cod+"'";
        try {
            ResultSet result = PersistenceUtil.realizaConsultaAppsportal(sql);
            if (result != null) {
                while (result.next()) {
                    lista=result.getString(1);
                }
            } else {
                System.out.println("No hay  registro cargadas en la base de datos ");
            }
            PersistenceUtil.terminaOperacion();
        }
        catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error de conexion a la bd  " + ex.getMessage());
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error  excepcion  " + ex);
        }
        return lista;
    }

    public static String getNombreDespacho(String CodDespacho) {
        String lista = "";
        String sql = 	"select NOMBRE "+
		        		"from DIRECTORIO_PORTAL "+
				        "where codigo = '"+CodDespacho+"' ";

        try {
            ResultSet result = PersistenceUtil.realizaConsultaAppsportal(sql);
            if (result != null) {
                while (result.next()) {
                    lista = result.getString(1);
                }
            } else {
                System.out.println("No hay  registro cargadas en la base de datos ");
            }
            PersistenceUtil.terminaOperacion();
        }
        catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error de conexion a la bd  " + ex.getMessage());
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error  excepcion  " + ex);
        }
        return lista;
    }
    
    public static List<modelo> getDistritosN() {
        ArrayList<modelo> lista = new ArrayList<modelo>();
        //String sql = "select distinct(nombre) from adm_distrito order by 1 asc";
        String sql = "select distinct(gdm.nombre_mascara) from DESPACHO_PRU.dbo.adm_distrito dis join genero_distritos_mascaras gdm on (dis.NOMBRE = gdm.nombre) order by 1 asc";        

        try {
            ResultSet result = PersistenceUtil.realizaConsultaAppsportal(sql);
            if (result != null) {
                while (result.next()) {
                	modelo aux = new modelo(result.getString(1), result.getString(1));
                    lista.add(aux);
                }
            } else {
                System.out.println("No hay  registro cargadas en la base de datos ");
            }
            PersistenceUtil.terminaOperacion();
        }
        catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error de conexion a la bd  " + ex.getMessage());
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error  excepcion  " + ex);
        }
        return lista;
    }

    public static List<generoUsuario> getBusquedaUsuariosGenero(String correo, String nombre, String ciudad, String entidad, String especialidad) {
    	if(correo==null)
    		correo="";
    	if(nombre==null)
    		nombre="";
    	if(ciudad==null)
    		ciudad="";
    	if(entidad==null)
    		entidad="";
    	if(especialidad==null)
    		especialidad="";
        ArrayList<generoUsuario> lista = new ArrayList<generoUsuario>();
        
        String sql = 	"select gu.* "+ 
        				"from genero_usuarios gu left join lportalramaprod.dbo.user_ u on (gu.user_id = u.userid) "+
        				"where 1=1 ";
        
        if(correo.length()>0){
        	sql+="and u.emailaddress = '"+correo+"' ";
        }
        if(nombre.length()>0){
        	sql+="and u.firstName+' '+u.middleName+' '+u.lastName like '%"+nombre+"%' ";
        }
        if(ciudad.length()>0){
        	sql+="and SUBSTRING(gu.despacho,1,5) = '"+ciudad+"' ";
        }
        if(entidad.length()>0){
        	sql+="and SUBSTRING(gu.despacho,6,2) = '"+entidad+"' ";
        }
        if(especialidad.length()>0){
        	sql+="and SUBSTRING(gu.despacho,8,2) = '"+especialidad+"' ";
        }
        
        sql+="order by gu.fecha_creacion desc";
        
        System.out.println(sql);
        
        try {
            ResultSet result = PersistenceUtil.realizaConsultaAppsportal(sql);
            if (result != null) {
                while (result.next()) {
                	generoUsuario aux = generoUsuarioLocalServiceUtil.creategeneroUsuario(result.getInt(1));
                	aux.setDespacho(result.getString(2));
                	aux.setUserId(result.getString(3));
                    lista.add(aux);
                }
            } else {
                System.out.println("No hay  registro cargadas en la base de datos ");
            }
            PersistenceUtil.terminaOperacion();
        }
        catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error de conexion a la bd  " + ex.getMessage());
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error  excepcion  " + ex);
        }
        return lista;
    }


}