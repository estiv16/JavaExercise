<%-- 
    Document   : add
    Created on : 10/08/2020, 10:50:47 a. m.
    Author     : felip
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous"> 
        <title>JSP Page</title>
    </head>
    <body>
        <br><br>
        <div class="container">
            <h1> Agregar Mascota</h1>
            <form action = "Controlador">
                IdMascota:<br>
                <input class="form-control" type="text" name="txtIdMascota"><br>
                Nombre:<br>
                <input class="form-control" type="text" name="txtMascota"><br>
                Tratamiento:<br>
                <input class="form-control" type="text" name="txtTratamiento"><br>
                
                <input class="btn btn-primary" type="submit" name="accion" value="AgregarMascota"><br>
                <a href="Controlador?accion=listarMascota">Regresar</a>
            </form>
        </div>
    </body>
</html>