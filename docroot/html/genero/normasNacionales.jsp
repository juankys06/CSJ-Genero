<%@page import="java.util.List"%>
<%@page import="com.ability.genero.server.service.normasNacionalesLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.normasNacionales"%>
<%@page import="com.ability.genero.server.service.entidadLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.entidad"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@include file="/html/init.jsp"%>

<% List<normasNacionales> normas = normasNacionalesLocalServiceUtil.getnormasNacionaleses(-1, -1); %>

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
			<label style="font-size: 14px;">INSTRUMENTOS NORMATIVOS NACIONALES</label>
			<br>
			<a target="_blank" href="https://www.ramajudicial.gov.co/web/comision-nacional-de-genero/leyes-y-decretos">En el Observatorio de la Comisión Nacional de Género de la Rama Judicial, se pueden consultar los instrumentos normativos nacionales.</a>
		</div>
		<br>
		<br>
		<div class="centroContenido">
			<table class="row">
				<tr>
					<th class="row centro tablaTituloNN borde" style="width: 90%;">INSTRUMENTOS NORMATIVOS CON ENFOQUE DE GÉNERO, DERECHO A LA IGUALDAD Y NO DISCRIMINACIÓN</th>
					<th class="row centro tablaTituloNN borde" style="width: 10%;">AÑO</th>
				</tr>
				<tr>
					<td colspan="2" class="row centro borde negrita" style="color: #E26B0A; font-size: 15px; padding: 1%;">Constitución Política, leyes, decretos, directivas</td>
				</tr>
				<%if(normas!=null){ %>
					<%for(normasNacionales nor : normas){ %>
						<%if(nor.getAmbito().equalsIgnoreCase("1")){ %>
							<tr class="izqui" style="font-size: 12px;">
								<%if(!nor.getUrl().equalsIgnoreCase("")){ %>
									<td class="borde" style="width: 90%; padding: 1%;"><a target="_blank" href="<%=nor.getUrl()%>"><%=nor.getNormativas() %></a></td>
								<%}else{ %>
									<td class="borde" style="width: 90%; padding: 1%;"><label><%=nor.getNormativas() %></label></td>
								<%} %>
								<td class="borde centro" style="width: 10%; padding: 1%;"><%=nor.getAnhio() %></td>
							</tr>
						<%} %>
					<%} %>
				<%} %>
				<tr>
					<td colspan="2" class="row centro borde negrita" style="color: #E26B0A; font-size: 15px; padding: 1%;">Acuerdos del Consejo Superior de la Judicatura</td>
				</tr>
				<%if(normas!=null){ %>
					<%for(normasNacionales nor : normas){ %>
						<%if(nor.getAmbito().equalsIgnoreCase("2")){ %>
							<tr class="izqui" style="font-size: 12px;">
								<%if(!nor.getUrl().equalsIgnoreCase("")){ %>
									<td class="borde" style="width: 90%; padding: 1%;"><a target="_blank" href="<%=nor.getUrl()%>"><%=nor.getNormativas() %></a></td>
								<%}else{ %>
									<td class="borde" style="width: 90%; padding: 1%;"><label><%=nor.getNormativas() %></label></td>
								<%} %>
								<td class="borde centro" style="width: 10%; padding: 1%;"><%=nor.getAnhio() %></td>
							</tr>
						<%} %>
					<%} %>
				<%} %>
				<tr>
					<td colspan="2" class="row centro borde negrita" style="color: #E26B0A; font-size: 15px; padding: 1%;">Directivas, circulares e instructivos de organismos de control, fuerzas militares, ministerios, institutos descentralizados, entre otros</td>
				</tr>
				<%if(normas!=null){ %>
					<%for(normasNacionales nor : normas){ %>
						<%if(nor.getAmbito().equalsIgnoreCase("3")){ %>
							<tr class="izqui" style="font-size: 12px;">
								<%if(!nor.getUrl().equalsIgnoreCase("")){ %>
									<td class="borde" style="width: 90%; padding: 1%;"><a target="_blank" href="<%=nor.getUrl()%>"><%=nor.getNormativas() %></a></td>
								<%}else{ %>
									<td class="borde" style="width: 90%; padding: 1%;"><label><%=nor.getNormativas() %></label></td>
								<%} %>
								<td class="borde centro" style="width: 10%; padding: 1%;"><%=nor.getAnhio() %></td>
							</tr>
						<%} %>
					<%} %>
				<%} %>
				<tr>
					<td colspan="2" class="row centro borde negrita" style="color: #E26B0A; font-size: 15px; padding: 1%;">Instrumentos jurídicos por el derecho a la igualdad y no discriminación con enfoque diferencial y de género en beneficio de las comunidades negras, afrocolombianas, raizales y palenqueras</td>
				</tr>
				<%if(normas!=null){ %>
					<%for(normasNacionales nor : normas){ %>
						<%if(nor.getAmbito().equalsIgnoreCase("4")){ %>
							<tr class="izqui" style="font-size: 12px;">
								<%if(!nor.getUrl().equalsIgnoreCase("")){ %>
									<td class="borde" style="width: 90%; padding: 1%;"><a target="_blank" href="<%=nor.getUrl()%>"><%=nor.getNormativas() %></a></td>
								<%}else{ %>
									<td class="borde" style="width: 90%; padding: 1%;"><label><%=nor.getNormativas() %></label></td>
								<%} %>
								<td class="borde centro" style="width: 10%; padding: 1%;"><%=nor.getAnhio() %></td>
							</tr>
						<%} %>
					<%} %>
				<%} %>
				<tr>
					<td colspan="2" class="row centro borde negrita" style="color: #E26B0A; font-size: 15px; padding: 1%;">Instrumentos jurídicos por el derecho a la igualdad y no discriminación con enfoque diferencial y de género en beneficio de la comunidad raizal</td>
				</tr>
				<%if(normas!=null){ %>
					<%for(normasNacionales nor : normas){ %>
						<%if(nor.getAmbito().equalsIgnoreCase("5")){ %>
							<tr class="izqui" style="font-size: 12px;">
								<%if(!nor.getUrl().equalsIgnoreCase("")){ %>
									<td class="borde" style="width: 90%; padding: 1%;"><a target="_blank" href="<%=nor.getUrl()%>"><%=nor.getNormativas() %></a></td>
								<%}else{ %>
									<td class="borde" style="width: 90%; padding: 1%;"><label><%=nor.getNormativas() %></label></td>
								<%} %>
								<td class="borde centro" style="width: 10%; padding: 1%;"><%=nor.getAnhio() %></td>
							</tr>
						<%} %>
					<%} %>
				<%} %>
				<tr>
					<td colspan="2" class="row centro borde negrita" style="color: #E26B0A; font-size: 15px; padding: 1%;">Instrumentos jurídicos por el derecho a la igualdad y no discriminación con enfoque diferencial en beneficio de las personas discapacitadas</td>
				</tr>
				<%if(normas!=null){ %>
					<%for(normasNacionales nor : normas){ %>
						<%if(nor.getAmbito().equalsIgnoreCase("6")){ %>
							<tr class="izqui" style="font-size: 12px;">
								<%if(!nor.getUrl().equalsIgnoreCase("")){ %>
									<td class="borde" style="width: 90%; padding: 1%;"><a target="_blank" href="<%=nor.getUrl()%>"><%=nor.getNormativas() %></a></td>
								<%}else{ %>
									<td class="borde" style="width: 90%; padding: 1%;"><label><%=nor.getNormativas() %></label></td>
								<%} %>
								<td class="borde centro" style="width: 10%; padding: 1%;"><%=nor.getAnhio() %></td>
							</tr>
						<%} %>
					<%} %>
				<%} %>
				<tr>
					<td colspan="2" class="row centro borde negrita" style="color: #E26B0A; font-size: 15px; padding: 1%;">Instrumentos jurídicos con enfoque diferencial en beneficio de las personas en condición de desplazamiento forzado</td>
				</tr>
				<%if(normas!=null){ %>
					<%for(normasNacionales nor : normas){ %>
						<%if(nor.getAmbito().equalsIgnoreCase("7")){ %>
							<tr class="izqui" style="font-size: 12px;">
								<%if(!nor.getUrl().equalsIgnoreCase("")){ %>
									<td class="borde" style="width: 90%; padding: 1%;"><a target="_blank" href="<%=nor.getUrl()%>"><%=nor.getNormativas() %></a></td>
								<%}else{ %>
									<td class="borde" style="width: 90%; padding: 1%;"><label><%=nor.getNormativas() %></label></td>
								<%} %>
								<td class="borde centro" style="width: 10%; padding: 1%;"><%=nor.getAnhio() %></td>
							</tr>
						<%} %>
					<%} %>
				<%} %>
			</table>
		</div>
	</div>
</div>