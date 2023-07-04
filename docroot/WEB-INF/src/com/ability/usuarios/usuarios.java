package com.ability.usuarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.poi.ss.usermodel.Workbook;

import com.ability.administracion.exporterUtil;
import com.ability.genero.server.model.auditoria;
import com.ability.genero.server.model.despacho;
import com.ability.genero.server.model.generoUsuario;
import com.ability.genero.server.model.generoUsuarioComite;
import com.ability.genero.server.service.auditoriaLocalServiceUtil;
import com.ability.genero.server.service.despachoLocalServiceUtil;
import com.ability.genero.server.service.generoUsuarioComiteLocalServiceUtil;
import com.ability.genero.server.service.generoUsuarioLocalServiceUtil;
import com.ability.modelo.consultas;
import com.ability.modelo.modelo;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.taglib.aui.AUIUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.liferay.util.json.JSONFactoryUtil;

/**
 * Portlet implementation class usuarios
 */
public class usuarios extends MVCPortlet {
	 
		@ProcessAction(name="asignarUsuario")
		public void asignarUsuario(ActionRequest actionRequest,ActionResponse actionResponse) throws IOException, PortletException, NumberFormatException, PortalException {
			ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);	
			User user = themeDisplay.getUser();
			String userid = ParamUtil.getString(actionRequest, "usuarios");
			String despacho = ParamUtil.getString(actionRequest, "despacho");
			boolean bandera = false;
			
			try {
				List<generoUsuario> lista = generoUsuarioLocalServiceUtil.getgeneroUsuarios(-1, -1);
				for(generoUsuario gu : lista){
					if(gu.getUserId().equalsIgnoreCase(userid)){
						bandera=true;
					}
				}
				
				if(bandera){
					actionResponse.setRenderParameter("mvcPath", "/html/usuarios/usuariosP.jsp");
					SessionErrors.add(actionRequest, "yaEsta");
				}else{
					generoUsuario usuarioGenero = generoUsuarioLocalServiceUtil.creategeneroUsuario((int)CounterLocalServiceUtil.increment(generoUsuario.class.getName()));
					usuarioGenero.setUserId(userid);
					usuarioGenero.setDespacho(despacho);
					usuarioGenero.setFecha_creacion(new Date());
					generoUsuarioLocalServiceUtil.addgeneroUsuario(usuarioGenero);
					actionResponse.setRenderParameter("mvcPath", "/html/usuarios/usuariosP.jsp");
					SessionMessages.add(actionRequest, "guardo");
					User us = UserLocalServiceUtil.getUser(Long.valueOf(userid));
					String log="";
					log="Agrego al usuario: "+us.getFullName().toUpperCase()+" al despacho con el codigo: "+despacho;
					auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
					audi.setFecha(new Date());
					audi.setEvento("AGREGAR");
					audi.setTabla("GENERO_USUARIOS");
					audi.setLogs(log);
					audi.setIdUser(user.getUserId());
					auditoriaLocalServiceUtil.addauditoria(audi);
					
					
				}
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		@ProcessAction(name="asignarUsuarioC")
		public void asignarUsuarioC(ActionRequest actionRequest,ActionResponse actionResponse) throws IOException, PortletException, NumberFormatException, PortalException {
			ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);	
			User user = themeDisplay.getUser();
			String userid = ParamUtil.getString(actionRequest, "usuarios");
			String distrito = ParamUtil.getString(actionRequest, "distrito");
//			boolean bandera = false;
			
			try {
//				List<generoUsuarioComite> lista = generoUsuarioComiteLocalServiceUtil.getgeneroUsuarioComites(-1, -1);
//				for(generoUsuarioComite gu : lista){
//					if(gu.getUserId().equalsIgnoreCase(userid)){
//						bandera=true;
//					}
//				}
//				
//				if(bandera){
//					actionResponse.setRenderParameter("mvcPath", "/html/usuarios/usuariosC.jsp");
//					SessionErrors.add(actionRequest, "yaEsta");
//				}else{
					generoUsuarioComite usuarioGenero = generoUsuarioComiteLocalServiceUtil.creategeneroUsuarioComite((int)CounterLocalServiceUtil.increment(generoUsuarioComite.class.getName()));
					usuarioGenero.setUserId(userid);
					usuarioGenero.setDistrito(distrito);
					usuarioGenero.setFecha_creacion(new Date());
					generoUsuarioComiteLocalServiceUtil.addgeneroUsuarioComite(usuarioGenero);
					actionResponse.setRenderParameter("mvcPath", "/html/usuarios/usuariosC.jsp");
					SessionMessages.add(actionRequest, "guardo");
					User us = UserLocalServiceUtil.getUser(Long.valueOf(userid));
					String log="";
					log="Agrego al usuario: "+us.getFullName().toUpperCase()+" al distrito con el codigo: "+distrito;
					auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
					audi.setFecha(new Date());
					audi.setEvento("AGREGAR");
					audi.setTabla("GENERO_USUARIOS_COMITES");
					audi.setLogs(log);
					audi.setIdUser(user.getUserId());
					auditoriaLocalServiceUtil.addauditoria(audi);
					
					
//				}
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		@ProcessAction(name="eliminarUsuario")
		public void eliminarUsuario(ActionRequest actionRequest,ActionResponse actionResponse) throws IOException, PortletException, NumberFormatException, PortalException, SystemException {
			ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);	
			User user = themeDisplay.getUser();
			String id = ParamUtil.getString(actionRequest, "id");
			generoUsuario borrar = generoUsuarioLocalServiceUtil.getgeneroUsuario(Integer.parseInt(id));
			User us = UserLocalServiceUtil.getUser(Long.valueOf(borrar.getUserId()));
			try {
				generoUsuario usuG = generoUsuarioLocalServiceUtil.getgeneroUsuario(Integer.parseInt(id));
				generoUsuarioLocalServiceUtil.deletegeneroUsuario(usuG);
				actionResponse.setRenderParameter("mvcPath", "/html/usuarios/usuariosP.jsp");
				SessionMessages.add(actionRequest, "eliminado");
				
				String log="";
				log="Elimino al usuario: "+us.getFullName().toUpperCase()+" del despacho con el codigo: "+borrar.getDespacho();
				auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
				audi.setFecha(new Date());
				audi.setEvento("ELIMINAR");
				audi.setTabla("GENERO_USUARIOS");
				audi.setLogs(log);
				audi.setIdUser(user.getUserId());
				auditoriaLocalServiceUtil.addauditoria(audi);
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
		
		@ProcessAction(name="eliminarUsuarioC")
		public void eliminarUsuarioC(ActionRequest actionRequest,ActionResponse actionResponse) throws IOException, PortletException, NumberFormatException, PortalException, SystemException {
			ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);	
			User user = themeDisplay.getUser();
			String id = ParamUtil.getString(actionRequest, "id");
			generoUsuarioComite borrar = generoUsuarioComiteLocalServiceUtil.getgeneroUsuarioComite(Integer.parseInt(id));
			User us = UserLocalServiceUtil.getUser(Long.valueOf(borrar.getUserId()));
			try {
				generoUsuarioComite usuG = generoUsuarioComiteLocalServiceUtil.getgeneroUsuarioComite(Integer.parseInt(id));
				generoUsuarioComiteLocalServiceUtil.deletegeneroUsuarioComite(usuG);
				actionResponse.setRenderParameter("mvcPath", "/html/usuarios/usuariosC.jsp");
				SessionMessages.add(actionRequest, "eliminado");
				
				String log="";
				log="Elimino al usuario: "+us.getFullName().toUpperCase()+" del distrito con el codigo: "+borrar.getDistrito();
				auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
				audi.setFecha(new Date());
				audi.setEvento("ELIMINAR");
				audi.setTabla("GENERO_USUARIOS_COMITE");
				audi.setLogs(log);
				audi.setIdUser(user.getUserId());
				auditoriaLocalServiceUtil.addauditoria(audi);
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
		
		@ProcessAction(name="buscarUsuario")
	    public void buscarUsuario(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException, NumberFormatException, PortalException {
	        String correo = ParamUtil.getString(actionRequest, (String)"correo").toLowerCase();
	        String nombre = ParamUtil.getString(actionRequest, (String)"nombre").toLowerCase();
	        String ciudad = ParamUtil.getString(actionRequest, (String)"ciudadB").toLowerCase();
	        String entidad = ParamUtil.getString(actionRequest, (String)"entidadB").toLowerCase();
	        String especialidad = ParamUtil.getString(actionRequest, (String)"especialidadB").toLowerCase();
	        
	        actionRequest.getPortletSession().setAttribute("correo", correo);
	        actionRequest.getPortletSession().setAttribute("nombre", nombre);
	        actionRequest.getPortletSession().setAttribute("ciudad", ciudad);
	        actionRequest.getPortletSession().setAttribute("entidad", entidad);
	        actionRequest.getPortletSession().setAttribute("especialidad", especialidad);
	        
	        actionResponse.setRenderParameter("mvcPath", "/html/usuarios/usuariosP.jsp");
	    }
		
		@ProcessAction(name="buscarUsuarioC")
	    public void buscarUsuarioC(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException, NumberFormatException, PortalException {
	        String correo = ParamUtil.getString(actionRequest, (String)"correo").toLowerCase();
	        String distrito = ParamUtil.getString(actionRequest, (String)"distritoB").toLowerCase();
	        if (correo.length() > 1) {
	            actionRequest.getPortletSession().setAttribute("correoC", (Object)correo);
	        }
	        if (distrito.length() > 1) {
	            actionRequest.getPortletSession().setAttribute("distritoC", (Object)distrito);
	        }
	        actionResponse.setRenderParameter("mvcPath", "/html/usuarios/usuariosC.jsp");
	    }
		
		@Override
		public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws IOException, PortletException {
	        HttpServletRequest request = PortalUtil.getOriginalServletRequest((HttpServletRequest)PortalUtil.getHttpServletRequest(resourceRequest));
	        HttpServletResponse response = PortalUtil.getHttpServletResponse(resourceResponse);
	        
	        String tipo = ParamUtil.getString(resourceRequest, "tipoSol");
	        System.out.println(tipo);
	        if(tipo.equalsIgnoreCase("1")){
		        String despachos = ParamUtil.getString(resourceRequest, "despachos");
		        consultas consul = new consultas();
		        System.out.println(despachos);
		        List<modelo> des = consul.getDespachos(despachos);
		        JSONArray arra = JSONFactoryUtil.createJSONArray();
		        for (modelo d : des) {
		            JSONObject json = JSONFactoryUtil.createJSONObject();
		            json.put("id", d.getId());
		            json.put("nombre", d.getNombre());
		            arra.put(json);
		        }
		        response.getWriter().println(arra.toString());
	        }
	        if(tipo.equalsIgnoreCase("2")){

	        	List<generoUsuario> usuarios =  (List<generoUsuario>) resourceRequest.getPortletSession().getAttribute("usuariosGenero");
				
				FileOutputStream fichero = new FileOutputStream("C:\\reportes\\UsuariosPerspectivasGenero.xls");
				Workbook wb = null;
				try {
					wb = exporterUtil.INSTANCE.exportUsuariosGenero(usuarios);
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				wb.write(fichero);
				resourceResponse.setContentType("application/vnd.ms-excel");
				
				HttpServletResponse res = PortalUtil.getHttpServletResponse(resourceResponse);
				res.setHeader("Content-Disposition", "attachment; filename=UsuariosPerspectivasGenero.xls");
				OutputStream out = resourceResponse.getPortletOutputStream();
				InputStream in = new FileInputStream(new File("C:\\reportes\\UsuariosPerspectivasGenero.xls"));
				IOUtils.copy(in, out);
				out.flush();
				in.close();
				out.close();
	        }
	    }

}
