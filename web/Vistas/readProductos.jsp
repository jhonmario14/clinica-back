
<%@page import="java.util.Iterator"%>
<%@page import="ModeloDTO.ProductoDTO"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.ProductoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Productos</title>
    </head>
    <body>
        <div class="container">
            <h1>Productos</h1>
            <a class="btn btn-success" href="ControladorProductos?accionProductos=insertar">Agregar Nuevo</a>
            <a class="btn btn-success" href="/webIEFCV/index.jsp"> Regresar</a>
            <br>
            <br>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">ID</th>
                        <th class="text-center">NÚMERO FACTURA DE REMISIÓN</th>
                        <th class="text-center">NOMBRE COMERCIAL</th>
                        <th class="text-center">NOMBRE GENÉRICO</th>
                        <th class="text-center">CANTIDAD DE PRODUCTOS</th>
                        <th class="text-center">CANTIDAD DE PRESENTACIÓN</th>
                        <th class="text-center">PRECIO X UNIDAD</th>
                        <th class="text-center">DESCRIPCIÓN</th>
                        <th class="text-center">LOTE</th>
                        <th class="text-center">LABORATORIO</th>
                        <th class="text-center">FORMA FARMACEUTICA</th>
                        <th class="text-center">CONCENTRACIÓN</th>
                        <th class="text-center">NÚMERO REGISTRO INVIMA</th>
                        <th class="text-center">FECHA DE VENCIMIENTO</th>
                        <th class="text-center">NIT PROVEEDOR</th>
                    </tr>
                </thead>
                <%
                    ProductoDAO dao = new ProductoDAO();
                    List<ProductoDTO>list=dao.readAll();
                    Iterator<ProductoDTO>iter=list.iterator();
                    ProductoDTO obj = null;
                    while (iter.hasNext()) {                            
                            obj = iter.next();                     
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%=obj.getId()%></td>
                        <td class="text-center"><%=obj.getNum_factura_remision()%></td>
                        <td class="text-center"><%=obj.getNom_comercial()%></td>
                        <td class="text-center"><%=obj.getNom_generico()%></td>
                        <td class="text-center"><%=obj.getCantidad_producto()%></td>
                        <td class="text-center"><%=obj.getCantidad_presentacion()%></td>
                        <td class="text-center"><%=obj.getPrecio_unidad()%></td>
                        <td class="text-center"><%=obj.getDescripcion()%></td>
                        <td class="text-center"><%=obj.getLote()%></td>
                        <td class="text-center"><%=obj.getLaboratorio()%></td>
                        <td class="text-center"><%=obj.getForma_farmaceutica()%></td>
                        <td class="text-center"><%=obj.getConcentracion()%></td>
                        <td class="text-center"><%=obj.getNum_registro_ICA_INVIMA()%></td>
                        <td class="text-center"><%=obj.getFecha_vencimiento()%></td>
                        <td class="text-center"><%=obj.getFK_nit_Proveedor()%></td>                       
                    </tr>
                    <%}%>
                </tbody>
            </table>

   
           
        </div>
       
    </body>
</html>
