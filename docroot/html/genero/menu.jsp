<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@page import="javax.portlet.PortletURL"%>
<%@include file="/html/init.jsp"%>

<portlet:defineObjects />
<!-- Enlaces internos -->
<portlet:renderURL	var="consolidado">
	<portlet:param name="mvcPath" value="/html/genero/view.jsp"/>
</portlet:renderURL>
<portlet:renderURL	var="preguntas">
	<portlet:param name="mvcPath" value="/html/genero/preguntasClave.jsp"/>
</portlet:renderURL>
<portlet:renderURL	var="matriz">
	<portlet:param name="mvcPath" value="/html/genero/matrizCategorias.jsp"/>
</portlet:renderURL>
<portlet:renderURL	var="normasN">
	<portlet:param name="mvcPath" value="/html/genero/normasNacionales.jsp"/>
</portlet:renderURL>
<portlet:renderURL	var="normasI">
	<portlet:param name="mvcPath" value="/html/genero/normasInternacional.jsp"/>
</portlet:renderURL>
<portlet:renderURL	var="jurisN">
	<portlet:param name="mvcPath" value="/html/genero/jurisprudenciaNacional.jsp"/>
</portlet:renderURL>
<portlet:renderURL	var="jurisI">
	<portlet:param name="mvcPath" value="/html/genero/jurisprudenciaInternacional.jsp"/>
</portlet:renderURL>

<div class="row">
		<div class="botonesPrincipales bloque"><aui:button style="width: 100%;color: white !important; background: #014691 !important; text-shadow: none !important;" value="INICIO" href="${consolidado }"/></div>
		<div class="botonesPrincipales bloque menu">
			<ul style="width: 100%;">
				<li style="width: 100%;"><aui:button style="width: 100%;color: white !important; background: #014691 !important; text-shadow: none !important;" value="ORIENTACIONES TEÓRICAS"/>
				 <ul style="width: 100%;">
 					<li><aui:button value="Matriz de Categorias"  style="width: 100%;color: white !important; background: #7030a0 !important; text-shadow: none !important;" href="${matriz }"/></li>
 					<li><aui:button value="Preguntas Clave"  style="width: 100%;background: #e26b0a !important;	text-shadow: none !important;	color: white !important;" href="${preguntas }"/></li>
 					<li><aui:button value="Normas Nacionales"  style="width: 100%;background: #ff0066 !important;	text-shadow: none !important;	color: white !important;" href="${normasN }"/></li>
 					<li><aui:button value="Normas Internacionales"  style="width: 100%;background: #00b050 !important;	text-shadow: none !important;	color: black !important;" href="${normasI }"/></li>
 					<li><aui:button value="Jurisprudencia Nacional"  style="width: 100%;background: #76933c !important;	text-shadow: none !important;	color: black !important;" href="${jurisN }"/></li>
 					<li><aui:button value="Jurisprudencia Internacional"  style="width: 100%;background: #0070c0 !important;	text-shadow: none !important;	color: white !important;" href="${jurisI }"/></li>
 					<li><aui:button value="Jurisprudencia de Género"  style="width: 100%;background: #7b7b7b !important;	text-shadow: none !important;	color: white !important;" onClick="jurisprudencia()"/></li>
 					<li><aui:button value="Ayuda Jurisprudencia de Género"  style="width: 100%;background: #7b7b7b !important;	text-shadow: none !important;	color: white !important;" onClick="jurisprudenciaAyuda()"/></li>
 				</ul>
 				</li>
			</ul>
		</div>
	</div>
<script>
	function jurisprudencia(){
		window.open("http://jurisprudencia.ramajudicial.gov.co/WebRelatoria/gen/index.xhtml","_blank");
	}
	function jurisprudenciaAyuda(){
		window.open("https://ayudajurisprudencia.ramajudicial.gov.co:8446/ayuda/","_blank");
	}
</script>