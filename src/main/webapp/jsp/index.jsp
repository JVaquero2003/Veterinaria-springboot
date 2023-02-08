<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<h3>Insertar mascota</h3>
		<form:form action="addMascotaForm" method="post" modelAttribute="mascota">
			<span>NumChip:</span>
			<form:input path="numChip" type="number" name="numChip"/>
			
			<span>Nombre:</span>
			<form:input path="nombre" type="text" name="nombre"/>
			
			<label for="vacunacion">Vacuna:</label>
			<form:checkbox path="vacunacion" name="vacunacion"/>
			
			<input type="submit"/>
		</form:form>
		
		<br/><br/><br/>
		
		<h3>Insertar dueno</h3>
		<form:form action="addDuenoForm" method="post" modelAttribute="dueno">
			<span>Nombre:</span>
			<form:input path="nombre" type="text" name="nombre"/>
			
			<span>DNI:</span>
			<form:input path="dni" type="text" name="dni"/>
			
			<form:select  path="MascotasDescompuesto">
    			<form:option value="NONE"> --SELECT--</form:option>
    			<form:options items="${listaMascotas}"></form:options>
		  	</form:select>
			
			<!-- 
			<select id="listaMascotas">
				<c:forEach items="${listaMascotas}" var="mascota">
					<option value="${mascota.nombre}">${mascota.nombre} </option>
				</c:forEach>
			</select>
			 -->
			 
			<input type="submit"/>
		</form:form>
		
		
		<br/><br/><br/>
		<a href="listMascotas">Lista/Editar/Eliminar mascotas</a>	 <!-- ListMascotaController -->
		<br/><br/>
		<a href="listDuenos">Lista/Editar/Eliminar due�os</a>	<!-- ListDue�oController -->
		
	</body>
</html>


