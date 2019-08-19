<%-- 
    Document   : insertCliente
    Created on : 18/08/2019, 02:33:16 AM
    Author     : Juan Camilo
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
                <h1>Agregar Cliente</h1>
            <form action="ControladorCliente">
                <label>TIPO DE IDENTIFICACION:</label><input class="form-control" type="text" name="txtTipo_identificacion" ><br>
                <label>NUMERO DE IDENTIFICACION:</label><input class="form-control" type="text" name="txtNum_identificacion" ><br>
                <label>NOMBRE:</label><input class="form-control" type="text" name="txtNombre" ><br>
                <label>CELULAR:</label><input class="form-control" type="text" name="txtCelular" ><br>
                <label>CORREO:</label><input class="form-control" type="text" name="txtCorreo" ><br>
                <label>CIUDAD:</label><input class="form-control" type="text" name="txtCiudad" ><br>
                <label>TIPO CLIENTE:</label><input class="form-control" type="text" name="txtTipo_cliente" ><br>
                <input class="btn btn-primary" type="submit" name="accionCliente" value="Agregar">
                <input class="btn btn-primary" TYPE="button" VALUE="Volver" onClick="history.back()">

            </form>
            </div>
            
        </div>
    </body>
</html>
