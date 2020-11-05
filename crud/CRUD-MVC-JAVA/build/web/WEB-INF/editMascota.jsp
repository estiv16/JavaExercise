<%-- 
    Document   : edit
    Created on : 10/08/2020, 10:51:01 a. m.
    Author     : felip
--%>

<%@page import="ModeloDAO.PersonaDAO"%>
<%@page import="Modelo.Mascota"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="col-lg-6">
                
            <%
                PersonaDAO dao = new PersonaDAO();
                int id = Integer.parseInt((String) request.getAttribute("idper"));
                Mascota m = (Mascota)dao.listMascota(id);
            %>
            <h1>Modificar Persona </h1>
            <form action ="Controlador">
                IdMASCOTA:<br>
                <input class="form-control" type="text" name="txtIdMascota" value="<%= m.getIdMascota() %>"><br>
                Nombres:<br>
                <input class="form-control" type="text" name="txtMascota" value ="<%= m.getMascota() %>"><br>
                Tratamiento:<br>
                <input class="form-control" type="hidden" name="txtid" value="<%= m.getTratamiento()%>"><br>
                
                <input class="btn btn-primary" type="submit" name="accion" value="Actualizar">
                <a href="Controlador?accion=listarMascota">Regresar</a>
            </form>
            </div>      
              
        </div>
    </body>
</html>
