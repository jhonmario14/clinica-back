<%-- 
    Document   : Insertar
    Created on : 10/08/2019, 08:18:03 PM
    Author     : Acer
--%>

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
            <div class="col-lg-8">
                <h1>Agregar Proveedor</h1>
                <form action="Controlador">
                    <label>NIT:</label><input class="form-control" type="text" name="txtNit" ><br>
                    <label>NOMBRE:</label><input class="form-control" type="text" name="txtNombre" ><br>
                    <label>CELULAR:</label><input class="form-control" type="text" name="txtCelular" ><br>
                    <label>CORREO:</label><input class="form-control" type="text" name="txtCorreo" ><br>
                    <label>CIUDAD:</label><input class="form-control" type="text" name="txtCiudad" ><br>
                    <input class="btn btn-primary" type="submit" name="accion" value="Agregar">
                    <INPUT class="btn btn-primary" TYPE="button" VALUE="Volver" onClick="history.back()">
                   
                    <!--<a class="btn btn-success" href="/webIEFCV/Vistas/read.jsp">Regresar</a>-->
                </form>
            </div>
        </div>
    </body>
</html>
