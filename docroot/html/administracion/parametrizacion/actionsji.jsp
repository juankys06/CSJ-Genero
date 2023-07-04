<%@page import="com.ability.genero.server.model.juresprudenciaInternacional"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@include file="/html/init.jsp"%>

<%	ResultRow row=( ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	juresprudenciaInternacional cat= (juresprudenciaInternacional)row.getObject();
	String id=String.valueOf(cat.getId());
	String urlAux="";
%>

<liferay-ui:icon-menu>	
	
	<portlet:actionURL  name="editji" var="editji">
	       <portlet:param name="id" value="<%=id%>"/>	    
    </portlet:actionURL>
    <liferay-ui:icon image="edit"  message="Editar" url="<%=editji %>"/>	
    <portlet:actionURL  name="eliminarji" var="eliminarji">
	       <portlet:param name="id" value="<%=id%>"/>	    
    </portlet:actionURL>
    <liferay-ui:icon image="delete"  message="Eliminar" url="<%=eliminarji %>"/>
</liferay-ui:icon-menu>