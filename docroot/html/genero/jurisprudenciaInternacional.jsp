<%@page import="com.ability.genero.server.service.juresprudenciaInternacionalLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.juresprudenciaInternacional"%>
<%@page import="java.util.List"%>
<%@page import="com.ability.genero.server.service.entidadLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.entidad"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@include file="/html/init.jsp"%>

<% List<juresprudenciaInternacional> jurisInter = juresprudenciaInternacionalLocalServiceUtil.getjuresprudenciaInternacionals(-1, -1); %>

<portlet:defineObjects />


<div class="contenedor">
	<jsp:include page="/html/genero/menu.jsp"></jsp:include>
	<br>
	<br>
	<div class="row">
		<br>
		<br>
		<div class="row centro negrita">
			<label style="font-size: 16px; text-decoration: underline;">PERSPECTIVA DE GÉNERO EN LAS DECISIONES JUDICIALES</label>
			<br>
			<label style="font-size: 14px;">JURISPRUDENCIA INTERNACIONAL</label>
		</div>
		<br>
		<br>
		<div class="centroContenido">
			<table class="row">
				<tr>
					<th class="row centro tablaTituloJI borde" style="width: 80%;">SELECCIÓN DE ALGUNAS REFERENCIAS JURISPRUDENCIALES A NIVEL  INTERNACIONAL</th>
					<th class="row centro tablaTituloJI borde" style="width: 20%;">REFERENCIA Y AÑO</th>
				</tr>
				<%if(jurisInter!=null){ %>
					<%for(juresprudenciaInternacional ji : jurisInter){ %>
							<tr class="izqui" style="font-size: 12px;">
								<%if(!ji.getUrl().equalsIgnoreCase("")){ %>
									<td class="borde" style="width: 80%; padding: 1%;"><a target="_blank" href="<%=ji.getUrl()%>"><%=ji.getReferencias() %></a></td>
								<%}else{ %>
									<td class="borde" style="width: 80%; padding: 1%;"><label><%=ji.getReferencias() %></label></td>
								<%} %>	
								<td class="borde centro" style="width: 20%; padding: 1%;"><%=ji.getAnhio() %></td>
							</tr>
					<%} %>
				<%} %>
			</table>
		</div>
	</div>
</div>