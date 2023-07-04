<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.ability.genero.server.service.normasInteracionalesLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.normasInteracionales"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@include file="/html/init-control-panel.jsp"%>

<%
	List <normasInteracionales> norma = normasInteracionalesLocalServiceUtil.getnormasInteracionaleses(-1, -1);
%>

<portlet:defineObjects />

<liferay-portlet:renderURL varImpl="iteratorURL">
	<portlet:param name="mvcPath" value="/html/administracion/parametrizacion/normasI.jsp"/>
</liferay-portlet:renderURL>
<portlet:renderURL var="agregarni">
	<portlet:param name="mvcPath" value="/html/administracion/parametrizacion/ni.jsp"/>
</portlet:renderURL>

<liferay-ui:success key="nimodif" message="Norma internacional modificada"></liferay-ui:success>
<liferay-ui:success key="niagre" message="Norma internacional agregada"></liferay-ui:success>
<liferay-ui:success key="nieli" message="Norma internacional Eliminada"></liferay-ui:success>

<div class="contenedor">
	<div class="row">
		<div class="bloque" style="width: 20%">
			<jsp:include page="/html/administracion/menu.jsp"></jsp:include>
		</div>
		<div class="bloque" style="width: 79% ;">
			<div class="row">
				<label class="negrita centro" style="font-size: 17px">Normas Internacionales</label>
				<br>
				<label class="negrita centro" style="font-size: 15px">Conferencias - Convenciones - Pactos - Declaraciones - Protocolos </label>
				<br>
				<div class="row izqui">
					<aui:button style="margin-left: 5%" value="Nueva norma internacional" href="<%=agregarni %>"></aui:button>
				</div>
				<br>
				<div class="centroContenido">
					<liferay-ui:search-container   delta="10" deltaConfigurable="true"  emptyResultsMessage="No hay normas internacionales registradas" iteratorURL="<%=iteratorURL%>">
		    			<liferay-ui:search-container-results>
		        			<%				
							 	String keywords = ParamUtil.getString(request, "keywords");		
								results = ListUtil.subList(norma, searchContainer.getStart(), searchContainer.getEnd());
								total = norma.size();
								searchContainer.setTotal(norma.size());
								pageContext.setAttribute("results", results);
								pageContext.setAttribute("total", total);			
							%>
		    			</liferay-ui:search-container-results>    
						<liferay-ui:search-container-row className="com.ability.genero.server.model.normasInteracionales" keyProperty="id" modelVar="pre">          	
						    <liferay-ui:search-container-column-text name="Id" 				value="<%=String.valueOf(pre.getId())  %>"/>
						    <liferay-ui:search-container-column-text name="Norma Internacional" 		value="<%=pre.getConferencias() %>"/>
						    <liferay-ui:search-container-column-text name="año" 		value="<%=pre.getAnhio() %>"/>
				       		<liferay-ui:search-container-column-jsp  name="Acciones"  		path="/html/administracion/parametrizacion/actionsni.jsp" />			     
				  		</liferay-ui:search-container-row>
			  			<liferay-ui:search-iterator />
					</liferay-ui:search-container>
				</div>
			</div>
		</div>
	</div>
</div>
<script>
$('#normasI').addClass("active");	
</script>