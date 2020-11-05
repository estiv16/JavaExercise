<%-- 
    Document   : index
    Created on : 10/08/2020, 10:51:26 a. m.
    Author     : felip
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <br><br><br><br><br>
        <center>
            <div class="container" style="background-color: rgba(255,200,10,0.5)">
                <br>
                <!-- JS, Popper.js, and jQuery -->
                <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
                <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
                <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>

            
                <h1>Escoge una opcion:</h1><br>
                <a class="btn" href="Controlador?accion=listar" style="color: black; background-color: rgba(255,255,255,0.7)"> Listar Personas </a>
                
                <a class="btn" href="Controlador?accion=add" style="color: black; background-color: rgba(255,255,255,0.7)"> Guardar Personas </a>
                
                <a class="btn" href="Controlador?accion=listarMascota" style="color: black; background-color: rgba(255,255,255,0.7)"> Listar Mascota </a>
                
                <a class="btn" href="Controlador?accion=addMascota" style="color: black; background-color: rgba(255,255,255,0.7)"> Guardar Mascota </a>
                <br><br>
                <a class="btn" href="Controlador?accion=listarTodo" style="color: black; background-color: rgba(255,255,255,0.7)"> Listar Todo </a>
   
                <br>
                <br>
                
            </div>
        </center>
    </body>
</html>
