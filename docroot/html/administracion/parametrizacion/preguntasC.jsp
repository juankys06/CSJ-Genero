<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.ability.genero.server.service.preguntasClaveLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.preguntasClave"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@include file="/html/init-control-panel.jsp"%>

<%
	List <preguntasClave> preguntas = preguntasClaveLocalServiceUtil.getpreguntasClaves(-1, -1);
%>

<portlet:defineObjects />

<liferay-portlet:renderURL varImpl="iteratorURL">
	<portlet:param name="mvcPath" value="/html/administracion/parametrizacion/preguntasC.jsp"/>
</liferay-portlet:renderURL>
<portlet:renderURL var="agregar">
	<portlet:param name="mvcPath" value="/html/administracion/parametrizacion/pregunta.jsp"/>
</portlet:renderURL>

<liferay-ui:success key="preguntamodif" message="Pregunta clave modificada"></liferay-ui:success>
<liferay-ui:success key="preguntaagre" message="Pregunta clave agregada"></liferay-ui:success>
<liferay-ui:success key="elimenoPre" message="Pregunta clave Eliminada"></liferay-ui:success>

<div class="contenedor">
	<div class="row">
		<div class="bloque" style="width: 20%">
			<jsp:include page="/html/administracion/menu.jsp"></jsp:include>
		</div>
		<div class="bloque" style="width: 79% ;">
			<div class="row">
				<label class="negrita centro" style="font-size: 17px">Preguntas Clave</label>
				<div class="row izqui">
					<aui:button style="margin-left: 5%" value="Nueva Pregunta" href="<%=agregar %>"></aui:button>
				</div>
				<br>
				<div class="centroContenido">
					<liferay-ui:search-container   delta="10" deltaConfigurable="true"  emptyResultsMessage="No hay preguntas claves registradas" iteratorURL="<%=iteratorURL%>">
		    			<liferay-ui:search-container-results>
		        			<%				
							 	String keywords = ParamUtil.getString(request, "keywords");		
								results = ListUtil.subList(preguntas, searchContainer.getStart(), searchContainer.getEnd());
								total = preguntas.size();
								searchContainer.setTotal(preguntas.size());
								pageContext.setAttribute("results", results);
								pageContext.setAttribute("total", total);			
							%>
		    			</liferay-ui:search-container-results>    
						<liferay-ui:search-container-row className="com.ability.genero.server.model.preguntasClave" keyProperty="id" modelVar="pre">          	
						    <liferay-ui:search-container-column-text name="Id" 				value="<%=String.valueOf(pre.getId())  %>"/>
						    <liferay-ui:search-container-column-text name="Pregunta" 		value="<%=pre.getPregunta() %>"/>
				    	   	<liferay-ui:search-container-column-text name="Respuesta" 		value="<%=pre.getRespuesta() %>"/>
				       		<liferay-ui:search-container-column-jsp  name="Acciones"  		path="/html/administracion/parametrizacion/actionsPregunta.jsp" />			     
				  		</liferay-ui:search-container-row>
			  			<liferay-ui:search-iterator />
					</liferay-ui:search-container>
				</div>
			</div>
		</div>
	</div>
</div>
<script>
$('#preguntaC').addClass("active");	
</script>