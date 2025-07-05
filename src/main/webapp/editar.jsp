<%@page import="logica.Usuarios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Editar Usuario</title>
    </head>
    <body>
        <%
            Usuarios usu = (Usuarios) request.getSession().getAttribute("usuEditar");
        %>

        <h1>Editar Usuario</h1>
        <h2>ID #<%= usu.getId_usuario()%></h2>

        <form action="SvEditar" method="POST">
            <p>
                <label for="nombre_usuario">Nombre:</label>
                <input type="text" id="nombre_usuario" name="nombre_usuario" 
                       value="<%= usu.getNombre_usuario()%>" 
                       required minlength="2" maxlength="50">
            </p>

            <p>
                <label for="nombre_cuenta_usuario">Nombre de usuario:</label>
                <input type="text" id="nombre_cuenta_usuario" name="nombre_cuenta_usuario" 
                       value="<%= usu.getNombre_cuenta_usuario()%>" 
                       required pattern="^[a-zA-Z0-9_]{4,20}$"
                       title="Debe tener entre 4 y 20 caracteres alfanuméricos o guión bajo">
            </p>

            <p>
                <label for="clave_usuario">Contraseña:</label>
                <input type="password" id="clave_usuario" name="clave_usuario" 
                       value="<%= usu.getClave_usuario()%>" 
                       required minlength="6" maxlength="20">
            </p>

            <p>
                <label for="correo_usuario">Correo:</label>
                <input type="email" id="correo_usuario" name="correo_usuario" 
                       value="<%= usu.getCorreo_usuario()%>" 
                       required>
            </p>

            <button type="submit">Guardar</button>
        </form>
    </body>
</html>
