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
	String editid = (String) renderRequest.getPortletSession().getAttribute("idcatedit");
	renderRequest.getPortletSession().removeAttribute("idcatedit");
	categoria editcat =null;
	if(editid!=null){
		editcat= categoriaLocalServiceUtil.getcategoria(Integer.valueOf(editid));
	}
	List <categoria> categorias = categoriaLocalServiceUtil.getcategorias(-1, -1);
%>

<portlet:defineObjects />

<liferay-portlet:renderURL varImpl="iteratorURL">
	<portlet:param name="mvcPath" value="/html/administracion/parametrizacion/matrizC.jsp"/>
</liferay-portlet:renderURL>
<portlet:actionURL name="agregarcat" var="agregarcat"></portlet:actionURL>
<portlet:actionURL name="editarcat" var="editarcat"></portlet:actionURL>

<liferay-ui:success key="catmodif" message="Categoria de g�nero modificada"></liferay-ui:success>
<liferay-ui:success key="catagregada" message="Categoria de g�nero agregada"></liferay-ui:success>
<liferay-ui:success key="cateli" message="Categoria de g�nero Eliminada"></liferay-ui:success>


<div class="contenedor">
	<div class="row">
		<div class="bloque" style="width: 20%">
			<jsp:include page="/html/administracion/menu.jsp"></jsp:include>
		</div>
		<div class="bloque" style="width: 79% ;">
			<div class="row">
			
				<label class="negrita centro" style="font-size: 17px">Categorias de g�nero</label>
				<br>
				<br>
				<div class="row">
				<aui:form method="post" action="<%=agregarcat %>">
					<div class="bloque" style="width: 70%">
						<aui:input style="width: 70%" name="nuevacat" id="nuevacat" required="true" label="Nueva Categor�a: " inlineLabel="rigth"></aui:input>
					</div>
					<div class="bloque" style="width: 29%">
						<aui:button value="Nueva Categor�a" type="submit"></aui:button>
					</div>
				</aui:form>	
				</div>
				
				<%if(editcat!=null){ %>
				<br>
				<br>
				<div class="row">
				<aui:form method="post" action="<%=editarcat %>">
					<aui:input name="id" id="id" type="hidden" value="<%=editid %>"></aui:input>
					<div class="bloque" style="width: 70%">
						<aui:input style="width: 70%" name="cateditar" id="cateditar" required="true" label="Categor�a a editar: " inlineLabel="rigth" value="<%=editcat.getCategoria() %>"></aui:input>
					</div>
					<div class="bloque" style="width: 29%">
						<aui:button value="Editar Categor�a" type="submit"></aui:button>
					</div>
				</aui:form>	
				</div>
				<%} %>
				<br>
				<br>
				<div class="centroContenido">
					<liferay-ui:search-container   delta="10" deltaConfigurable="true"  emptyResultsMessage="No hay categorias de g�nero registradas" iteratorURL="<%=iteratorURL%>">
		    			<liferay-ui:search-container-results>
		        			<%				
							 	String keywords = ParamUtil.getString(request, "keywords");		
								results = ListUtil.subList(categorias, searchContainer.getStart(), searchContainer.getEnd());
								total = categorias.size();
								searchContainer.setTotal(categorias.size());
								pageContext.setAttribute("results", results);
								pageContext.setAttribute("total", total);			
							%>
		    			</liferay-ui:search-container-results>    
						<liferay-ui:search-container-row className="com.ability.genero.server.model.categoria" keyProperty="id" modelVar="pre">          	
						    <liferay-ui:search-container-column-text name="Id" 				value="<%=String.valueOf(pre.getId())  %>"/>
						    <liferay-ui:search-container-column-text name="Categoria" 		value="<%=pre.getCategoria() %>"/>
				       		<liferay-ui:search-container-column-jsp  name="Acciones"  		path="/html/administracion/parametrizacion/actionsCat.jsp" />			     
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