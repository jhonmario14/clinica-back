<%-- 
    Document   : readCliente
    Created on : 18/08/2019, 02:32:27 AM
    Author     : Juan Camilo
--%>

<%@page import="java.util.Iterator"%>
<%@page import="ModeloDTO.ClienteDTO"%>
<%@page import="ModeloDTO.ClienteDTO"%>
<%@page import="ModeloDAO.ClienteDAO"%>
<%@page import="java.util.List"%>
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
                <h1>Clientes</h1>
            <a class="btn btn-success"  href="ControladorCliente?accionCliente=insertar">Agregar Nuevo</a>
            <a class="btn btn-success"  href="/webIEFCV/index.jsp"> Regresar</a>
             <br>
            <br>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">TIPO DE IDENTIFICACION</th>
                        <th class="text-center">NUMERO DE IDENTIFICACION</th>
                        <th class="text-center">NOMBRE</th>
                        <th class="text-center">CORREO</th>
                        <th class="text-center">CIUDAD</th>
                        <th class="text-center">CELULAR</th>
                        <th class="text-center">TIPO CLIENTE</th>
                        <th class="text-center">ACCIONES</th>
                    </tr>
                </thead>
                <%
                    ClienteDAO dao = new ClienteDAO();
                    List<ClienteDTO>list=dao.readAll();
                    Iterator<ClienteDTO>iter=list.iterator();
                    ClienteDTO obj = null;
                    while (iter.hasNext()) {                            
                            obj = iter.next();      
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%=obj.getTipo_identificacion()%></td>
                        <td class="text-center"><%=obj.getNum_identificacion()%></td>
                        <td class="text-center"><%=obj.getNombre()%></td>
                        <td class="text-center"><%=obj.getCorreo()%></td>
                        <td class="text-center"><%=obj.getCiudad()%></td>
                        <td class="text-center"><%=obj.getCelular()%></td>
                        <td class="text-center"><%=obj.getTipo_cliente()%></td>
                        <td class="text-center">
                            <a class="btn btn-warning" href="Controlador?accionCliente=editar&Num_identificacion=<%=obj.getNum_identificacion()%>">Editar</a>
                            <a class="btn btn-danger"href="Controlador?accionCliente=eliminar&Num_identificacion=<%=obj.getNum_identificacion()%>">Remover</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
            </div>
        </div>
       
    </body>
</html>
