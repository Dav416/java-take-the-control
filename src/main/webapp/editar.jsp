<%@page import="logica.Usuarios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Usuario</title>
    </head>
    <body>
        <% Usuarios usu = (Usuarios) request.getSession().getAttribute("usuEditar");%>
        <h1>Editar Usuario</h1>
        <h2>Id #<%=usu.getId_usuario()%></h2>
        <form action="SvEditar" method="POST">
            <p><label for="nombre_usuario">Nombre: </label> <input type="text" id="nombre_usuario" name="nombre_usuario" value="<%=usu.getNombre_usuario()%>"></p>
            <p><label for="nombre_cuenta_usuario">Nombre de usuario: </label> <input type="text" id="nombre_cuenta_usuario" name="nombre_cuenta_usuario" value="<%=usu.getNombre_cuenta_usuario()%>"></p>
            <p><label for="clave_usuario">Contraseña: </label> <input type="text" id="clave_usuario" name="clave_usuario" value="<%=usu.getClave_usuario()%>"></p>
            <p><label for="correo_usuario">Correo: </label> <input type="text" id="correo_usuario" name="correo_usuario" value="<%=usu.getCorreo_usuario()%>"></p>
            <button type="submit">Guardar</button>
        </form>
    </body>
</html>
