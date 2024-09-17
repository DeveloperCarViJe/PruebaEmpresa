<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>REGISTRO DE EMPLEADOS</title>
</head>
<body>
    <h2>FORMULARIO DE REGISTRO DE EMPLEADOS</h2>
    <form action="EmpleadoControlador" method="POST">
        <label for="cedula">Cedula:</label>
        <input type="text" id="cedula" name="cedula" required><br><br>
        
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre" required><br><br>
        
        <label for="fecha_nacimiento">Fecha_nacimiento:</label>
        <input type="date" id="fecha_nacimiento" name="fecha_nacimiento" required><br><br>
        
        <label for="sueldo">Sueldo:</label>
        <input type="text" id="sueldo" name="sueldo" required><br><br>
        
        <input type="submit" name="accion" value="Registrar">
    </form>
</body>
</html>
