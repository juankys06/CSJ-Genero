<%@page import="com.ability.genero.server.service.subcategoriaLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.subcategoria"%>
<%@page import="com.ability.genero.server.service.categoriaLocalServiceUtil"%>
<%@page import="com.ability.genero.server.service.categoriaLocalService"%>
<%@page import="com.ability.genero.server.service.casoLVLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.ability.genero.server.model.categoria"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@include file="/html/init-control-panel.jsp"%>

<%
	String idcategoria = (String) renderRequest.getPortletSession().getAttribute("idcategoria");
	categoria categoria = categoriaLocalServiceUtil.getcategoria(Integer.valueOf(idcategoria));
	
	List <subcategoria> subcategorias = subcategoriaLocalServiceUtil.findBysubCatXCat(Integer.valueOf(idcategoria));
%>

<portlet:defineObjects />
<portlet:renderURL var="volver">
	<portlet:param name="mvcPath" value="/html/administracion/parametrizacion/matrizC.jsp"/>
</portlet:renderURL>
<liferay-portlet:renderURL varImpl="iteratorURL">
	<portlet:param name="mvcPath" value="/html/administracion/parametrizacion/subcategoria.jsp"/>
</liferay-portlet:renderURL>
<portlet:actionURL name="iragregarsubcat" var="iragregarsubcat"></portlet:actionURL>

<liferay-ui:success key="subcatmodif" message="Subcategoria de género modificada"></liferay-ui:success>
<liferay-ui:success key="subcatagregada" message="Subcategoria de género agregada"></liferay-ui:success>
<liferay-ui:success key="subcateli" message="Subcategoria de género Eliminada"></liferay-ui:success>


<div class="contenedor">
	<div class="row">
		<div class="bloque" style="width: 20%">
			<jsp:include page="/html/administracion/menu.jsp"></jsp:include>
		</div>
		<div class="bloque" style="width: 79% ;">
			<div class="row">
			
				<label class="negrita centro" style="font-size: 17px">Subcategorias de la categoria</label>
				<br>
				<label class="negrita centro" style="font-size: 17px"><%=categoria.getCategoria() %></label>
				<br>
				<br>
				<div class="row izqui">
					<aui:button style="margin-left : 5%" value="Volver a Categorias" href="${volver }"></aui:button>
					<aui:form action="${iragregarsubcat }" method="post" cssClass="bloque">
						<aui:input name="id" id="id" type="hidden" value="<%=idcategoria %>"></aui:input>
						<aui:button value="Agregar Subcategoria" type="submit"></aui:button>
					</aui:form>
					
				</div>
				<br>
				<br>
				<div class="centroContenido">
					<liferay-ui:search-container   delta="10" deltaConfigurable="true"  emptyResultsMessage="No hay Subcategorias de género registradas" iteratorURL="<%=iteratorURL%>">
		    			<liferay-ui:search-container-results>
		        			<%				
							 	String keywords = ParamUtil.getString(request, "keywords");		
								results = ListUtil.subList(subcategorias, searchContainer.getStart(), searchContainer.getEnd());
								total = subcategorias.size();
								searchContainer.setTotal(subcategorias.size());
								pageContext.setAttribute("results", results);
								pageContext.setAttribute("total", total);			
							%>
		    			</liferay-ui:search-container-results>    
						<liferay-ui:search-container-row className="com.ability.genero.server.model.subcategoria" keyProperty="id" modelVar="pre">          	
						    <liferay-ui:search-container-column-text name="Id" 				value="<%=String.valueOf(pre.getId())  %>"/>
						    <liferay-ui:search-container-column-text name="Subcategoria" 		value="<%=pre.getSubcategoria() %>"/>
				       		<liferay-ui:search-container-column-jsp  name="Acciones"  		path="/html/administracion/parametrizacion/actionsSub.jsp" />			     
				  		</liferay-ui:search-container-row>
			  			<liferay-ui:search-iterator />
					</liferay-ui:search-container>
				</div>
			</div>
		</div>
	</div>
</div>
<script>
$('#matriz').addClass("active");	
</script>