<%@page import="java.util.ArrayList"%>
<%@page import="com.ability.genero.server.service.normasNacionalesLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.normasNacionales"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.ability.genero.server.model.categoria"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@include file="/html/init-control-panel.jsp"%>

<%
	List <normasNacionales> normas = normasNacionalesLocalServiceUtil.getnormasNacionaleses(-1, -1);
	List <normasNacionales> normas1 = new ArrayList<normasNacionales>();
	List <normasNacionales> normas2 = new ArrayList<normasNacionales>();
	List <normasNacionales> normas3 = new ArrayList<normasNacionales>();
	List <normasNacionales> normas4 = new ArrayList<normasNacionales>();
	List <normasNacionales> normas5 = new ArrayList<normasNacionales>();
	List <normasNacionales> normas6 = new ArrayList<normasNacionales>();
	List <normasNacionales> normas7 = new ArrayList<normasNacionales>();
	
	for(normasNacionales n : normas){
		if(n.getAmbito().equalsIgnoreCase("1")){
			normas1.add(n);
		}
		if(n.getAmbito().equalsIgnoreCase("2")){
			normas2.add(n);
		}
		if(n.getAmbito().equalsIgnoreCase("3")){
			normas3.add(n);
		}
		if(n.getAmbito().equalsIgnoreCase("4")){
			normas4.add(n);
		}
		if(n.getAmbito().equalsIgnoreCase("5")){
			normas5.add(n);
		}
		if(n.getAmbito().equalsIgnoreCase("6")){
			normas6.add(n);
		}
		if(n.getAmbito().equalsIgnoreCase("7")){
			normas7.add(n);
		}
	}
%>

<portlet:defineObjects />
<liferay-portlet:renderURL varImpl="iteratorURL">
	<portlet:param name="mvcPath" value="/html/administracion/parametrizacion/normasN.jsp"/>
</liferay-portlet:renderURL>


<portlet:actionURL name="iragregarnn" var="iragregarnn"></portlet:actionURL>

<liferay-ui:success key="normanmodif" message="Norma nacional modificada"></liferay-ui:success>
<liferay-ui:success key="normanagregada" message="Norma nacional agregada"></liferay-ui:success>
<liferay-ui:success key="normaneli" message="Norma nacional Eliminada"></liferay-ui:success>


<div class="contenedor">
	<div class="row">
		<div class="bloque" style="width: 20%">
			<jsp:include page="/html/administracion/menu.jsp"></jsp:include>
		</div>
		<div class="bloque" style="width: 79% ;">
			<div class="row">
			
				<label class="negrita centro" style="font-size: 17px">Normas Nacionales</label>
				<br>
				<label class="negrita centro" style="font-size: 15px">Constitución Política, leyes, decretos, directivas</label>
				<br>
				<div class="row izqui">
					<aui:form style="margin-left : 5%" action="${iragregarnn }" method="post" id="1">
						<aui:input name="ambito" id="ambito" type="hidden" value="1"></aui:input>
						<aui:button value="Agregar Norma Nacional" type="submit"></aui:button>
					</aui:form>
					
				</div>
				<br>
				<div class="centroContenido">
					<liferay-ui:search-container   delta="10" deltaConfigurable="true"  emptyResultsMessage="No hay normas nacionales registradas" iteratorURL="<%=iteratorURL%>">
		    			<liferay-ui:search-container-results>
		        			<%				
							 	String keywords = ParamUtil.getString(request, "keywords");		
								results = ListUtil.subList(normas1, searchContainer.getStart(), searchContainer.getEnd());
								total = normas1.size();
								searchContainer.setTotal(normas1.size());
								pageContext.setAttribute("results", results);
								pageContext.setAttribute("total", total);			
							%>
		    			</liferay-ui:search-container-results>    
						<liferay-ui:search-container-row className="com.ability.genero.server.model.normasNacionales" keyProperty="id" modelVar="pre">          	
						    <liferay-ui:search-container-column-text name="Id" 				value="<%=String.valueOf(pre.getId())  %>"/>
						    <liferay-ui:search-container-column-text name="Normas Nacionales" 		value="<%=pre.getNormativas() %>"/>
						    <liferay-ui:search-container-column-text name="Año" 		value="<%=pre.getAnhio() %>"/>
				       		<liferay-ui:search-container-column-jsp  name="Acciones"  		path="/html/administracion/parametrizacion/actionsnn.jsp" />			     
				  		</liferay-ui:search-container-row>
			  			<liferay-ui:search-iterator />
					</liferay-ui:search-container>
				</div>
			</div>
		<div class="row">
				<br>
				<br>
				<label class="negrita centro" style="font-size: 15px">Acuerdos del Consejo Superior de la Judicatura</label>
				<br>
				<div class="row izqui">
					<aui:form style="margin-left : 5%" action="${iragregarnn }" method="post" id="2">
						<aui:input name="ambito" id="ambito" type="hidden" value="2"></aui:input>
						<aui:button value="Agregar Norma Nacional" type="submit"></aui:button>
					</aui:form>
					
				</div>
				<br>
				<div class="centroContenido">
					<liferay-ui:search-container   delta="10" deltaConfigurable="true"  emptyResultsMessage="No hay normas nacionales registradas" iteratorURL="<%=iteratorURL%>">
		    			<liferay-ui:search-container-results>
		        			<%				
							 	String keywords = ParamUtil.getString(request, "keywords");		
								results = ListUtil.subList(normas2, searchContainer.getStart(), searchContainer.getEnd());
								total = normas2.size();
								searchContainer.setTotal(normas2.size());
								pageContext.setAttribute("results", results);
								pageContext.setAttribute("total", total);			
							%>
		    			</liferay-ui:search-container-results>    
						<liferay-ui:search-container-row className="com.ability.genero.server.model.normasNacionales" keyProperty="id" modelVar="pre">          	
						    <liferay-ui:search-container-column-text name="Id" 				value="<%=String.valueOf(pre.getId())  %>"/>
						    <liferay-ui:search-container-column-text name="Normas Nacionales" 		value="<%=pre.getNormativas() %>"/>
						    <liferay-ui:search-container-column-text name="Año" 		value="<%=pre.getAnhio() %>"/>
				       		<liferay-ui:search-container-column-jsp  name="Acciones"  		path="/html/administracion/parametrizacion/actionsnn.jsp" />			     
				  		</liferay-ui:search-container-row>
			  			<liferay-ui:search-iterator />
					</liferay-ui:search-container>
				</div>
			</div>
		<div class="row">
				<br>
				<br>
				<label class="negrita centro" style="font-size: 15px">Directivas, circulares e instructivos de organismos de control, fuerzas militares, ministerios, institutos descentralizados, entre otros</label>
				<br>
				<div class="row izqui">
					<aui:form style="margin-left : 5%" action="${iragregarnn }" method="post" id="3">
						<aui:input name="ambito" id="ambito" type="hidden" value="3"></aui:input>
						<aui:button value="Agregar Norma Nacional" type="submit"></aui:button>
					</aui:form>
					
				</div>
				<br>
				<div class="centroContenido">
					<liferay-ui:search-container   delta="10" deltaConfigurable="true"  emptyResultsMessage="No hay normas nacionales registradas" iteratorURL="<%=iteratorURL%>">
		    			<liferay-ui:search-container-results>
		        			<%				
							 	String keywords = ParamUtil.getString(request, "keywords");		
								results = ListUtil.subList(normas3, searchContainer.getStart(), searchContainer.getEnd());
								total = normas3.size();
								searchContainer.setTotal(normas3.size());
								pageContext.setAttribute("results", results);
								pageContext.setAttribute("total", total);			
							%>
		    			</liferay-ui:search-container-results>    
						<liferay-ui:search-container-row className="com.ability.genero.server.model.normasNacionales" keyProperty="id" modelVar="pre">          	
						    <liferay-ui:search-container-column-text name="Id" 				value="<%=String.valueOf(pre.getId())  %>"/>
						    <liferay-ui:search-container-column-text name="Normas Nacionales" 		value="<%=pre.getNormativas() %>"/>
						    <liferay-ui:search-container-column-text name="Año" 		value="<%=pre.getAnhio() %>"/>
				       		<liferay-ui:search-container-column-jsp  name="Acciones"  		path="/html/administracion/parametrizacion/actionsnn.jsp" />			     
				  		</liferay-ui:search-container-row>
			  			<liferay-ui:search-iterator />
					</liferay-ui:search-container>
				</div>
			</div>
		<div class="row">
				<br>
				<br>
				<label class="negrita centro" style="font-size: 15px">Instrumentos jurídicos por el derecho a la igualdad y no discriminación con enfoque diferencial y de género en beneficio de las comunidades negras, afrocolombianas, raizales y palenqueras</label>
				<br>
				<div class="row izqui">
					<aui:form style="margin-left : 5%" action="${iragregarnn }" method="post" id="4">
						<aui:input name="ambito" id="ambito" type="hidden" value="4"></aui:input>
						<aui:button value="Agregar Norma Nacional" type="submit"></aui:button>
					</aui:form>
					
				</div>
				<br>
				<div class="centroContenido">
					<liferay-ui:search-container   delta="10" deltaConfigurable="true"  emptyResultsMessage="No hay normas nacionales registradas" iteratorURL="<%=iteratorURL%>">
		    			<liferay-ui:search-container-results>
		        			<%				
							 	String keywords = ParamUtil.getString(request, "keywords");		
								results = ListUtil.subList(normas4, searchContainer.getStart(), searchContainer.getEnd());
								total = normas4.size();
								searchContainer.setTotal(normas4.size());
								pageContext.setAttribute("results", results);
								pageContext.setAttribute("total", total);			
							%>
		    			</liferay-ui:search-container-results>    
						<liferay-ui:search-container-row className="com.ability.genero.server.model.normasNacionales" keyProperty="id" modelVar="pre">          	
						    <liferay-ui:search-container-column-text name="Id" 				value="<%=String.valueOf(pre.getId())  %>"/>
						    <liferay-ui:search-container-column-text name="Normas Nacionales" 		value="<%=pre.getNormativas() %>"/>
						    <liferay-ui:search-container-column-text name="Año" 		value="<%=pre.getAnhio() %>"/>
				       		<liferay-ui:search-container-column-jsp  name="Acciones"  		path="/html/administracion/parametrizacion/actionsnn.jsp" />			     
				  		</liferay-ui:search-container-row>
			  			<liferay-ui:search-iterator />
					</liferay-ui:search-container>
				</div>
			</div>
		<div class="row">
				<br>
				<br>
				<label class="negrita centro" style="font-size: 15px">Instrumentos jurídicos por el derecho a la igualdad y no discriminación con enfoque diferencial y de género en beneficio de la comunidad raizal</label>
				<br>
				<div class="row izqui">
					<aui:form style="margin-left : 5%" action="${iragregarnn }" method="post" id="5">
						<aui:input name="ambito" id="ambito" type="hidden" value="5"></aui:input>
						<aui:button value="Agregar Norma Nacional" type="submit"></aui:button>
					</aui:form>
					
				</div>
				<br>
				<div class="centroContenido">
					<liferay-ui:search-container   delta="10" deltaConfigurable="true"  emptyResultsMessage="No hay normas nacionales registradas" iteratorURL="<%=iteratorURL%>">
		    			<liferay-ui:search-container-results>
		        			<%				
							 	String keywords = ParamUtil.getString(request, "keywords");		
								results = ListUtil.subList(normas5, searchContainer.getStart(), searchContainer.getEnd());
								total = normas5.size();
								searchContainer.setTotal(normas5.size());
								pageContext.setAttribute("results", results);
								pageContext.setAttribute("total", total);			
							%>
		    			</liferay-ui:search-container-results>    
						<liferay-ui:search-container-row className="com.ability.genero.server.model.normasNacionales" keyProperty="id" modelVar="pre">          	
						    <liferay-ui:search-container-column-text name="Id" 				value="<%=String.valueOf(pre.getId())  %>"/>
						    <liferay-ui:search-container-column-text name="Normas Nacionales" 		value="<%=pre.getNormativas() %>"/>
						    <liferay-ui:search-container-column-text name="Año" 		value="<%=pre.getAnhio() %>"/>
				       		<liferay-ui:search-container-column-jsp  name="Acciones"  		path="/html/administracion/parametrizacion/actionsnn.jsp" />			     
				  		</liferay-ui:search-container-row>
			  			<liferay-ui:search-iterator />
					</liferay-ui:search-container>
				</div>
			</div>
		<div class="row">
				<br>
				<br>
				<label class="negrita centro" style="font-size: 15px">Instrumentos jurídicos por el derecho a la igualdad y no discriminación con enfoque diferencial en beneficio de las personas discapacitadas</label>
				<br>
				<div class="row izqui">
					<aui:form style="margin-left : 5%" action="${iragregarnn }" method="post" id="6">
						<aui:input name="ambito" id="ambito" type="hidden" value="6"></aui:input>
						<aui:button value="Agregar Norma Nacional" type="submit"></aui:button>
					</aui:form>
					
				</div>
				<br>
				<div class="centroContenido">
					<liferay-ui:search-container   delta="10" deltaConfigurable="true"  emptyResultsMessage="No hay normas nacionales registradas" iteratorURL="<%=iteratorURL%>">
		    			<liferay-ui:search-container-results>
		        			<%				
							 	String keywords = ParamUtil.getString(request, "keywords");		
								results = ListUtil.subList(normas6, searchContainer.getStart(), searchContainer.getEnd());
								total = normas6.size();
								searchContainer.setTotal(normas6.size());
								pageContext.setAttribute("results", results);
								pageContext.setAttribute("total", total);			
							%>
		    			</liferay-ui:search-container-results>    
						<liferay-ui:search-container-row className="com.ability.genero.server.model.normasNacionales" keyProperty="id" modelVar="pre">          	
						    <liferay-ui:search-container-column-text name="Id" 				value="<%=String.valueOf(pre.getId())  %>"/>
						    <liferay-ui:search-container-column-text name="Normas Nacionales" 		value="<%=pre.getNormativas() %>"/>
						    <liferay-ui:search-container-column-text name="Año" 		value="<%=pre.getAnhio() %>"/>
				       		<liferay-ui:search-container-column-jsp  name="Acciones"  		path="/html/administracion/parametrizacion/actionsnn.jsp" />			     
				  		</liferay-ui:search-container-row>
			  			<liferay-ui:search-iterator />
					</liferay-ui:search-container>
				</div>
			</div>
		<div class="row">
				<br>
				<br>
				<label class="negrita centro" style="font-size: 15px">Instrumentos jurídicos con enfoque diferencial en beneficio de las personas en condición de desplazamiento forzado</label>
				<br>
				<div class="row izqui">
					<aui:form style="margin-left : 5%" action="${iragregarnn }" method="post" id="7">
						<aui:input name="ambito" id="ambito" type="hidden" value="7"></aui:input>
						<aui:button value="Agregar Norma Nacional" type="submit"></aui:button>
					</aui:form>
					
				</div>
				<br>
				<div class="centroContenido">
					<liferay-ui:search-container   delta="10" deltaConfigurable="true"  emptyResultsMessage="No hay normas nacionales registradas" iteratorURL="<%=iteratorURL%>">
		    			<liferay-ui:search-container-results>
		        			<%				
							 	String keywords = ParamUtil.getString(request, "keywords");		
								results = ListUtil.subList(normas7, searchContainer.getStart(), searchContainer.getEnd());
								total = normas7.size();
								searchContainer.setTotal(normas7.size());
								pageContext.setAttribute("results", results);
								pageContext.setAttribute("total", total);			
							%>
		    			</liferay-ui:search-container-results>    
						<liferay-ui:search-container-row className="com.ability.genero.server.model.normasNacionales" keyProperty="id" modelVar="pre">          	
						    <liferay-ui:search-container-column-text name="Id" 				value="<%=String.valueOf(pre.getId())  %>"/>
						    <liferay-ui:search-container-column-text name="Normas Nacionales" 		value="<%=pre.getNormativas() %>"/>
						    <liferay-ui:search-container-column-text name="Año" 		value="<%=pre.getAnhio() %>"/>
				       		<liferay-ui:search-container-column-jsp  name="Acciones"  		path="/html/administracion/parametrizacion/actionsnn.jsp" />			     
				  		</liferay-ui:search-container-row>
			  			<liferay-ui:search-iterator />
					</liferay-ui:search-container>
				</div>
			</div>
		</div>
	</div>
</div>
<script>
$('#normasN').addClass("active");	
</script>