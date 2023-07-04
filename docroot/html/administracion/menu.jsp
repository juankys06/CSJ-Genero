<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@page import="javax.portlet.PortletURL"%>
<%@include file="/html/init-control-panel.jsp"%>

<portlet:defineObjects />
<!-- enlaces internos -->
<portlet:renderURL var="preguntaC" >
	<portlet:param name="mvcPath" value="/html/administracion/parametrizacion/preguntasC.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="matriz" >
	<portlet:param name="mvcPath" value="/html/administracion/parametrizacion/matrizC.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="normasN" >
	<portlet:param name="mvcPath" value="/html/administracion/parametrizacion/normasN.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="normasI" >
	<portlet:param name="mvcPath" value="/html/administracion/parametrizacion/normasI.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="jurisprudenciaN" >
	<portlet:param name="mvcPath" value="/html/administracion/parametrizacion/jurisprudenciaN.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="jurisprudenciaI" >
	<portlet:param name="mvcPath" value="/html/administracion/parametrizacion/jurisprudenciaI.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="encuesta" >
	<portlet:param name="mvcPath" value="/html/administracion/parametrizacion/encuesta.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="auditoria" >
	<portlet:param name="mvcPath" value="/html/administracion/auditoria/auditoria.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="distritos" >
	<portlet:param name="mvcPath" value="/html/administracion/distritos/distritos.jsp"/>
</portlet:renderURL>

<div class="row text-left">
	<div class="col-md-12">
		<div class="panel-group">
			<div class="panel panel-default" style="border-radius : 0;">
		      	<div class="panel-heading">
		        	<h4 class="panel-title">
		          		<a data-toggle="collapse" href="#collapse1"  style="text-decoration: none;">Parametrización</a>
		        	</h4>
		      	</div>
		      	<div id="collapse1" class="panel-collapse collapse in">
		        	<ul class="list-group" style="margin: 0">
		        		<li id="preguntaC" class="list-group-item"><a href="<%= preguntaC %>" style="text-decoration: none;">Preguntas Clave</a></li>
		        		<li id="matriz" class="list-group-item"><a href="<%= matriz %>" style="text-decoration: none;">Matriz de Categorias</a></li>
		        		<li id="normasN" class="list-group-item"><a href="<%= normasN %>" style="text-decoration: none;">Normas Nacionales</a></li>
		        		<li id="normasI" class="list-group-item"><a href="<%= normasI %>" style="text-decoration: none;">Normas Internacionales</a></li>
		        		<li id="jurisprudenciaN" class="list-group-item"><a href="<%= jurisprudenciaN %>" style="text-decoration: none;">Jurisprudencia Nacional</a></li>
		        		<li id="jurisprudenciaI" class="list-group-item"><a href="<%= jurisprudenciaI %>" style="text-decoration: none;">Jurisprudencia Internacional</a></li>
		        		<li id="encuesta" class="list-group-item"><a href="<%= encuesta %>" style="text-decoration: none;">Encuesta Lista de Verificación</a></li>
		        	</ul>
		      	</div>
		      	<div class="panel-heading">
		        	<h4 class="panel-title">
		          		<a data-toggle="collapse" href="#collapse2" >Auditoría</a>
		        	</h4>
		      	</div>
		      	<div id="collapse2" class="panel-collapse collapse in">
		        	<ul class="list-group" style="margin: 0">
		        		<li id="auditoria" class="list-group-item"><a href="<%= auditoria %>">Auditoría</a></li>
		        	</ul>
		      	</div>
		      	<div class="panel-heading">
		        	<h4 class="panel-title">
		          		<a data-toggle="collapse" href="#collapse3" >Distritos Genero</a>
		        	</h4>
		      	</div>
		      	<div id="collapse3" class="panel-collapse collapse in">
		        	<ul class="list-group" style="margin: 0">
		        		<li id="distrito" class="list-group-item"><a href="<%= distritos %>">Distritos</a></li>
		        	</ul>
		      	</div>
		 	</div>
		</div>
	</div>
</div>

<%-- <div class="row izqui">
	<label class="negrita" style="font-size: 15px;">Administración</label><br>
	<label class="negrita">Parametrización</label><br>
	<a class="enlace" href="${preguntaC }">-Preguntas Clave</a><br>
	<a class="enlace" href="${matriz }">-Matriz de Categorias</a><br>
	<a class="enlace" href="${normasN }">-Normas Nacionales</a><br>
	<a class="enlace" href="${normasI }">-Normas Internacionales</a><br>
	<a class="enlace" href="${jurisprudenciaN }">-Jurisprudencia Nacional</a><br>
	<a class="enlace" href="${jurisprudenciaI }">-Jurisprudencia Internacional</a><br>
	<a class="enlace" href="${encuesta }">-Encuesta Lista de Verificación</a><br>
	<br>
	<label class="negrita">Auditoría</label><br>
	<a class="enlace" href="${auditoria }">-Auditoría</a><br>
</div> --%>