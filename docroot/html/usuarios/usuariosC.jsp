<%@page import="com.ability.genero.server.service.generoUsuarioComiteLocalServiceUtil"%>
<%@page import="com.ability.modelo.modelo"%>
<%@page import="com.ability.modelo.consultas"%>
<%@page import="com.ability.genero.server.service.despachoLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.despacho"%>
<%@page import="com.ability.genero.server.service.generoUsuarioLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.generoUsuarioComite"%>
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
	<portlet:param name="mvcPath" value="/html/usuarios/usuariosC.jsp"/>
</liferay-portlet:renderURL>

<portlet:actionURL name="asignarUsuarioC" var="asignarUsuarioC"/>
<portlet:actionURL name="buscarUsuarioC" var="buscarUsuarioC"></portlet:actionURL>
<portlet:resourceURL var="exportar">
	<portlet:param name="tipoSol" value="2"/>	
</portlet:resourceURL>


<%
	
	String correo = (String) renderRequest.getPortletSession().getAttribute("correoC");
	String distrito = (String) renderRequest.getPortletSession().getAttribute("distritoC");
	
	renderRequest.getPortletSession().removeAttribute("correoC");
	renderRequest.getPortletSession().removeAttribute("distritoC");
	List<generoUsuarioComite> usuariosGeneaux = generoUsuarioComiteLocalServiceUtil.getgeneroUsuarioComites(-1, -1);
	List<generoUsuarioComite> usuariosGeneComite = new ArrayList<generoUsuarioComite>();
	if(correo != null && distrito == null){
		for(generoUsuarioComite g : usuariosGeneaux){
			String correoB ="//";
			try{
				correoB = UserLocalServiceUtil.getUser(Long.parseLong(g.getUserId())).getEmailAddress();
			}catch(Exception e){}
			correoB = correoB.toLowerCase();
			if(correoB.indexOf(correo) != -1){
				usuariosGeneComite.add(g);
			}
		}
	}
	if(distrito != null && correo == null){
		for(generoUsuarioComite g : usuariosGeneaux){
			if(g.getDistrito().equals(distrito)){
				usuariosGeneComite.add(g);
			}
		}
	}
	if(correo == null && distrito == null){
		usuariosGeneComite = usuariosGeneaux;
	}
	renderRequest.getPortletSession().setAttribute("usuariosGeneroComite", usuariosGeneComite);
	List<User> usuGenero = new ArrayList<User>();
	List<modelo> distritos = consultas.getDistritos();
	
	DynamicQuery dynamicQuery=DynamicQueryFactoryUtil.forClass(Role.class, PortalClassLoaderUtil.getClassLoader());
	dynamicQuery.add(PropertyFactoryUtil.forName("name").like("Comites Seccionales de Perspectivas Genero"));
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
					<h3>Gestion de Usuarios Comités de Genero</h3>
				</div>
				<aui:form action="${asignarUsuarioC }" method="post">
				<div class="row">
					<div class="col-md-5">
						<aui:select name="usuarios" id="usuarios" label="Usuarios" required="true" style="width: 99%;">
							<aui:option>Seleccione un usuario</aui:option>
							<%if(usuGenero!=null){ %>
								<%for(User us : usuGenero){ %>
									<aui:option value="<%=us.getUserId() %>"><%=us.getEmailAddress() %></aui:option>
								<%} %>
							<%} %>
						</aui:select>
					</div>
					<div class="col-md-5">
						<aui:select name="distrito" id="distrito" label="Distrito" required="true" style="width: 99%;">
							<aui:option value="">Seleccione...</aui:option>
							<%if(distritos!=null){ %>
								<%for(modelo ciu : distritos){ %>
									<aui:option value="<%=ciu.getId() %>"><%=ciu.getNombre() %></aui:option>
								<%} %>
							<%} %>
						</aui:select>
					</div>
					<div class="col-md-2">
						<aui:button name="guardar" id="guardar" value="Asignar" type="submit" style="padding: 4px 2%;"></aui:button>
					</div>
				</div>
				<br>
				<br>
				</aui:form>
				<aui:form method="post" action="${buscarUsuarioC }">
					<div class="row">
						<div class="col-md-5">
							<aui:input id="correo" name="correo" label="Dirección de Correo" style="width:100%;"/>
						</div>
						<div class="col-md-5">
							<aui:select name="distritoB" id="distritoB" label="Distrito" style="width: 99%;">
								<aui:option value="">Seleccione...</aui:option>
								<%if(distritos!=null){ %>
									<%for(modelo ciu : distritos){ %>
										<aui:option value="<%=ciu.getId() %>"><%=ciu.getNombre() %></aui:option>
									<%} %>
								<%} %>
							</aui:select>
						</div>
						<div class="col-md-2">
							<aui:button name="buscar" id="buscar" value="Buscar" type="submit" style="margin-top: 8%; width:100%;"></aui:button>
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
									results = ListUtil.subList(usuariosGeneComite, searchContainer.getStart(), searchContainer.getEnd());
									total = usuariosGeneComite.size();
									searchContainer.setTotal(usuariosGeneComite.size());
									pageContext.setAttribute("results", results);
									pageContext.setAttribute("total", total);			
								%>
						    </liferay-ui:search-container-results>    
								<liferay-ui:search-container-row className="com.ability.genero.server.model.generoUsuarioComite" keyProperty="id" modelVar="userGene">          	
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
								       		String distritoNombre = consultas.getDistritoNombre(userGene.getDistrito());			       
								       %>
								       <liferay-ui:search-container-column-text name="Distrito" value="<%=distritoNombre %>"></liferay-ui:search-container-column-text>
								       <liferay-ui:search-container-column-jsp  name="Acciones"  path="/html/usuarios/actionsC.jsp" />			     
								  </liferay-ui:search-container-row>
						  	<liferay-ui:search-iterator />
						</liferay-ui:search-container>
					</div>
				</div>
				<%-- <br>
				<div class="row text-center">
					<aui:button name="exportar" id="exportar" value="Exportar" type="button" style="padding: 4px 2%;" onClick="<%=exportar %>"></aui:button>
				</div> --%>
			</div>
		</div>
	</div>
</div>
			

<portlet:resourceURL var="filtro">
</portlet:resourceURL>
<script type="text/javascript">
$('#usuariosC').addClass("active");	
</script>