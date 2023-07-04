<%@page import="com.ability.genero.server.service.subcategoriaLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.subcategoria"%>
<%@page import="java.util.List"%>
<%@page import="com.ability.genero.server.service.categoriaLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.categoria"%>
<%@page import="com.ability.genero.server.service.entidadLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.entidad"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@include file="/html/init.jsp"%>

<%
	List<categoria> categorias = categoriaLocalServiceUtil.getcategorias(-1, -1);

%>

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
			<label style="font-size: 14px;">MATRIZ DE CATEGORÍAS DE GÉNERO - LISTA DE VERIFICACIÓN</label>
		</div>
		<br>
		<br>
		<div class="centroContenido">
			<table class="row">
				<tr>
					<th class="campoTabla centro tablaTituloMatriz borde">CATEGORIA</th>
					<th class="campoTabla centro tablaTituloMatriz borde">SUBCATEGORÍA y ESTÁNDARES INTERNACIONALES</th>
				</tr>
				<%if(categorias!=null){ %>
					<%for(categoria cat : categorias){ %>
						<tr class="izqui">
							<td class="campoTabla borde categoria" style="padding-left: 2%;"><%=cat.getCategoria() %></td>
							<td class="campoTabla borde">
								<table style="width: 100%;">
									<%
									List<subcategoria> subcategorias = subcategoriaLocalServiceUtil.findBysubCatXCat(cat.getId());
									int tamano=subcategorias.size();
									for(int i=0;i<tamano;i++){ 
										subcategoria sub = subcategorias.get(i);
									%>
										<%if(i!=tamano-1){ %>
											<%if(!sub.getUrl().equalsIgnoreCase("")){ %>
												<tr>
													<td class="subcategoria"><a target="_blank" href="<%=sub.getUrl()%>"><%=sub.getSubcategoria() %></a></td>
												</tr>
											<%}else{ %>
												<tr>
													<td class="subcategoria"><label><%=sub.getSubcategoria() %></label></td>
												</tr>
											<%} %>
										<%}else{ %>
											<%if(!sub.getUrl().equalsIgnoreCase("")){ %>
												<tr>
													<td style="padding: 2% 2%;"><a target="_blank" href="<%=sub.getUrl()%>"><%=sub.getSubcategoria() %></a></td>
												</tr>
											<%}else{ %>
												<tr>
													<td style="padding: 2% 2%; font-size: 13px;"><label><%=sub.getSubcategoria() %></label></td>
												</tr>
											<%} %>
											<%} %>
										<%} %>
								</table>
							</td>
						</tr>
					<%} %>
				<%} %>
			</table>
		</div>
		
				
	</div>
</div>