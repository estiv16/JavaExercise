package Controlador;

import Modelo.Mascota;
import Modelo.Persona;
import ModeloDAO.PersonaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author felip
 */
@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {
    String index = "index.jsp";
    String listar = "vistas/listar.jsp";
    String add="vistas/add.jsp";
    String edit ="vistas/edit.jsp";
    Persona p = new Persona();
    PersonaDAO dao=new PersonaDAO();
    
    String listarMascota = "vistas/listarMascota.jsp";
    String addMascota="vistas/addMascota.jsp";
    String editMascota ="vistas/editMascota.jsp";
    Mascota m = new Mascota();
    
    String listarTodo ="vistas/listarTodo.jsp";
    
    int id;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acceso="";
        String action=request.getParameter("accion");
        if(action.equalsIgnoreCase("index")){
            acceso=index;
        }else if(action.equalsIgnoreCase("listar")){
            acceso=listar;
        }else if(action.equalsIgnoreCase("add")){
            acceso=add;                
        }else if(action.equalsIgnoreCase("Agregar")){ ////////////////////
            String dni=request.getParameter("txtDni");
            String nom=request.getParameter("txtNom");
            p.setDni(dni);
            p.setNombre(nom);
            dao.add(p);
            acceso=listar;         
        }else if(action.equalsIgnoreCase("editar")){
            request.setAttribute("idper", request.getParameter("id"));
            acceso=edit;
        }else if(action.equalsIgnoreCase("Actualizar")){
            id=Integer.parseInt(request.getParameter("txtid"));
            String dni=request.getParameter("txtDni");
            String nom=request.getParameter("txtNom");
            p.setId(id);
            p.setDni(dni);
            p.setNombre(nom);
            dao.edit(p);
            acceso=listar;            
        }else if(action.equalsIgnoreCase("eliminar")){
            id=Integer.parseInt(request.getParameter("id"));
            p.setId(id);
            dao.eliminar(id);
            acceso=listar;
        }else if(action.equalsIgnoreCase("listarMascota")){
            acceso=listarMascota;
        }else if(action.equalsIgnoreCase("addMascota")){
            acceso=addMascota;                
        }else if(action.equalsIgnoreCase("AgregarMascota")){
            int id=Integer.parseInt((String)request.getParameter("txtIdMascota").toString());
            String mascota=request.getParameter("txtMascota");
            String tratamiento=request.getParameter("txtTratamiento");
            m.setIdMascota(id);
            m.setMascota(mascota);
            m.setTratamiento(tratamiento);
            dao.addMascota(m);
            acceso=listarMascota;            
        }else if(action.equalsIgnoreCase("editarMascota")){
            request.setAttribute("IdMascota", request.getParameter("id"));
            acceso=editMascota;
        }else if(action.equalsIgnoreCase("ActualizarMascota")){
            id=Integer.parseInt(request.getParameter("txtIdMascota"));
            String mascota=request.getParameter("txtMascota");
            String tratamiento=request.getParameter("txtTratamiento");
            m.setIdMascota(id);
            m.setMascota(mascota);
            m.setTratamiento(tratamiento);
            dao.editMascota(m);
            acceso=listarMascota;            
        }else if(action.equalsIgnoreCase("eliminarMascota")){
            int id=Integer.parseInt((String)request.getParameter("id").toString());
            m.setIdMascota(id);
            dao.eliminarMascota(id);
            acceso=listarMascota;
        }else if(action.equalsIgnoreCase("listarTodo")){
            acceso=listarTodo;
        }
        RequestDispatcher vista=request.getRequestDispatcher(acceso);
        vista.forward(request, response);
       
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
