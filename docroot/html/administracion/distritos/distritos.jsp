<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.ability.genero.server.service.distritoGLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.distritoG"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@include file="/html/init.jsp"%>

<%
	String editid = (String) renderRequest.getPortletSession().getAttribute("idDistritoEditar");
	renderRequest.getPortletSession().removeAttribute("idDistritoEditar");
	distritoG editDis =null;
	if(editid!=null){
		editDis= distritoGLocalServiceUtil.getdistritoG(Integer.valueOf(editid));
	}
	
	List<distritoG> distritos = distritoGLocalServiceUtil.getdistritoGs(-1, -1);
	
%>


<portlet:defineObjects />
<liferay-portlet:renderURL varImpl="iteratorURL">
	<portlet:param name="mvcPath" value="/html/administracion/distritos/distritos.jsp"/>
</liferay-portlet:renderURL>

<portlet:actionURL name="editarDistrito" var="editarDistrito"></portlet:actionURL>

<div class="contenedor">
	<div class="row">
		<div class="bloque" style="width: 20%">
			<jsp:include page="/html/administracion/menu.jsp"></jsp:include>
		</div>
		<div class="bloque" style="width: 79% ; min-height : 200px;">
			<div class="container-fluid">
				<liferay-ui:success key="disModif" message="Distrito modificado satisfactoriamente"></liferay-ui:success>
				<%if(editDis!=null){ %>
					<div class="row">
					<aui:form method="post" action="<%=editarDistrito %>">
						<aui:input name="id" id="id" type="hidden" value="<%=editid %>"></aui:input>
						<div class="col-md-8">
							<aui:input style="width: 70%; text-transform: uppercase;" name="nombre_mascara" id="nombre_mascara" required="true" label="Distrito a editar: " inlineLabel="rigth" value="<%=editDis.getNombre_mascara() %>"></aui:input>
						</div>
						<div class="col-md-4">
							<aui:button value="Editar Distrito" type="submit"></aui:button>
						</div>
					</aui:form>	
					</div>
					<br>
					<br>
				<%} %>
				<div class="row">
					<div class="col-md-12">
						<liferay-ui:search-container   delta="10" deltaConfigurable="true"  emptyResultsMessage="No hay Distritos" iteratorURL="<%=iteratorURL%>">
			    			<liferay-ui:search-container-results>
			        			<%				
								 	String keywords = ParamUtil.getString(request, "keywords");		
									results = ListUtil.subList(distritos, searchContainer.getStart(), searchContainer.getEnd());
									total = distritos.size();
									searchContainer.setTotal(distritos.size());
									pageContext.setAttribute("results", results);
									pageContext.setAttribute("total", total);			
								%>
			    			</liferay-ui:search-container-results>    
							<liferay-ui:search-container-row className="com.ability.genero.server.model.distritoG" keyProperty="id" modelVar="dis">          	
							    <liferay-ui:search-container-column-text name="Distrito" 		value="<%=dis.getNombre_mascara()  %>"/>
					       		<liferay-ui:search-container-column-jsp  name="Acciones"  		path="/html/administracion/distritos/actionDistri.jsp" />			     
					  		</liferay-ui:search-container-row>
				  			<liferay-ui:search-iterator />
						</liferay-ui:search-container>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<script>
$('#distrito').addClass("active");	
</script>