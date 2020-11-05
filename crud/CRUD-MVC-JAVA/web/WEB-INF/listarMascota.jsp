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
                    <h1>Mascota</h1>
                    <table class="table table-striped">
                        <thead>
                            <tr>
                                <th class="text-center">IDMascota</th>
                                <th class="text-center">Mascota</th>
                                <th class="text-center">Tratamiento</th>
                                <th class="text-center">Acciones</th>
                            </tr>
                        </thead>
                        <%
                            PersonaDAO dao = new PersonaDAO();
                            List<Mascota> list2 = dao.listarMascota();
                            Iterator<Mascota> iter = list2.iterator();
                            Mascota mas = null;
                            while(iter.hasNext()){
                                mas=iter.next();

                         %>
                        <tbody>
                            <tr>
                                <td class="text-center"><%= mas.getIdMascota() %></td>
                                <td class="text-center"><%= mas.getMascota() %></td>
                                <td class="text-center"><%= mas.getTratamiento() %></td>
                                <td class="text-center"> 
                                    <a class="btn btn-warning" href="Controlador?accion=editarMascota&idMascota=<%= mas.getIdMascota()%>">EditarMascota</a>
                                    <a class="btn btn-danger" href="Controlador?accion=eliminarMascota&idMascota=<%= mas.getIdMascota()%>">RemoverMascota</a>
                                </td>
                            </tr>
                            <%}%>
                        </tbody>
                    </table>
                </center>
            </div>
        </div>
    </body>
</html>