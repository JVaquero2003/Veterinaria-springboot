<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
		<meta charset="ISO-8859-1">
		<title>Dueños</title>
	</head>
	<body>
		<h1>Editar Dueño</h1>
		<form action="editNewDuenoForm" method="post" modelAttribute="dueno">
			<!--editar de mascota solo con los parametros de numChip, nombre y vacunacion-->
			<div>
				<label for="nombre">Nombre</label>
				<input type="disable" id="nombre" name="nombre" value="${duenoParaEditar.nombre}">
			</div>
			<div>
				<label for="dni">DNI</label>
				<input type="text" id="dni" name="dni" value="${duenoParaEditar.dni}">
			</div>
			<!--Mandarle los parametros de la mascota con un select y guardarlo como objeto -->
			<div>
				<select path="MascotasDescompuesto">
    			<options items="${duenoParaEditar.mascota}"></options>
		  	</select>

			</div>
			<button type="submit">Guardar</button>
		</form>
		
		<br/><br/>
		<a href="/">Volver a inicio</a>
		
	</body>
</html>