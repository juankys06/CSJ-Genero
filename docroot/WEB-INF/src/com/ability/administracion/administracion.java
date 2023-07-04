package com.ability.administracion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.poi.ss.usermodel.Workbook;

import com.ability.genero.server.model.auditoria;
import com.ability.genero.server.model.categoria;
import com.ability.genero.server.model.distritoG;
import com.ability.genero.server.model.encuestaCriterios;
import com.ability.genero.server.model.encuestaEnfoDife;
import com.ability.genero.server.model.juresprudenciaInternacional;
import com.ability.genero.server.model.juresprudenciaNacional;
import com.ability.genero.server.model.normasInteracionales;
import com.ability.genero.server.model.normasNacionales;
import com.ability.genero.server.model.preguntasClave;
import com.ability.genero.server.model.subcategoria;
import com.ability.genero.server.service.auditoriaLocalServiceUtil;
import com.ability.genero.server.service.categoriaLocalServiceUtil;
import com.ability.genero.server.service.distritoGLocalServiceUtil;
import com.ability.genero.server.service.encuestaCriteriosLocalServiceUtil;
import com.ability.genero.server.service.encuestaEnfoDifeLocalServiceUtil;
import com.ability.genero.server.service.juresprudenciaInternacionalLocalServiceUtil;
import com.ability.genero.server.service.juresprudenciaNacionalLocalServiceUtil;
import com.ability.genero.server.service.normasInteracionalesLocalServiceUtil;
import com.ability.genero.server.service.normasNacionalesLocalServiceUtil;
import com.ability.genero.server.service.preguntasClaveLocalServiceUtil;
import com.ability.genero.server.service.subcategoriaLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class administracion
 */
public class administracion extends MVCPortlet {
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> PREGUNTAS CLAVE   <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		public void editarpregunta( ActionRequest request, ActionResponse response){
			String id = ParamUtil.getString(request, "id");
			request.getPortletSession().setAttribute("id", id);
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/pregunta.jsp");
			SessionMessages.add(request, "nomensaje");
		}
		
		public void eliminarpregunta( ActionRequest request, ActionResponse response) throws NumberFormatException, PortalException, SystemException{
			
			String id = ParamUtil.getString(request, "id");
			preguntasClaveLocalServiceUtil.deletepreguntasClave(Integer.valueOf(id));
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/preguntasC.jsp");
			SessionMessages.add(request, "elimenoPre");
			
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);	
			User user = themeDisplay.getUser();
			String log="";
			log="Se elimino la PREGUNTA CLAVE con id: "+id;
			auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
			audi.setFecha(new Date());
			audi.setEvento("ELIMINAR");
			audi.setTabla("GENERO_PREGUNTAS_CLAVES");
			audi.setLogs(log);
			audi.setIdUser(user.getUserId());
			auditoriaLocalServiceUtil.addauditoria(audi);
		}
		
		public void modificarPre(ActionRequest request, ActionResponse response) throws PortalException, SystemException{
			int id = ParamUtil.getInteger(request, "id");
			String pregunta = ParamUtil.getString(request, "pregunta");
			String respuesta = ParamUtil.getString(request, "respuesta");
			
			preguntasClave pre = preguntasClaveLocalServiceUtil.getpreguntasClave(id);
			pre.setPregunta(pregunta);
			pre.setRespuesta(respuesta);
			preguntasClaveLocalServiceUtil.updatepreguntasClave(pre);
			
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);	
			User user = themeDisplay.getUser();
			String log="";
			log="Se modifico la PREGUNTA CLAVE con id: "+id;
			auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
			audi.setFecha(new Date());
			audi.setEvento("MODIFICAR");
			audi.setTabla("GENERO_PREGUNTAS_CLAVES");
			audi.setLogs(log);
			audi.setIdUser(user.getUserId());
			auditoriaLocalServiceUtil.addauditoria(audi);
			
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/preguntasC.jsp");
			SessionMessages.add(request, "preguntamodif");
			
		}
		
		public void agregarPre(ActionRequest request, ActionResponse response) throws SystemException{
			String pregunta = ParamUtil.getString(request, "pregunta");
			String respuesta = ParamUtil.getString(request, "respuesta");
			
			int id = 0;
			List<preguntasClave> pre = preguntasClaveLocalServiceUtil.getpreguntasClaves(-1, -1);
			for(preguntasClave p : pre){
				if(p.getId()>=id){
					id=p.getId();
				}
			}
			id+=1;
			preguntasClave nuevaPre = preguntasClaveLocalServiceUtil.createpreguntasClave(id);
			nuevaPre.setPregunta(pregunta);
			nuevaPre.setRespuesta(respuesta);
			preguntasClaveLocalServiceUtil.addpreguntasClave(nuevaPre);
			
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);	
			User user = themeDisplay.getUser();
			String log="";
			log="Se agrego una nueva PREGUNTA CLAVE con id: "+id;
			auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
			audi.setFecha(new Date());
			audi.setEvento("AGREGAR");
			audi.setTabla("GENERO_PREGUNTAS_CLAVES");
			audi.setLogs(log);
			audi.setIdUser(user.getUserId());
			auditoriaLocalServiceUtil.addauditoria(audi);
			
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/preguntasC.jsp");
			SessionMessages.add(request, "preguntaagre");
		}
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> CATEGORIAS	<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		public void agregarcat(ActionRequest request, ActionResponse response) throws SystemException{
			String cat = ParamUtil.getString(request, "nuevacat");
			int id = 0;
			List<categoria> pre = categoriaLocalServiceUtil.getcategorias(-1, -1);
			for(categoria p : pre){
				if(p.getId()>=id){
					id=p.getId();
				}
			}
			id+=1;
			categoria nuevacat = categoriaLocalServiceUtil.createcategoria(id);
			nuevacat.setCategoria(cat);
			categoriaLocalServiceUtil.addcategoria(nuevacat);
			
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);	
			User user = themeDisplay.getUser();
			String log="";
			log="Se agrego una nueva CATEGOÍA con id: "+id;
			auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
			audi.setFecha(new Date());
			audi.setEvento("AGREGAR");
			audi.setTabla("GENERO_CATEGORIAS");
			audi.setLogs(log);
			audi.setIdUser(user.getUserId());
			auditoriaLocalServiceUtil.addauditoria(audi);
			
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/matrizC.jsp");
			SessionMessages.add(request, "catagregada");
			
		}
		
		public void editcat(ActionRequest request, ActionResponse response){
			String id = ParamUtil.getString(request, "id");
			request.getPortletSession().setAttribute("idcatedit", id);
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/matrizC.jsp");
			SessionMessages.add(request, "nomensaje");
			
		}
		
		public void editarcat(ActionRequest request, ActionResponse response) throws PortalException, SystemException{
			int id = ParamUtil.getInteger(request, "id");
			String categoriaEditada = ParamUtil.getString(request, "cateditar");
			
			categoria cat = categoriaLocalServiceUtil.getcategoria(id);
			cat.setCategoria(categoriaEditada);
			
			categoriaLocalServiceUtil.updatecategoria(cat);
			
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);	
			User user = themeDisplay.getUser();
			String log="";
			log="Se modifico la CATEGOÍA con id: "+id;
			auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
			audi.setFecha(new Date());
			audi.setEvento("MODIFICAR");
			audi.setTabla("GENERO_CATEGORIAS");
			audi.setLogs(log);
			audi.setIdUser(user.getUserId());
			auditoriaLocalServiceUtil.addauditoria(audi);
			
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/matrizC.jsp");
			SessionMessages.add(request, "catmodif");
			
		}
		
		public void eliminarcat(ActionRequest request, ActionResponse response) throws PortalException, SystemException{
			int id= ParamUtil.getInteger(request, "id");
			
			categoriaLocalServiceUtil.deletecategoria(id);
			
			List<subcategoria> sub = subcategoriaLocalServiceUtil.findBysubCatXCat(id);
			
			for(subcategoria s : sub){
				subcategoriaLocalServiceUtil.deletesubcategoria(s.getId());
			}
			
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);	
			User user = themeDisplay.getUser();
			String log="";
			log="Se elimino la CATEGOÍA con id: "+id+" y todas sus SUBCATEGORIAS";
			auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
			audi.setFecha(new Date());
			audi.setEvento("ELIMINAR");
			audi.setTabla("GENERO_CATEGORIAS");
			audi.setLogs(log);
			audi.setIdUser(user.getUserId());
			auditoriaLocalServiceUtil.addauditoria(audi);
			
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/matrizC.jsp");
			SessionMessages.add(request, "cateli");
		}
		
		public void versub(ActionRequest request, ActionResponse response){
			String id = ParamUtil.getString(request, "id");
			request.getPortletSession().setAttribute("idcategoria", id);
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/subcategoria.jsp");
			SessionMessages.add(request, "nomensaje");
			
		}
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> SUBCATEGORIAS <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		
		public void editsubcat( ActionRequest request, ActionResponse response){
			String id = ParamUtil.getString(request, "id");
			request.getPortletSession().setAttribute("id", id);
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/agregarsubcat.jsp");
			SessionMessages.add(request, "nomensaje");
		}
		
		public void eliminarsubcat( ActionRequest request, ActionResponse response) throws NumberFormatException, PortalException, SystemException{
			String id = ParamUtil.getString(request, "id");
			subcategoria sub = subcategoriaLocalServiceUtil.getsubcategoria(Integer.valueOf(id));
			subcategoriaLocalServiceUtil.deletesubcategoria(Integer.valueOf(id));
			
			categoria cat = categoriaLocalServiceUtil.getcategoria(sub.getIdCategoria());
			
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);	
			User user = themeDisplay.getUser();
			String log="";
			log="Se elimino la SUBCATEGOÍA con id: "+id+"de la CATEGORIA: "+cat.getCategoria();
			auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
			audi.setFecha(new Date());
			audi.setEvento("ELIMINAR");
			audi.setTabla("GENERO_SUBCATEGORIAS");
			audi.setLogs(log);
			audi.setIdUser(user.getUserId());
			auditoriaLocalServiceUtil.addauditoria(audi);
			
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/subcategoria.jsp");
			SessionMessages.add(request, "subcateli");
		}
		
		public void modificarSubcat(ActionRequest request, ActionResponse response) throws PortalException, SystemException{
			int id = ParamUtil.getInteger(request, "id");
			String subcat = ParamUtil.getString(request, "subcategoria");
			String url = ParamUtil.getString(request, "url");
			
			subcategoria sub = subcategoriaLocalServiceUtil.getsubcategoria(id);
			sub.setSubcategoria(subcat);
			sub.setUrl(url);
			subcategoriaLocalServiceUtil.updatesubcategoria(sub);
			
			categoria cat = categoriaLocalServiceUtil.getcategoria(sub.getIdCategoria());
			
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);	
			User user = themeDisplay.getUser();
			String log="";
			log="Se modifico la SUBCATEGOÍA con id: "+id+" de la CATEGORIA: "+cat.getCategoria();
			auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
			audi.setFecha(new Date());
			audi.setEvento("MODIFICAR");
			audi.setTabla("GENERO_SUBCATEGORIAS");
			audi.setLogs(log);
			audi.setIdUser(user.getUserId());
			auditoriaLocalServiceUtil.addauditoria(audi);
			
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/subcategoria.jsp");
			SessionMessages.add(request, "subcatmodif");
			
		}
		
		public void iragregarsubcat(ActionRequest request, ActionResponse response){
			String id = ParamUtil.getString(request, "id");
			request.getPortletSession().setAttribute("idcategoriasub", id);
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/agregarsubcat.jsp");
			SessionMessages.add(request, "nomensaje");
			
		}
		
		public void agregarSubcat(ActionRequest request, ActionResponse response) throws SystemException, PortalException{
			int idCategoria = ParamUtil.getInteger(request, "id");
			String subcat = ParamUtil.getString(request, "subcategoria");
			String url = ParamUtil.getString(request, "url");
			
			int id = 0;
			List<subcategoria> pre = subcategoriaLocalServiceUtil.getsubcategorias(-1, -1);
			for(subcategoria p : pre){
				if(p.getId()>=id){
					id=p.getId();
				}
			}
			id+=1;
			
			subcategoria sub = subcategoriaLocalServiceUtil.createsubcategoria(id);
			sub.setSubcategoria(subcat);
			sub.setUrl(url);
			sub.setIdCategoria(idCategoria);
			subcategoriaLocalServiceUtil.addsubcategoria(sub);
			
			categoria cat = categoriaLocalServiceUtil.getcategoria(idCategoria);
			
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);	
			User user = themeDisplay.getUser();
			String log="";
			log="Se agrego una nueva SUBCATEGOÍA con id: "+id+" a la CATEGORIA:"+cat.getCategoria() ;
			auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
			audi.setFecha(new Date());
			audi.setEvento("AGREGAR");
			audi.setTabla("GENERO_SUBCATEGORIAS");
			audi.setLogs(log);
			audi.setIdUser(user.getUserId());
			auditoriaLocalServiceUtil.addauditoria(audi);
			
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/subcategoria.jsp");
			SessionMessages.add(request, "subcatagregada");
		}
		
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> NORMAS NACIONALES <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		
		public void iragregarnn(ActionRequest request, ActionResponse response){
			String ambito = ParamUtil.getString(request, "ambito");
			request.getPortletSession().setAttribute("ambito", ambito);
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/nn.jsp");
			SessionMessages.add(request, "nomensaje");
		}
		
		public void agregarnn(ActionRequest request, ActionResponse response) throws SystemException{
			String ambito = ParamUtil.getString(request, "ambito");
			String nn = ParamUtil.getString(request, "nn");
			String ano = ParamUtil.getString(request, "ano");
			String url = ParamUtil.getString(request, "url");
			
			int id = 0;
			List<normasNacionales> pre = normasNacionalesLocalServiceUtil.getnormasNacionaleses(-1, -1);
			for(normasNacionales p : pre){
				if(p.getId()>=id){
					id=p.getId();
				}
			}
			id+=1;
			
			normasNacionales nueva = normasNacionalesLocalServiceUtil.createnormasNacionales(id);
			nueva.setAmbito(ambito);
			nueva.setAnhio(ano);
			nueva.setNormativas(nn);
			nueva.setUrl(url);
			
			normasNacionalesLocalServiceUtil.addnormasNacionales(nueva);
			
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);	
			User user = themeDisplay.getUser();
			String log="";
			log="Se agrego una nueva NORMA NACIONAL con id: "+id;
			auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
			audi.setFecha(new Date());
			audi.setEvento("AGREGAR");
			audi.setTabla("GENERO_NORMAS_NACIONALES");
			audi.setLogs(log);
			audi.setIdUser(user.getUserId());
			auditoriaLocalServiceUtil.addauditoria(audi);
			
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/normasN.jsp");
			SessionMessages.add(request, "normanagregada");
		}
		
		public void editnn(ActionRequest request, ActionResponse response){
			String id = ParamUtil.getString(request, "id");
			request.getPortletSession().setAttribute("id", id);
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/nn.jsp");
			SessionMessages.add(request, "nomensaje");
		}
		
		public void modificarnn(ActionRequest request, ActionResponse response) throws PortalException, SystemException{
			int id = ParamUtil.getInteger(request, "id");
			String nn = ParamUtil.getString(request, "nn");
			String ano = ParamUtil.getString(request, "ano");
			String url = ParamUtil.getString(request, "url");
			
			normasNacionales editnn = normasNacionalesLocalServiceUtil.getnormasNacionales(id);
			editnn.setNormativas(nn);
			editnn.setAnhio(ano);
			editnn.setUrl(url);
			normasNacionalesLocalServiceUtil.updatenormasNacionales(editnn);
			
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);	
			User user = themeDisplay.getUser();
			String log="";
			log="Se modifico la NORMA NACIONAL con id: "+id;
			auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
			audi.setFecha(new Date());
			audi.setEvento("MODIFICAR");
			audi.setTabla("GENERO_NORMAS_NACIONALES");
			audi.setLogs(log);
			audi.setIdUser(user.getUserId());
			auditoriaLocalServiceUtil.addauditoria(audi);
			
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/normasN.jsp");
			SessionMessages.add(request, "normanmodif");
		}
		
		public void eliminarnn(ActionRequest request, ActionResponse response) throws PortalException, SystemException{
			int id = ParamUtil.getInteger(request, "id");
			normasNacionalesLocalServiceUtil.deletenormasNacionales(id);
			
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);	
			User user = themeDisplay.getUser();
			String log="";
			log="Se elimino la NORMA NACIONAL con id: "+id;
			auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
			audi.setFecha(new Date());
			audi.setEvento("ELIMINAR");
			audi.setTabla("GENERO_NORMAS_NACIONALES");
			audi.setLogs(log);
			audi.setIdUser(user.getUserId());
			auditoriaLocalServiceUtil.addauditoria(audi);
			
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/normasN.jsp");
			SessionMessages.add(request, "normaneli");
		}
		
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> NORMAS INTERNACIONALES <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		
		public void editni( ActionRequest request, ActionResponse response){
			String id = ParamUtil.getString(request, "id");
			request.getPortletSession().setAttribute("id", id);
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/ni.jsp");
			SessionMessages.add(request, "nomensaje");
		}
		
		public void eliminarni( ActionRequest request, ActionResponse response) throws NumberFormatException, PortalException, SystemException{
			String id = ParamUtil.getString(request, "id");
			normasInteracionalesLocalServiceUtil.deletenormasInteracionales(Integer.valueOf(id));
			
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);	
			User user = themeDisplay.getUser();
			String log="";
			log="Se elimino la NORMA INTERNACIONAL con id: "+id;
			auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
			audi.setFecha(new Date());
			audi.setEvento("ELIMINAR");
			audi.setTabla("GENERO_NORMAS_INTERNACIONALES");
			audi.setLogs(log);
			audi.setIdUser(user.getUserId());
			auditoriaLocalServiceUtil.addauditoria(audi);
			
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/normasI.jsp");
			SessionMessages.add(request, "nieli");
		}
		
		public void modificarni(ActionRequest request, ActionResponse response) throws PortalException, SystemException{
			int id = ParamUtil.getInteger(request, "id");
			String ni = ParamUtil.getString(request, "ni");
			String ano = ParamUtil.getString(request, "ano");
			String url = ParamUtil.getString(request, "url");
			
			normasInteracionales modificar = normasInteracionalesLocalServiceUtil.getnormasInteracionales(id);
			modificar.setConferencias(ni);
			modificar.setAnhio(ano);
			modificar.setUrl(url);
			normasInteracionalesLocalServiceUtil.updatenormasInteracionales(modificar);
			
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);	
			User user = themeDisplay.getUser();
			String log="";
			log="Se modifico la NORMA INTERNACIONAL con id: "+id;
			auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
			audi.setFecha(new Date());
			audi.setEvento("MODIFICAR");
			audi.setTabla("GENERO_NORMAS_INTERNACIONALES");
			audi.setLogs(log);
			audi.setIdUser(user.getUserId());
			auditoriaLocalServiceUtil.addauditoria(audi);
			
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/normasI.jsp");
			SessionMessages.add(request, "nimodif");
			
		}
		
		public void agregarni(ActionRequest request, ActionResponse response) throws SystemException{
			String ni = ParamUtil.getString(request, "ni");
			String ano = ParamUtil.getString(request, "ano");
			String url = ParamUtil.getString(request, "url");
			
			int id = 0;
			List<normasInteracionales> normas = normasInteracionalesLocalServiceUtil.getnormasInteracionaleses(-1, -1);
			for(normasInteracionales p : normas){
				if(p.getId()>=id){
					id=p.getId();
				}
			}
			id+=1;
			normasInteracionales nuevani = normasInteracionalesLocalServiceUtil.createnormasInteracionales(id);
			nuevani.setConferencias(ni);
			nuevani.setAnhio(ano);
			nuevani.setUrl(url);
			normasInteracionalesLocalServiceUtil.addnormasInteracionales(nuevani);
			
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);	
			User user = themeDisplay.getUser();
			String log="";
			log="Se agrego una nueva NORMA INTERNACIONAL con id: "+id;
			auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
			audi.setFecha(new Date());
			audi.setEvento("AGREGAR");
			audi.setTabla("GENERO_NORMAS_INTERNACIONALES");
			audi.setLogs(log);
			audi.setIdUser(user.getUserId());
			auditoriaLocalServiceUtil.addauditoria(audi);
			
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/normasI.jsp");
			SessionMessages.add(request, "niagre");
		}
		
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> JURISPRUDENCIA NACIONALES <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		
		public void iragregarjn(ActionRequest request, ActionResponse response){
			String ambito = ParamUtil.getString(request, "ambito");
			request.getPortletSession().setAttribute("ambito", ambito);
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/jn.jsp");
			SessionMessages.add(request, "nomensaje");
		}
		
		public void agregarjn(ActionRequest request, ActionResponse response) throws SystemException{
			String ambito = ParamUtil.getString(request, "ambito");
			String jn = ParamUtil.getString(request, "jn");
			String cor = ParamUtil.getString(request, "cor");
			String url = ParamUtil.getString(request, "url");
			
			int id = 0;
			List<juresprudenciaNacional> pre = juresprudenciaNacionalLocalServiceUtil.getjuresprudenciaNacionals(-1, -1);
			for(juresprudenciaNacional p : pre){
				if(p.getId()>=id){
					id=p.getId();
				}
			}
			id+=1;
			
			juresprudenciaNacional nueva = juresprudenciaNacionalLocalServiceUtil.createjuresprudenciaNacional(id);
			nueva.setAmbito(ambito);
			nueva.setReferencias(jn);
			nueva.setCorporacion(cor);
			nueva.setUrl(url);
			
			juresprudenciaNacionalLocalServiceUtil.addjuresprudenciaNacional(nueva);
			
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);	
			User user = themeDisplay.getUser();
			String log="";
			log="Se agrego una nueva JURISPRUDENCIA NACIONAL con id: "+id;
			auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
			audi.setFecha(new Date());
			audi.setEvento("AGREGAR");
			audi.setTabla("GENERO_JURISPRUDENCIA_NACIONALES");
			audi.setLogs(log);
			audi.setIdUser(user.getUserId());
			auditoriaLocalServiceUtil.addauditoria(audi);
			
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/jurisprudenciaN.jsp");
			SessionMessages.add(request, "jnagregada");
		}
		
		public void editjn(ActionRequest request, ActionResponse response){
			String id = ParamUtil.getString(request, "id");
			request.getPortletSession().setAttribute("id", id);
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/jn.jsp");
			SessionMessages.add(request, "nomensaje");
		}
		
		public void modificarjn(ActionRequest request, ActionResponse response) throws PortalException, SystemException{
			int id = ParamUtil.getInteger(request, "id");
			String jn = ParamUtil.getString(request, "jn");
			String cor = ParamUtil.getString(request, "cor");
			String url = ParamUtil.getString(request, "url");
			
			juresprudenciaNacional editjn = juresprudenciaNacionalLocalServiceUtil.getjuresprudenciaNacional(id);
			editjn.setReferencias(jn);
			editjn.setCorporacion(cor);
			editjn.setUrl(url);
			juresprudenciaNacionalLocalServiceUtil.updatejuresprudenciaNacional(editjn);
			
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);	
			User user = themeDisplay.getUser();
			String log="";
			log="Se modifico la JURISPRUDENCIA NACIONAL con id: "+id;
			auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
			audi.setFecha(new Date());
			audi.setEvento("MODIFICAR");
			audi.setTabla("GENERO_JURISPRUDENCIA_NACIONALES");
			audi.setLogs(log);
			audi.setIdUser(user.getUserId());
			auditoriaLocalServiceUtil.addauditoria(audi);
			
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/jurisprudenciaN.jsp");
			SessionMessages.add(request, "jnmodif");
		}
		
		public void eliminarjn(ActionRequest request, ActionResponse response) throws PortalException, SystemException{
			int id = ParamUtil.getInteger(request, "id");
			juresprudenciaNacionalLocalServiceUtil.deletejuresprudenciaNacional(id);
			
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);	
			User user = themeDisplay.getUser();
			String log="";
			log="Se elimino la JURISPRUDENCIA NACIONAL con id: "+id;
			auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
			audi.setFecha(new Date());
			audi.setEvento("ELIMINAR");
			audi.setTabla("GENERO_JURISPRUDENCIA_NACIONALES");
			audi.setLogs(log);
			audi.setIdUser(user.getUserId());
			auditoriaLocalServiceUtil.addauditoria(audi);
			
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/jurisprudenciaN.jsp");
			SessionMessages.add(request, "jneli");
		}
		
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> JURISPRUDENCIA INTERNACIONALES <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		
		public void editji( ActionRequest request, ActionResponse response){
			String id = ParamUtil.getString(request, "id");
			request.getPortletSession().setAttribute("id", id);
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/ji.jsp");
			SessionMessages.add(request, "nomensaje");
		}
		
		public void eliminarji( ActionRequest request, ActionResponse response) throws NumberFormatException, PortalException, SystemException{
			String id = ParamUtil.getString(request, "id");
			juresprudenciaInternacionalLocalServiceUtil.deletejuresprudenciaInternacional(Integer.valueOf(id));
			
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);	
			User user = themeDisplay.getUser();
			String log="";
			log="Se elimino la JURISPRUDENCIA INTERNACIONAL con id: "+id;
			auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
			audi.setFecha(new Date());
			audi.setEvento("ELIMINAR");
			audi.setTabla("GENERO_JURISPRUDENCIA_INTERNACIONALES");
			audi.setLogs(log);
			audi.setIdUser(user.getUserId());
			auditoriaLocalServiceUtil.addauditoria(audi);
			
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/jurisprudenciaI.jsp");
			SessionMessages.add(request, "jieli");
		}
		
		public void modificarji(ActionRequest request, ActionResponse response) throws PortalException, SystemException{
			int id = ParamUtil.getInteger(request, "id");
			String ji = ParamUtil.getString(request, "ji");
			String ano = ParamUtil.getString(request, "ano");
			String url = ParamUtil.getString(request, "url");
			
			juresprudenciaInternacional modificar = juresprudenciaInternacionalLocalServiceUtil.getjuresprudenciaInternacional(id);
			modificar.setReferencias(ji);
			modificar.setAnhio(ano);
			modificar.setUrl(url);
			juresprudenciaInternacionalLocalServiceUtil.updatejuresprudenciaInternacional(modificar);
			
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);	
			User user = themeDisplay.getUser();
			String log="";
			log="Se modifico la JURISPRUDENCIA INTERNACIONAL con id: "+id;
			auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
			audi.setFecha(new Date());
			audi.setEvento("MODIFICAR");
			audi.setTabla("GENERO_JURISPRUDENCIA_INTERNACIONALES");
			audi.setLogs(log);
			audi.setIdUser(user.getUserId());
			auditoriaLocalServiceUtil.addauditoria(audi);
			
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/jurisprudenciaI.jsp");
			SessionMessages.add(request, "jimodif");
			
		}
		
		public void agregarji(ActionRequest request, ActionResponse response) throws SystemException{
			String ji = ParamUtil.getString(request, "ji");
			String ano = ParamUtil.getString(request, "ano");
			String url = ParamUtil.getString(request, "url");
			
			int id = 0;
			List<juresprudenciaInternacional> normas = juresprudenciaInternacionalLocalServiceUtil.getjuresprudenciaInternacionals(-1, -1);
			for(juresprudenciaInternacional p : normas){
				if(p.getId()>=id){
					id=p.getId();
				}
			}
			id+=1;
			juresprudenciaInternacional nuevani = juresprudenciaInternacionalLocalServiceUtil.createjuresprudenciaInternacional(id);
			nuevani.setReferencias(ji);
			nuevani.setAnhio(ano);
			nuevani.setUrl(url);
			juresprudenciaInternacionalLocalServiceUtil.addjuresprudenciaInternacional(nuevani);
			
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);	
			User user = themeDisplay.getUser();
			String log="";
			log="Se agrego una nueva JURISPRUDENCIA INTERNACIONAL con id: "+id;
			auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
			audi.setFecha(new Date());
			audi.setEvento("AGREGAR");
			audi.setTabla("GENERO_JURISPRUDENCIA_INTERNACIONALES");
			audi.setLogs(log);
			audi.setIdUser(user.getUserId());
			auditoriaLocalServiceUtil.addauditoria(audi);
			
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/jurisprudenciaI.jsp");
			SessionMessages.add(request, "jiagre");
		}
		
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ENCUESTA ENFOQUE DIFERENCIAL <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		
		public void agregaree(ActionRequest request, ActionResponse response) throws SystemException{
			String pregunta = ParamUtil.getString(request, "ee");
			
			int id = 0;
			List<encuestaEnfoDife> normas = encuestaEnfoDifeLocalServiceUtil.getencuestaEnfoDifes(-1, -1);
			for(encuestaEnfoDife p : normas){
				if(p.getId()>=id){
					id=p.getId();
				}
			}
			id+=1;
			
			encuestaEnfoDife nueva = encuestaEnfoDifeLocalServiceUtil.createencuestaEnfoDife(id);
			nueva.setPregunta(pregunta);
			
			encuestaEnfoDifeLocalServiceUtil.addencuestaEnfoDife(nueva);
			
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);	
			User user = themeDisplay.getUser();
			String log="";
			log="Se agrego una nueva pregunta a la encuesta de IDENTIFICACIÓN DEL CASO DE GÉNERO DESDE EL ENFOQUE DIFERENCIAL con id: "+id;
			auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
			audi.setFecha(new Date());
			audi.setEvento("AGREGAR");
			audi.setTabla("GENERO_ENCUESTA_ENFOQUEDIFERENCIAL");
			audi.setLogs(log);
			audi.setIdUser(user.getUserId());
			auditoriaLocalServiceUtil.addauditoria(audi);
			
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/encuesta.jsp");
			SessionMessages.add(request, "eagregada");
			
		}
		
		public void editee(ActionRequest request, ActionResponse response){
			String id = ParamUtil.getString(request, "id");
			request.getPortletSession().setAttribute("idcatEe", id);
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/encuesta.jsp");
			SessionMessages.add(request, "nomensaje");
		}
		
		public void eliminaree(ActionRequest request, ActionResponse response) throws PortalException, SystemException{
			int id = ParamUtil.getInteger(request, "id");
			encuestaEnfoDifeLocalServiceUtil.deleteencuestaEnfoDife(id);
			
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);	
			User user = themeDisplay.getUser();
			String log="";
			log="Se elimino la pregunta de la encuesta de IDENTIFICACIÓN DEL CASO DE GÉNERO DESDE EL ENFOQUE DIFERENCIAL con id: "+id;
			auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
			audi.setFecha(new Date());
			audi.setEvento("ELIMINAR");
			audi.setTabla("GENERO_ENCUESTA_ENFOQUEDIFERENCIAL");
			audi.setLogs(log);
			audi.setIdUser(user.getUserId());
			auditoriaLocalServiceUtil.addauditoria(audi);
			
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/encuesta.jsp");
			SessionMessages.add(request, "eeli");
		}
		
		public void editaree(ActionRequest request, ActionResponse response) throws PortalException, SystemException{
			int id = ParamUtil.getInteger(request, "id");
			String pregunta = ParamUtil.getString(request, "ee");
			
			encuestaEnfoDife editar = encuestaEnfoDifeLocalServiceUtil.getencuestaEnfoDife(id);
			editar.setPregunta(pregunta);
			
			encuestaEnfoDifeLocalServiceUtil.updateencuestaEnfoDife(editar);
			
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);	
			User user = themeDisplay.getUser();
			String log="";
			log="Se modifico la pregunta de la encuesta de IDENTIFICACIÓN DEL CASO DE GÉNERO DESDE EL ENFOQUE DIFERENCIAL con id: "+id;
			auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
			audi.setFecha(new Date());
			audi.setEvento("MODIFICAR");
			audi.setTabla("GENERO_ENCUESTA_ENFOQUEDIFERENCIAL");
			audi.setLogs(log);
			audi.setIdUser(user.getUserId());
			auditoriaLocalServiceUtil.addauditoria(audi);
			
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/encuesta.jsp");
			SessionMessages.add(request, "emodif");
		}
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ENCUESTA CRITERIOS <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		
		public void agregarec(ActionRequest request, ActionResponse response) throws SystemException{
			String pregunta = ParamUtil.getString(request, "ec");
			
			int id = 0;
			List<encuestaCriterios> normas = encuestaCriteriosLocalServiceUtil.getencuestaCriterioses(-1, -1);
			for(encuestaCriterios p : normas){
				if(p.getId()>=id){
					id=p.getId();
				}
			}
			id+=1;
			
			encuestaCriterios nueva = encuestaCriteriosLocalServiceUtil.createencuestaCriterios(id);
			nueva.setPregunta(pregunta);
			
			encuestaCriteriosLocalServiceUtil.addencuestaCriterios(nueva);
			
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);	
			User user = themeDisplay.getUser();
			String log="";
			log="Se agrego una nueva pregunta a la encuesta de CRITERIOS ORIENTADORES RELACIONADOS CON EL PROCEDIMIENTO Y LA DECISIÓN JUDICIAL con id: "+id;
			auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
			audi.setFecha(new Date());
			audi.setEvento("AGREGAR");
			audi.setTabla("GENERO_ENCUESTA_CRITERIOS");
			audi.setLogs(log);
			audi.setIdUser(user.getUserId());
			auditoriaLocalServiceUtil.addauditoria(audi);
			
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/encuesta.jsp");
			SessionMessages.add(request, "eagregada");
			
		}
		
		public void editec(ActionRequest request, ActionResponse response){
			String id = ParamUtil.getString(request, "id");
			request.getPortletSession().setAttribute("idcatEc", id);
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/encuesta.jsp");
			SessionMessages.add(request, "nomensaje");
		}
		
		public void eliminarec(ActionRequest request, ActionResponse response) throws PortalException, SystemException{
			int id = ParamUtil.getInteger(request, "id");
			encuestaCriteriosLocalServiceUtil.deleteencuestaCriterios(id);
			
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);	
			User user = themeDisplay.getUser();
			String log="";
			log="Se elimino la pregunta de la encuesta de CRITERIOS ORIENTADORES RELACIONADOS CON EL PROCEDIMIENTO Y LA DECISIÓN JUDICIAL con id: "+id;
			auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
			audi.setFecha(new Date());
			audi.setEvento("ALIMINAR");
			audi.setTabla("GENERO_ENCUESTA_CRITERIOS");
			audi.setLogs(log);
			audi.setIdUser(user.getUserId());
			auditoriaLocalServiceUtil.addauditoria(audi);
			
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/encuesta.jsp");
			SessionMessages.add(request, "eeli");
		}
		
		public void editarec(ActionRequest request, ActionResponse response) throws PortalException, SystemException{
			int id = ParamUtil.getInteger(request, "id");
			String pregunta = ParamUtil.getString(request, "ec");
			
			encuestaCriterios editar = encuestaCriteriosLocalServiceUtil.getencuestaCriterios(id);
			editar.setPregunta(pregunta);
			
			encuestaCriteriosLocalServiceUtil.updateencuestaCriterios(editar);
			
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);	
			User user = themeDisplay.getUser();
			String log="";
			log="Se modifico la pregunta de la encuesta de CRITERIOS ORIENTADORES RELACIONADOS CON EL PROCEDIMIENTO Y LA DECISIÓN JUDICIAL con id: "+id;
			auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
			audi.setFecha(new Date());
			audi.setEvento("MODIFICAR");
			audi.setTabla("GENERO_ENCUESTA_CRITERIOS");
			audi.setLogs(log);
			audi.setIdUser(user.getUserId());
			auditoriaLocalServiceUtil.addauditoria(audi);
			
			response.setRenderParameter("mvcPath", "/html/administracion/parametrizacion/encuesta.jsp");
			SessionMessages.add(request, "emodif");
		} 
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> AUDITORIA <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		
		public void filtrar(ActionRequest actionRequest,ActionResponse actionResponse) throws ParseException{
			SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
			SimpleDateFormat formato1 = new SimpleDateFormat("dd-MM-yyyy");
			String fechaInicial = ParamUtil.getString(actionRequest, "FechaI");
			String fechaFinal = ParamUtil.getString(actionRequest, "FechaF");
			String tabla = ParamUtil.getString(actionRequest, "tabla");
			Date p = null;
			Date q = null;
			String fechaInicialS ="";
			String fechaFinalS = "";
			if(!fechaInicial.isEmpty()){
				p = formato.parse(fechaInicial);
			}
			if(!fechaFinal.isEmpty()){
				q = formato.parse(fechaFinal);
			}
			if(p!=null){
				fechaInicialS=formato1.format(p);
			}
			if(q!=null){
				fechaFinalS=formato1.format(q);
			}
			if(tabla.isEmpty()){
				tabla=null;
			}
			actionRequest.getPortletSession().setAttribute("fechaIni", fechaInicialS);
			actionRequest.getPortletSession().setAttribute("fechaFin", fechaFinalS);
			actionRequest.getPortletSession().setAttribute("tabla", tabla);
			System.out.println(fechaInicialS+"   "+fechaFinalS);
			actionResponse.setRenderParameter("mvcPath", "/html/administracion/auditoria/auditoria.jsp");
		}

		@Override
		public void serveResource(ResourceRequest resourceRequest,ResourceResponse resourceResponse) throws IOException,PortletException {
			
			HttpServletRequest request = PortalUtil.getOriginalServletRequest(PortalUtil.getHttpServletRequest(resourceRequest));
			HttpServletResponse response = PortalUtil.getHttpServletResponse(resourceResponse);
			
			String fechaInicial = (String) resourceRequest.getPortletSession().getAttribute("fechaIni")+" 00:00";
			String fechaFinal =  (String) resourceRequest.getPortletSession().getAttribute("fechaFin")+" 23:59";
			String tabla =  (String) resourceRequest.getPortletSession().getAttribute("tabla");
			
			FileOutputStream fichero = new FileOutputStream("C:\\reportes\\AuditoriaPerspectivasGenero.xls");
			Workbook wb = null;
			try {
				wb = exporterUtil.INSTANCE.exportAuditoriaGenero(fechaInicial,fechaFinal,tabla);
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
			res.setHeader("Content-Disposition", "attachment; filename=AuditoriaPerspectivasGenero.xls");
			OutputStream out = resourceResponse.getPortletOutputStream();
			InputStream in = new FileInputStream(new File("C:\\reportes\\AuditoriaPerspectivasGenero.xls"));
			IOUtils.copy(in, out);
			out.flush();
			in.close();
			out.close();
		}

		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> DISTRITOS <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		
		public void editdis(ActionRequest request, ActionResponse response){
			String id = ParamUtil.getString(request, "id");
			request.getPortletSession().setAttribute("idDistritoEditar", id);
			response.setRenderParameter("mvcPath", "/html/administracion/distritos/distritos.jsp");
			SessionMessages.add(request, "nomensaje");
			
		}
		
		public void editarDistrito(ActionRequest request, ActionResponse response) throws PortalException, SystemException{

			int id = ParamUtil.getInteger(request, "id");
			String nombre_mascara = ParamUtil.getString(request, "nombre_mascara");
			
			distritoG dis = distritoGLocalServiceUtil.getdistritoG(id);
			dis.setNombre_mascara(nombre_mascara.toUpperCase());
			
			distritoGLocalServiceUtil.updatedistritoG(dis);
			
			ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);	
			User user = themeDisplay.getUser();
			String log="";
			log="Se modifico el distrito con nombre: "+nombre_mascara;
			auditoria audi = auditoriaLocalServiceUtil.createauditoria(CounterLocalServiceUtil.increment(auditoria.class.getName(), 1));
			audi.setFecha(new Date());
			audi.setEvento("MODIFICAR");
			audi.setTabla("GENERO_DISTRITOS_MASCARAS");
			audi.setLogs(log);
			audi.setIdUser(user.getUserId());
			auditoriaLocalServiceUtil.addauditoria(audi);
			
			response.setRenderParameter("mvcPath", "/html/administracion/distritos/distritos.jsp");
			SessionMessages.add(request, "disModif");
			
		}
}
