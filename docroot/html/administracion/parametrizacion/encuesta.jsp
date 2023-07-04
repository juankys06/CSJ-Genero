<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.ability.genero.server.service.encuestaCriteriosLocalServiceUtil"%>
<%@page import="com.ability.genero.server.service.encuestaEnfoDifeLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.encuestaEnfoDife"%>
<%@page import="com.ability.genero.server.model.encuestaCriterios"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@include file="/html/init-control-panel.jsp"%>

<%
	String editEe = (String) renderRequest.getPortletSession().getAttribute("idcatEe");
	String editEc = (String) renderRequest.getPortletSession().getAttribute("idcatEc");
	renderRequest.getPortletSession().removeAttribute("idcatEe");
	renderRequest.getPortletSession().removeAttribute("idcatEc");
	encuestaEnfoDife Ee =null;
	encuestaCriterios Ec =null;
	if(editEe!=null){
		Ee= encuestaEnfoDifeLocalServiceUtil.getencuestaEnfoDife(Integer.valueOf(editEe));
	}
	if(editEc!=null){
		Ec= encuestaCriteriosLocalServiceUtil.getencuestaCriterios(Integer.valueOf(editEc));
	}
	List <encuestaEnfoDife> listaenfoque = encuestaEnfoDifeLocalServiceUtil.getencuestaEnfoDifes(-1, -1);
	List <encuestaCriterios> listacrite = encuestaCriteriosLocalServiceUtil.getencuestaCriterioses(-1, -1);
%>

<portlet:defineObjects />

<liferay-portlet:renderURL varImpl="iteratorURL">
	<portlet:param name="mvcPath" value="/html/administracion/parametrizacion/encuesta.jsp"/>
</liferay-portlet:renderURL>
<liferay-portlet:renderURL varImpl="iterator2">
	<portlet:param name="mvcPath" value="/html/administracion/parametrizacion/encuesta.jsp"/>
</liferay-portlet:renderURL>

<portlet:actionURL name="agregaree" var="agregaree"></portlet:actionURL>
<portlet:actionURL name="editaree" var="editaree"></portlet:actionURL>

<portlet:actionURL name="agregarec" var="agregarec"></portlet:actionURL>
<portlet:actionURL name="editarec" var="editarec"></portlet:actionURL>

<liferay-ui:success key="emodif" message="Pregunta de encuesta modificada"></liferay-ui:success>
<liferay-ui:success key="eagregada" message="Pregunta de encuesta agregada"></liferay-ui:success>
<liferay-ui:success key="eeli" message="Pregunta de encuesta Eliminada"></liferay-ui:success>


<div class="contenedor">
	<div class="row">
		<div class="bloque" style="width: 20%">
			<jsp:include page="/html/administracion/menu.jsp"></jsp:include>
		</div>
		<div class="bloque" style="width: 79% ;">
			<div class="row">
			
				<label class="negrita centro" style="font-size: 17px">Identificación del caso de género desde el enfoque diferencial</label>
				<br>
				<br>
				<div class="row">
				<aui:form method="post" action="<%=agregaree %>">
					<div class="bloque" style="width: 70%">
						<aui:input style="width: 70%" name="ee" id="ee" required="true" label="Nueva Pregunta: " inlineLabel="rigth"></aui:input>
					</div>
					<div class="bloque" style="width: 29%">
						<aui:button value="Crear Pregunta" type="submit"></aui:button>
					</div>
				</aui:form>	
				</div>
				
				<%if(Ee!=null){ %>
				<br>
				<br>
				<div class="row">
				<aui:form method="post" action="<%=editaree %>">
					<aui:input name="id" id="id" type="hidden" value="<%=editEe %>"></aui:input>
					<div class="bloque" style="width: 70%">
						<aui:input style="width: 70%" name="ee" required="true" id="ee" label="Editar Pregunta: " inlineLabel="rigth" value="<%=Ee.getPregunta() %>"></aui:input>
					</div>
					<div class="bloque" style="width: 29%">
						<aui:button value="Editar Pregunta" type="submit"></aui:button>
					</div>
				</aui:form>	
				</div>
				<%} %>
				<br>
				<br>
				<div class="centroContenido">
					<liferay-ui:search-container   delta="10" deltaConfigurable="true"  emptyResultsMessage="No hay preguntas registradas" iteratorURL="<%=iteratorURL%>">
		    			<liferay-ui:search-container-results>
		        			<%				
							 	String keywords = ParamUtil.getString(request, "keywords");		
								results = ListUtil.subList(listaenfoque, searchContainer.getStart(), searchContainer.getEnd());
								total = listaenfoque.size();
								searchContainer.setTotal(listaenfoque.size());
								pageContext.setAttribute("results", results);
								pageContext.setAttribute("total", total);			
							%>
		    			</liferay-ui:search-container-results>    
						<liferay-ui:search-container-row className="com.ability.genero.server.model.encuestaEnfoDife" keyProperty="id" modelVar="pre">          	
						    <liferay-ui:search-container-column-text name="Id" 				value="<%=String.valueOf(pre.getId())%>"/>
						    <liferay-ui:search-container-column-text name="Pregunta" 		value="<%=pre.getPregunta()%>"/>
				       		<liferay-ui:search-container-column-jsp  name="Acciones"  		path="/html/administracion/parametrizacion/actionse.jsp" />			     
				  		</liferay-ui:search-container-row>
			  			<liferay-ui:search-iterator />
					</liferay-ui:search-container>
				</div>
			</div>
			<div class="row">
				<br>
				<br>
				<label class="negrita centro" style="font-size: 17px">Criterios orientadores relacionados con el procedimiento y la decisión judicial</label>
				<br>
				<br>
				<div class="row">
				<aui:form method="post" action="<%=agregarec %>">
					<div class="bloque" style="width: 70%">
						<aui:input style="width: 70%" name="ec" required="true" id="ec" label="Nueva Pregunta: " inlineLabel="rigth"></aui:input>
					</div>
					<div class="bloque" style="width: 29%">
						<aui:button value="Crear Pregunta" type="submit"></aui:button>
					</div>
				</aui:form>	
				</div>
				
				<%if(Ec!=null){ %>
				<br>
				<br>
				<div class="row">
				<aui:form method="post" action="<%=editarec %>">
					<aui:input name="id" id="id" type="hidden" value="<%=editEc %>"></aui:input>
					<div class="bloque" style="width: 70%">
						<aui:input style="width: 70%" name="ec" required="true" id="ec" label="Editar Pregunta: " inlineLabel="rigth" value="<%=Ec.getPregunta() %>"></aui:input>
					</div>
					<div class="bloque" style="width: 29%">
						<aui:button value="Editar Pregunta" type="submit"></aui:button>
					</div>
				</aui:form>	
				</div>
				<%} %>
				<br>
				<br>
				<div class="centroContenido">
					<liferay-ui:search-container   delta="10" deltaConfigurable="true"  emptyResultsMessage="No hay preguntas registradas" iteratorURL="<%=iterator2%>">
		    			<liferay-ui:search-container-results>
		        			<%				
							 	String keywords = ParamUtil.getString(request, "keywords");		
								results = ListUtil.subList(listacrite, searchContainer.getStart(), searchContainer.getEnd());
								total = listacrite.size();
								searchContainer.setTotal(listacrite.size());
								pageContext.setAttribute("results", results);
								pageContext.setAttribute("total", total);			
							%>
		    			</liferay-ui:search-container-results>    
						<liferay-ui:search-container-row className="com.ability.genero.server.model.encuestaCriterios" keyProperty="id" modelVar="pre">          	
						    <liferay-ui:search-container-column-text name="Id" 				value="<%=String.valueOf(pre.getId())%>"/>
						    <liferay-ui:search-container-column-text name="Pregunta" 		value="<%=pre.getPregunta()%>"/>
				       		<liferay-ui:search-container-column-jsp  name="Acciones"  		path="/html/administracion/parametrizacion/actionse2.jsp" />			     
				  		</liferay-ui:search-container-row>
			  			<liferay-ui:search-iterator />
					</liferay-ui:search-container>
				</div>
			</div>
		</div>
	</div>
</div>
<script>
$('#encuesta').addClass("active");	
</script>