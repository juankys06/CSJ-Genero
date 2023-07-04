<%@page import="com.ability.genero.server.service.preguntasClaveLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.preguntasClave"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@include file="/html/init-control-panel.jsp"%>

<portlet:actionURL var="modificarPre" name="modificarPre"></portlet:actionURL>
<portlet:actionURL var="agregarPre" name="agregarPre"></portlet:actionURL>

<portlet:defineObjects />
<%
	String id = (String) renderRequest.getPortletSession().getAttribute("id");
	preguntasClave pregunta = null;	
	if(id!=null){
		pregunta = preguntasClaveLocalServiceUtil.getpreguntasClave(Integer.parseInt(id));
	}
	renderRequest.getPortletSession().removeAttribute("id");
%>
<div class="contenedor">
	<div class="row">
		<div class="bloque" style="width: 20%">
			<jsp:include page="/html/administracion/menu.jsp"></jsp:include>
		</div>
		<div class="bloque" style="width: 79% ;">
			<div class="row">
				<div class="row">
					<%if(pregunta!=null){ %>
						<label class="negrita centro" style="font-size: 17px;"> Edición de pregunta clave</label>
					<%}else{ %>
						<label class="negrita centro" style="font-size: 17px;"> Crear pregunta clave</label>
					<%} %>
				</div>
				<br>
				<br>
				<div class="centroContenido">
					<%if(pregunta!=null){ %>
					<aui:form method="post" action="<%=modificarPre %>">
						<aui:input name="id" id="id" type="hidden" value="<%=id %>"></aui:input>
						<div class="row">
							<aui:input name="pregunta" id="pregunta" label="Pregunta:" style="width: 99% ;" value="<%=pregunta.getPregunta() %>" required="true"></aui:input>
						</div>
						<br>
						<div class="row">
							<aui:input name="respuesta" id="respuesta" label="Respuesta:" type="textarea" style="width: 99% ;height : 80px;" value="<%=pregunta.getRespuesta() %>" required="true"></aui:input>
						</div>
						<br>
						<div class="row centro">
							<aui:button type="submit" value="modificar pregunta"></aui:button>
						</div>
					</aui:form>
					<%}else{ %>
					<aui:form method="post" action="<%=agregarPre %>">
						<div class="row">
							<aui:input name="pregunta" id="pregunta" label="Pregunta:" style="width: 99% ;" value="" required="true"></aui:input>
						</div>
						<br>
						<div class="row">
							<aui:input name="respuesta" id="respuesta" label="Respuesta:" type="textarea" style="width: 99% ;height : 80px;" value="" required="true"></aui:input>
						</div>
						<br>
						<div class="row centro">
							<aui:button type="submit" value="agregar pregunta"></aui:button>
						</div>
					</aui:form>
					<% } %>
				</div>
			</div>
		</div>
	</div>
</div>
<script>
$('#preguntaC').addClass("active");	
</script>