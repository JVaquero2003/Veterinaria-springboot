<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
		<meta charset="ISO-8859-1">
		<title>Mascotas</title>
	</head>
	<body>
		<h1>Editar Mascota</h1>
		<form action="editNewMascotaForm" method="post">
			<!--editar de mascota solo con los parametros de numChip, nombre y vacunacion-->
			<div>
				<label for="numChip">Número de chip</label>
				<input type="disable" id="numChip" name="numChip" value="${mascotaParaEditar.numChip}">
			</div>
			<div>
				<label for="nombre">Nombre</label>
				<input type="text" id="nombre" name="nombre" value="${mascotaParaEditar.nombre}">
			</div>
			<!--la vacunacion: 2 type radio, y solo que se seleccione uno dependiendo mascotaParaEditar.vacunacion-->
			<div>
				<label for="vacunacion">Vacunación</label>
				<div>
					<input type="radio" name="vacunacion" id="vacunacion1" value="true" 
						<c:if test="${mascotaParaEditar.vacunacion == true}">checked</c:if>>
					<label for="vacunacion1">Sí</label>
				</div>
				<div class="form-check">
					<input class="form-check-input" type="radio" name="vacunacion" id="vacunacion2" value="false"
						<c:if test="${mascotaParaEditar.vacunacion == false}">checked</c:if>>
					<label class="form-check-label" for="vacunacion2">No</label>
				</div>
			</div>
			<button type="submit">Guardar</button>
		</form>
		
		<br/><br/>
		<a href="/">Volver a inicio</a>
		
	</body>
</html>