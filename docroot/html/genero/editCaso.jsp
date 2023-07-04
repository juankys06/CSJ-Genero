<%@page import="com.ability.genero.server.service.generoUsuarioLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.generoUsuario"%>
<%@page import="com.liferay.portal.service.RoleLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.Role"%>
<%@page import="com.ability.genero.server.model.casoLV"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@include file="/html/init.jsp"%>

<%	ResultRow row=( ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	casoLV caso= (casoLV)row.getObject();
	String id=String.valueOf(caso.getId());
	String urlAux="";
	Role rolAdminPortal = RoleLocalServiceUtil.getRole(user.getCompanyId(), "Administrator");
	Role rolAdminGenero = RoleLocalServiceUtil.getRole(user.getCompanyId(), "Administrador de Perspectivas de Genero");
	Role rolComite = RoleLocalServiceUtil.getRole(user.getCompanyId(), "Comites Seccionales de Perspectivas Genero");
	String idUsu =String.valueOf(user.getUserId()); //id del usuario logueado
	generoUsuario usuarioDespacho = null;
	usuarioDespacho = generoUsuarioLocalServiceUtil.findByPorUsuario(idUsu); //despacho del usuario
%>

<liferay-ui:icon-menu>	
	<%if(usuarioDespacho!=null){%>
		<portlet:actionURL  name="editarCaso" var="editarCaso">
	       <portlet:param name="id" value="<%=id%>"/>	    
    	</portlet:actionURL>
    	<liferay-ui:icon image="edit"  message="Editar caso" url="<%=editarCaso %>"/>
    <%}%>
    <portlet:actionURL  name="detalleCaso" var="detalleCaso">
		<portlet:param name="id" value="<%=id%>"/>	    
    </portlet:actionURL>
    <liferay-ui:icon image="edit"  message="Detalle del caso" url="<%=detalleCaso %>"/>
    <%if(RoleLocalServiceUtil.hasUserRole(user.getUserId(), rolAdminPortal.getRoleId())){%>
    	<portlet:actionURL  name="eliminarCaso" var="eliminarCaso">
			<portlet:param name="id" value="<%=id%>"/>	    
    	</portlet:actionURL>
    	<liferay-ui:icon image="delete"  message="Eliminar caso" url="<%=eliminarCaso %>"/>
    <%} %>
    	
</liferay-ui:icon-menu>