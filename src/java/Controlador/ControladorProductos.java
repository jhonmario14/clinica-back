/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.ProductoDAO;
import ModeloDTO.ProductoDTO;
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
 * @author Mario
 */
@WebServlet(name = "ControladorProductos", urlPatterns = {"/ControladorProductos"})
public class ControladorProductos extends HttpServlet {

    String insertar ="Vistas/insertProductos.jsp";
    String Actualizar ="Vistas/updateProductos.jsp";
    String leer ="Vistas/readProductos.jsp";
    ProductoDTO productoDTO= new ProductoDTO();
    ProductoDAO productoDAO= new ProductoDAO();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorProductos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorProductos at " + request.getContextPath() + "</h1>");
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
        String actionProductos=request.getParameter("accionProductos");
        if (actionProductos.equalsIgnoreCase("leer")) {
            acceso= leer;
        }else if (actionProductos.equalsIgnoreCase("insertar")) {
           acceso = insertar;
        }else if (actionProductos.equalsIgnoreCase("Agregar")) {
            //int id = Integer.parseInt(request.getParameter("txtId"));
            int num_factura = Integer.parseInt(request.getParameter("txtNum_factura"));
            String nom_comercial = request.getParameter("txtNom_comercial");
            String nom_generecio = request.getParameter("txtNom_genereico");
            int cantidad_producto = Integer.parseInt(request.getParameter("txtCantidad_producto"));
            int cantidad_presentacion = Integer.parseInt(request.getParameter("txtCantidad_presentacion"));
            int precio_unidad = Integer.parseInt(request.getParameter("txtPrecio_unidad"));
            String descripcion = request.getParameter("txtDescripcion");
            String lote = request.getParameter("txtLote");
            String laboratorio = request.getParameter("txtLaboratorio");
            String forma_farmaceutica = request.getParameter("txtForma_farmaceutica");
            String concentracion = request.getParameter("txtConcentracion");
            String num_registro = request.getParameter("txtNum_registro");
            String fecha_vencimiento = request.getParameter("txtFecha_vencimiento");
            String fk_nit_proveedor = request.getParameter("txtFk_nit_proveedor");
            //productoDTO.setId(id);
            productoDTO.setNum_factura_remision(num_factura);
            productoDTO.setNom_comercial(nom_comercial);
            productoDTO.setNom_generico(nom_generecio);
            productoDTO.setCantidad_producto(cantidad_producto);
            productoDTO.setCantidad_presentacion(cantidad_presentacion);
            productoDTO.setPrecio_unidad(precio_unidad);
            productoDTO.setDescripcion(descripcion);
            productoDTO.setLote(lote);
            productoDTO.setLaboratorio(laboratorio);
            productoDTO.setForma_farmaceutica(forma_farmaceutica);
            productoDTO.setConcentracion(concentracion);
            productoDTO.setNum_registro_ICA_INVIMA(num_registro);
            productoDTO.setFecha_vencimiento(fecha_vencimiento);
            productoDTO.setFK_nit_Proveedor(fk_nit_proveedor);
            productoDAO.insert(productoDTO);
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
