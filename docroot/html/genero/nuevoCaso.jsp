<%@page import="com.ability.modelo.consultas"%>
<%@page import="com.ability.modelo.modelo"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@page import="java.util.Date"%>
<%@page import="com.ability.genero.server.service.especialidadLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.especialidad"%>
<%@page import="com.ability.genero.server.service.claseProcesoLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.claseProceso"%>
<%@page import="com.ability.genero.server.service.generoUsuarioLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.generoUsuario"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.awt.Event"%>
<%@page import="com.ability.genero.server.model.casoLV"%>
<%@page import="com.ability.genero.server.service.encuestaCriteriosLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.encuestaCriterios"%>
<%@page import="com.ability.genero.server.service.encuestaEnfoDifeLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.encuestaEnfoDife"%>
<%@page import="com.ability.genero.server.service.tipoDecisionLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.tipoDecision"%>
<%@page import="java.util.List"%>
<%@page import="com.ability.genero.server.service.categoriaLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.categoria"%>
<%@page import="com.ability.genero.server.service.entidadLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.entidad"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@page import="javax.portlet.PortletURL"%>
<%@include file="/html/init.jsp"%>

<%
	
	String idUsu =String.valueOf(user.getUserId());
	Date hoy = new Date();
	generoUsuario usuarioDespacho = generoUsuarioLocalServiceUtil.findByPorUsuario(idUsu);
	boolean bandera=false;
	String[] respuesta1 ={},respuesta2 ={};
	casoLV casoEditar = (casoLV) renderRequest.getPortletSession().getAttribute("casoEditar");
	modelo esp = null;
	if(casoEditar!=null){
		respuesta1 = casoEditar.getRespuestas1().split("-");
		respuesta2 = casoEditar.getRespuestas2().split("-");
		
	}

	List<categoria> categorias = categoriaLocalServiceUtil.getcategorias(-1, -1);
	List<tipoDecision> tipoDeci = tipoDecisionLocalServiceUtil.gettipoDecisions(-1, -1);
	List<encuestaEnfoDife> parte1 = encuestaEnfoDifeLocalServiceUtil.getencuestaEnfoDifes(-1, -1);
	List<encuestaCriterios> parte2 = encuestaCriteriosLocalServiceUtil.getencuestaCriterioses(-1, -1);
	List<claseProceso> clase = claseProcesoLocalServiceUtil.getclaseProcesos(-1, -1);
	SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
	String diaHoy = formato.format(hoy);
	
	String codigoDespacho=usuarioDespacho.getDespacho();
	String especialidad = codigoDespacho.substring(7, 9);
	esp=consultas.getEspecialidades(especialidad);
		
	
	renderRequest.getPortletSession().removeAttribute("casoEditar");
%>

<portlet:defineObjects />
<portlet:actionURL name="guardar" var="guardar"></portlet:actionURL>
<portlet:actionURL name="modificar" var="modificar"></portlet:actionURL>

<div class="contenedor">
	<jsp:include page="/html/genero/menu.jsp"></jsp:include>
	<br>
	<br>
	<div class="row" style="font-size: 13px; font-weight: bold;">
		PERSPECTIVA DE GÉNERO DESDE EL ENFOQUE DIFERENCIAL EN LAS DECISIONES JUDICIALES
	</div>
	<br>
	<br>
	<%if(casoEditar==null){ %>
	<aui:form method="post" action="${guardar }" enctype="multipart/form-data">
	<div class="row">
		<div style="width:  80%; margin: auto; text-align: left;">
			<div style="width: 45%; font-weight: bold;">INFORMACIÓN PRELIMINAR DEL CASO</div>
			<div style="width: 50%;"></div>
		</div>
		<br>
		<div style="width:  80%; margin: auto; text-align: left;">
			<div class="bloque" style="width: 45%; font-weight: bold;">1.	Despacho judicial</div>
			<div class="bloque" style="width: 50%;"><aui:input name="despacho" id="despacho" label="" style="width : 95%; margin-bottom: 10px;" value="<%=usuarioDespacho.getDespacho() %>" readonly="true" required="true"></aui:input></div>
			<%
				List<modelo> nombreDisctrito = consultas.getNombreDistrito(usuarioDespacho.getDespacho());
			%>
			<div class="bloque" style="width: 42%; font-weight: bold; margin-left: 3%;">1.2 Nombre Despacho</div>
			<div class="bloque" style="width: 50%;"><%= nombreDisctrito.get(0).getId() %></div>
			<div class="bloque" style="width: 42%; font-weight: bold; margin-left: 3%;">1.3 Distrito</div>
			<div class="bloque" style="width: 50%;"><%= nombreDisctrito.get(0).getNombre() %></div>
		</div>
		<br>
		<div style="width:  80%; margin: auto; text-align: left;">
			<div class="bloque" style="width: 45%; font-weight: bold;">2. Radicacíon</div>
			<div class="bloque" style="width: 50%;">
				<aui:input name="radicacion" id="radicacion" type="number" label="" style="width : 95%;" onChange="alertaRa();" oninput="javascript: if (this.value.length > this.maxLength) this.value = this.value.slice(0, this.maxLength);" maxlength="23" required="true">
					<aui:validator name="minLength">23</aui:validator>
				</aui:input>
			</div>
		</div>
		<br>
		<div style="width:  80%; margin: auto; text-align: left;">
			<div class="bloque" style="width: 45%; font-weight: bold;">3. Sujetos procesales</div>
			<div class="bloque" style="width: 50%;"></div>
		</div>
		<br>
		<div style="width:  80%; margin: auto; text-align: left;">
			<div class="bloque" style="width: 42%; font-weight: bold; margin-left: 3%;">3.1 Demandante / víctima</div>
			<div class="bloque" style="width: 38%;"><aui:input name="demandante" id="demandante" label="" oninput="javascript: if (this.value.length > this.maxLength) this.value = this.value.slice(0, this.maxLength);" maxlength="400" style="width : 95%;" required="true"></aui:input></div>
			<div class="bloque" style="width: 10%;">
				<aui:select name="generoDemandante" id="generoDemandante" label="" style="width : 95%;" required="true">
					<aui:option>Genero</aui:option>
					<aui:option value="Masculino">Masculino</aui:option>
					<aui:option value="Femenino">Femenino</aui:option>
					<aui:option value="Transgénero">Transgénero</aui:option>
					<aui:option value="Jurídicas">Jurídicas</aui:option>
				</aui:select>
			</div>
		</div>
		<br>
		<div style="width:  80%; margin: auto; text-align: left;">
			<div class="bloque" style="width: 42%; font-weight: bold; margin-left: 3%;">3.2 Demandado / Agresor / Victimario</div>
			<div class="bloque" style="width: 38%;"><aui:input name="demandado" id="demandado" label="" oninput="javascript: if (this.value.length > this.maxLength) this.value = this.value.slice(0, this.maxLength);" maxlength="400" style="width : 95%;" required="true"></aui:input></div>
			<div class="bloque" style="width: 10%;">
				<aui:select name="generoDemandado" id="generoDemandado" label="" style="width : 95%;" required="true">
					<aui:option>Genero</aui:option>
					<aui:option value="Masculino">Masculino</aui:option>
					<aui:option value="Femenino">Femenino</aui:option>
					<aui:option value="Transgénero">Transgénero</aui:option>
					<aui:option value="Jurídicas">Jurídicas</aui:option>
				</aui:select>
			</div>
		</div>
		<br>
		<div style="width:  80%; margin: auto; text-align: left;">
			<div class="bloque" style="width: 45%; font-weight: bold;">4. Clase de proceso</div>
			<div class="bloque" style="width: 22%;">
				<aui:select name="claseProceso1" id="claseProceso1" label="" style="width : 95%;" required="true" onChange="cargarEspecia()">
					<aui:option>Clase de Proceso</aui:option>
					<%if(clase!=null){ %>
						<%for(claseProceso td : clase){ %>
							<aui:option value="<%=td.getClaseProceso() %>"><%=td.getClaseProceso() %></aui:option>
						<%}%>
					<%} %>
				</aui:select>
			</div>
			<div class="bloque" style="width: 32%;">
				<aui:input name="claseProceso2" id="claseProceso2" readonly="true" label="" style="width : 79%; display:none;"></aui:input>
			</div>
		</div>
		<br>
		<div style="width:  80%; margin: auto; text-align: left;">
			<div class="bloque" style="width: 45%; font-weight: bold;">5. Tipo de Decisión</div>
			<div class="bloque" style="width: 15%;">
				<aui:select name="tipoDecision" id="tipoDesicion" label="" style="width : 95%;" required="true" onChange="cargarArchivo()">
					<aui:option>Tipo de Decisión</aui:option>
					<%if(tipoDeci!=null){ %>
						<%for(tipoDecision td : tipoDeci){ %>
							<aui:option value="<%=td.getId() %>"><%=td.getTipoDecision() %></aui:option>
						<%}%>
					<%} %>
				</aui:select>
			</div>
			<div class="bloque" style="width: 34%;">
				<aui:input label="" style="width : 95%; display:none;" type="file" name="archivo" id="archivo"></aui:input>
			</div>
		</div>
		<br>
		<div style="width:  80%; margin: auto; text-align: left;">
			<div class="bloque" style="width: 45%; font-weight: bold;">6. Ponente</div>
			<div class="bloque" style="width: 50%;"><aui:input name="ponente" id="ponente" label="" style="width : 95%;" readonly="true" value="<%=user.getFullName() %>" required="true"></aui:input></div>
		</div>
		<br>
		<div style="width:  80%; margin: auto; text-align: left;">
			<div class="bloque" style="width: 45%; font-weight: bold;">7. Fecha en la que se dicta la providencia</div>
			<div class="bloque" style="width: 50%;">
				<aui:input name="fecha" id="fecha" label="" style="width : 95%;" type="date" required="true" max="<%=diaHoy %>"></aui:input>
			</div>
		</div>
		<br>
		<div style="width:  80%; margin: auto; text-align: left;">
			<div class="bloque" style="width: 45%; font-weight: bold;">8. Categoría</div>
			<div class="bloque" style="width: 50%;">
				<aui:select name="categoria" id="categoria" label="" style="width : 95%;" onChange="filtros()" required="true" >
					<aui:option>Seleccione una Categoría</aui:option>
					<%if(categorias!=null){ %>
						<%for(categoria cat : categorias){ %>
							<aui:option value="<%=cat.getId() %>"><%=cat.getCategoria() %></aui:option>
						<%}%>
					<%} %>
				</aui:select>
			</div>
			<div class="bloque">
				<abbr title="Este ítem agrupa los diferentes temas que identifican el enfoque de género, la aplicación del derecho a la igualdad y la no discriminación, partiendo de la clasificación que traen los instrumentos internacionales como la Guía interactiva de estándares internacionales sobre derechos de las mujeres de la Corte suprema de Justicia de la Nación. República Argentina . Es importante identificar este ítem porque permite medir que categoría de los Estándares se aplica.">?</abbr>
			</div>
		</div>
		<br>
		<div style="width:  80%; margin: auto; text-align: left;">
			<div class="bloque" style="width: 45%; font-weight: bold;">9. Subcategoría</div>
			<div class="bloque" style="width: 50%;">
				<aui:select name="subCategoria" id="subCategoria" label="" style="width : 95%;" required="true"></aui:select>
			</div>
			<div class="bloque">
				<abbr title="Este ítem agrupa las subdivisiones relevantes de los temas que agrupan las Categorías, e identifican el enfoque de género, la aplicación del derecho a la igualdad y la no discriminación, partiendo de la clasificación que traen los instrumentos internacionales como la Guía interactiva de estándares internacionales sobre derechos de las mujeres de la Corte suprema de Justicia de la Nación. República Argentina . Es importante identificar este Ítem porque permite medir que Sub categoría de los Estándares se aplica.">?</abbr>
		</div>
		</div>
	</div>
	<aui:input name="respuestas1" id="respuestas1" type="hidden"></aui:input>
	<aui:input name="respuestas2" id="respuestas2" type="hidden"></aui:input>
	<br>
	<br>
	<div style="width: 90%;margin: auto; border-top-style: ridge; border-left-style: ridge; border-right-style: ridge;">
		<div class="titulo bordeabajo">
			<div class="bloque centro numero">1</div>
			<div class="bloque pregunta">IDENTIFICACIÓN DEL CASO DE GÉNERO DESDE EL ENFOQUE DIFERENCIAL</div>
			<div class="bloque centro respuesta">SI / NO</div>
		</div>
		<%if(parte1!=null){ %>
			<%for(int i=1 ; i<=parte1.size() ; i++){ %>
				<div class="bordeabajo">
					<div class="bloque1 centro numero">1.<%=i %></div>
					<div class="bloque1 izqui pregunta"><%=parte1.get(i-1).getPregunta() %></div>
					<div class="bloque1 centro respuesta">
					<%String aux = "resp1"+i; %>
						<aui:select name="<%=aux %>" id="<%=aux %>" label="" style="width : 100%;" onChange="actualizar()">
							<%aux="0/"+parte1.get(i-1).getId(); %>
							<aui:option value="<%=aux %>">-------</aui:option>
							<%aux="1/"+parte1.get(i-1).getId(); %>
							<aui:option value="<%=aux %>">SI</aui:option>
							<%aux="2/"+parte1.get(i-1).getId(); %>
							<aui:option value="<%=aux %>">NO</aui:option>
						</aui:select>
					</div>
				</div>
			<%} %>
		<%} %>
	</div>
	<br>
	<div style="width: 90%;margin: auto; border-top-style: ridge; border-left-style: ridge; border-right-style: ridge;">
		<div class="titulo bordeabajo">
			<div class="bloque centro numero">2</div>
			<div class="bloque pregunta">CRITERIOS ORIENTADORES RELACIONADOS CON EL PROCEDIMIENTO Y LA DECISIÓN JUDICIAL</div>
			<div class="bloque centro respuesta">SI / NO</div>
		</div>
		<%if(parte2!=null){ %>
			<%for(int i=1 ; i<=parte2.size() ; i++){ %>
				<div class="bordeabajo">
					<div class="bloque1 centro numero">2.<%=i %></div>
					<div class="bloque1 izqui pregunta"><%=parte2.get(i-1).getPregunta() %></div>
					<div class="bloque1 centro respuesta">
					<%String aux = "resp2"+i; %>
						<aui:select name="<%=aux %>" id="<%=aux %>" label="" style="width : 100%;" onChange="actualizar()">
							<%aux="0/"+parte2.get(i-1).getId(); %>
							<aui:option value="<%=aux %>">-------</aui:option>
							<%aux="1/"+parte2.get(i-1).getId(); %>
							<aui:option value="<%=aux %>">SI</aui:option>
							<%aux="2/"+parte2.get(i-1).getId(); %>
							<aui:option value="<%=aux %>">NO</aui:option>
						</aui:select>
					</div>
				</div>
			<%} %>
		<%} %>
	</div>
	<br>
	<div style="width: 90%;margin: auto; border-style: ridge;">
		<div class="titulo bordeabajo">
			<div class="bloque centro numero">3</div>
			<div class="bloque pregunta">Estadística de aplicación de los criterios de la "LISTA DE VERIFICACIÓN".</div>
			<div class="bloque centro respuesta"></div>
		</div>
		<div class="bordeabajo">
			<div class="bloque1 centro numero">3.1</div>
			<div class="bloque1 izqui pregunta">Criterios con perspectiva de género desde el enfoque diferencial que se aplican al caso en estudio</div>
			<div class="bloque1 centro respuesta" id="si"></div>
		</div>
		<div>
			<div class="bloque1 centro numero">3.2</div>
			<div class="bloque1 izqui pregunta">Criterios con perspectiva de género desde el enfoque diferencial que no se aplican al caso en estudio</div>
			<div class="bloque1 centro respuesta" id="no"></div>
		</div>
	</div>
	<br>
	<div class="row">
		<div id="grafica"></div>
	</div>
	<br>
	<div class="row centro">
		<aui:button type="submit" value="Guardar Caso"></aui:button>
	</div>
	</aui:form>
	
	
	<%}else{ %>
	
	
	
	<aui:form method="post" action="${modificar }" enctype="multipart/form-data">
	<div class="row">
		<aui:input name="detalle" id="detalle" type="hidden" value="1"></aui:input>
		<aui:input name="id" id="id" type="hidden" value="<%=casoEditar.getId() %>"></aui:input>
		<div style="width:  80%; margin: auto; text-align: left;">
			<div style="width: 45%; font-weight: bold;">INFORMACIÓN PRELIMINAR DEL CASO</div>
			<div style="width: 50%;"></div>
		</div>
		<br>
		<div style="width:  80%; margin: auto; text-align: left;">
			<div class="bloque" style="width: 45%; font-weight: bold;">1.	Despacho judicial</div>
			<div class="bloque" style="width: 50%;"><aui:input name="despacho" id="despacho" label="" style="width : 95%; margin-bottom: 10px;" readonly="true" value="<%=casoEditar.getDespacho() %>" required="true"></aui:input></div>
			<%
				List<modelo> nombreDisctrito = consultas.getNombreDistrito(casoEditar.getDespacho());
			%>
			<div class="bloque" style="width: 42%; font-weight: bold; margin-left: 3%;">1.2 Nombre Despacho</div>
			<div class="bloque" style="width: 50%;"><%= nombreDisctrito.get(0).getId() %></div>
			<div class="bloque" style="width: 42%; font-weight: bold; margin-left: 3%;">1.3 Distrito</div>
			<div class="bloque" style="width: 50%;"><%= nombreDisctrito.get(0).getNombre() %></div>
		</div>
		<br>
		<div style="width:  80%; margin: auto; text-align: left;">
			<div class="bloque" style="width: 45%; font-weight: bold;">2. Radicacíon</div>
			<div class="bloque" style="width: 50%;">
				<aui:input name="radicacion" id="radicacion" type="number" label="" style="width : 95%;" oninput="javascript: if (this.value.length > this.maxLength) this.value = this.value.slice(0, this.maxLength);" maxlength="23" required="true" value="<%=casoEditar.getRadicacion() %>">
					<aui:validator name="minLength">23</aui:validator>
				</aui:input>
			</div>
		</div>
		<br>
		<div style="width:  80%; margin: auto; text-align: left;">
			<div class="bloque" style="width: 45%; font-weight: bold;">3. Sujetos procesales</div>
			<div class="bloque" style="width: 50%;"></div>
		</div>
		<br>
		<div style="width:  80%; margin: auto; text-align: left;">
			<div class="bloque" style="width: 42%; font-weight: bold; margin-left: 3%;">3.1 Demandante / víctima</div>
			<div class="bloque" style="width: 38%;"><aui:input name="demandante" id="demandante" label="" style="width : 95%;" value="<%=casoEditar.getDemandante() %>" oninput="javascript: if (this.value.length > this.maxLength) this.value = this.value.slice(0, this.maxLength);" maxlength="400" required="true"></aui:input></div>
			<div class="bloque" style="width: 10%;">
				<aui:select name="generoDemandante" id="generoDemandante" label="" style="width : 95%;" required="true">
					<%if(casoEditar.getGeneroDemandante().equalsIgnoreCase("Masculino")){bandera=true;}else{bandera=false;} %>
					<aui:option value="Masculino" selected="<%=bandera %>">Masculino</aui:option>
					<%if(casoEditar.getGeneroDemandante().equalsIgnoreCase("Femenino")){bandera=true;}else{bandera=false;} %>
					<aui:option value="Femenino" selected="<%=bandera %>">Femenino</aui:option>
					<%if(casoEditar.getGeneroDemandante().equalsIgnoreCase("Transgénero")){bandera=true;}else{bandera=false;} %>
					<aui:option value="Transgénero" selected="<%=bandera %>">Transgénero</aui:option>
					<%if(casoEditar.getGeneroDemandante().equalsIgnoreCase("Jurídicas")){bandera=true;}else{bandera=false;} %>
					<aui:option value="Jurídicas" selected="<%=bandera %>">Jurídicas</aui:option>
				</aui:select>
			</div>
		</div>
		<br>
		<div style="width:  80%; margin: auto; text-align: left;">
			<div class="bloque" style="width: 42%; font-weight: bold; margin-left: 3%;">3.2 Demandado / Agresor / Victimario</div>
			<div class="bloque" style="width: 38%;"><aui:input name="demandado" id="demandado" label="" style="width : 95%;" value="<%=casoEditar.getDemandado() %>" oninput="javascript: if (this.value.length > this.maxLength) this.value = this.value.slice(0, this.maxLength);" maxlength="400" required="true"></aui:input></div>
			<div class="bloque" style="width: 10%;">
				<aui:select name="generoDemandado" id="generoDemandado" label="" style="width : 95%;" required="true">
				<%if(casoEditar.getGeneroDemandante().equalsIgnoreCase("Masculino")){bandera=true;}else{bandera=false;} %>
					<aui:option value="Masculino" selected="<%=bandera %>">Masculino</aui:option>
					<%if(casoEditar.getGeneroDemandante().equalsIgnoreCase("Femenino")){bandera=true;}else{bandera=false;} %>
					<aui:option value="Femenino" selected="<%=bandera %>">Femenino</aui:option>
					<%if(casoEditar.getGeneroDemandante().equalsIgnoreCase("Transgénero")){bandera=true;}else{bandera=false;} %>
					<aui:option value="Transgénero" selected="<%=bandera %>">Transgénero</aui:option>
					<%if(casoEditar.getGeneroDemandante().equalsIgnoreCase("Jurídicas")){bandera=true;}else{bandera=false;} %>
					<aui:option value="Jurídicas" selected="<%=bandera %>">Jurídicas</aui:option>
				</aui:select>
			</div>
		</div>
		<br>
		<div style="width:  80%; margin: auto; text-align: left;">
			<div class="bloque" style="width: 45%; font-weight: bold;">4. Clase de proceso</div>
			<div class="bloque" style="width: 22%;">
				<aui:select name="claseProceso1" id="claseProceso1" label="" style="width : 95%;" required="true" onChange="cargarEspecia()">
					<aui:option>Clase de Proceso</aui:option>
					
					<%if(clase!=null){ %>
						<%String[] clasep = casoEditar.getClaseProceso().split("-"); %>
						<%for(claseProceso td : clase){ %>
							<%if(clasep[0].equalsIgnoreCase(td.getClaseProceso())){ %>
								<aui:option value="<%=td.getClaseProceso() %>" selected="true"><%=td.getClaseProceso() %></aui:option>
							<%}else{ %>
								<aui:option value="<%=td.getClaseProceso() %>"><%=td.getClaseProceso() %></aui:option>
							<%} %>
						<%}%>
					<%} %>
				</aui:select>
			</div>
			<div class="bloque" style="width: 32%;">
				<%String[] clasep = casoEditar.getClaseProceso().split("-"); %>
				<%if(clasep[0].equalsIgnoreCase("Ordinaria") &&(esp.getId().equals("3") || esp.getId().equals("4") || esp.getId().equals("31"))){ %>
					<aui:input name="claseProceso2" id="claseProceso2" readonly="true" value="<%=esp.getNombre() %>" label="" style="width : 79%;"></aui:input>
				<%}else{ %>
					<aui:input name="claseProceso2" id="claseProceso2" readonly="true" label="" style="width : 79%; display:none;"></aui:input>
				<%} %>
			</div>
		</div>
		<br>
		<div style="width:  80%; margin: auto; text-align: left;">
			<div class="bloque" style="width: 45%; font-weight: bold;">5. Tipo de Decisión</div>
			<div class="bloque" style="width: 15%;">
				<aui:select name="tipoDecision" id="tipoDesicion" label="" style="width : 95%;" required="true" onChange="cargarArchivo()">
					<aui:option>Tipo de Decisión</aui:option>
					<%if(tipoDeci!=null){ %>
						<%for(tipoDecision td : tipoDeci){ %>
							<%if(casoEditar.getTipoDecision().equalsIgnoreCase(String.valueOf(td.getId()))){ %>
								<aui:option value="<%=td.getId() %>" selected="true"><%=td.getTipoDecision() %></aui:option>
							<%}else{ %>
								<aui:option value="<%=td.getId() %>"><%=td.getTipoDecision() %></aui:option>
							<%} %>
						<%}%>
					<%} %>
				</aui:select>
			</div>
			<div class="bloque" style="width: 34%;">
				<%if(!casoEditar.getArchivo().isEmpty()){ %>
					<portlet:resourceURL var="ver">
						<portlet:param name="tipoSolicitud" value="11"/>
						<portlet:param name="ruta" value="<%=casoEditar.getArchivo()%>"/>
					</portlet:resourceURL>
						<a target="_blank" href="${ver }">
							Descargar Adjunto
						</a>
				<%} %>
				<aui:input label="" style="width : 95%; display:none;" type="file" name="archivo" id="archivo"></aui:input>
			</div>
		</div>
		<br>
		<div style="width:  80%; margin: auto; text-align: left;">
			<div class="bloque" style="width: 45%; font-weight: bold;">6. Ponente</div>
			<div class="bloque" style="width: 50%;"><aui:input name="ponente" id="ponente" label="" style="width : 95%;" readonly="true" value="<%=casoEditar.getPonente() %>" required="true"></aui:input></div>
		</div>
		<br>
		<div style="width:  80%; margin: auto; text-align: left;">
			<div class="bloque" style="width: 45%; font-weight: bold;">7. Fecha en la que se dicta la providencia</div>
			<div class="bloque" style="width: 50%;"><aui:input name="fecha" id="fecha" label="" style="width : 95%;" type="date" max="<%=diaHoy %>" value="<%=formato.format(casoEditar.getFecha()) %>" required="true"></aui:input></div>
		</div>
		<br>
		<div style="width:  80%; margin: auto; text-align: left;">
			<div class="bloque" style="width: 45%; font-weight: bold;">8. Categoría</div>
			<div class="bloque" style="width: 50%;">
				<aui:select name="categoria" id="categoria" label="" style="width : 95%;" required="true"  onChange="filtros()">
					<aui:option disable="true">Seleccione una Categoría</aui:option>
					<%if(categorias!=null){ %>
						<%for(categoria cat : categorias){ %>
							<%if(casoEditar.getCategoria().equalsIgnoreCase(String.valueOf(cat.getId()))){ %>
								<aui:option value="<%=cat.getId() %>" selected="true"><%=cat.getCategoria() %></aui:option>
							<%}else{ %>
								<aui:option value="<%=cat.getId() %>"><%=cat.getCategoria() %></aui:option>
							<%} %>
						<%}%>
					<%} %>
				</aui:select>
			</div>
			<div class="bloque">
				<abbr title="Este ítem agrupa los diferentes temas que identifican el enfoque de género, la aplicación del derecho a la igualdad y la no discriminación, partiendo de la clasificación que traen los instrumentos internacionales como la Guía interactiva de estándares internacionales sobre derechos de las mujeres de la Corte suprema de Justicia de la Nación. República Argentina . Es importante identificar este ítem porque permite medir que categoría de los Estándares se aplica.">?</abbr>
			</div>
		</div>
		<br>
		<div style="width:  80%; margin: auto; text-align: left;">
			<div class="bloque" style="width: 45%; font-weight: bold;">9. Subcategoría</div>
			<div class="bloque" style="width: 50%;">
				<aui:select name="subCategoria" id="subCategoria" label="" style="width : 95%;" required="true"></aui:select>
			</div>
			<div class="bloque">
				<abbr title="Este ítem agrupa las subdivisiones relevantes de los temas que agrupan las Categorías, e identifican el enfoque de género, la aplicación del derecho a la igualdad y la no discriminación, partiendo de la clasificación que traen los instrumentos internacionales como la Guía interactiva de estándares internacionales sobre derechos de las mujeres de la Corte suprema de Justicia de la Nación. República Argentina . Es importante identificar este Ítem porque permite medir que Sub categoría de los Estándares se aplica.">?</abbr>
		</div>
		</div>
	</div>
	<aui:input name="respuestas1" id="respuestas1" type="hidden" value="<%=casoEditar.getRespuestas1() %>"></aui:input>
	<aui:input name="respuestas2" id="respuestas2" type="hidden" value="<%=casoEditar.getRespuestas2() %>"></aui:input>
	<aui:input name="prueba" id="prueba" type="hidden" value="<%=casoEditar.getSubCategoria() %>"></aui:input>
	<br>
	<br>
	<div style="width: 90%;margin: auto; border-top-style: ridge; border-left-style: ridge; border-right-style: ridge;">
		<div class="titulo bordeabajo">
			<div class="bloque centro numero">1</div>
			<div class="bloque pregunta">IDENTIFICACIÓN DEL CASO DE GÉNERO DESDE EL ENFOQUE DIFERENCIAL</div>
			<div class="bloque centro respuesta">SI / NO</div>
		</div>
		<%if(parte1!=null){ %>
			<%for(int i=1 ; i<=parte1.size() ; i++){ %>
				<div class="bordeabajo">
					<div class="bloque1 centro numero">1.<%=i %></div>
					<div class="bloque1 izqui pregunta"><%=parte1.get(i-1).getPregunta() %></div>
					<div class="bloque1 centro respuesta">
					<%String aux = "resp1"+i; %>
						<aui:select name="<%=aux %>" id="<%=aux %>" label="" style="width : 100%;" onChange="actualizar()">
							<%
								bandera =false;
								aux="0/"+parte1.get(i-1).getId();
								for(String res : respuesta1){
									String[] r = res.split("/");
									if(r[1].equalsIgnoreCase(String.valueOf(parte1.get(i-1).getId())) && r[0].equalsIgnoreCase("0")){
										bandera=true;
									}
								}
							%>
							<aui:option value="<%=aux %>" selected="<%=bandera %>">-------</aui:option>
							<%
								bandera =false;
								aux="1/"+parte1.get(i-1).getId();
								for(String res : respuesta1){
									String[] r = res.split("/");
									if(r[1].equalsIgnoreCase(String.valueOf(parte1.get(i-1).getId())) && r[0].equalsIgnoreCase("1")){
										bandera=true;
									}
								}
							%>
							<aui:option value="<%=aux %>" selected="<%=bandera %>">SI</aui:option>
							<%
								bandera =false;
								aux="2/"+parte1.get(i-1).getId();
								for(String res : respuesta1){
									String[] r = res.split("/");
									if(r[1].equalsIgnoreCase(String.valueOf(parte1.get(i-1).getId())) && r[0].equalsIgnoreCase("2")){
										bandera=true;
									}
								}
							%>
							<aui:option value="<%=aux %>" selected="<%=bandera %>">NO</aui:option>
						</aui:select>
					</div>
				</div>
			<%} %>
		<%} %>
	</div>
	<br>
	<div style="width: 90%;margin: auto; border-top-style: ridge; border-left-style: ridge; border-right-style: ridge;">
		<div class="titulo bordeabajo">
			<div class="bloque centro numero">2</div>
			<div class="bloque pregunta">CRITERIOS ORIENTADORES RELACIONADOS CON EL PROCEDIMIENTO Y LA DECISIÓN JUDICIAL</div>
			<div class="bloque centro respuesta">SI / NO</div>
		</div>
		<%if(parte2!=null){ %>
			<%for(int i=1 ; i<=parte2.size() ; i++){ %>
				<div class="bordeabajo">
					<div class="bloque1 centro numero">2.<%=i %></div>
					<div class="bloque1 izqui pregunta"><%=parte2.get(i-1).getPregunta() %></div>
					<div class="bloque1 centro respuesta">
					<%String aux = "resp2"+i; %>
						<aui:select name="<%=aux %>" id="<%=aux %>" label="" style="width : 100%;" onChange="actualizar()">
							<%
								bandera =false;
								aux="0/"+parte2.get(i-1).getId();
								for(String res : respuesta2){
									String[] r = res.split("/");
									if(r[1].equalsIgnoreCase(String.valueOf(parte2.get(i-1).getId())) && r[0].equalsIgnoreCase("0")){
										bandera=true;
									}
								}
							%>
							<aui:option value="<%=aux %>" selected="<%=bandera %>">-------</aui:option>
							<%
								bandera =false;
								aux="1/"+parte2.get(i-1).getId();
								for(String res : respuesta2){
									String[] r = res.split("/");
									if(r[1].equalsIgnoreCase(String.valueOf(parte2.get(i-1).getId())) && r[0].equalsIgnoreCase("1")){
										bandera=true;
									}
								}
							%>
							<aui:option value="<%=aux %>" selected="<%=bandera %>">SI</aui:option>
							<%
								bandera =false;
								aux="2/"+parte2.get(i-1).getId();
								for(String res : respuesta2){
									String[] r = res.split("/");
									if(r[1].equalsIgnoreCase(String.valueOf(parte2.get(i-1).getId())) && r[0].equalsIgnoreCase("2")){
										bandera=true;
									}
								}
							%>
							<aui:option value="<%=aux %>" selected="<%=bandera %>">NO</aui:option>
						</aui:select>
					</div>
				</div>
			<%} %>
		<%} %>
	</div>
	<br>
	<div style="width: 90%;margin: auto; border-style: ridge;">
		<div class="titulo bordeabajo">
			<div class="bloque centro numero">3</div>
			<div class="bloque pregunta">Estadística de aplicación de los criterios de la "LISTA DE VERIFICACIÓN".</div>
			<div class="bloque centro respuesta"></div>
		</div>
		<div class="bordeabajo">
			<div class="bloque1 centro numero">3.1</div>
			<div class="bloque1 izqui pregunta">Criterios con perspectiva de género desde el enfoque diferencial que se aplican al caso en estudio</div>
			<div class="bloque1 centro respuesta" id="si"></div>
		</div>
		<div>
			<div class="bloque1 centro numero">3.2</div>
			<div class="bloque1 izqui pregunta">Criterios con perspectiva de género desde el enfoque diferencial que no se aplican al caso en estudio</div>
			<div class="bloque1 centro respuesta" id="no"></div>
		</div>
	</div>
	<br>
	<div class="row">
		<div id="grafica"></div>
	</div>
	<br>
	<div class="row centro">
		<aui:button type="submit" value="Modificar Caso"></aui:button>
	</div>
	</aui:form>
	<%} %>
</div>



<portlet:resourceURL var="estadisticas">
</portlet:resourceURL>
<portlet:resourceURL var="filtro">
</portlet:resourceURL>
<portlet:resourceURL var="validarRadicacion">
</portlet:resourceURL>

<script type="text/javascript">
function alertaRa(){
	var radicacion = document.getElementById("<portlet:namespace/>radicacion").value;
	if(radicacion.length==23){
		$.ajax({
			url:   '<%=validarRadicacion%>',
	        type:  'post',
	        dataType: 'json',
	        data:  {radicacion : radicacion, tipoSolicitud : 9 },
	        success:  function (response) {
	        	var data = response;
	        	if(data["0"].si==1){
	        		alert("El número de radicación ingresado ya esta asignado a un proceso");
	        		document.getElementById("<portlet:namespace/>radicacion").value = "";
	        	}
	        }
	        
		});
	}
}

function actualizar(){
	var datos="",datos2="";
	var i;
	var aux;
	for(i=1 ; i<=<%=parte1.size()%> ; i++){
		aux="resp1"+i;
		datos = datos + document.getElementById("<portlet:namespace/>"+aux).value + "-";
	}
	for(i=1 ; i<=<%=parte2.size()%> ; i++){
		aux="resp2"+i;
		datos2 = datos2 + document.getElementById("<portlet:namespace/>"+aux).value + "-";
	}
	document.getElementById("<portlet:namespace/>respuestas1").value=datos;
	document.getElementById("<portlet:namespace/>respuestas2").value=datos2;
	datos=datos+datos2;
	$.ajax({
		url:   '<%=estadisticas%>',
        type:  'post',
        dataType: 'json',
        data:  {respuestas : datos, tipoSolicitud : 1 },
        success:  function (response) {
        	var datosR = response;
        	console.log(datosR);
        	Highcharts.chart('grafica', {
                chart: {
                    type: 'column'
                },
                title: {
                    text: 'ESTADÍSTICA DE APLICACIÓN DE ASPECTOS DE LA LISTA DE VERIFICACIÓN'
                },
                xAxis: {
                    type: 'category',
                    labels: {
                        rotation: 0,
                        style: {
                            fontSize: '10px',
                            fontFamily: 'Verdana, sans-serif'
                        }
                    }
                },
                yAxis: {
                    min: 0,
                    title: {
                        text: 'Cantidad de criterios'
                    }
                },
                legend: {
                    enabled: false
                },
                series: [{
                    name: 'Cantidad',
                    data: [
                        ['Criterios que se aplican al caso en estudio', datosR["0"].si],
                        ['Criterios que no se aplican al caso en estudio', datosR["0"].no]
                    ],
                    dataLabels: {
                        enabled: true,
                        rotation: 0,
                        color: '#FFFFFF',
                        align: 'center',
                        format: '{point.y:.0f}', // one decimal
                        y: 30, // 10 pixels down from the top
                        style: {
                            fontSize: '13px',
                            fontFamily: 'Verdana, sans-serif'
                        }
                    }
                }]
            });
        	document.getElementById("si").innerHTML = datosR["0"].si;
        	document.getElementById("no").innerHTML = datosR["0"].no;
        }
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
        	$('#<portlet:namespace/>subCategoria').append($('<option>').text('Seleccione una SubCategoría').attr('value', '').attr('disabled',true));
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

function grafica2(){
	var datos = document.getElementById("<portlet:namespace/>respuestas1").value;
	var datos2 = document.getElementById("<portlet:namespace/>respuestas2").value;
	datos=datos+datos2;
	$.ajax({
		url:   '<%=estadisticas%>',
        type:  'post',
        dataType: 'json',
        data:  {respuestas : datos, tipoSolicitud : 1 },
        success:  function (response) {
        	var datosR = response;
        	console.log(datosR);
        	Highcharts.chart('grafica', {
                chart: {
                    type: 'column'
                },
                title: {
                    text: 'ESTADÍSTICA DE APLICACIÓN DE ASPECTOS DE LA LISTA DE VERIFICACIÓN'
                },
                xAxis: {
                    type: 'category',
                    labels: {
                        rotation: 0,
                        style: {
                            fontSize: '10px',
                            fontFamily: 'Verdana, sans-serif'
                        }
                    }
                },
                yAxis: {
                    min: 0,
                    title: {
                        text: 'Cantidad de criterios'
                    }
                },
                legend: {
                    enabled: false
                },
                series: [{
                    name: 'Cantidad',
                    data: [
                        ['Criterios que se aplican al caso en estudio', datosR["0"].si],
                        ['Criterios que no se aplican al caso en estudio', datosR["0"].no]
                    ],
                    dataLabels: {
                        enabled: true,
                        rotation: 0,
                        color: '#FFFFFF',
                        align: 'center',
                        format: '{point.y:.0f}', // one decimal
                        y: 30, // 10 pixels down from the top
                        style: {
                            fontSize: '13px',
                            fontFamily: 'Verdana, sans-serif'
                        }
                    }
                }]
            });
        	document.getElementById("si").innerHTML = datosR["0"].si;
        	document.getElementById("no").innerHTML = datosR["0"].no;
        }
        });
}


window.onload = function(){
	
	var datos="",datos2="";
	var i;
	var aux;
	for(i=1 ; i<=<%=parte1.size()%> ; i++){
		aux="resp1"+i;
		datos = datos + document.getElementById("<portlet:namespace/>"+aux).value + "-";
	}
	for(i=1 ; i<=<%=parte2.size()%> ; i++){
		aux="resp2"+i;
		datos2 = datos2 + document.getElementById("<portlet:namespace/>"+aux).value + "-";
	}
	document.getElementById("<portlet:namespace/>respuestas1").value=datos;
	document.getElementById("<portlet:namespace/>respuestas2").value=datos2;
	
	if(document.getElementById("<portlet:namespace/>detalle").value=="1"){
		filtros2();
		grafica2();
	}
	cargarArchivo();
	};
	
function cargarEspecia(){
	var selec = document.getElementById("<portlet:namespace/>claseProceso1").value;
	var especialidad = <%=esp.getId()%>;
	if(selec=="Ordinaria"){
		if(especialidad==3 || especialidad==4 || especialidad==31){
			document.getElementById("<portlet:namespace/>claseProceso2").value="<%=esp.getNombre()%>";
			document.getElementById("<portlet:namespace/>claseProceso2").style.display="block";
		}
	}else{
		document.getElementById("<portlet:namespace/>claseProceso2").value="";
		document.getElementById("<portlet:namespace/>claseProceso2").style.display="none";
	}
}

function cargarArchivo(){
	var selec = document.getElementById("<portlet:namespace/>tipoDesicion").value;
	if(selec!=""){
		document.getElementById("<portlet:namespace/>archivo").style.display="block";
		
	}else{
		document.getElementById("<portlet:namespace/>archivo").value="";
		document.getElementById("<portlet:namespace/>archivo").style.display="none";
	}
}
</script>