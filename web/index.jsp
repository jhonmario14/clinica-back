<%-- 
    Document   : index
    Created on : 10/08/2019, 08:58:43 PM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <br>
        <br>
        <div class="container">
            <a class="btn btn-success btn-lg" href="Controlador?accion=leer">Listar Proveedores</a>
            <a class="btn btn-success btn-lg" href="ControladorCliente?accionCliente=leer">Listar Clientes</a>
            <a class="btn btn-success btn-lg" href="ControladorProductos?accionProductos=leer">Listar Productos</a>
        </div>
    </body>
</html>
