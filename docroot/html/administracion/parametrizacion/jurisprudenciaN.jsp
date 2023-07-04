<%@page import="java.util.ArrayList"%>
<%@page import="com.ability.genero.server.service.juresprudenciaNacionalLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.juresprudenciaNacional"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.ability.genero.server.model.categoria"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@include file="/html/init-control-panel.jsp"%>

<%
	List <juresprudenciaNacional> jn = juresprudenciaNacionalLocalServiceUtil.getjuresprudenciaNacionals(-1, -1);
	List <juresprudenciaNacional> jn1 = new ArrayList<juresprudenciaNacional>();
	List <juresprudenciaNacional> jn2 = new ArrayList<juresprudenciaNacional>();
	List <juresprudenciaNacional> jn3 = new ArrayList<juresprudenciaNacional>();
	
	for(juresprudenciaNacional n : jn){
		if(n.getAmbito().equalsIgnoreCase("1")){
			jn1.add(n);
		}
		if(n.getAmbito().equalsIgnoreCase("2")){
			jn2.add(n);
		}
		if(n.getAmbito().equalsIgnoreCase("3")){
			jn3.add(n);
		}
	}
%>

<portlet:defineObjects />
<liferay-portlet:renderURL varImpl="iteratorURL">
	<portlet:param name="mvcPath" value="/html/administracion/parametrizacion/jurisprudenciaN.jsp"/>
</liferay-portlet:renderURL>


<portlet:actionURL name="iragregarjn" var="iragregarjn"></portlet:actionURL>

<liferay-ui:success key="jnmodif" message="Jurisprudencia nacional modificada"></liferay-ui:success>
<liferay-ui:success key="jnagregada" message="Jurisprudencia nacional agregada"></liferay-ui:success>
<liferay-ui:success key="jneli" message="Jurisprudencia nacional Eliminada"></liferay-ui:success>


<div class="contenedor">
	<div class="row">
		<div class="bloque" style="width: 20%">
			<jsp:include page="/html/administracion/menu.jsp"></jsp:include>
		</div>
		<div class="bloque" style="width: 79% ;">
			<div class="row">
			
				<label class="negrita centro" style="font-size: 17px">Jurisprudencia Nacionales</label>
				<br>
				<label class="negrita centro" style="font-size: 15px">Selección de algunas referencias jurisprudenciales a nivel nacional</label>
				<br>
				<div class="row izqui">
					<aui:form style="margin-left : 5%" action="${iragregarjn }" method="post" id="1">
						<aui:input name="ambito" id="ambito" type="hidden" value="1"></aui:input>
						<aui:button value="Agregar Jurisprudencia Nacional" type="submit"></aui:button>
					</aui:form>
					
				</div>
				<br>
				<div class="centroContenido">
					<liferay-ui:search-container   delta="10" deltaConfigurable="true"  emptyResultsMessage="No hay Jurisprudencia nacionales registradas" iteratorURL="<%=iteratorURL%>">
		    			<liferay-ui:search-container-results>
		        			<%				
							 	String keywords = ParamUtil.getString(request, "keywords");		
								results = ListUtil.subList(jn1, searchContainer.getStart(), searchContainer.getEnd());
								total = jn1.size();
								searchContainer.setTotal(jn1.size());
								pageContext.setAttribute("results", results);
								pageContext.setAttribute("total", total);			
							%>
		    			</liferay-ui:search-container-results>    
						<liferay-ui:search-container-row className="com.ability.genero.server.model.juresprudenciaNacional" keyProperty="id" modelVar="pre">          	
						    <liferay-ui:search-container-column-text name="Id" 				value="<%=String.valueOf(pre.getId())  %>"/>
						    <liferay-ui:search-container-column-text name="Jurisprudencia Nacional" 		value="<%=pre.getReferencias() %>"/>
						    <liferay-ui:search-container-column-text name="Corporación" 		value="<%=pre.getCorporacion() %>"/>
				       		<liferay-ui:search-container-column-jsp  name="Acciones"  		path="/html/administracion/parametrizacion/actionsjn.jsp" />			     
				  		</liferay-ui:search-container-row>
			  			<liferay-ui:search-iterator />
					</liferay-ui:search-container>
				</div>
			</div>
		<div class="row">
				<br>
				<br>
				<label class="negrita centro" style="font-size: 15px">Selección de algunas referencias jurisprudenciales a nivel nacional para la población lgtbi</label>
				<br>
				<div class="row izqui">
					<aui:form style="margin-left : 5%" action="${iragregarjn }" method="post" id="2">
						<aui:input name="ambito" id="ambito" type="hidden" value="2"></aui:input>
						<aui:button value="Agregar Jurisprudencia Nacional" type="submit"></aui:button>
					</aui:form>
					
				</div>
				<br>
				<div class="centroContenido">
					<liferay-ui:search-container   delta="10" deltaConfigurable="true"  emptyResultsMessage="No hay Jurisprudencia nacionales registradas" iteratorURL="<%=iteratorURL%>">
		    			<liferay-ui:search-container-results>
		        			<%				
							 	String keywords = ParamUtil.getString(request, "keywords");		
								results = ListUtil.subList(jn2, searchContainer.getStart(), searchContainer.getEnd());
								total = jn2.size();
								searchContainer.setTotal(jn2.size());
								pageContext.setAttribute("results", results);
								pageContext.setAttribute("total", total);			
							%>
		    			</liferay-ui:search-container-results>    
						<liferay-ui:search-container-row className="com.ability.genero.server.model.juresprudenciaNacional" keyProperty="id" modelVar="pre">          	
						    <liferay-ui:search-container-column-text name="Id" 				value="<%=String.valueOf(pre.getId())  %>"/>
						    <liferay-ui:search-container-column-text name="Jurisprudencia Nacional" 		value="<%=pre.getReferencias() %>"/>
						    <liferay-ui:search-container-column-text name="Corporación" 		value="<%=pre.getCorporacion() %>"/>
				       		<liferay-ui:search-container-column-jsp  name="Acciones"  		path="/html/administracion/parametrizacion/actionsjn.jsp" />			     
				  		</liferay-ui:search-container-row>
			  			<liferay-ui:search-iterator />
					</liferay-ui:search-container>
				</div>
			</div>
			<div class="row">
				<br>
				<br>
				<label class="negrita centro" style="font-size: 15px">Selección de algunas referencias jurisprudenciales a nivel nacional para la población indígena</label>
				<br>
				<div class="row izqui">
					<aui:form style="margin-left : 5%" action="${iragregarjn }" method="post" id="2">
						<aui:input name="ambito" id="ambito" type="hidden" value="3"></aui:input>
						<aui:button value="Agregar Jurisprudencia Nacional" type="submit"></aui:button>
					</aui:form>
					
				</div>
				<br>
				<div class="centroContenido">
					<liferay-ui:search-container   delta="10" deltaConfigurable="true"  emptyResultsMessage="No hay Jurisprudencia nacionales registradas" iteratorURL="<%=iteratorURL%>">
		    			<liferay-ui:search-container-results>
		        			<%				
							 	String keywords = ParamUtil.getString(request, "keywords");		
								results = ListUtil.subList(jn3, searchContainer.getStart(), searchContainer.getEnd());
								total = jn3.size();
								searchContainer.setTotal(jn3.size());
								pageContext.setAttribute("results", results);
								pageContext.setAttribute("total", total);			
							%>
		    			</liferay-ui:search-container-results>    
						<liferay-ui:search-container-row className="com.ability.genero.server.model.juresprudenciaNacional" keyProperty="id" modelVar="pre">          	
						    <liferay-ui:search-container-column-text name="Id" 				value="<%=String.valueOf(pre.getId())  %>"/>
						    <liferay-ui:search-container-column-text name="Jurisprudencia Nacional" 		value="<%=pre.getReferencias() %>"/>
						    <liferay-ui:search-container-column-text name="Corporación" 		value="<%=pre.getCorporacion() %>"/>
				       		<liferay-ui:search-container-column-jsp  name="Acciones"  		path="/html/administracion/parametrizacion/actionsjn.jsp" />			     
				  		</liferay-ui:search-container-row>
			  			<liferay-ui:search-iterator />
					</liferay-ui:search-container>
				</div>
			</div>
		</div>
	</div>
</div>
<script>
$('#jurisprudenciaN').addClass("active");	
</script>