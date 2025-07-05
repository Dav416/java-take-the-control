<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Formulario de usuario</title>
</head>
<body>
    <h1>Crear Usuario</h1>
    <form action="SvUsuarios" method="POST">
        <p>
            <label for="nombre_usuario">Nombre:</label>
            <input type="text" id="nombre_usuario" name="nombre_usuario" required minlength="2" maxlength="50">
        </p>
        <p>
            <label for="nombre_cuenta_usuario">Nombre de usuario:</label>
            <input type="text" id="nombre_cuenta_usuario" name="nombre_cuenta_usuario" required pattern="^[a-zA-Z0-9_]{4,20}$" 
                   title="Entre 4 y 20 caracteres alfanuméricos o guión bajo">
        </p>
        <p>
            <label for="clave_usuario">Contraseña:</label>
            <input type="password" id="clave_usuario" name="clave_usuario" required minlength="6" maxlength="20">
        </p>
        <p>
            <label for="correo_usuario">Correo:</label>
            <input type="email" id="correo_usuario" name="correo_usuario" required>
        </p>
        <button type="submit">Enviar</button>
    </form>

    <h1>Listar Usuarios</h1>
    <p>Para ver los datos de los usuarios cargados presione el siguiente botón</p>
    <form action="SvUsuarios" method="GET">
        <button type="submit">Mostrar Usuarios</button>
    </form>

    <h1>Editar Usuario</h1>
    <p>Ingrese el ID del usuario a editar</p>
    <form action="SvEditar" method="GET">
        <p>
            <label for="id_usuario_edit">ID:</label>
            <input type="number" id="id_usuario_edit" name="id_usuario_edit" min="1" required>
        </p>
        <button type="submit">Editar Usuario</button>
    </form>

    <h1>Eliminar Usuario</h1>
    <p>Ingrese el ID del usuario a eliminar</p>
    <form action="SvEliminar" method="POST">
        <p>
            <label for="id_usuario">ID:</label>
            <input type="number" id="id_usuario" name="id_usuario" min="1" required>
        </p>
        <button type="submit">Eliminar Usuario</button>
    </form>
</body>
</html>
