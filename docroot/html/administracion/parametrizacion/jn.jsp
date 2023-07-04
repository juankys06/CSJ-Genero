<%@page import="com.ability.genero.server.service.juresprudenciaNacionalLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.juresprudenciaNacional"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@include file="/html/init-control-panel.jsp"%>

<portlet:actionURL var="modificarjn" name="modificarjn"></portlet:actionURL>
<portlet:actionURL var="agregarjn" name="agregarjn"></portlet:actionURL>

<portlet:defineObjects />
<%
	String id = (String) renderRequest.getPortletSession().getAttribute("id");
	String ambito = (String) renderRequest.getPortletSession().getAttribute("ambito");
	juresprudenciaNacional jn = null;	
	if(id!=null){
		jn = juresprudenciaNacionalLocalServiceUtil.getjuresprudenciaNacional(Integer.parseInt(id));
	}
	renderRequest.getPortletSession().removeAttribute("id");
	renderRequest.getPortletSession().removeAttribute("ambito");
%>
<div class="contenedor">
	<div class="row">
		<div class="bloque" style="width: 20%">
			<jsp:include page="/html/administracion/menu.jsp"></jsp:include>
		</div>
		<div class="bloque" style="width: 79% ;">
			<div class="row">
				<div class="row">
					<%if(jn!=null){ %>
						<label class="negrita centro" style="font-size: 17px;"> Edición de Jurisprudencia Nacional</label>
					<%}else{ %>
						<label class="negrita centro" style="font-size: 17px;"> Crear Jurisprudencia Nacional</label>
					<%} %>
				</div>
				<br>
				<br>
				<div class="centroContenido">
					<%if(jn!=null){ %>
					<aui:form method="post" action="<%=modificarjn %>">
						<aui:input name="id" id="id" type="hidden" value="<%=id %>"></aui:input>
						<div class="row">
							<aui:input name="jn" id="jn" required="true" label="Jurisprudencia Nacional:" type="textarea" style="width: 99% ;height : 80px;" value="<%=jn.getReferencias() %>"></aui:input>
						</div>
						<br>
						<div class="row">
							<aui:input name="cor" id="cor" required="true" label="Corporación:" style="width: 99% ;" value="<%=jn.getCorporacion() %>"></aui:input>
						</div>
						<br>
						<div class="row">
							<aui:input name="url" id="url" label="URL:" style="width: 99% ;" value="<%=jn.getUrl() %>">
								<aui:validator name="url"></aui:validator>
							</aui:input>
						</div>
						<br>
						<div class="row centro">
							<aui:button type="submit" value="modificar Jurisprudencia nacional"></aui:button>
						</div>
					</aui:form>
					<%}else{ %>
					<aui:form  method="post" action="<%=agregarjn %>">
						<aui:input name="ambito" id="ambito" type="hidden" value="<%=ambito %>"></aui:input>
						<div class="row">
							<aui:input name="jn" id="jn" required="true" label="Jurisprudencia Nacional:" type="textarea" style="width: 99% ;height : 80px;"></aui:input>
						</div>
						<br>
						<div class="row">
							<aui:input name="cor" id="cor" required="true" label="Corporación:" style="width: 99% ;"></aui:input>
						</div>
						<br>
						<div class="row">
							<aui:input name="url" id="url" label="URL:" style="width: 99% ;">
								<aui:validator name="url"></aui:validator>
							</aui:input>
						</div>
						<br>
						<div class="row centro">
							<aui:button type="submit" value="agregar Jurisprudencia nacional"></aui:button>
						</div>
					</aui:form>
					<% } %>
				</div>
			</div>
		</div>
	</div>
</div>
<script>
$('#jurisprudenciaN').addClass("active");	
</script>