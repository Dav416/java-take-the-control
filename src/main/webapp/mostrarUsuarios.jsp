<%@page import="java.util.List"%>
<%@page import="logica.Usuarios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Usuarios</title>
    </head>
    <body>
            <h1>Lista de Usuarios Registrados</h1>
            <%
                List<Usuarios> listaUsuarios = (List) request.getSession().getAttribute("listaUsuarios");
                int count = 1;
                for(Usuarios usu: listaUsuarios){
            %>
                    <h2>Cliente N°<%=count%></h2>
                    <ul>
                        <li>Id: <%=usu.getId_usuario()%></li>
                        <li>Nombre: <%=usu.getNombre_usuario()%></li>
                        <li>Nombre Usuario: <%=usu.getNombre_cuenta_usuario()%></li>
                        <li>Contraseña: <%=usu.getClave_usuario()%></li>
                        <li>Correo: <%=usu.getCorreo_usuario()%></li>
                    </ul>
                    <p>------------------------------------------------------</p>
                    <br>
                    <% count++;%>
            <% } %>
    </body>
</html>
