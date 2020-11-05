<%-- 
    Document   : listar
    Created on : 10/08/2020, 10:51:08 a. m.
    Author     : felip
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Persona"%>
<%@page import="ModeloDAO.PersonaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous"> 
       
    </head>
    <body>
        <br>
        <div class="container">
            <div class="col-lg-12">
                      
                <center>
                    <h1>Tabla Personas</h1>
                    <table class="table table-striped">
                    <thead>
                        <tr>
                            <th class="text-center">ID</th>
                            <th class="text-center">DNI</th>
                            <th class="text-center">Nombres</th>
                            <th class="text-center">Acciones</th>
                        </tr>
                    </thead>
                    <%
                        PersonaDAO dao = new PersonaDAO();
                        List<Persona> list = dao.listar();
                        Iterator<Persona> iter = list.iterator();
                        Persona per = null;
                        while(iter.hasNext()){
                            per=iter.next();
                        
                     %>
                    <tbody>
                        <tr>
                            <td class="text-center"><%= per.getId() %></td>
                            <td class="text-center"><%= per.getDni() %></td>
                            <td class="text-center"> <%= per.getNombre() %></td>
                            <td class="text-center"> 
                                <a class="btn btn-warning" href="Controlador?accion=editar&id=<%= per.getId()%>">Editar</a>
                                <a class="btn btn-danger" href="Controlador?accion=eliminar&id=<%= per.getId()%>">Eliminar</a>
                            </td>
                        </tr>
                        <%}%>
                    </tbody>
                    </table>
                        <a class="btn btn-primary" href="Controlador?accion=index">Inicio</a>
                        <a class="btn btn-warning" href="Controlador?accion=add">Agregar</a>
                </center>
            </div>
        </div>
    </body>
</html>
