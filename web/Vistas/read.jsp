<%-- 
    Document   : Leer
    Created on : 10/08/2019, 08:18:30 PM
    Author     : Acer
--%>

<%@page import="java.util.Iterator"%>
<%@page import="ModeloDTO.ProveedorDTO"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.ProveedorDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <h1>Proveedores</h1>
            <a class="btn btn-success" href="Controlador?accion=insertar">Agregar Nuevo</a>
            <a class="btn btn-success" href="/webIEFCV/index.jsp"> Regresar</a>
            <br>
            <br>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">NIT</th>
                        <th class="text-center">NOMBRE</th>
                        <th class="text-center">CELULAR</th>
                        <th class="text-center">CORREO</th>
                        <th class="text-center">CIUDAD</th>
                        <th class="text-center">ACCIONES</th>
                    </tr>
                </thead>
                <%
                    ProveedorDAO dao = new ProveedorDAO();
                    List<ProveedorDTO>list=dao.readAll();
                    Iterator<ProveedorDTO>iter=list.iterator();
                    ProveedorDTO obj = null;
                    while (iter.hasNext()) {                            
                            obj = iter.next();
                            
                        
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%=obj.getNit()%></td>
                        <td class="text-center"><%=obj.getNombre()%></td>
                        <td class="text-center"><%=obj.getCelular()%></td>
                        <td class="text-center"><%=obj.getCorreo()%></td>
                        <td class="text-center"><%=obj.getCiudad()%></td>
                        <td>
                            <a class="btn btn-warning" href="Controlador?accion=editar&NIT=<%=obj.getNit()%>">Editar</a>
                            <a class="btn btn-danger" href="Controlador?accion=eliminar&NIT=<%=obj.getNit()%>">Remover</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>

        </div>
    </body>
</html>
