<%@page import="java.util.Date"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="com.ability.genero.server.service.auditoriaLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.ability.genero.server.model.auditoria"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@include file="/html/init.jsp"%>

<%
	SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
	
	String fechaInicial = "";
	String fechaFinal = "";
	String tabla = "";
	
	fechaInicial = (String) renderRequest.getPortletSession().getAttribute("fechaIni")+" 00:00";
	fechaFinal =  (String) renderRequest.getPortletSession().getAttribute("fechaFin")+" 23:59";
	tabla =  (String) renderRequest.getPortletSession().getAttribute("tabla");
	
	SimpleDateFormat SIMPLE_DATE_FORMAT=new SimpleDateFormat("dd-MM-yyyy HH:mm");
	List<auditoria> audi = new ArrayList<auditoria>();
	Date fInicial, fFinal;
	try{
		fInicial=SIMPLE_DATE_FORMAT.parse(fechaInicial);
	}catch(Exception e){
		fInicial=SIMPLE_DATE_FORMAT.parse("01-01-1900 00:00");
	}
	try{
		fFinal=SIMPLE_DATE_FORMAT.parse(fechaFinal);
	}catch(Exception e){
		fFinal=SIMPLE_DATE_FORMAT.parse("31-12-2050 23:59");
	}

	System.out.println("fechas  "+fInicial+"--"+fFinal);
	System.out.println(tabla);
	for(auditoria iterator: auditoriaLocalServiceUtil.getauditorias(-1, -1)){
		if(tabla==null){
			if(iterator.getFecha().after(fInicial) && iterator.getFecha().before(fFinal)){
				audi.add(iterator);
			}
		}else{
			if(iterator.getFecha().after(fInicial) && iterator.getFecha().before(fFinal) && iterator.getTabla().equals(tabla)){
				audi.add(iterator);
			}
		}
	}
	
%>


<portlet:defineObjects />
<liferay-portlet:renderURL varImpl="iteratorURL">
	<portlet:param name="mvcPath" value="/html/administracion/auditoria/auditoria.jsp"/>
</liferay-portlet:renderURL>

<portlet:resourceURL var="exportar"></portlet:resourceURL>

<portlet:actionURL name="filtrar" var="filtrar"></portlet:actionURL>

<div class="contenedor">
	<div class="row">
		<div class="bloque" style="width: 20%">
			<jsp:include page="/html/administracion/menu.jsp"></jsp:include>
		</div>
		<div class="bloque" style="width: 79% ; min-height : 200px;">
			<div class="container-fluid text-center">
				<br>
				<br>
				<label class="negrita centro" style="font-size: 17px">Auditoría</label>
				<br>
				<br>
				<div class="row centro">
				<aui:form method="post" action="<%=filtrar %>">
					<div class="bloque izqui" style=" width: 22%">
						<aui:input name="FechaI" id="FechaI" type="date" label="Fecha Inicio:"></aui:input>
					</div>
					<div class="bloque izqui" style=" width: 22%">
						<aui:input name="FechaF" id="FechaF" type="date" label="Fecha Fin:"></aui:input>
					</div>
					<div class="bloque izqui" style=" width: 40%">
						<aui:select name="tabla" id="tabla" type="date" label="Tabla:">
							<aui:option value="">Seleccione...</aui:option>
							<aui:option value="GENERO_PREGUNTAS_CLAVES">GENERO_PREGUNTAS_CLAVES</aui:option>
							<aui:option value="GENERO_CATEGORIAS">GENERO_CATEGORIAS</aui:option>
							<aui:option value="GENERO_SUBCATEGORIAS">GENERO_SUBCATEGORIAS</aui:option>
							<aui:option value="GENERO_NORMAS_NACIONALES">GENERO_NORMAS_NACIONALES</aui:option>
							<aui:option value="GENERO_NORMAS_INTERNACIONALES">GENERO_NORMAS_INTERNACIONALES</aui:option>
							<aui:option value="GENERO_JURISPRUDENCIA_NACIONALES">GENERO_JURISPRUDENCIA_NACIONALES</aui:option>
							<aui:option value="GENERO_JURISPRUDENCIA_INTERNACIONALES">GENERO_JURISPRUDENCIA_INTERNACIONALES</aui:option>
							<aui:option value="GENERO_ENCUESTA_ENFOQUEDIFERENCIAL">GENERO_ENCUESTA_ENFOQUEDIFERENCIAL</aui:option>
							<aui:option value="GENERO_ENCUESTA_CRITERIOS">GENERO_ENCUESTA_CRITERIOS</aui:option>
							<aui:option value="GENERO_LV_CASO">GENERO_LV_CASO</aui:option>
							<aui:option value="GENERO_USUARIOS">GENERO_USUARIOS</aui:option>
							<aui:option value="GENERO_DISTRITOS_MASCARAS">GENERO_DISTRITOS_MASCARAS</aui:option>
						</aui:select>
					</div>
					<div class="bloque izqui" style=" width: 10%; margin-top: 16px;">
						<aui:button value="Filtrar" type="submit"></aui:button>
					</div>
				</aui:form>
				</div>
				<br>
				<br>
				<div class="row">
					<liferay-ui:search-container   delta="10" deltaConfigurable="true"  emptyResultsMessage="Sin registros" iteratorURL="<%=iteratorURL%>">
						    <liferay-ui:search-container-results>
						        	<%				
									 	String keywords = ParamUtil.getString(request, "keywords");		
										results = ListUtil.subList(audi, searchContainer.getStart(), searchContainer.getEnd());
										total = audi.size();
										searchContainer.setTotal(audi.size());
										pageContext.setAttribute("results", results);
										pageContext.setAttribute("total", total);			
										
									%>    
						    </liferay-ui:search-container-results>    
							    <liferay-ui:search-container-row className="com.ability.genero.server.model.auditoria" keyProperty="id" modelVar="aud">
							    <%String aux=String.valueOf(aud.getId()); %>          	
									<liferay-ui:search-container-column-text cssClass="tablaAud" name="Id" 						value="<%=aux%>"/>
									<liferay-ui:search-container-column-text cssClass="tablaAud" name="Fecha" 						value="<%=formato.format(aud.getFecha())%>"/>
									<liferay-ui:search-container-column-text cssClass="tablaAud" name="Acción" 						value="<%=aud.getEvento()%>"/>
									<liferay-ui:search-container-column-text cssClass="tablaAud" name="Tabla" 						value="<%=aud.getTabla()%>"/>
									<liferay-ui:search-container-column-text cssClass="tablaAud" name="Log" 						value="<%=aud.getLogs()%>"/>
									<%
										String correo = "";
										try{
											correo = UserLocalServiceUtil.getUserById(aud.getIdUser()).getEmailAddress();
										}catch(Exception e){
											correo = "Usuario eliminado del portal";
										}
									%>
									<liferay-ui:search-container-column-text cssClass="tablaAud" name="Usuario" 					value="<%=correo%>"/>
							  </liferay-ui:search-container-row>
						  <liferay-ui:search-iterator />
					</liferay-ui:search-container>
				</div>
				<div class="row" align="center">
					<aui:button value="Exportar" type="button" onClick="<%=exportar %>"></aui:button>
				</div>
			</div>
		</div>
	</div>
</div>
<script>
$('#auditoria').addClass("active");	
</script>