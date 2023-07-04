<%@page import="com.ability.genero.server.service.normasInteracionalesLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.normasInteracionales"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@include file="/html/init-control-panel.jsp"%>

<portlet:actionURL var="modificarni" name="modificarni"></portlet:actionURL>
<portlet:actionURL var="agregarni" name="agregarni"></portlet:actionURL>

<portlet:defineObjects />
<%
	String id = (String) renderRequest.getPortletSession().getAttribute("id");
normasInteracionales ni = null;	
	if(id!=null){
		ni = normasInteracionalesLocalServiceUtil.getnormasInteracionales(Integer.parseInt(id));
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
					<%if(ni!=null){ %>
						<label class="negrita centro" style="font-size: 17px;"> Edición de Norma Internacional</label>
					<%}else{ %>
						<label class="negrita centro" style="font-size: 17px;"> Crear Norma Internacional</label>
					<%} %>
				</div>
				<br>
				<br>
				<div class="centroContenido">
					<%if(ni!=null){ %>
					<aui:form method="post" action="<%=modificarni %>">
						<aui:input name="id" id="id" type="hidden" value="<%=id %>"></aui:input>
						<div class="row">
							<aui:input name="ni" id="ni" required="true" label="Norma Internacional:" type="textarea" style="width: 99% ;height : 80px;" value="<%=ni.getConferencias() %>"></aui:input>
						</div>
						<br>
						<div class="row">
							<aui:input name="ano" id="ano" required="true" label="Año:" style="width: 99% ;" value="<%=ni.getAnhio() %>"></aui:input>
						</div>
						<br>
						<div class="row">
							<aui:input name="url" id="url" label="URL:" style="width: 99% ;" value="<%=ni.getUrl() %>">
								<aui:validator name="url"></aui:validator>
							</aui:input>
						</div>
						<br>
						<div class="row centro">
							<aui:button type="submit" value="modificar norma Internacional"></aui:button>
						</div>
					</aui:form>
					<%}else{ %>
					<aui:form  method="post" action="<%=agregarni %>">
						<div class="row">
							<aui:input name="ni" id="ni" required="true" label="Norma Internacional:" style="width: 99% ;height : 80px;"></aui:input>
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
							<aui:button type="submit" value="agregar norma Internacional"></aui:button>
						</div>
					</aui:form>
					<% } %>
				</div>
			</div>
		</div>
	</div>
</div>
<script>
$('#normasI').addClass("active");	
</script>