<%@page import="com.ability.genero.server.service.generoUsuarioComiteLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.generoUsuarioComite"%>
<%@page import="com.ability.modelo.modelo"%>
<%@page import="com.ability.modelo.consultas"%>
<%@page import="java.util.Date"%>
<%@page import="com.ability.genero.server.service.ciudadesLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.ciudades"%>
<%@page import="com.liferay.portal.service.RoleLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.Role"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="com.ability.genero.server.service.tipoDecisionLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.tipoDecision"%>
<%@page import="com.ability.genero.server.service.encuestaCriteriosLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.encuestaCriterios"%>
<%@page import="com.ability.genero.server.service.encuestaEnfoDifeLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.encuestaEnfoDife"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.ability.genero.server.model.casoLVClp"%>
<%@page import="java.awt.Event"%>
<%@page import="com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.Projection"%>
<%@page import="com.liferay.portal.kernel.util.PortalClassLoaderUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
<%@page import="com.ability.genero.server.service.generoUsuarioLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.generoUsuario"%>
<%@page import="com.ability.genero.server.service.subcategoriaLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.subcategoria"%>
<%@page import="com.ability.genero.server.service.categoriaLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.categoria"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.ability.genero.server.service.casoLVLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.casoLV"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.ability.genero.server.service.entidadLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.entidad"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@include file="/html/init.jsp"%>

<%
	int cuenta=1,cuenta2=0;//cuentas de for
	float porcent=0;
	boolean banderaTodos=true; //bandera de motrar todos los casos del despacho
	boolean banderaTodas=true; //bandera de motrar todos los casos del despacho
	boolean rango = false;
	boolean anosss = false;
	boolean tieneRolAdmin = false;
	boolean tieneRolComite = false;
	List <casoLV> casos= new ArrayList<casoLV>(); //lista de casos del despacho
	String idUsu =String.valueOf(user.getUserId()); //id del usuario logueado
	generoUsuario usuarioDespacho = null;
	usuarioDespacho = generoUsuarioLocalServiceUtil.findByPorUsuario(idUsu); //despacho del usuario
	List<generoUsuarioComite> usuarioComite = new ArrayList<generoUsuarioComite>();
	usuarioComite = generoUsuarioComiteLocalServiceUtil.findByPorUsuario(idUsu); //despacho del usuario
	List <tipoDecision> tipos = tipoDecisionLocalServiceUtil.gettipoDecisions(-1, -1);
	List <encuestaEnfoDife> parte1 = encuestaEnfoDifeLocalServiceUtil.getencuestaEnfoDifes(-1, -1);//preguntas parte 1 de la encuesta
	List <encuestaCriterios> parte2 = encuestaCriteriosLocalServiceUtil.getencuestaCriterioses(-1, -1);//preguntas de parte 2 de la encuesta
	List<modelo> ciudaGenero = consultas.getCiudades(); //todas las ciudades
	List<modelo> distritos = consultas.getDistritosN();//Todos los distritos
	Role rolAdminPortal = RoleLocalServiceUtil.getRole(user.getCompanyId(), "Administrator");
	Role rolAdminGenero = RoleLocalServiceUtil.getRole(user.getCompanyId(), "Administrador de Perspectivas de Genero");
	if(RoleLocalServiceUtil.hasUserRole(user.getUserId(), rolAdminPortal.getRoleId()) || RoleLocalServiceUtil.hasUserRole(user.getUserId(), rolAdminGenero.getRoleId()))
		tieneRolAdmin=true;
	//------ obtencion años de casos disponibles
	List<String> anhios = new ArrayList<String>();
	if(usuarioDespacho!=null){
		anhios = consultas.getAnhios(usuarioDespacho.getDespacho());
	}
	if(tieneRolAdmin && usuarioDespacho==null){
		anhios = consultas.getAnhios("");
	}
	if(usuarioComite.size()>0){
		anhios = consultas.getAnhios("");
	}
		
	//------- fin de obtencion de años
	String aux=""; // variable para usos multibles
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); //formato de fecha a mostrar
	SimpleDateFormat formato1 = new SimpleDateFormat("yyyy-MM-dd"); //formato de fecha comparar
	List <categoria> categorias = categoriaLocalServiceUtil.getcategorias(-1, -1); //lista de categorias
	List <subcategoria> subcategorias = subcategoriaLocalServiceUtil.getsubcategorias(-1, -1); //lista de subcategorias
	//filtrar la busqueda por año y ciudad
	String ano = (String) renderRequest.getPortletSession().getAttribute("ano"); //año por el cual se filtro la busqueda
	String fechaini = (String) renderRequest.getPortletSession().getAttribute("fechainicio"); //año por el cual se filtro la busqueda
	String fechafi = (String) renderRequest.getPortletSession().getAttribute("fechafin"); //año por el cual se filtro la busqueda
	String ciu = (String) renderRequest.getPortletSession().getAttribute("ciudad"); //cuidad por el cual se filtro la busqueda
	String cateFiltro = (String) renderRequest.getPortletSession().getAttribute("categ"); //categoria por el cual se filtro la busqueda
	String subcateFiltro = (String) renderRequest.getPortletSession().getAttribute("subcat"); //subcategoria por el cual se filtro la busqueda
	String distrito = (String) renderRequest.getPortletSession().getAttribute("distrito"); //distrito por el cual se filtro la busqueda
	String nombre = (String) renderRequest.getPortletSession().getAttribute("nombre"); //nombre por el cual se filtro la busqueda
	String distritosComite = "";
	if(ano!=null){
		anosss=true;
		if(!ano.equals("todos"))
			banderaTodos=false;
	}
	if(ciu!=null && !ciu.equalsIgnoreCase("todas"))
		banderaTodas=false;
	if(fechaini!=null || fechafi!=null)
		rango=true;
	
	if(usuarioDespacho!=null){
		casos = consultas.getCasos(ano, fechaini, fechafi, ciu, cateFiltro, subcateFiltro, usuarioDespacho.getDespacho(),"","","");
	}
	if(tieneRolAdmin && usuarioDespacho==null){
		casos = consultas.getCasos(ano, fechaini, fechafi, ciu, cateFiltro, subcateFiltro, "",distrito,nombre,"");
	}
	if(!tieneRolAdmin && usuarioDespacho==null && usuarioComite.size()>0){
		for(generoUsuarioComite d : usuarioComite){
			distritosComite+=d.getDistrito()+",";
		}
		distritosComite = distritosComite.substring(0, distritosComite.length()-1);
		casos = consultas.getCasos(ano, fechaini, fechafi, ciu, cateFiltro, subcateFiltro, "",distrito,nombre,distritosComite);
	}
	
	// fin de filtrado de busqueda por años
	//--------- calculo de estadisticos
	int numeroCasos = 0;
	numeroCasos = casos.size();
	int numeroCasosAux = 0;
	int completa = 0;
	int parcial = 0;
	int noCompleta = 0;
	int cantidadAplican = 0;
	int cantidadNoAplican = 0;
	int cantidadTotal = 0;
	float completaPorcentaje,parcialPorcentaje,noCompletaPorcentaje,cantidadAplicanPorcen,cantidadNoAplicanPorcen;
	String respuestas1="";
	String respuestas2="";
	String categorias1="";
	
	for(casoLV estadisticas : casos){
		String[] pre1 = estadisticas.getRespuestas1().split("-");
		String[] pre2 = estadisticas.getRespuestas2().split("-");
		int cant1=pre1.length,cant2=pre2.length,si=0,no=0;
		for(String a : pre1){
			String[] res = a.split("/");
			if(res[0].equals("1")){
				si++;
			}
			if(res[0].equals("2")){
				no++;
			}
		}
		for(String a : pre2){
			String[] res = a.split("/");
			if(res[0].equals("1")){
				si++;
			}
			if(res[0].equals("2")){
				no++;
			}
		}
		if(cant1+cant2==si){
			completa++;
		}else if(cant1+cant2==no){
			noCompleta++;
		}else{
			parcial++;
		}
		cantidadAplican+=si;
		cantidadNoAplican+=no;
		cantidadTotal+=(si+no);
	}
	if(numeroCasos==0){
		numeroCasos=1;
	}
	if(cantidadTotal==0){
		cantidadTotal=1;
	}
	completaPorcentaje=((float)completa/numeroCasos)*100;
	parcialPorcentaje=((float)parcial/numeroCasos)*100;
	noCompletaPorcentaje=((float)noCompleta/numeroCasos)*100;
	cantidadAplicanPorcen=((float)cantidadAplican/cantidadTotal)*100;
	cantidadNoAplicanPorcen=((float)cantidadNoAplican/cantidadTotal)*100;
	
	for(encuestaEnfoDife diferencial : parte1){
		for(casoLV c : casos){
			String[] pre = c.getRespuestas1().split("-");
			for(String s : pre){
				String[] s1 = s.split("/");
				if(s1[1].equalsIgnoreCase(String.valueOf(diferencial.getId()))){
					if(s1[0].equalsIgnoreCase("1")){
						cuenta2++;
					}
				}
			}
		}
		respuestas1+=cuenta2+"/";
		cuenta2=0;
		cuenta++;
	}
	cuenta=1;cuenta2=0;
	for(encuestaCriterios diferencia2 : parte2){
		for(casoLV c : casos){
			String[] pre = c.getRespuestas2().split("-");
			for(String s : pre){
				String[] s1 = s.split("/");
				if(s1[1].equalsIgnoreCase(String.valueOf(diferencia2.getId()))){
					if(s1[0].equalsIgnoreCase("1")){
						cuenta2++;
					}
				}
			}
		}
		respuestas2+=cuenta2+"/";
		cuenta2=0;
		cuenta++;
	}
	cuenta=0;cuenta2=1;
	for(categoria cat: categorias){
		for(casoLV c : casos){
			if(c.getCategoria().equalsIgnoreCase(String.valueOf(cat.getId()))){
				cuenta++;
			}
		} 
		categorias1+=cuenta+"/";
		cuenta=0;
		cuenta2++;
	}
	cuenta=1;cuenta2=0;
	//----------fin de calculo de estadisticos
	
%>

<portlet:defineObjects />
<liferay-portlet:renderURL varImpl="iteratorURL">
	<portlet:param name="mvcPath" value="/html/genero/view.jsp"/>
</liferay-portlet:renderURL>

<portlet:resourceURL var="pdf">
	<portlet:param name="tipo" value="1"/>
</portlet:resourceURL>
<portlet:resourceURL var="xls">
	<portlet:param name="tipo" value="2"/>
</portlet:resourceURL>

<!-- Enlaces internos -->
<portlet:renderURL	var="nuevoCaso">
	<portlet:param name="mvcPath" value="/html/genero/nuevoCaso.jsp"/>
</portlet:renderURL>

<portlet:actionURL var="filtroRan" name="filtroRan"></portlet:actionURL>
<portlet:actionURL var="filtroAno" name="filtroAno"></portlet:actionURL>
<portlet:actionURL var="filtroNombre" name="filtroNombre"></portlet:actionURL>
<portlet:actionURL var="limpiar" name="limpiarFiltros"/>

<style>

.aui .alert-success, .aui .portlet-msg-success {
    display: none;
}
</style>

<div class="contenedor">
<%if(usuarioDespacho!=null || tieneRolAdmin || usuarioComite.size()>0){ %>
	<jsp:include page="/html/genero/menu.jsp"></jsp:include>
	<br>
	<br>
	<div style="text-align: center;" class="row"> Seleccione metodo de rango de vigencia</div>
	<br>
	<div class="row">
		<div class="col-md-4">
			<%
			if(usuarioDespacho!=null){ 
			%>
				<aui:button name="nuevoCaso" id="nuevoCaso" value="Nuevo Caso" href="${nuevoCaso }"></aui:button>
			<%
			}
			if(tieneRolAdmin && usuarioDespacho==null){ 
			%>
				<aui:select name="ciudad" id="ciudad" label="Ciudad" required="true" style="width: 99%;" onChange="filtroCiudad()">
					<aui:option value="todas">Todas</aui:option>
					<%if(ciudaGenero!=null){ %>
						<%for(modelo ciud : ciudaGenero){ %>
							<%if(ciu!=null){ %>
								<%if(ciu.equalsIgnoreCase(ciud.getId())){ %>
									<aui:option value="<%=ciud.getId() %>" selected="true"><%=ciud.getNombre() %></aui:option>
								<%}else{ %>
									<aui:option value="<%=ciud.getId() %>"><%=ciud.getNombre() %></aui:option>
								<%} %>
							<%}else{ %>
								<aui:option value="<%=ciud.getId() %>"><%=ciud.getNombre() %></aui:option>
							<%} %>
						<%} %>
					<%} %>
				</aui:select>
				<br>
				<aui:select name="distrito" id="distrito" label="Distrito" required="true" style="width: 99%;" onChange="filtroDistrito()">
					<aui:option value="todos">Todos</aui:option>
					<%for(modelo dis : distritos){ %>
						<%if(distrito!=null){ %>
							<%if(distrito.equalsIgnoreCase(dis.getId())){ %>
								<aui:option value="<%=dis.getId() %>" selected="true"><%=dis.getNombre() %></aui:option>
							<%}else{ %>
								<aui:option value="<%=dis.getId() %>"><%=dis.getNombre() %></aui:option>
							<%} %>
						<%}else{ %>
							<aui:option value="<%=dis.getId() %>"><%=dis.getNombre() %></aui:option>
						<%} %>
					<%} %>
				</aui:select>
				<br>
				<form action="${filtroNombre }" method="post">
					<div class="bloque" style="width:79%">
						<%if(nombre!=null){ %>
							<aui:input name="nombre" id="nombre" label="Nombre Despacho:" type="text" style="width:95%;" value="<%=nombre %>"></aui:input>
						<%}else{ %>
							<aui:input name="nombre" id="nombre" label="Nombre Despacho:" type="text" style="width:95%;"></aui:input>
						<%} %>
					</div>
					<div class="bloque" style="width:20%">
						<aui:button name="buscar" id="buscar" value="Filtrar" type="submit" style="width:100%; margin-top:22%;"></aui:button>
					</div>
				</form>
			<%} %>
		</div>
		<div class="col-md-4" style="text-align: center;" onchange="metodoBusqueda()">
			<aui:select name="busqueda" label="">
				<aui:option value="0">Seleccione metodo</aui:option>
				<aui:option value="1" selected="<%=anosss %>">Año</aui:option>
				<aui:option value="2" selected="<%=rango %>">Rango</aui:option>
			</aui:select>
			<br>
			<div class="row" id="ano1" style="display:none;">
				<form id="fromAno" action="${filtroAno }" method="post">
					<aui:select name="ano" id="ano" label="" onChange="filtroano()">
						<aui:option value="todos" selected="<%=banderaTodos %>">Todos</aui:option>
						<%for(String a :anhios){%>
							<%if(ano!=null){ %>
								<%if(ano.equals(a)){ %>
									<aui:option value="<%=a %>" selected="true"><%=a %></aui:option>
								<%}else{ %>
									<aui:option value="<%=a %>"><%=a %></aui:option>
								<%} %>
							<%}else{ %>
								<aui:option value="<%=a %>"><%=a %></aui:option>
							<%} %>
						<%} %>
					</aui:select>
				</form>
			</div>
			<div class="row" id="rango" style="display:none;">
				<form id="fromRango" action="${filtroRan }" method="post">
					<div class="bloque" style="width:35%">
						<%if(fechaini!=null && !fechaini.equalsIgnoreCase("")){ %>
							<aui:input name="fechainicio" id="fechainicio" label="Inicio:" type="date" style="width:95%;" value="<%=fechaini %>"></aui:input>
						<%}else{ %>
							<aui:input name="fechainicio" id="fechainicio" label="Inicio:" type="date" style="width:95%;"></aui:input>
						<%} %>
					</div>
					<div class="bloque" style="width:35%">
						<%if(fechafi!=null && !fechafi.equalsIgnoreCase("")){ %>
							<aui:input name="fechafin" id="fechafin" label="Fin:" type="date" style="width:95%;" value="<%=fechafi %>"></aui:input>
						<%}else{ %>
							<aui:input name="fechafin" id="fechafin" label="Fin:" type="date" style="width:95%;"></aui:input>
						<%} %>
					</div>
					<div class="bloque" style="width:20%">
						<aui:button name="buscar" id="buscar" value="Filtrar" onClick="filtroRango()" style="width:100%; margin-top:22%;"></aui:button>
					</div>
				</form>
			</div>
			<div class="row" style="margin-top: 5px;">
				<aui:input name="prueba" id="prueba" type="hidden" value="<%=subcateFiltro %>"></aui:input>
				<p>Filtro por matriz de categorías</p>
				<div class="col-md-12">
					<aui:select name="categoria" id="categoria" label="Categoria" style="width : 76%;" onChange="filtros()" required="true" >
						<aui:option value="todas">Todas</aui:option>
						<%if(categorias!=null){ %>
							<%for(categoria cat : categorias){ %>
								<%if(cateFiltro!=null){ %>
									<%if(!cateFiltro.equalsIgnoreCase("todas")){ %>	
										<%if(cateFiltro!=null && Integer.parseInt(cateFiltro)==cat.getId()){ %>
											<aui:option value="<%=cat.getId() %>" selected="true"><%=cat.getCategoria() %></aui:option>
										<%}else{ %>
											<aui:option value="<%=cat.getId() %>"><%=cat.getCategoria() %></aui:option>
										<%} %>
									<%}else{ %>
										<aui:option value="<%=cat.getId() %>"><%=cat.getCategoria() %></aui:option>
									<%} %>
								<%}else{ %>
									<aui:option value="<%=cat.getId() %>"><%=cat.getCategoria() %></aui:option>
								<%} %>
							<%}%>
						<%} %>
					</aui:select>
				</div>
				<div class="col-md-12" style="margin-top: 5px;">
					<aui:select name="subCategoria" id="subCategoria" label="Subcategoria" style="width : 76%;" required="true" onChange="filtroCategorias()"></aui:select>
				</div>
			</div>
		</div>
		<div class="col-md-4">
		<div class="row">
			<form action="<%=pdf %>" method="post" class="bloque">
				<%if(usuarioDespacho!=null){ %>
					<aui:input name="despachoC" id="despachoC" value="<%=usuarioDespacho.getDespacho() %>" type="hidden"></aui:input>
				<%}else{ %>
					<aui:input name="despachoC" id="despachoC" value="-1" type="hidden"></aui:input>
				<%} %>
				<%if(usuarioComite.size()>0){ %>
					<aui:input name="comite" id="comite" value="<%=distritosComite %>" type="hidden"></aui:input>
				<%}else{ %>
					<aui:input name="comite" id="comite" value="-1" type="hidden"></aui:input>
				<%} %>
				<aui:input name="anhio" id="anhio" value="<%=ano %>" type="hidden"></aui:input>
				<aui:input name="fechaini" id="fechaini" value="<%=fechaini %>" type="hidden"></aui:input>
				<aui:input name="fechafin" id="fechafin" value="<%=fechafi %>" type="hidden"></aui:input>
				<aui:input name="ciudad" id="ciudad" value="<%=ciu %>" type="hidden"></aui:input>
				<aui:input name="categoria" id="categoria" value="<%=cateFiltro %>" type="hidden"></aui:input>
				<aui:input name="subcategoria" id="subcategoria" value="<%=subcateFiltro %>" type="hidden"></aui:input>
				<aui:input name="distrito" id="distrito" value="<%=distrito %>" type="hidden"></aui:input>
				<aui:input name="nombre" id="nombre" value="<%=nombre %>" type="hidden"></aui:input>
				<aui:button  value="Reporte Casos PDF" type="submit" formtarget="_blank" onclick="sendParams()"></aui:button>
			</form>
			
			<form action="<%=pdf %>" method="post" class="bloque">
				<%if(usuarioDespacho!=null){ %>
					<aui:input name="despachoC" id="despachoC" value="<%=usuarioDespacho.getDespacho() %>" type="hidden"></aui:input>
				<%}else{ %>
					<aui:input name="despachoC" id="despachoC" value="-1" type="hidden"></aui:input>
				<%} %>
				<aui:input name="anhio" id="anhio" value="<%=ano %>" type="hidden"></aui:input>
				<aui:input name="fechaini" id="fechaini" value="<%=fechaini %>" type="hidden"></aui:input>
				<aui:input name="fechafin" id="fechafin" value="<%=fechafi %>" type="hidden"></aui:input>
				<aui:input name="ciudad" id="ciudad" value="<%=ciu %>" type="hidden"></aui:input>
				<aui:input name="categoria" id="categoria" value="<%=cateFiltro %>" type="hidden"></aui:input>
				<aui:input name="subcategoria" id="subcategoria" value="<%=subcateFiltro %>" type="hidden"></aui:input>
				<aui:input name="distrito" id="distrito" value="<%=distrito %>" type="hidden"></aui:input>
				<aui:input name="nombre" id="nombre" value="<%=nombre %>" type="hidden"></aui:input>
				<aui:input name="numeroCasos" id="numeroCasos" value="<%=numeroCasos %>" type="hidden"></aui:input>
				<aui:input name="completa" id="completa" value="<%=completa %>" type="hidden"></aui:input>
				<aui:input name="parcial" id="parcial" value="<%=parcial %>" type="hidden"></aui:input>
				<aui:input name="noCompleta" id="noCompleta" value="<%=noCompleta %>" type="hidden"></aui:input>
				<aui:input name="cantidadAplican" id="cantidadAplican" value="<%=cantidadAplican %>" type="hidden"></aui:input>
				<aui:input name="cantidadNoAplican" id="cantidadNoAplican" value="<%=cantidadNoAplican %>" type="hidden"></aui:input>
				<aui:input name="cantidadTotal" id="cantidadTotal" value="<%=cantidadTotal %>" type="hidden"></aui:input>
				<aui:input name="respuestas1" id="respuestas1" value="<%=respuestas1 %>" type="hidden"></aui:input>
				<aui:input name="respuestas2" id="respuestas2" value="<%=respuestas2 %>" type="hidden"></aui:input>
				<aui:input name="categorias1" id="categorias1" value="<%=categorias1 %>" type="hidden"></aui:input>
				
				<aui:button  value="Reporte Indicadores PDF" type="submit" formtarget="_blank" onclick="sendParams1()"></aui:button>
			</form>
		</div>
		<br>
		<div class="row">
			<form action="<%=xls %>" method="post" class="bloque">
				<%if(usuarioDespacho!=null){ %>
					<aui:input name="despachoC" id="despachoC" value="<%=usuarioDespacho.getDespacho() %>" type="hidden"></aui:input>
				<%}else{ %>
					<aui:input name="despachoC" id="despachoC" value="-1" type="hidden"></aui:input>
				<%} %>
				<%if(usuarioComite.size()>0){ %>
					<aui:input name="comite" id="comite" value="<%=distritosComite %>" type="hidden"></aui:input>
				<%}else{ %>
					<aui:input name="comite" id="comite" value="-1" type="hidden"></aui:input>
				<%} %>
				<aui:input name="anhio" id="anhio" value="<%=ano %>" type="hidden"></aui:input>
				<aui:input name="fechaini" id="fechaini" value="<%=fechaini %>" type="hidden"></aui:input>
				<aui:input name="fechafin" id="fechafin" value="<%=fechafi %>" type="hidden"></aui:input>
				<aui:input name="ciudad" id="ciudad" value="<%=ciu %>" type="hidden"></aui:input>
				<aui:input name="categoria" id="categoria" value="<%=cateFiltro %>" type="hidden"></aui:input>
				<aui:input name="subcategoria" id="subcategoria" value="<%=subcateFiltro %>" type="hidden"></aui:input>
				<aui:input name="distrito" id="distrito" value="<%=distrito %>" type="hidden"></aui:input>
				<aui:input name="nombre" id="nombre" value="<%=nombre %>" type="hidden"></aui:input>
				<aui:button  value="Reporte Casos XLS" type="submit" formtarget="_blank" onclick="sendParams2()"></aui:button>
			</form>
			
			<form action="<%=xls %>" method="post" class="bloque">
				<%if(usuarioDespacho!=null){ %>
					<aui:input name="despachoC" id="despachoC" value="<%=usuarioDespacho.getDespacho() %>" type="hidden"></aui:input>
				<%}else{ %>
					<aui:input name="despachoC" id="despachoC" value="-1" type="hidden"></aui:input>
				<%} %>
				<aui:input name="anhio" id="anhio" value="<%=ano %>" type="hidden"></aui:input>
				<aui:input name="fechaini" id="fechaini" value="<%=fechaini %>" type="hidden"></aui:input>
				<aui:input name="fechafin" id="fechafin" value="<%=fechafi %>" type="hidden"></aui:input>
				<aui:input name="ciudad" id="ciudad" value="<%=ciu %>" type="hidden"></aui:input>
				<aui:input name="categoria" id="categoria" value="<%=cateFiltro %>" type="hidden"></aui:input>
				<aui:input name="subcategoria" id="subcategoria" value="<%=subcateFiltro %>" type="hidden"></aui:input>
				<aui:input name="distrito" id="distrito" value="<%=distrito %>" type="hidden"></aui:input>
				<aui:input name="nombre" id="nombre" value="<%=nombre %>" type="hidden"></aui:input>
				<aui:input name="numeroCasos" id="numeroCasos" value="<%=numeroCasos %>" type="hidden"></aui:input>
				<aui:input name="completa" id="completa" value="<%=completa %>" type="hidden"></aui:input>
				<aui:input name="parcial" id="parcial" value="<%=parcial %>" type="hidden"></aui:input>
				<aui:input name="noCompleta" id="noCompleta" value="<%=noCompleta %>" type="hidden"></aui:input>
				<aui:input name="cantidadAplican" id="cantidadAplican" value="<%=cantidadAplican %>" type="hidden"></aui:input>
				<aui:input name="cantidadNoAplican" id="cantidadNoAplican" value="<%=cantidadNoAplican %>" type="hidden"></aui:input>
				<aui:input name="cantidadTotal" id="cantidadTotal" value="<%=cantidadTotal %>" type="hidden"></aui:input>
				<aui:input name="respuestas1" id="respuestas1" value="<%=respuestas1 %>" type="hidden"></aui:input>
				<aui:input name="respuestas2" id="respuestas2" value="<%=respuestas2 %>" type="hidden"></aui:input>
				<aui:input name="categorias1" id="categorias1" value="<%=categorias1 %>" type="hidden"></aui:input>
				
				<aui:button  value="Reporte Indicadores XLS" type="submit" formtarget="_blank" onclick="sendParams3()"></aui:button>
			</form>
		</div>
		</div>
		<div class="col-md-12 text-center">
			<aui:button  value="Limpiar Filtros" type="button" href="<%=limpiar %>"></aui:button>
		</div>
	</div>
	<br>
	<div class="row">
		<liferay-ui:search-container   delta="10" deltaConfigurable="true"  emptyResultsMessage="No hay casos registrados en el despacho" iteratorURL="<%=iteratorURL%>">
		    <liferay-ui:search-container-results>
		         <%				
				 	String keywords = ParamUtil.getString(request, "keywords");		
					results = ListUtil.subList(casos, searchContainer.getStart(), searchContainer.getEnd());
					total = casos.size();
					searchContainer.setTotal(casos.size());
					pageContext.setAttribute("results", results);
					pageContext.setAttribute("total", total);			
				%>	    
		    </liferay-ui:search-container-results>    
				<liferay-ui:search-container-row className="com.ability.genero.server.model.casoLV" keyProperty="id" modelVar="casoConsolidados">          	
	
				       <%
				       	if(usuarioDespacho==null){
				       		List<modelo> nombreDistrito = consultas.getNombreDistrito(casoConsolidados.getDespacho());
				       		String valor = "<br><br>"+nombreDistrito.get(0).getId()+"<br><br>"+nombreDistrito.get(0).getNombre();
				       %>
				       		
				       <liferay-ui:search-container-column-text name="Despacho" 				value="<%=casoConsolidados.getDespacho()+valor%>"/>
				       <%} %>
				       <liferay-ui:search-container-column-text name="Radicacíon" 				value="<%=casoConsolidados.getRadicacion()%>"/>	
				       <liferay-ui:search-container-column-text name="Clase de proceso" 		value="<%=casoConsolidados.getClaseProceso()%>"/>
				       <%
				       		for(tipoDecision td : tipos){
				       			if(td.getId()==Integer.parseInt(casoConsolidados.getTipoDecision())){
				       				aux=td.getTipoDecision();
				       			}
				       		}
				       %>
				       <liferay-ui:search-container-column-text name="Tipo de decisión" 		value="<%=aux%>"/>
				       <liferay-ui:search-container-column-text name="Ponente" 					value="<%=casoConsolidados.getPonente()%>"/>
				       <liferay-ui:search-container-column-text name="Fecha" 					value="<%=formato.format(casoConsolidados.getFecha())%>"/>	
				       <%
				       	for(categoria cat : categorias){
				       		if(cat.getId()==Integer.parseInt(casoConsolidados.getCategoria()))
				       			aux=cat.getCategoria();
				       	}
				       %>
				       <liferay-ui:search-container-column-text name="Categoria" 				value="<%=aux%>"/>
				       <%
				       	for(subcategoria sub : subcategorias){
				       		if(sub.getId()==Integer.parseInt(casoConsolidados.getSubCategoria()))
				       			aux=sub.getSubcategoria();
				       	}
				       %>
				       <liferay-ui:search-container-column-text name="Subcategoria" 			value="<%=aux%>"/>	
				       <liferay-ui:search-container-column-jsp  name="Accion"  					path="/html/genero/editCaso.jsp" />						     
				  </liferay-ui:search-container-row>
		  <liferay-ui:search-iterator />
	</liferay-ui:search-container>
	</div>
	<br>
	<br>
	<div class="row">
		<label style="font-size: 15px;font-weight: bold;">INDICADORES DE PERSPECTIVA DE GENERO Y ENFOQUE DIFERENCIAL</label>
	</div>
	<br>
	<br>
	<div class="centroContenido">
		<table class="row">
			<tr class="negrita estaTitulo"  style="font-size: 12px">
				<th class="borde estaPadin" style=" text-align: center; width:  10%;">N°</th>
				<th class="borde estaPadin" style=" text-align: left;width: 68%;">DENOMINACIÓN DEL INDICADOR</th>
				<th class="borde estaPadin" style=" text-align: center;width: 10%;">No.</th>
				<th class="borde estaPadin" style=" text-align: center;width: 10%;">%</th>
			</tr>
			<tr class="negrita estaSubTitulo"  style="font-size: 12px">
				<td class="borde estaPadin" style=" text-align: center; width:  10%;">1</td>
				<td class="borde estaPadin" style=" text-align: left;width: 68%;">APLICACIÓN DE LA PERSPECTIVA DE GÉNERO Y ENFOQUE DIFERENCIAL</td>
				<%if(completa==0 && parcial==0 && noCompleta==0){ %>
					<td class="borde estaPadin" style=" text-align: center;width: 10%;"><%=numeroCasosAux %></td>
				<%}else{ %>
					<td class="borde estaPadin" style=" text-align: center;width: 10%;"><%=numeroCasos %></td>
				<%} %>
				<td class="borde estaPadin" style=" text-align: center;width: 10%;"></td>
			</tr>
			
			<tr class="negrita estaSubTitulo"  style="font-size: 12px">
				<td class="borde estaPadin" style=" text-align: center; width:  10%;">2</td>
				<td class="borde estaPadin" style=" text-align: left;width: 68%;">EFICACIA EN EL USO DE LOS CRITERIOS DE PERSPECTIVA DE GÉNERO Y ENFOQUE DIFERENCIAL</td>
				<td class="borde estaPadin" style=" text-align: center;width: 10%;">No.</td>
				<td class="borde estaPadin" style=" text-align: center;width: 10%;">%</td>
			</tr>
			<tr  style="font-size: 11px">
				<td class="borde estaPadin" style=" text-align: center; width:  10%;">2.1</td>
				<td class="borde estaPadin" style=" text-align: left;width: 68%;">Completa</td>
				<td class="borde estaPadin" style=" text-align: center;width: 10%;"><%=completa %></td>
				<td class="borde estaPadin" style=" text-align: center;width: 10%;"><%=String.format("%.2f", completaPorcentaje) %></td>
			</tr>
			<tr  style="font-size: 11px">
				<td class="borde estaPadin" style=" text-align: center; width:  10%;">2.2</td>
				<td class="borde estaPadin" style=" text-align: left;width: 68%;">Parcial</td>
				<td class="borde estaPadin" style=" text-align: center;width: 10%;"><%=parcial %></td>
				<td class="borde estaPadin" style=" text-align: center;width: 10%;"><%=String.format("%.2f", parcialPorcentaje) %></td>
			</tr>
			<tr  style="font-size: 11px">
				<td class="borde estaPadin" style=" text-align: center; width:  10%;">2.3</td>
				<td class="borde estaPadin" style=" text-align: left;width: 68%;">No Aplicación</td>
				<td class="borde estaPadin" style=" text-align: center;width: 10%;"><%=noCompleta %></td>
				<td class="borde estaPadin" style=" text-align: center;width: 10%;"><%=String.format("%.2f", noCompletaPorcentaje) %></td>
			</tr>
			<tr class="negrita estaSubTitulo"  style="font-size: 12px">
				<td class="borde estaPadin" style=" text-align: center; width:  10%;">3</td>
				<td class="borde estaPadin" style=" text-align: left;width: 68%;">UTILIZACIÓN DE CRITERIOS APLICABLES A LA PERSPECTIVA DE GÉNERO</td>
				<td class="borde estaPadin" style=" text-align: center;width: 10%;">No.</td>
				<td class="borde estaPadin" style=" text-align: center;width: 10%;">%</td>
			</tr>
			<tr class="negrita estaSubTitulo"  style="font-size: 12px">
				<td class="borde estaPadin" style=" text-align: center; width:  10%;">3.1</td>
				<td class="borde estaPadin" style=" text-align: left;width: 68%;">IDENTIFICACIÓN DEL CASO DE GÉNERO DESDE EL ENFOQUE DIFERENCIAL</td>
				<td class="borde estaPadin" style=" text-align: center;width: 10%;"></td>
				<td class="borde estaPadin" style=" text-align: center;width: 10%;"></td>
			</tr>
			<%for(encuestaEnfoDife diferencial : parte1){%>
				<tr  style="font-size: 11px">
					<td class="borde estaPadin" style=" text-align: center; width:  10%;">3.1.<%=cuenta %></td>
					<td class="borde estaPadin" style=" text-align: left;width: 68%;"><%=diferencial.getPregunta() %></td>
					<%
						for(casoLV c : casos){
							String[] pre = c.getRespuestas1().split("-");
							for(String s : pre){
								String[] s1 = s.split("/");
								if(s1[1].equalsIgnoreCase(String.valueOf(diferencial.getId()))){
									if(s1[0].equalsIgnoreCase("1")){
										cuenta2++;
									}
								}
							}
						}
						porcent=((float)cuenta2/numeroCasos)*100;
					%>
					<td class="borde estaPadin" style=" text-align: center;width: 10%;"><%=cuenta2 %></td>
					<td class="borde estaPadin" style=" text-align: center;width: 10%;"><%=String.format("%.2f", porcent) %></td>
				</tr>
			<%
			cuenta2=0;
			cuenta++;
			} %>
			<tr class="negrita estaSubTitulo"  style="font-size: 12px">
				<td class="borde estaPadin" style=" text-align: center; width:  10%;">3.2</td>
				<td class="borde estaPadin" style=" text-align: left;width: 68%;">CRITERIOS ORIENTADORES RELACIONADOS CON EL PROCEDIMIENTO Y LA DECISIÓN JUDICIAL</td>
				<td class="borde estaPadin" style=" text-align: center;width: 10%;"></td>
				<td class="borde estaPadin" style=" text-align: center;width: 10%;"></td>
			</tr>
			<%cuenta=1;cuenta2=0; %>
			<%for(encuestaCriterios diferencia2 : parte2){%>
				<tr  style="font-size: 11px">
					<td class="borde estaPadin" style=" text-align: center; width:  10%;">3.2.<%=cuenta %></td>
					<td class="borde estaPadin" style=" text-align: left;width: 68%;"><%=diferencia2.getPregunta() %></td>
					<%
						for(casoLV c : casos){
							String[] pre = c.getRespuestas2().split("-");
							for(String s : pre){
								String[] s1 = s.split("/");
								if(s1[1].equalsIgnoreCase(String.valueOf(diferencia2.getId()))){
									if(s1[0].equalsIgnoreCase("1")){
										cuenta2++;
									}
								}
							}
						}
						porcent=((float)cuenta2/numeroCasos)*100;
					%>
					<td class="borde estaPadin" style=" text-align: center;width: 10%;"><%=cuenta2 %></td>
					<td class="borde estaPadin" style=" text-align: center;width: 10%;"><%=String.format("%.2f", porcent) %></td>
				</tr>
			<%
			cuenta2=0;
			cuenta++;
			} %>
			<tr class="negrita estaSubTitulo"  style="font-size: 12px">
				<td class="borde estaPadin" style=" text-align: center; width:  10%;">4</td>
				<td class="borde estaPadin" style=" text-align: left;width: 68%;">ESTADÍSTICA DE APLICACIÓN DE LOS CRITERIOS DE LA LISTA DE VERIFICACIÓN</td>
				<td class="borde estaPadin" style=" text-align: center;width: 10%;">No.</td>
				<td class="borde estaPadin" style=" text-align: center;width: 10%;">%</td>
			</tr>
			<tr style="font-size: 11px">
				<td class="borde estaPadin" style=" text-align: center; width:  10%;">4.1</td>
				<td class="borde estaPadin" style=" text-align: left;width: 68%;">Criterios con perspectiva de género desde el enfoque diferencial que se aplican al caso en estudio</td>
				<td class="borde estaPadin" style=" text-align: center;width: 10%;"><%=cantidadAplican %></td>
				<td class="borde estaPadin" style=" text-align: center;width: 10%;"><%=String.format("%.2f", cantidadAplicanPorcen) %></td>
			</tr>
			<tr style="font-size: 11px">
				<td class="borde estaPadin" style=" text-align: center; width:  10%;">4.2</td>
				<td class="borde estaPadin" style=" text-align: left;width: 68%;">Criterios con perspectiva de género desde el enfoque diferencial que no se aplican al caso en estudio</td>
				<td class="borde estaPadin" style=" text-align: center;width: 10%;"><%=cantidadNoAplican %></td>
				<td class="borde estaPadin" style=" text-align: center;width: 10%;"><%=String.format("%.2f", cantidadNoAplicanPorcen) %></td>
			</tr>
			<tr class="negrita estaSubTitulo"  style="font-size: 12px">
				<td class="borde estaPadin" style=" text-align: center; width:  10%;">5</td>
				<td class="borde estaPadin" style=" text-align: left;width: 68%;">UTILIZACIÓN DE CATEGORÍAS APLICABLES A LA PERSPECTIVA DE GÉNERO Y ENFOQUE DIFERENCIAL</td>
				<td class="borde estaPadin" style=" text-align: center;width: 10%;">No.</td>
				<td class="borde estaPadin" style=" text-align: center;width: 10%;">%</td>
			</tr>
			<%cuenta=0;cuenta2=1; %>
			<%for(categoria cat: categorias){ %>
				<tr style="font-size: 11px">
					<td class="borde estaPadin" style=" text-align: center; width:  10%;">5.<%=cuenta2 %></td>
					<td class="borde estaPadin" style=" text-align: left;width: 68%;"><%=cat.getCategoria() %></td>
					<%
						for(casoLV c : casos){
							if(c.getCategoria().equalsIgnoreCase(String.valueOf(cat.getId()))){
								cuenta++;
							}
						} 
						porcent = ((float)cuenta/numeroCasos)*100;
					%>
					<td class="borde estaPadin" style=" text-align: center;width: 10%;"><%=cuenta %></td>
					<td class="borde estaPadin" style=" text-align: center;width: 10%;"><%=String.format("%.2f", porcent) %></td>
				</tr>
			<% cuenta=0;cuenta2++;} %>
		</table>
	</div>
<%}else{ %>
	<div class="row centro">
		<label style="color: red; font-size: 17px;">USUARIO NO REGISTRADO EN NINGUN DESPACHO</label>
	</div>
<%} %>
</div>

<portlet:resourceURL var="filtro"></portlet:resourceURL>

<script type="text/javascript">
window.onload = function(){
	var valor = document.getElementById('<portlet:namespace/>busqueda').value;
	var idSubCat = document.getElementById('<portlet:namespace/>prueba').value;
	if(idSubCat!=''){
		filtros2();
	}
	if(valor==0){
		document.getElementById('ano1').style.display = 'none';
		document.getElementById('rango').style.display = 'none';
	}
	if(valor==1){
		document.getElementById('ano1').style.display = 'inherit';
	}else{
		document.getElementById('ano1').style.display = 'none';
	}
	if(valor==2){
		document.getElementById('rango').style.display = 'inherit';
	}else{
		document.getElementById('rango').style.display = 'none';
	}
};
function metodoBusqueda(){
	var valor = document.getElementById('<portlet:namespace/>busqueda').value;
	var idSubCat = document.getElementById('<portlet:namespace/>prueba').value;
	if(idSubCat!=''){
		filtros2();
	}
	if(valor==0){
		document.getElementById('ano1').style.display = 'none';
		document.getElementById('rango').style.display = 'none';
	}
	if(valor==1){
		document.getElementById('ano1').style.display = 'inherit';
	}else{
		document.getElementById('ano1').style.display = 'none';
	}
	if(valor==2){
		document.getElementById('rango').style.display = 'inherit';
	}else{
		document.getElementById('rango').style.display = 'none';
	}
}

function filtroRango(){
	if(document.getElementById('<portlet:namespace/>fechainicio').value!="" && document.getElementById('<portlet:namespace/>fechafin').value!=""){
		var fechainicioaux = document.getElementById('<portlet:namespace/>fechainicio').value.split("-");
		var fechafinaux = document.getElementById('<portlet:namespace/>fechafin').value.split("-");
		var fechainicio = new Date(parseInt(fechainicioaux[0]),parseInt(fechainicioaux[1]-1),parseInt(fechainicioaux[2]),00,00);
		var fechafin = new Date(parseInt(fechafinaux[0]),parseInt(fechafinaux[1]-1),parseInt(fechafinaux[2]),00,00);
		if(fechainicio>fechafin){
			alert("La fecha de inicio no puede ser mayor a la fecha de fin");
		}else{
			document.getElementById("fromRango").submit();
		}
	}
	if((document.getElementById('<portlet:namespace/>fechainicio').value!="" && document.getElementById('<portlet:namespace/>fechafin').value=="") || (document.getElementById('<portlet:namespace/>fechainicio').value=="" && document.getElementById('<portlet:namespace/>fechafin').value!="")){
		document.getElementById("fromRango").submit();
	}
	if(document.getElementById('<portlet:namespace/>fechafin').value=="" && document.getElementById('<portlet:namespace/>fechainicio').value==""){
		
		document.getElementById("fromRango").submit();
	}
	
}
function filtroano(){
	document.getElementById("fromAno").submit();
}

function filtroFecha(){
	var ano = document.getElementById('<portlet:namespace/>ano').value;
	$.ajax({
		url:   '<%=filtro%>',
        type:  'post',
        dataType: 'json',
        data:  {ano : ano, tipoSolicitud : 3},
        success:  function (response) {
        	location.reload();
        }
        
	});
}
function filtroCiudad(){
	var ciudad = document.getElementById('<portlet:namespace/>ciudad').value;
	$.ajax({
		url:   '<%=filtro%>',
        type:  'post',
        dataType: 'json',
        data:  {ciudad1 : ciudad, tipoSolicitud : 8},
        success:  function (response) {
        	location.reload();
        }
        
	});
}

function filtroDistrito(){
	var distrito = document.getElementById('<portlet:namespace/>distrito').value;
	$.ajax({
		url:   '<%=filtro%>',
        type:  'post',
        dataType: 'json',
        data:  {distrito : distrito, tipoSolicitud : 12},
        success:  function (response) {
        	location.reload();
        }
        
	});
}

function filtroCategorias(){
	var catego = document.getElementById('<portlet:namespace/>categoria').value;
	var subcatego = document.getElementById('<portlet:namespace/>subCategoria').value;
	$.ajax({
		url:   '<%=filtro%>',
        type:  'post',
        dataType: 'json',
        data:  {cat : catego, subcat : subcatego, tipoSolicitud : 10},
        success:  function (response) {
        	location.reload();
        }
        
	});
}

function sendParams() {
	AUI().use('aui-io-request', function(A){		
		A.io.request('<%= pdf %>', {
			method: 'POST',
			data: { tipoSolicitud : 4 ,
					despachoR : document.getElementById('<portlet:namespace/>despachoC').value ,
					anhioR : document.getElementById('<portlet:namespace/>anhio').value,
					fechaI : document.getElementById('<portlet:namespace/>fechaini').value,
					fechaF : document.getElementById('<portlet:namespace/>fechafin').value,
					ciudad : document.getElementById('<portlet:namespace/>ciudad').value,
					categoria : document.getElementById('<portlet:namespace/>categoria').value,
					subcategoria : document.getElementById('<portlet:namespace/>subcategoria').value,
					distrito : document.getElementById('<portlet:namespace/>distrito').value,
					nombre : document.getElementById('<portlet:namespace/>nombre').value,
					comite : document.getElementById('<portlet:namespace/>comite').value
				},
			sync:true
		});
		
	});
}
function sendParams1() {
	AUI().use('aui-io-request', function(A){		
		A.io.request('<%= pdf %>', {
			method: 'POST',
			data: { tipoSolicitud : 5 ,
					despachoR : document.getElementById('<portlet:namespace/>despachoC').value ,
					anhioR : document.getElementById('<portlet:namespace/>anhio').value,
					fechaI : document.getElementById('<portlet:namespace/>fechaini').value,
					fechaF : document.getElementById('<portlet:namespace/>fechafin').value,
					ciudad : document.getElementById('<portlet:namespace/>ciudad').value,
					categoria : document.getElementById('<portlet:namespace/>categoria').value,
					subcategoria : document.getElementById('<portlet:namespace/>subcategoria').value,
					distrito : document.getElementById('<portlet:namespace/>distrito').value,
					nombre : document.getElementById('<portlet:namespace/>nombre').value,
					numeroCasos : document.getElementById('<portlet:namespace/>numeroCasos').value,
					completa : document.getElementById('<portlet:namespace/>completa').value,
					parcial : document.getElementById('<portlet:namespace/>parcial').value,
					noCompleta : document.getElementById('<portlet:namespace/>noCompleta').value,
					cantidadAplican : document.getElementById('<portlet:namespace/>cantidadAplican').value,
					cantidadNoAplican : document.getElementById('<portlet:namespace/>cantidadNoAplican').value,
					cantidadTotal : document.getElementById('<portlet:namespace/>cantidadTotal').value,
					respuestas1 : document.getElementById('<portlet:namespace/>respuestas1').value,
					respuestas2 : document.getElementById('<portlet:namespace/>respuestas2').value,
					categorias1 : document.getElementById('<portlet:namespace/>categorias1').value
				},
			sync:true
		});
		
	});
}
function sendParams2() {
	AUI().use('aui-io-request', function(A){		
		A.io.request('<%= xls %>', {
			method: 'POST',
			data: { tipoSolicitud : 6 ,
					despachoR : document.getElementById('<portlet:namespace/>despachoC').value ,
					anhioR : document.getElementById('<portlet:namespace/>anhio').value,
					fechaI : document.getElementById('<portlet:namespace/>fechaini').value,
					fechaF : document.getElementById('<portlet:namespace/>fechafin').value,
					ciudad : document.getElementById('<portlet:namespace/>ciudad').value,
					categoria : document.getElementById('<portlet:namespace/>categoria').value,
					subcategoria : document.getElementById('<portlet:namespace/>subcategoria').value,
					distrito : document.getElementById('<portlet:namespace/>distrito').value,
					nombre : document.getElementById('<portlet:namespace/>nombre').value,
					comite : document.getElementById('<portlet:namespace/>comite').value	
			},
			sync:true
		});
		
	});
}
function sendParams3() {
	AUI().use('aui-io-request', function(A){		
		A.io.request('<%= xls %>', {
			method: 'POST',
			data: { tipoSolicitud : 7 ,
					despachoR : document.getElementById('<portlet:namespace/>despachoC').value ,
					anhioR : document.getElementById('<portlet:namespace/>anhio').value,
					fechaI : document.getElementById('<portlet:namespace/>fechaini').value,
					fechaF : document.getElementById('<portlet:namespace/>fechafin').value,
					ciudad : document.getElementById('<portlet:namespace/>ciudad').value,
					categoria : document.getElementById('<portlet:namespace/>categoria').value,
					subcategoria : document.getElementById('<portlet:namespace/>subcategoria').value,
					distrito : document.getElementById('<portlet:namespace/>distrito').value,
					nombre : document.getElementById('<portlet:namespace/>nombre').value,
					numeroCasos : document.getElementById('<portlet:namespace/>numeroCasos').value,
					completa : document.getElementById('<portlet:namespace/>completa').value,
					parcial : document.getElementById('<portlet:namespace/>parcial').value,
					noCompleta : document.getElementById('<portlet:namespace/>noCompleta').value,
					cantidadAplican : document.getElementById('<portlet:namespace/>cantidadAplican').value,
					cantidadNoAplican : document.getElementById('<portlet:namespace/>cantidadNoAplican').value,
					cantidadTotal : document.getElementById('<portlet:namespace/>cantidadTotal').value,
					respuestas1 : document.getElementById('<portlet:namespace/>respuestas1').value,
					respuestas2 : document.getElementById('<portlet:namespace/>respuestas2').value,
					categorias1 : document.getElementById('<portlet:namespace/>categorias1').value
				},
			sync:true
		});
		
	});
}
function filtros(){
	var idCat = document.getElementById('<portlet:namespace/>categoria').value;
	
	$.ajax({
		url:   '<%=filtro%>',
        type:  'post',
        dataType: 'json',
        data:  {idCategoria : idCat, tipoSolicitud : 2 },
        success:  function (response) {
        	var data = response;
        	$('#<portlet:namespace/>subCategoria').html('');// to clear the previous option
        	$('#<portlet:namespace/>subCategoria').append($('<option>').text('Seleccione una SubCategoría').attr('value', '').attr('selected',true));
        	$('#<portlet:namespace/>subCategoria').append($('<option>').text('Todas').attr('value', 'todas'));
        	$.each(data, function(i, subc) {
            	$('#<portlet:namespace/>subCategoria').append($('<option>').text(subc.subCat).attr('value', subc.id));
            });
        }
        
	});
}

function filtros2(){
	var idCat = document.getElementById('<portlet:namespace/>categoria').value;
	
	var idSubCat = document.getElementById('<portlet:namespace/>prueba').value;
	$.ajax({
		url:   '<%=filtro%>',
        type:  'post',
        dataType: 'json',
        data:  {idCategoria : idCat, tipoSolicitud : 2 },
        success:  function (response) {
        	var data = response;
        	$('#<portlet:namespace/>subCategoria').html('');// to clear the previous option
        	if(idCat=='todas'){
        		$('#<portlet:namespace/>subCategoria').append($('<option>').text('Seleccione una SubCategoría').attr('value', ''));
        		$('#<portlet:namespace/>subCategoria').append($('<option>').text('Todas').attr('value', 'todas').attr('selected',true));
        	}else{
        		if(idSubCat=='todas' ){
            		$('#<portlet:namespace/>subCategoria').append($('<option>').text('Todas').attr('value', 'todas').attr('selected',true));
            	}else{
            		$('#<portlet:namespace/>subCategoria').append($('<option>').text('Todas').attr('value', 'todas'));
            	}
        	}
        	
        	
        	$.each(data, function(i, subc) {
        		if(subc.id==idSubCat){
        			$('#<portlet:namespace/>subCategoria').append($('<option>').text(subc.subCat).attr('value', subc.id).attr('selected',true));
        		}else{
        			$('#<portlet:namespace/>subCategoria').append($('<option>').text(subc.subCat).attr('value', subc.id));
        		}
            	
            });
        }
        
	});
	
}
</script>