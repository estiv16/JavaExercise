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
        <div class="container">
            <h1> Agregar Persona</h1>
            <form action = "Controlador">
                DNI:<br>
                <input class="form-control" type="text" name="txtDni"><br>
                Nombres:<br>
                <input class="form-control" type="text" name="txtNom"><br>
                <input class="btn btn-primary" type="submit" name="accion" value="Agregar"><br>
                <a href="Controlador?accion=listar">Regresar</a>
            </form>
        </div>
    </body>
</html>
