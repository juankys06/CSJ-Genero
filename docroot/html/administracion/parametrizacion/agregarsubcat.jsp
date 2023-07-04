<%@page import="com.ability.genero.server.service.subcategoriaLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.subcategoria"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@include file="/html/init-control-panel.jsp"%>

<portlet:actionURL var="modificarSubcat" name="modificarSubcat"></portlet:actionURL>
<portlet:actionURL var="agregarSubcat" name="agregarSubcat"></portlet:actionURL>

<portlet:defineObjects />
<%
	String id = (String) renderRequest.getPortletSession().getAttribute("id");
	String idcat = (String) renderRequest.getPortletSession().getAttribute("idcategoriasub");
	subcategoria subcategoria = null;	
	if(id!=null){
		subcategoria = subcategoriaLocalServiceUtil.getsubcategoria(Integer.parseInt(id));
	}
	renderRequest.getPortletSession().removeAttribute("id");
	renderRequest.getPortletSession().removeAttribute("idcategoriasub");
%>
<div class="contenedor">
	<div class="row">
		<div class="bloque" style="width: 20%">
			<jsp:include page="/html/administracion/menu.jsp"></jsp:include>
		</div>
		<div class="bloque" style="width: 79% ;">
			<div class="row">
				<div class="row">
					<%if(subcategoria!=null){ %>
						<label class="negrita centro" style="font-size: 17px;"> Edición de Subcategoria</label>
					<%}else{ %>
						<label class="negrita centro" style="font-size: 17px;"> Crear Subcategoria</label>
					<%} %>
				</div>
				<br>
				<br>
				<div class="centroContenido">
					<%if(subcategoria!=null){ %>
					<aui:form method="post" action="<%=modificarSubcat %>">
						<aui:input name="id" id="id" type="hidden" value="<%=id %>"></aui:input>
						<div class="row">
							<aui:input name="subcategoria" id="subcategoria" required="true" label="Subcategoria:" style="width: 99% ;" value="<%=subcategoria.getSubcategoria() %>"></aui:input>
						</div>
						<br>
						<div class="row">
							<aui:input name="url" id="url" label="URL:" style="width: 99% ;" value="<%=subcategoria.getUrl() %>">
								<aui:validator name="url"></aui:validator>
							</aui:input>
						</div>
						<br>
						<div class="row centro">
							<aui:button type="submit" value="modificar subcategoria"></aui:button>
						</div>
					</aui:form>
					<%}else{ %>
					<aui:form  method="post" action="<%=agregarSubcat %>">
						<aui:input name="id" id="id" type="hidden" value="<%=idcat %>"></aui:input>
						<div class="row">
							<aui:input name="subcategoria" id="subcategoria" label="Subcategoria:" required="true" style="width: 99% ;" value=""></aui:input>
						</div>
						<br>
						<div class="row">
							<aui:input name="url" id="url" label="URL:" type="textarea" style="width: 99% ;height : 80px;" value="">
								<aui:validator name="url"></aui:validator>
							</aui:input>
						</div>
						<br>
						<div class="row centro">
							<aui:button type="submit" value="agregar subcategoria"></aui:button>
						</div>
					</aui:form>
					<% } %>
				</div>
			</div>
		</div>
	</div>
</div>
<script>
$('#matriz').addClass("active");	
</script>