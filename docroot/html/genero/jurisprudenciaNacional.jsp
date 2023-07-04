<%@page import="com.ability.genero.server.service.juresprudenciaNacionalLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.juresprudenciaNacional"%>
<%@page import="java.util.List"%>
<%@page import="com.ability.genero.server.service.entidadLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.entidad"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@include file="/html/init.jsp"%>

<% List<juresprudenciaNacional> jurisNa = juresprudenciaNacionalLocalServiceUtil.getjuresprudenciaNacionals(-1, -1); %>

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
			<label style="font-size: 14px;">JURISPRUDENCIA NACIONAL</label>
			<br>
			<a target="_blank" href="http://jurisprudencia.ramajudicial.gov.co/WebRelatoria/gen/index.xhtml">En el Observatorio de la Comisión Nacional de Género de la Rama Judicial, se pueden consultar la jurisprudencia nacional.</a>
		</div>
		<br>
		<br>
		<div class="centroContenido">
			<table class="row">
				<tr>
					<th class="row centro tablaTituloJN borde" style="width: 80%;">SELECCIÓN DE ALGUNAS REFERENCIAS JURISPRUDENCIALES A NIVEL NACIONAL</th>
					<th class="row centro tablaTituloJN borde" style="width: 20%;">CORPORACIÓN</th>
				</tr>
				<%if(jurisNa!=null){ %>
					<%for(juresprudenciaNacional jn : jurisNa){ %>
						<%if(jn.getAmbito().equalsIgnoreCase("1")){ %>
							<tr class="izqui" style="font-size: 12px;">
								<%if(!jn.getUrl().equalsIgnoreCase("")){ %>
									<td class="borde" style="width: 80%; padding: 1%;"><a target="_blank" href="<%=jn.getUrl()%>"><%=jn.getReferencias() %></a></td>
								<%}else{ %>
									<td class="borde" style="width: 80%; padding: 1%;"><label><%=jn.getReferencias() %></label></td>
								<%} %>	
								<td class="borde centro" style="width: 20%; padding: 1%;"><%=jn.getCorporacion() %></td>
							</tr>
						<%} %>
					<%} %>
				<%} %>
				<tr>
					<th class="row centro tablaTituloJN borde" style="width: 80%;">SELECCIÓN DE ALGUNAS REFERENCIAS JURISPRUDENCIALES A NIVEL NACIONAL PARA LA POBLACIÓN LGTBI</th>
					<th class="row centro tablaTituloJN borde" style="width: 20%;">CORPORACIÓN</th>
				</tr>
				<%if(jurisNa!=null){ %>
					<%for(juresprudenciaNacional jn : jurisNa){ %>
						<%if(jn.getAmbito().equalsIgnoreCase("2")){ %>
							<tr class="izqui" style="font-size: 12px;">
								<%if(!jn.getUrl().equalsIgnoreCase("")){ %>
									<td class="borde" style="width: 80%; padding: 1%;"><a target="_blank" href="<%=jn.getUrl()%>"><%=jn.getReferencias() %></a></td>
								<%}else{ %>
									<td class="borde" style="width: 80%; padding: 1%;"><label><%=jn.getReferencias() %></label></td>
								<%} %>	
								<td class="borde centro" style="width: 20%; padding: 1%;"><%=jn.getCorporacion() %></td>
							</tr>
						<%} %>
					<%} %>
				<%} %>
				<tr>
					<th class="row centro tablaTituloJN borde" style="width: 80%;">SELECCIÓN DE ALGUNAS REFERENCIAS JURISPRUDENCIALES A NIVEL NACIONAL PARA LA POBLACIÓN INDIGENA</th>
					<th class="row centro tablaTituloJN borde" style="width: 20%;">CORPORACIÓN</th>
				</tr>
				<%if(jurisNa!=null){ %>
					<%for(juresprudenciaNacional jn : jurisNa){ %>
						<%if(jn.getAmbito().equalsIgnoreCase("3")){ %>
							<tr class="izqui" style="font-size: 12px;">
								<%if(!jn.getUrl().equalsIgnoreCase("")){ %>
									<td class="borde" style="width: 80%; padding: 1%;"><a target="_blank" href="<%=jn.getUrl()%>"><%=jn.getReferencias() %></a></td>
								<%}else{ %>
									<td class="borde" style="width: 80%; padding: 1%;"><label><%=jn.getReferencias() %></label></td>
								<%} %>	
								<td class="borde centro" style="width: 20%; padding: 1%;"><%=jn.getCorporacion() %></td>
							</tr>
						<%} %>
					<%} %>
				<%} %>
			</table>
		</div>
	</div>
</div>