/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import ModeloDAO.ClienteDAO;
import ModeloDTO.ClienteDTO;
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
 * @author Juan Camilo
 */

@WebServlet(name = "ControladorCliente", urlPatterns = {"/ControladorCliente"})
public class ControladorCliente extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    String insertar ="Vistas/insertCliente.jsp";
    String Actualizar ="Vistas/updateCliente.jsp";
    String leer ="Vistas/readCliente.jsp";
    ClienteDTO clienteDTO= new ClienteDTO();
    ClienteDAO clienteDAO= new ClienteDAO();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorCliente</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorCliente at " + request.getContextPath() + "</h1>");
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
        String actionCliente=request.getParameter("accionCliente");
        if (actionCliente.equalsIgnoreCase("leer")) {
            acceso= leer;
        }else if (actionCliente.equalsIgnoreCase("insertar")) {
           acceso = insertar;
           
        }else if (actionCliente.equalsIgnoreCase("Agregar")) {
            String tipo_identificacion = request.getParameter("txtTipo_identificacion");
            String num_identificacion = request.getParameter("txtNum_identificacion");
            String nombre = request.getParameter("txtNombre");
            String celular = request.getParameter("txtCelular");
            String correo = request.getParameter("txtCorreo");
            String ciudad = request.getParameter("txtCiudad");
            String tipo_cliente = request.getParameter("txtTipo_cliente");
            clienteDTO.setTipo_identificacion(tipo_identificacion);
            clienteDTO.setNum_identificacion(num_identificacion);
            clienteDTO.setNombre(nombre);
            clienteDTO.setCelular(celular);
            clienteDTO.setCorreo(correo);
            clienteDTO.setCiudad(ciudad);
            clienteDTO.setTipo_cliente(tipo_cliente);
            clienteDAO.insert(clienteDTO);
            acceso = leer;
        }else if (actionCliente.equalsIgnoreCase("editar")) {
            request.setAttribute("Num_identificacion", request.getParameter("Num_identificacion"));
            acceso=Actualizar;
        }else if(actionCliente.equalsIgnoreCase("Actualizar")){
            String num_identificacion = request.getParameter("accion");
            String tipo_identificacion = request.getParameter("txtTipo_identificacion");
            String nombre = request.getParameter("txtNombre");
            String correo = request.getParameter("txtCorreo");
            String ciudad = request.getParameter("txtCiudad");
            String tipo_cliente = request.getParameter("txtTipo_cliente");
            String celular = request.getParameter("txtCelular");
            clienteDTO.setTipo_identificacion(tipo_identificacion);
            clienteDTO.setNombre(nombre);
            clienteDTO.setCorreo(correo);
            clienteDTO.setCiudad(ciudad);
            clienteDTO.setTipo_cliente(tipo_cliente);
            clienteDTO.setNum_identificacion(num_identificacion);
            clienteDTO.setCelular(celular);
            clienteDAO.update(clienteDTO);
            acceso = leer;
        }else if(actionCliente.equalsIgnoreCase("eliminar")){
            String num_identificacion = request.getParameter("Num_identificacion");
            clienteDTO.setNum_identificacion(num_identificacion);
            clienteDAO.delete(num_identificacion);
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
