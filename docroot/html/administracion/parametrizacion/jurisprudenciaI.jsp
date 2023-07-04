<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.ability.genero.server.service.juresprudenciaInternacionalLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.juresprudenciaInternacional"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@include file="/html/init-control-panel.jsp"%>

<%
	List <juresprudenciaInternacional> norma = juresprudenciaInternacionalLocalServiceUtil.getjuresprudenciaInternacionals(-1, -1);
%>

<portlet:defineObjects />

<liferay-portlet:renderURL varImpl="iteratorURL">
	<portlet:param name="mvcPath" value="/html/administracion/parametrizacion/jurisprudenciaI.jsp"/>
</liferay-portlet:renderURL>
<portlet:renderURL var="agregarji">
	<portlet:param name="mvcPath" value="/html/administracion/parametrizacion/ji.jsp"/>
</portlet:renderURL>

<liferay-ui:success key="jimodif" message="Jurisprudencia internacional modificada"></liferay-ui:success>
<liferay-ui:success key="jiagre" message="Jurisprudencia internacional agregada"></liferay-ui:success>
<liferay-ui:success key="jieli" message="Jurisprudencia internacional Eliminada"></liferay-ui:success>

<div class="contenedor">
	<div class="row">
		<div class="bloque" style="width: 20%">
			<jsp:include page="/html/administracion/menu.jsp"></jsp:include>
		</div>
		<div class="bloque" style="width: 79% ;">
			<div class="row">
				<label class="negrita centro" style="font-size: 17px">Jurisprudencia Internacionales</label>
				<br>
				<label class="negrita centro" style="font-size: 15px">Selección de algunas referencias jurisprudenciales a nivel internacional</label>
				<br>
				<div class="row izqui">
					<aui:button style="margin-left: 5%" value="Nueva Jurisprudencia internacional" href="<%=agregarji %>"></aui:button>
				</div>
				<br>
				<div class="centroContenido">
					<liferay-ui:search-container   delta="10" deltaConfigurable="true"  emptyResultsMessage="No hay Jurisprudencia internacionales registradas" iteratorURL="<%=iteratorURL%>">
		    			<liferay-ui:search-container-results>
		        			<%				
							 	String keywords = ParamUtil.getString(request, "keywords");		
								results = ListUtil.subList(norma, searchContainer.getStart(), searchContainer.getEnd());
								total = norma.size();
								searchContainer.setTotal(norma.size());
								pageContext.setAttribute("results", results);
								pageContext.setAttribute("total", total);			
							%>
		    			</liferay-ui:search-container-results>    
						<liferay-ui:search-container-row className="com.ability.genero.server.model.juresprudenciaInternacional" keyProperty="id" modelVar="pre">          	
						    <liferay-ui:search-container-column-text name="Id" 				value="<%=String.valueOf(pre.getId())  %>"/>
						    <liferay-ui:search-container-column-text name="Jurisprudencia Internacional" 		value="<%=pre.getReferencias() %>"/>
						    <liferay-ui:search-container-column-text name="Referencia y año" 		value="<%=pre.getAnhio() %>"/>
				       		<liferay-ui:search-container-column-jsp  name="Acciones"  		path="/html/administracion/parametrizacion/actionsji.jsp" />			     
				  		</liferay-ui:search-container-row>
			  			<liferay-ui:search-iterator />
					</liferay-ui:search-container>
				</div>
			</div>
		</div>
	</div>
</div>
<script>
$('#jurisprudenciaI').addClass("active");	
</script>