<%-- 
    Document   : insertProductos
    Created on : 18/08/2019, 04:00:03 PM
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
                <h1>Agregar Productos</h1>
            <form action="ControladorProductos">
                <label>NUMERO DE FACTURA:</label><input class="form-control"  type="text" name="txtNum_factura" ><br>
                <label>NOMBRE COMERCIAL:</label><input class="form-control"  type="text" name="txtNom_comercial" ><br>
                <label>NOMBRE GENERICO:</label><input class="form-control"  type="text" name="txtNom_genereico" ><br>
                <label>CANTIDAD DE PRODUCTOS:</label><input class="form-control"  type="text" name="txtCantidad_producto" ><br>
                <label>CANTIDAD POR PRESENTACION:</label><input class="form-control"  type="text" name="txtCantidad_presentacion" ><br>
                <label>PRECIO POR UNIDAD:</label><input class="form-control" type="text" name="txtPrecio_unidad" ><br>
                <label>DESCRIPCION DEL PRODUCTO:</label><input class="form-control" type="text" name="txtDescripcion" ><br>
                 <label>LOTE:</label><input class="form-control" type="text" name="txtLote" ><br>
                <label>LABORATORIO:</label><input class="form-control"  type="text" name="txtLaboratorio" ><br>
                <label>FORMA FARMACEUTICA:</label><input class="form-control" type="text" name="txtForma_farmaceutica" ><br>
                <label>CONCENTRACION DEL PRODUCTO:</label><input class="form-control"  type="text" name="txtConcentracion" ><br>
                <label>NUMERO DE REGISTRO:</label><input class="form-control"  type="text" name="txtNum_registro" ><br>
                <label>FECHA DE VENCIMIENTO:</label><input class="form-control"  type="text" name="txtFecha_vencimiento" ><br>
                <label>NIT DEL PROVEEDOR:</label><input class="form-control"  type="text" name="txtFk_nit_proveedor"><br>
                <input class="btn btn-primary" type="submit" name="accionProductos" value="Agregar">
                <input class="btn btn-primary" TYPE="button" VALUE="Volver" onClick="history.back()">
            </form>
            </div>
            
        </div>
    </body>
</html>
