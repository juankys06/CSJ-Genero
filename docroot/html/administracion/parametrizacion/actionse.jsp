<%@page import="com.ability.genero.server.model.encuestaEnfoDife"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@include file="/html/init.jsp"%>

<%	ResultRow row=( ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	encuestaEnfoDife cat= (encuestaEnfoDife)row.getObject();
	String id=String.valueOf(cat.getId());
	String urlAux="";
%>

<liferay-ui:icon-menu>	
	
	<portlet:actionURL  name="editee" var="editee">
	       <portlet:param name="id" value="<%=id%>"/>	    
    </portlet:actionURL>
    <liferay-ui:icon image="edit"  message="Editar" url="<%=editee %>"/>	
    <portlet:actionURL  name="eliminaree" var="eliminaree">
	       <portlet:param name="id" value="<%=id%>"/>	    
    </portlet:actionURL>
    <liferay-ui:icon image="delete"  message="Eliminar" url="<%=eliminaree %>"/>
</liferay-ui:icon-menu>