
<%@page import="java.util.Iterator"%>
<%@page import="ModeloDTO.AnimalDTO"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.AnimalDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Animales</title>
    </head>
    <body>
        <div>
            <h1>Animales</h1>
            <table border="1">
                <thead>
                    <tr>
                        <th>NÚMERO DE HISTORIA</th>
                        <th>NOMBRE</th>
                        <th>TAMANIO</th>
                        <th>ESPECIE</th>
                        <th>TIPO DE PACIENTE</th>
                        <th>SEXO</th>
                        <th>NÚMERO DE IDENTIFICACIÓN DE CLIENTE</th>
                    </tr>
                </thead>
                 <%
                    AnimalDAO dao = new AnimalDAO();
                    List<AnimalDTO>list=dao.readAll();
                    Iterator<AnimalDTO>iter=list.iterator();
                    AnimalDTO obj = null;
                    while (iter.hasNext()) {                            
                            obj = iter.next();                     
                %>
                <tbody>
                    <tr>
                        <td><%=obj.getNum_historia()%></td>
                        <td><%=obj.getNombre()%></td>
                        <td><%=obj.getTamanio()%></td>
                        <td><%=obj.getEspecie()%></td>
                        <td><%=obj.getTipo_paciente()%></td>
                        <td><%=obj.getSexo()%></td>
                        <td><%=obj.getFK_num_ident_cliente()%></td>
                    </tr>
                    <%}%>
                </tbody>
            </table>

        </div>
    </body>
</html>
