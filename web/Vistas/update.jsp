<%-- 
    Document   : Editar
    Created on : 10/08/2019, 08:16:58 PM
    Author     : Acer
--%>

<%@page import="ModeloDTO.ProveedorDTO"%>
<%@page import="ModeloDAO.ProveedorDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <%
                ProveedorDAO proveedorDAO = new ProveedorDAO();
                Object nit = request.getAttribute("NIT");
                ProveedorDTO proveedorDTO = (ProveedorDTO)proveedorDAO.read(nit);
            %>
            <h1>Modificar Proveedor</h1>
            <form action="Controlador">
                <label>NOMBRE:</label><input type="text" name="txtNombre" value="<%=proveedorDTO.getNombre()%>"><br>
                <label>CELULAR:</label><input type="text" name="txtCelular" value="<%=proveedorDTO.getCelular()%>"><br>
                <label>CORREO:</label><input type="text" name="txtCorreo" value="<%=proveedorDTO.getCorreo()%>"><br>
                <label>CIUDAD:</label><input type="text" name="txtCiudad" value="<%=proveedorDTO.getCiudad()%>"><br>
                <input type="hidden" name="accion" value="<%=proveedorDTO.getNit()%>"><br>
                <input type="submit" name="accion" value="Actualizar"><br>
            </form>
        </div>
    </body>
</html>
