<%@page import="java.util.List"%>
<%@page import="com.ability.genero.server.service.preguntasClaveLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.preguntasClave"%>
<%@page import="com.ability.genero.server.service.entidadLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.entidad"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@include file="/html/init.jsp"%>

<% List<preguntasClave> preguntasClaves = preguntasClaveLocalServiceUtil.getpreguntasClaves(-1, -1); %>

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
			<label style="font-size: 14px;">PREGUNTAS CLAVES</label>
		</div>
		<br>
		<br>
		<div class="centroContenido">
			<table class="row">
				<tr>
					<th class="row centro tablaTituloPre borde">PREGUNTAS CLAVES PARA ESTABLECER LA PERSPECTIVA DE GÉENRO DESDE EL ENFOQUE DIFERENCIAL</th>
				</tr>
				<%if(preguntasClaves!=null){ %>
					<%for(preguntasClave pre : preguntasClaves){ %>
						<tr>
							<td class="row borde izqui" style="padding: 2%;">
								<label class="negrita" style="font-size: 13px;"><%=pre.getPregunta() %></label>
								<label style="font-size: 13px;"><%=pre.getRespuesta() %></label>
							</td>
						</tr>
					<%} %>
				<%} %>
			</table>
		</div>
	</div>
</div>