<%@page import="com.ability.genero.server.model.generoUsuarioComite"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@include file="/html/init.jsp"%>

<%	ResultRow row=( ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	generoUsuarioComite usuariosgenero= (generoUsuarioComite)row.getObject();
	String id=String.valueOf(usuariosgenero.getId());
	String urlAux="";
%>

<liferay-ui:icon-menu>	
	
	<portlet:actionURL  name="eliminarUsuarioC" var="eliminarUsuarioC">
	       <portlet:param name="id" value="<%=id%>"/>	    
    </portlet:actionURL>
    
    	    
   <liferay-ui:icon image="delete"  message="eliminar" url="<%=eliminarUsuarioC %>"/>	
</liferay-ui:icon-menu>