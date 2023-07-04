<%@page import="com.ability.genero.server.model.juresprudenciaNacional"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@include file="/html/init.jsp"%>

<%	ResultRow row=( ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
juresprudenciaNacional cat= (juresprudenciaNacional)row.getObject();
	String id=String.valueOf(cat.getId());
	String urlAux="";
%>

<liferay-ui:icon-menu>	
	
	<portlet:actionURL  name="editjn" var="editjn">
	       <portlet:param name="id" value="<%=id%>"/>	    
    </portlet:actionURL>
    <liferay-ui:icon image="edit"  message="Editar" url="<%=editjn %>"/>	
    <portlet:actionURL  name="eliminarjn" var="eliminarjn">
	       <portlet:param name="id" value="<%=id%>"/>	    
    </portlet:actionURL>
    <liferay-ui:icon image="delete"  message="Eliminar" url="<%=eliminarjn %>"/>
</liferay-ui:icon-menu>