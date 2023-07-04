<%@page import="com.ability.genero.server.model.encuestaCriterios"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@include file="/html/init.jsp"%>

<%	ResultRow row=( ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	encuestaCriterios cat= (encuestaCriterios)row.getObject();
	String id=String.valueOf(cat.getId());
	String urlAux="";
%>

<liferay-ui:icon-menu>	
	
	<portlet:actionURL  name="editec" var="editec">
	       <portlet:param name="id" value="<%=id%>"/>	    
    </portlet:actionURL>
    <liferay-ui:icon image="edit"  message="Editar" url="<%=editec %>"/>	
    <portlet:actionURL  name="eliminarec" var="eliminarec">
	       <portlet:param name="id" value="<%=id%>"/>	    
    </portlet:actionURL>
    <liferay-ui:icon image="delete"  message="Eliminar" url="<%=eliminarec %>"/>
</liferay-ui:icon-menu>