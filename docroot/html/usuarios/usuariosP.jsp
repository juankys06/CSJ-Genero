<%@page import="com.ability.modelo.modelo"%>
<%@page import="com.ability.modelo.consultas"%>
<%@page import="com.ability.genero.server.service.despachoLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.despacho"%>
<%@page import="com.ability.genero.server.service.generoUsuarioLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.generoUsuario"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.ability.genero.server.service.especialidadLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.especialidad"%>
<%@page import="com.ability.genero.server.service.ciudadesLocalServiceUtil"%>
<%@page import="com.ability.genero.server.service.ciudadesLocalService"%>
<%@page import="com.ability.genero.server.model.ciudades"%>
<%@page import="com.ability.genero.server.service.entidadLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.entidad"%>
<%@page import="com.liferay.portal.kernel.util.PortalClassLoaderUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
<%@page import="com.liferay.portal.service.RoleLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.Role"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.User"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@include file="/html/init-control-panel.jsp"%>
<portlet:defineObjects />

<liferay-portlet:renderURL varImpl="iteratorURL">
	<portlet:param name="mvcPath" value="/html/usuarios/usuariosP.jsp"/>
</liferay-portlet:renderURL>

<portlet:actionURL name="asignarUsuario" var="asignarUsuario"/>
<portlet:actionURL name="buscarUsuario" var="buscarUsuario"></portlet:actionURL>
<portlet:resourceURL var="exportar">
	<portlet:param name="tipoSol" value="2"/>	
</portlet:resourceURL>


<%
	
	String nombreBus = (String) renderRequest.getPortletSession().getAttribute("nombre");
	String correoBus = (String) renderRequest.getPortletSession().getAttribute("correo");
	String ciudadBus = (String) renderRequest.getPortletSession().getAttribute("ciudad");
	String entidadBus = (String) renderRequest.getPortletSession().getAttribute("entidad");
	String especialidadBus = (String) renderRequest.getPortletSession().getAttribute("especialidad");
	
	consultas consul = new consultas();
	List<generoUsuario> usuariosGeneaux = generoUsuarioLocalServiceUtil.getgeneroUsuarios(-1, -1);
	List<generoUsuario> usuariosGene = new ArrayList<generoUsuario>();
	/* if(nombreBus != null && correo == null){
		for(generoUsuario g : usuariosGeneaux){
			String nombreB ="//";
			try{
				nombreB = UserLocalServiceUtil.getUser(Long.parseLong(g.getUserId())).getFirstName()+" "+UserLocalServiceUtil.getUser(Long.parseLong(g.getUserId())).getLastName();
			}catch(Exception e){}
			nombreB = nombreB.toLowerCase();
			if(nombreB.indexOf(nombreBus) != -1){
				usuariosGene.add(g);
			}
		}
	}
	if(correo != null && nombreBus == null){
		for(generoUsuario g : usuariosGeneaux){
			String correoB ="//";
			try{
				correoB = UserLocalServiceUtil.getUser(Long.parseLong(g.getUserId())).getEmailAddress();
			}catch(Exception e){}
			correoB = correoB.toLowerCase();
			if(correoB.indexOf(correo) != -1){
				usuariosGene.add(g);
			}
		}
	}
	if(nombreBus == null && correo == null){
		usuariosGene = usuariosGeneaux;
	} */
	usuariosGene = consultas.getBusquedaUsuariosGenero(correoBus, nombreBus, ciudadBus, entidadBus, especialidadBus);
	renderRequest.getPortletSession().setAttribute("usuariosGenero", usuariosGene);
	List<User> usuGenero = new ArrayList<User>();
	List<modelo> entiGEnero = consul.getEntidades();
	List<modelo> ciudaGenero = consultas.getCiudades();
	List<modelo> especiaGenero = consul.getEspecialidades();
	List<modelo> despachosGenero = consul.getDespachosTodos();
	
	DynamicQuery dynamicQuery=DynamicQueryFactoryUtil.forClass(Role.class, PortalClassLoaderUtil.getClassLoader());
	dynamicQuery.add(PropertyFactoryUtil.forName("name").like("Perspectivas de Genero"));
	List <Role> roles=RoleLocalServiceUtil.dynamicQuery(dynamicQuery);
	for(Role rol:roles){
		System.out.println("rol "+rol.getRoleId());
		usuGenero=UserLocalServiceUtil.getRoleUsers(rol.getRoleId());
	}

%>

<liferay-ui:error key="yaEsta" message="Usuario ya esta asociado en un despacho"></liferay-ui:error>
<liferay-ui:success key="guardo" message="Usuario asociado al despacho exitosamente"></liferay-ui:success>
<liferay-ui:success key="eliminado" message="Usuario eliminado del despacho exitosamente"></liferay-ui:success>

<div class="container-fluid">
	<div class="row">
		<div class="bloque" style="width: 20%">
			<jsp:include page="/html/usuarios/menu.jsp"></jsp:include>
		</div>
		<div class="bloque" style="width: 79% ; min-height : 200px;">
			<div class="container-fluid">
				<div class="row text-center">
					<h3>Gestion de Usuarios Genero</h3>
				</div>
				<aui:form action="${asignarUsuario }" method="post">
				<div class="row">
					<div class="col-md-3">
						<aui:select name="usuarios" id="usuarios" label="Usuarios" required="true" style="width: 99%;">
							<aui:option>Seleccione un usuario</aui:option>
							<%if(usuGenero!=null){ %>
								<%for(User us : usuGenero){ %>
									<aui:option value="<%=us.getUserId() %>"><%=us.getEmailAddress() %></aui:option>
								<%} %>
							<%} %>
						</aui:select>
					</div>
					<div class="col-md-3">
						<aui:select name="ciudad" id="ciudad" label="Ciudad" required="true" style="width: 99%;" onChange="despacho()">
							<%if(ciudaGenero!=null){ %>
								<%for(modelo ciu : ciudaGenero){ %>
									<aui:option value="<%=ciu.getId() %>"><%=ciu.getNombre() %></aui:option>
								<%} %>
							<%} %>
						</aui:select>
					</div>
					<div class="col-md-3">
						<aui:select name="entidad" id="entidad" label="Entidad" required="true" style="width: 99%;" onChange="despacho()">
							<%if(entiGEnero!=null){ %>
								<%for(modelo en : entiGEnero){ %>
									<aui:option value="<%=en.getId() %>"><%=en.getNombre() %></aui:option>
								<%} %>
							<%} %>
						</aui:select>
					</div>
					<div class="col-md-3">
						<aui:select name="especialidad" id="especialidad" label="Especialidad" required="true" style="width: 99%;" onChange="despacho()">
							<%if(especiaGenero!=null){ %>
								<%for(modelo es : especiaGenero){ %>
									<aui:option value="<%=es.getId() %>"><%=es.getNombre() %></aui:option>
								<%} %>
							<%} %>
						</aui:select>
					</div>
					<div class="col-md-6">
						<aui:select name="despacho" id="despacho" label="Despacho" required="true" style="width: 99%;">
							
						</aui:select>
					</div>
					<div class="col-md-6 text-center">
						<aui:button name="guardar" id="guardar" value="Asignar" type="submit" style="margin-top: 2%;"></aui:button>
					</div>
				</div>
				<br>
				<br>
				</aui:form>
				<aui:form method="post" action="${buscarUsuario }">
					<div class="row">
						<div class="col-md-6">
							<aui:input id="correo" name="correo" label="Dirección de Correo" style="width:100%;"/>
						</div>
						<div class="col-md-6">
							<aui:input id="nombre" name="nombre" label="nombre" style="width:100%;"/>
						</div>
						<div class="col-md-4">
							<aui:select name="ciudadB" id="ciudadB" label="Ciudad" style="width: 99%;">
								<aui:option value="">Seleccione</aui:option>
								<%if(ciudaGenero!=null){ %>
									<%for(modelo ciu : ciudaGenero){ %>
										<aui:option value="<%=ciu.getId() %>"><%=ciu.getNombre() %></aui:option>
									<%} %>
								<%} %>
							</aui:select>
						</div>
						<div class="col-md-4">
							<aui:select name="entidadB" id="entidadB" label="Entidad" style="width: 99%;">
								<aui:option value="">Seleccione</aui:option>
								<%if(entiGEnero!=null){ %>
									<%for(modelo en : entiGEnero){ %>
										<aui:option value="<%=en.getId() %>"><%=en.getNombre() %></aui:option>
									<%} %>
								<%} %>
							</aui:select>
						</div>
						<div class="col-md-4">
							<aui:select name="especialidadB" id="especialidadB" label="Especialidad" style="width: 99%;">
								<aui:option value="">Seleccione</aui:option>
								<%if(especiaGenero!=null){ %>
									<%for(modelo es : especiaGenero){ %>
										<aui:option value="<%=es.getId() %>"><%=es.getNombre() %></aui:option>
									<%} %>
								<%} %>
							</aui:select>
						</div>
						<div class="col-md-12 text-center">
							<aui:button name="buscar" id="buscar" value="Buscar" type="submit" style="margin-top: 10px;"></aui:button>
						</div>
					</div>
				</aui:form>
				<br>
				<br>
				<div class="row">
					<div class="col-md-12" style="font-size: 12px;">
						<liferay-ui:search-container   delta="10" deltaConfigurable="true"  emptyResultsMessage="No hay usuarios asignados" iteratorURL="<%=iteratorURL%>">
						    <liferay-ui:search-container-results>
						        <%				
								 	String keywords = ParamUtil.getString(request, "keywords");		
									results = ListUtil.subList(usuariosGene, searchContainer.getStart(), searchContainer.getEnd());
									total = usuariosGene.size();
									searchContainer.setTotal(usuariosGene.size());
									pageContext.setAttribute("results", results);
									pageContext.setAttribute("total", total);			
								%>
						    </liferay-ui:search-container-results>    
								<liferay-ui:search-container-row className="com.ability.genero.server.model.generoUsuario" keyProperty="id" modelVar="userGene">          	
										<%
											String nom = "Usuario eliminado del portal"; 
											String correoU = "Usuario eliminado del portal"; 
												try{
													nom = UserLocalServiceUtil.getUser(Long.parseLong(userGene.getUserId())).getFirstName()+" "+UserLocalServiceUtil.getUser(Long.parseLong(userGene.getUserId())).getLastName(); 
													correoU = UserLocalServiceUtil.getUser(Long.parseLong(userGene.getUserId())).getEmailAddress();
												}catch(Exception e){}		
											
										%>
								       <liferay-ui:search-container-column-text name="Nombre" 		value="<%=nom%>"/>
								       <liferay-ui:search-container-column-text name="Correo electrónico" 		value="<%=correoU%>"/>
								       <%
								       	String ciudad="",entidad="",especialidad="",despacho="";
								       for(modelo c : ciudaGenero){
								    	   if(userGene.getDespacho().substring(0, 5).equalsIgnoreCase(c.getId()))
								    		   ciudad=c.getNombre();
								       }
								       for(modelo e : entiGEnero){
								    	   if(e.getId().length()==1)
								    		   e.setId("0"+e.getId());
								    	   if(userGene.getDespacho().substring(5, 7).equalsIgnoreCase(e.getId()))
								    		   entidad=e.getNombre();
								       }
								       for(modelo e : especiaGenero){
								    	   if(e.getId().length()==1)
								    		   e.setId("0"+e.getId());
								    	   if(userGene.getDespacho().substring(7, 9).equalsIgnoreCase(e.getId()))
								    		   especialidad=e.getNombre();
								       }
								       for(modelo d : despachosGenero){
								    	   if(userGene.getDespacho().equalsIgnoreCase(d.getId()))
								    		   despacho=d.getNombre();
								       }
								       
								       %>
								       <liferay-ui:search-container-column-text name="Ciudad" value="<%=ciudad %>"></liferay-ui:search-container-column-text>
								       <liferay-ui:search-container-column-text name="Entidad" value="<%=entidad %>"></liferay-ui:search-container-column-text>
								       <liferay-ui:search-container-column-text name="Especilaidad" value="<%=especialidad %>"></liferay-ui:search-container-column-text>
								       <liferay-ui:search-container-column-text name="Nombre Despacho" value="<%=despacho %>"></liferay-ui:search-container-column-text>
								       <liferay-ui:search-container-column-text name="Codigo Despacho" value="<%=userGene.getDespacho() %>"></liferay-ui:search-container-column-text>
								       <liferay-ui:search-container-column-jsp  name="Acciones"  path="/html/usuarios/actionsP.jsp" />			     
								  </liferay-ui:search-container-row>
						  	<liferay-ui:search-iterator />
						</liferay-ui:search-container>
					</div>
				</div>
				<br>
				<div class="row text-center">
					<aui:button name="exportar" id="exportar" value="Exportar" type="button" style="padding: 4px 2%;" onClick="<%=exportar %>"></aui:button>
				</div>
			</div>
		</div>
	</div>
</div>
			

<portlet:resourceURL var="filtro">
</portlet:resourceURL>
<script type="text/javascript">
$('#usuariosP').addClass("active");
function despacho(){
	var ciudad = document.getElementById('<portlet:namespace/>ciudad').value;
	var entidad = document.getElementById('<portlet:namespace/>entidad').value;
	var especialidad = document.getElementById('<portlet:namespace/>especialidad').value;
	if(ciudad!='' && entidad!='' && especialidad!=''){
		if(entidad.length==1){
			entidad="0"+entidad;
		}
		if(especialidad.length==1){
			especialidad="0"+especialidad;
		}
		var despacho = ciudad+entidad+especialidad;
		$.ajax({
			url:   '<%=filtro%>',
	        type:  'post',
	        dataType: 'json',
	        data:  {tipoSol : 1 ,despachos : despacho },
	        success:  function (response) {
	        	var data = response;
	        	$('#<portlet:namespace/>despacho').html('');
	        	$('#<portlet:namespace/>despacho').append($('<option>').text('Seleccione un despacho').attr('value', ''));
	        	$.each(data, function(i, des) {
	        		$('#<portlet:namespace/>despacho').append($('<option>').text(des.nombre).attr('value', des.id));
	        		
	            	
	            });
	        }
	        
		});
	}
}
	
</script>