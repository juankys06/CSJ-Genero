<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:renderURL var="usuariosGenero">
	<portlet:param name="mvcPath" value="/html/usuarios/usuariosP.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="usuariosComites">
	<portlet:param name="mvcPath" value="/html/usuarios/usuariosC.jsp"/>
</portlet:renderURL>


<div class="row">
	<div class="col-md-12">
		<div class="panel-group">
			<div class="panel panel-default" style="border-radius : 0;">
		      	<div class="panel-heading">
		        	<h4 class="panel-title">
		          		<a data-toggle="collapse" href="#collapse1"  style="text-decoration: none;">Usuarios Perspectivas de Género</a>
		        	</h4>
		      	</div>
		      	<div id="collapse1" class="panel-collapse collapse in">
		        	<ul class="list-group" style="margin: 0">
		        		<li id="usuariosP" class="list-group-item"><a href="<%= usuariosGenero %>" style="text-decoration: none;">Usuarios Género</a></li>
		        		<li id="usuariosC" class="list-group-item"><a href="<%= usuariosComites %>" style="text-decoration: none;">Usuarios Comités</a></li>
		        	</ul>
		      	</div>
		      	<%-- <div class="panel-heading">
		        	<h4 class="panel-title">
		          		<a data-toggle="collapse" href="#collapse2" >Contacto</a>
		        	</h4>
		      	</div>
		      	<div id="collapse2" class="panel-collapse collapse">
		        	<ul class="list-group" style="margin: 0">
		        		<li id="contacto" class="list-group-item"><a href="<%= contacto %>">Contacto</a></li>
		        	</ul>
		      	</div> --%>
		 	</div>
		</div>
	</div>
</div>