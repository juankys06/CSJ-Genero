<%@page import="com.ability.genero.server.service.normasNacionalesLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.normasNacionales"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@include file="/html/init-control-panel.jsp"%>

<portlet:actionURL var="modificarnn" name="modificarnn"></portlet:actionURL>
<portlet:actionURL var="agregarnn" name="agregarnn"></portlet:actionURL>

<portlet:defineObjects />
<%
	String id = (String) renderRequest.getPortletSession().getAttribute("id");
	String ambito = (String) renderRequest.getPortletSession().getAttribute("ambito");
	normasNacionales nn = null;	
	if(id!=null){
		nn = normasNacionalesLocalServiceUtil.getnormasNacionales(Integer.parseInt(id));
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
					<%if(nn!=null){ %>
						<label class="negrita centro" style="font-size: 17px;"> Edición de Norma Nacional</label>
					<%}else{ %>
						<label class="negrita centro" style="font-size: 17px;"> Crear Norma Nacional</label>
					<%} %>
				</div>
				<br>
				<br>
				<div class="centroContenido">
					<%if(nn!=null){ %>
					<aui:form method="post" action="<%=modificarnn %>">
						<aui:input name="id" id="id" type="hidden" value="<%=id %>"></aui:input>
						<div class="row">
							<aui:input name="nn" id="nn" label="Norma Nacional:" required="true" type="textarea" style="width: 99% ;height : 80px;" value="<%=nn.getNormativas() %>"></aui:input>
						</div>
						<br>
						<div class="row">
							<aui:input name="ano" id="ano" label="Año:" required="true" style="width: 99% ;" value="<%=nn.getAnhio() %>"></aui:input>
						</div>
						<br>
						<div class="row">
							<aui:input name="url" id="url" label="URL:" style="width: 99% ;" value="<%=nn.getUrl() %>">
								<aui:validator name="url"></aui:validator>
							</aui:input>
						</div>
						<br>
						<div class="row centro">
							<aui:button type="submit" value="modificar norma nacional"></aui:button>
						</div>
					</aui:form>
					<%}else{ %>
					<aui:form  method="post" action="<%=agregarnn %>">
						<aui:input name="ambito" id="ambito" type="hidden" value="<%=ambito %>"></aui:input>
						<div class="row">
							<aui:input name="nn" id="nn" label="Norma Nacional:" required="true" type="textarea" style="width: 99% ;height : 80px;"></aui:input>
						</div>
						<br>
						<div class="row">
							<aui:input name="ano" id="ano" label="Año:" required="true" style="width: 99% ;"></aui:input>
						</div>
						<br>
						<div class="row">
							<aui:input name="url" id="url" label="URL:" style="width: 99% ;">
								<aui:validator name="url"></aui:validator>
							</aui:input>
						</div>
						<br>
						<div class="row centro">
							<aui:button type="submit" value="agregar norma nacional"></aui:button>
						</div>
					</aui:form>
					<% } %>
				</div>
			</div>
		</div>
	</div>
</div>
<script>
$('#normasN').addClass("active");	
</script>