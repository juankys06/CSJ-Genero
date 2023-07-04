<%@page import="com.ability.modelo.consultas"%>
<%@page import="com.ability.modelo.modelo"%>
<%@page import="com.ability.genero.server.service.subcategoriaLocalServiceUtil"%>
<%@page import="com.ability.genero.server.model.subcategoria"%>
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
	especialidad esp = null;
	if(casoEditar!=null){
		respuesta1 = casoEditar.getRespuestas1().split("-");
		respuesta2 = casoEditar.getRespuestas2().split("-");
		
	}

	List<categoria> categorias = categoriaLocalServiceUtil.getcategorias(-1, -1);
	List<subcategoria> subcategorias = subcategoriaLocalServiceUtil.getsubcategorias(-1, -1);
	List<tipoDecision> tipoDeci = tipoDecisionLocalServiceUtil.gettipoDecisions(-1, -1);
	List<encuestaEnfoDife> parte1 = encuestaEnfoDifeLocalServiceUtil.getencuestaEnfoDifes(-1, -1);
	List<encuestaCriterios> parte2 = encuestaCriteriosLocalServiceUtil.getencuestaCriterioses(-1, -1);
	List<claseProceso> clase = claseProcesoLocalServiceUtil.getclaseProcesos(-1, -1);
	SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
	String diaHoy = formato.format(hoy);
	
	
	renderRequest.getPortletSession().removeAttribute("casoEditar");
%>

<portlet:defineObjects />

<div class="contenedor">
	<jsp:include page="/html/genero/menu.jsp"></jsp:include>
	<br>
	<br>
	<div class="row" style="font-size: 13px; font-weight: bold;">
		PERSPECTIVA DE GÉNERO DESDE EL ENFOQUE DIFERENCIAL EN LAS DECISIONES JUDICIALES
	</div>
	<br>
	<br>
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
			<div class="bloque" style="width: 50%;"><aui:input name="despacho" id="despacho" label="" style="width : 95%; margin-bottom: 10px;" readonly="true" value="<%=casoEditar.getDespacho() %>"></aui:input></div>
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
				<aui:input name="radicacion" id="radicacion" type="number" label="" style="width : 95%;"  readonly="true" value="<%=casoEditar.getRadicacion() %>"></aui:input>
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
			<div class="bloque" style="width: 38%;"><aui:input name="demandante" id="demandante" label="" style="width : 95%;" value="<%=casoEditar.getDemandante() %>" readonly="true"></aui:input></div>
			<div class="bloque" style="width: 10%;"><aui:input name="generoDemandante" id="generoDemandante" label="" style="width : 95%;" value="<%=casoEditar.getGeneroDemandante() %>" readonly="true"></aui:input></div>
		</div>
		<br>
		<div style="width:  80%; margin: auto; text-align: left;">
			<div class="bloque" style="width: 42%; font-weight: bold; margin-left: 3%;">3.2 Demandado / Agresor / Victimario</div>
			<div class="bloque" style="width: 38%;"><aui:input name="demandado" id="demandado" label="" style="width : 95%;" value="<%=casoEditar.getDemandado() %>" readonly="true"></aui:input></div>
			<div class="bloque" style="width: 10%;"><aui:input name="generoDemandado" id="generoDemandado" label="" style="width : 95%;" value="<%=casoEditar.getGeneroDemandado() %>" readonly="true"></aui:input></div>
		</div>
		<br>
		<div style="width:  80%; margin: auto; text-align: left;">
			<div class="bloque" style="width: 45%; font-weight: bold;">4. Clase de proceso</div>
			<div class="bloque" style="width: 50%;">
				<aui:input name="claseProceso" id="claseProceso" readonly="true" value="<%=casoEditar.getClaseProceso() %>" label="" style="width : 95%;"></aui:input>
			</div>
		</div>
		<br>
		<div style="width:  80%; margin: auto; text-align: left;">
			<div class="bloque" style="width: 45%; font-weight: bold;">5. Tipo de Decisión</div>
			<div class="bloque" style="width: 15%;">
				<%if(tipoDeci!=null){ %>
					<%for(tipoDecision td : tipoDeci){ %>
						<%if(casoEditar.getTipoDecision().equalsIgnoreCase(String.valueOf(td.getId()))){ %>
							<aui:input name="tipoDecision" id="tipoDecision" readonly="true" value="<%=td.getTipoDecision() %>" label="" style="width : 95%;"></aui:input>
						<%} %>
					<%}%>
				<%} %>
			</div>
			<%if(!casoEditar.getArchivo().isEmpty()){ %>
				<div class="bloque" style="width: 34%;">
				<portlet:resourceURL var="ver">
					<portlet:param name="tipoSolicitud" value="11"/>
					<portlet:param name="ruta" value="<%=casoEditar.getArchivo()%>"/>
				</portlet:resourceURL>
					<a target="_blank" href="${ver }">
						Descargar Adjunto
					</a>
				</div>
			<%} %>
		</div>
		<br>
		<div style="width:  80%; margin: auto; text-align: left;">
			<div class="bloque" style="width: 45%; font-weight: bold;">6. Ponente</div>
			<div class="bloque" style="width: 50%;"><aui:input name="ponente" id="ponente" label="" style="width : 95%;" readonly="true" value="<%=casoEditar.getPonente() %>"></aui:input></div>
		</div>
		<br>
		<div style="width:  80%; margin: auto; text-align: left;">
			<div class="bloque" style="width: 45%; font-weight: bold;">7. Fecha en la que se dicta la providencia</div>
			<div class="bloque" style="width: 50%;"><aui:input name="fecha" id="fecha" label="" style="width : 95%;" type="date" max="<%=diaHoy %>" value="<%=formato.format(casoEditar.getFecha()) %>" readonly="true"></aui:input></div>
		</div>
		<br>
		<div style="width:  80%; margin: auto; text-align: left;">
			<div class="bloque" style="width: 45%; font-weight: bold;">8. Categoría</div>
			<div class="bloque" style="width: 50%;">
				<%if(categorias!=null){ %>
					<%for(categoria cat : categorias){ %>
						<%if(casoEditar.getCategoria().equalsIgnoreCase(String.valueOf(cat.getId()))){ %>
							<aui:input name="categoria" id="categoria" readonly="true" value="<%=cat.getCategoria() %>" label="" style="width : 95%;"></aui:input>
						<%} %>
					<%}%>
				<%} %>
			</div>
			<div class="bloque">
				<abbr title="Este ítem agrupa los diferentes temas que identifican el enfoque de género, la aplicación del derecho a la igualdad y la no discriminación, partiendo de la clasificación que traen los instrumentos internacionales como la Guía interactiva de estándares internacionales sobre derechos de las mujeres de la Corte suprema de Justicia de la Nación. República Argentina . Es importante identificar este ítem porque permite medir que categoría de los Estándares se aplica.">?</abbr>
			</div>
		</div>
		<br>
		<div style="width:  80%; margin: auto; text-align: left;">
			<div class="bloque" style="width: 45%; font-weight: bold;">9. Subcategoría</div>
			<div class="bloque" style="width: 50%;">
				<%if(subcategorias!=null){ %>
					<%for(subcategoria cat : subcategorias){ %>
						<%if(casoEditar.getSubCategoria().equalsIgnoreCase(String.valueOf(cat.getId()))){ %>
							<aui:input name="subcategoria" id="subcategoria" readonly="true" value="<%=cat.getSubcategoria() %>" label="" style="width : 95%;"></aui:input>
						<%} %>
					<%}%>
				<%} %>
			</div>
			<div class="bloque">
				<abbr title="Este ítem agrupa las subdivisiones relevantes de los temas que agrupan las Categorías, e identifican el enfoque de género, la aplicación del derecho a la igualdad y la no discriminación, partiendo de la clasificación que traen los instrumentos internacionales como la Guía interactiva de estándares internacionales sobre derechos de las mujeres de la Corte suprema de Justicia de la Nación. República Argentina . Es importante identificar este Ítem porque permite medir que Sub categoría de los Estándares se aplica.">?</abbr>
		</div>
		</div>
	</div>
	<aui:input name="respuestas1" id="respuestas1" type="hidden" value="<%=casoEditar.getRespuestas1() %>"></aui:input>
	<aui:input name="respuestas2" id="respuestas2" type="hidden" value="<%=casoEditar.getRespuestas2() %>"></aui:input>
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
					<%
						for(String res : respuesta1){
							String[] r = res.split("/");
							if(r[1].equalsIgnoreCase(String.valueOf(parte1.get(i-1).getId())) && r[0].equalsIgnoreCase("0")){
								out.print("-");
							}
						}
						for(String res : respuesta1){
							String[] r = res.split("/");
							if(r[1].equalsIgnoreCase(String.valueOf(parte1.get(i-1).getId())) && r[0].equalsIgnoreCase("1")){
								out.print("SI");
							}
						}
						for(String res : respuesta1){
							String[] r = res.split("/");
							if(r[1].equalsIgnoreCase(String.valueOf(parte1.get(i-1).getId())) && r[0].equalsIgnoreCase("2")){
								out.print("NO");
							}
						}
					%>
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
					<%
						for(String res : respuesta2){
							String[] r = res.split("/");
							if(r[1].equalsIgnoreCase(String.valueOf(parte2.get(i-1).getId())) && r[0].equalsIgnoreCase("0")){
								out.print("-");
							}
						}
						for(String res : respuesta2){
							String[] r = res.split("/");
							if(r[1].equalsIgnoreCase(String.valueOf(parte2.get(i-1).getId())) && r[0].equalsIgnoreCase("1")){
								out.print("SI");
							}
						}
						for(String res : respuesta2){
							String[] r = res.split("/");
							if(r[1].equalsIgnoreCase(String.valueOf(parte2.get(i-1).getId())) && r[0].equalsIgnoreCase("2")){
								out.print("NO");
							}
						}
					%>
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
</div>



<portlet:resourceURL var="estadisticas">
</portlet:resourceURL>
<portlet:resourceURL var="filtro">
</portlet:resourceURL>

<script type="text/javascript">

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
	
	
	
	if(document.getElementById("<portlet:namespace/>detalle").value=="1"){
		grafica2();
	}
	};
	
</script>