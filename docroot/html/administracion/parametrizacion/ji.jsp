<%@page import="com.ability.genero.server.service.juresprudenciaInternacionalLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.juresprudenciaInternacional"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@include file="/html/init-control-panel.jsp"%>

<portlet:actionURL var="modificarji" name="modificarji"></portlet:actionURL>
<portlet:actionURL var="agregarji" name="agregarji"></portlet:actionURL>

<portlet:defineObjects />
<%
	String id = (String) renderRequest.getPortletSession().getAttribute("id");
juresprudenciaInternacional ji = null;	
	if(id!=null){
		ji = juresprudenciaInternacionalLocalServiceUtil.getjuresprudenciaInternacional(Integer.parseInt(id));
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
					<%if(ji!=null){ %>
						<label class="negrita centro" style="font-size: 17px;"> Edición de Jurisprudencia Internacional</label>
					<%}else{ %>
						<label class="negrita centro" style="font-size: 17px;"> Crear Jurisprudencia Internacional</label>
					<%} %>
				</div>
				<br>
				<br>
				<div class="centroContenido">
					<%if(ji!=null){ %>
					<aui:form method="post" action="<%=modificarji %>">
						<aui:input name="id" id="id" type="hidden" value="<%=id %>"></aui:input>
						<div class="row">
							<aui:input name="ji" id="ji" required="true" label="Jurisprudencia Internacional:" type="textarea" style="width: 99% ;height : 80px;" value="<%=ji.getReferencias() %>"></aui:input>
						</div>
						<br>
						<div class="row">
							<aui:input name="ano" id="ano" required="true" label="Año:" style="width: 99% ;" value="<%=ji.getAnhio() %>"></aui:input>
						</div>
						<br>
						<div class="row">
							<aui:input name="url" id="url" label="URL:" style="width: 99% ;" value="<%=ji.getUrl() %>">
								<aui:validator name="url"></aui:validator>
							</aui:input>
						</div>
						<br>
						<div class="row centro">
							<aui:button type="submit" value="modificar Jurisprudencia Internacional"></aui:button>
						</div>
					</aui:form>
					<%}else{ %>
					<aui:form  method="post" action="<%=agregarji %>">
						<div class="row">
							<aui:input name="ji" id="ji" required="true" label="Jurisprudencia Internacional:" style="width: 99% ;height : 80px;"></aui:input>
						</div>
						<br>
						<div class="row">
							<aui:input name="ano" id="ano" required="true" label="Año:" style="width: 99% ;"></aui:input>
						</div>
						<br>
						<div class="row">
							<aui:input name="url" id="url" label="URL:" style="width: 99% ;">
								<aui:validator name="url"></aui:validator>
							</aui:input>
						</div>
						<br>
						<div class="row centro">
							<aui:button type="submit" value="agregar Jurisprudencia Internacional"></aui:button>
						</div>
					</aui:form>
					<% } %>
				</div>
			</div>
		</div>
	</div>
</div>
<script>
$('#jurisprudenciaI').addClass("active");	
</script>