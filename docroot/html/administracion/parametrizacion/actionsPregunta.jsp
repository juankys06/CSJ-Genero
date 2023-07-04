<%@page import="com.ability.genero.server.model.preguntasClave"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@include file="/html/init.jsp"%>

<%	ResultRow row=( ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	preguntasClave pre= (preguntasClave)row.getObject();
	String id=String.valueOf(pre.getId());
	String urlAux="";
%>

<liferay-ui:icon-menu>	
	
	<portlet:actionURL  name="editarpregunta" var="editarpregunta">
	       <portlet:param name="id" value="<%=id%>"/>	    
    </portlet:actionURL>
    <liferay-ui:icon image="edit"  message="Editar" url="<%=editarpregunta %>"/>	
    <portlet:actionURL  name="eliminarpregunta" var="eliminarpregunta">
	       <portlet:param name="id" value="<%=id%>"/>	    
    </portlet:actionURL>
    <liferay-ui:icon image="delete"  message="Eliminar" url="<%=eliminarpregunta %>"/>
</liferay-ui:icon-menu>