<%@page import="com.ability.genero.server.service.normasInteracionalesLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.normasInteracionales"%>
<%@page import="java.util.List"%>
<%@page import="com.ability.genero.server.service.entidadLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.entidad"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@include file="/html/init.jsp"%>

<% List<normasInteracionales> normas = normasInteracionalesLocalServiceUtil.getnormasInteracionaleses(-1, -1); %>

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
			<label style="font-size: 14px;">INSTRUMENTOS NORMATIVOS INTERNACIONALES</label>
			<br>
			<a target="_blank" href="https://www.ramajudicial.gov.co/web/comision-nacional-de-genero/instrumentos-internacionales">En el Observatorio de la Comisión Nacional de Género de la Rama Judicial, se pueden consultar los instrumentos normativos internacionales.</a>
		</div>
		<br>
		<br>
		<div class="centroContenido">
			<table class="row">
				<tr>
					<th class="row centro tablaTituloNI borde" style="width: 90%;">CONFERENCIAS - CONVENCIONES - PACTOS - DECLARACIONES - PROTOCOLOS </th>
					<th class="row centro tablaTituloNI borde" style="width: 10%;">AÑO</th>
				</tr>
				<%if(normas!=null){ %>
					<%for(normasInteracionales nor : normas){ %>
							<tr class="izqui" style="font-size: 12px;">
								<%if(!nor.getUrl().equalsIgnoreCase("")){ %>
									<td class="borde" style="width: 90%; padding: 1%;"><a target="_blank" href="<%=nor.getUrl()%>"><%=nor.getConferencias() %></a></td>
								<%}else{ %>
									<td class="borde" style="width: 90%; padding: 1%;"><label><%=nor.getConferencias() %></label></td>
								<%} %>
								<td class="borde centro" style="width: 10%; padding: 1%;"><%=nor.getAnhio() %></td>
							</tr>
						<%} %>
					<%} %>
			</table>
		</div>
	</div>
</div>
