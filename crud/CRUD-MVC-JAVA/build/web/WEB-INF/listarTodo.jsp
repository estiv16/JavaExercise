<%-- 
    Document   : listar
    Created on : 10/08/2020, 10:51:08 a. m.
    Author     : felip
--%>

<%@page import="Modelo.Mascota"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Persona"%>
<%@page import="ModeloDAO.PersonaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>  
    <head>
        <title>JSP Page</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous"> 
    </head> 
    <body>
        <br>
        <div class="container">
            <div class="col-lg-12">
                <center>
                    <h1>Personas con sus mascotas</h1>
                    <table class="table table-striped">
                        <thead>
                            <tr>
                                <th class="text-center">ID</th>
                                <th class="text-center">DNI</th>
                                <th class="text-center">Nombres</th>
                                <th class="text-center">IDMascota</th>
                                <th class="text-center">Mascota</th>
                                <th class="text-center">Tratamiento</th>
                            </tr>
                        </thead>
                        <%
                            PersonaDAO dao = new PersonaDAO();
                            List<Persona> list = dao.listar();
                            List<Mascota> list2 = dao.listarMascota();
                            Iterator<Persona> iter = list.iterator();
                            Iterator<Mascota> iter2 = list2.iterator();
                            Persona per = null;
                            Mascota m = null;
                            while(iter.hasNext()){
                                per=iter.next();
                                m=iter2.next();
                        %>
                        <tbody>
                            <tr>
                                <td class="text-center"><%= per.getId() %></td>
                                <td class="text-center"><%= per.getDni() %></td>
                                <td class="text-center"><%= per.getNombre() %></td>
                                <td class="text-center"><%= m.getIdMascota() %></td>
                                <td class="text-center"><%= m.getMascota() %></td>
                                <td class="text-center"><%= m.getTratamiento() %></td>
                            </tr>
                            <%}%>
                        </tbody>
                    </table>
                    <a class="btn btn-primary" href="Controlador?accion=index">Inicio</a>
                </center>
            </div>
        </div>
    </body>
</html>
