<%-- 
    Document   : updateCliente
    Created on : 18/08/2019, 02:32:40 AM
    Author     : Juan Camilo
--%>

<%@page import="ModeloDTO.ClienteDTO"%>
<%@page import="ModeloDAO.ClienteDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            ClienteDAO clienteDAO = new ClienteDAO();
            Object num_identificacion = request.getAttribute("Num_identificacion");
            ClienteDTO clienteDTO = (ClienteDTO)clienteDAO.read(num_identificacion);
        %>
        <h1>Modificar Proveedor</h1>
            <form action="ControladorCliente">
                <label>TIPO DE IDENTIFICACION:</label><input type="text" name="txtTipo_identificacion" ><br>
                <label>NOMBRE:</label><input type="text" name="txtNombre" value="<%=clienteDTO.getNombre()%>"><br>
                <label>CELULAR:</label><input type="text" name="txtCelular" value="<%=clienteDTO.getCelular()%>"><br>
                <label>CORREO:</label><input type="text" name="txtCorreo" value="<%=clienteDTO.getCorreo()%>"><br>
                <label>CIUDAD:</label><input type="text" name="txtCiudad" value="<%=clienteDTO.getCiudad()%>"><br>
                <label>TIPO CLIENTE:</label><input type="text" name="txtTipo_cliente" ><br>
                <input type="hidden" name="Num_identificacion" value="<%=clienteDTO.getNum_identificacion()%>"><br>
                <input type="submit" name="accionCliente" value="Actualizar"><br>
            </form>
    </body>
</html>
