<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario de usuario</title>
    </head>
    <body>
        <h1>Datos del Usuario</h1>
        <form action="SvUsuarios" method="POST">
            <p><label for="nombre_usuario">Nombre: </label> <input type="text" id="nombre_usuario" name="nombre_usuario"></p>
            <p><label for="nombre_cuenta_usuario">Nombre de usuario: </label> <input type="text" id="nombre_cuenta_usuario" name="nombre_cuenta_usuario"></p>
            <p><label for="clave_usuario">Contraseña: </label> <input type="text" id="clave_usuario" name="clave_usuario"></p>
            <p><label for="correo_usuario">Correo: </label> <input type="text" id="correo_usuario" name="correo_usuario"></p>
            <button type="submit">Enviar</button>
        </form>
        
        <h1>Ver lista de usuarios</h1>
        <p>Para ver los datos de los usuarios cargados presione el siguiente botón</p>
        <form action="SvUsuarios" method="GET">
            <button type="submit">Mostrar Usuarios</button>
        </form>
        
    </body>
</html>
