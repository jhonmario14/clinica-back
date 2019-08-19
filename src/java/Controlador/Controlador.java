/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.ProveedorDAO;
import ModeloDTO.ProveedorDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Acer
 */
public class Controlador extends HttpServlet {
    
    String insertar ="Vistas/insert.jsp";
    String Actualizar ="Vistas/update.jsp";
    String leer ="Vistas/read.jsp";
    ProveedorDTO proveedorDTO = new ProveedorDTO();
    ProveedorDAO proveedorDAO = new ProveedorDAO();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
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
        if (action.equalsIgnoreCase("leer")) {
            acceso= leer;
        }else if (action.equalsIgnoreCase("insertar")) {
           acceso = insertar;
        }else if (action.equalsIgnoreCase("Agregar")) {
            String nit = request.getParameter("txtNit");
            String nombre = request.getParameter("txtNombre");
            String correo = request.getParameter("txtCorreo");
            String ciudad = request.getParameter("txtCiudad");
            String celular = request.getParameter("txtCelular");
            proveedorDTO.setNit(nit);
            proveedorDTO.setNombre(nombre);
            proveedorDTO.setCorreo(correo);
            proveedorDTO.setCiudad(ciudad);
            proveedorDTO.setCelular(celular);
            proveedorDAO.insert(proveedorDTO);
            acceso = leer;
        }else if (action.equalsIgnoreCase("editar")) {
            request.setAttribute("NIT", request.getParameter("NIT"));
            acceso=Actualizar;
        }else if(action.equalsIgnoreCase("Actualizar")){
            String nit = request.getParameter("accion");
            String nombre = request.getParameter("txtNombre");
            String correo = request.getParameter("txtCorreo");
            String ciudad = request.getParameter("txtCiudad");
            String celular = request.getParameter("txtCelular");
            proveedorDTO.setNit(nit);
            proveedorDTO.setNombre(nombre);
            proveedorDTO.setCorreo(correo);
            proveedorDTO.setCiudad(ciudad);
            proveedorDTO.setCelular(celular);
            proveedorDAO.update(proveedorDTO);
            acceso = leer;
        }else if(action.equalsIgnoreCase("eliminar")){
            String nit = request.getParameter("NIT");
            proveedorDTO.setNit(nit);
            proveedorDAO.delete(nit);
            acceso = leer;
        }
        RequestDispatcher vista = request.getRequestDispatcher(acceso);
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
