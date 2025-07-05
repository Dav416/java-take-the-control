package com.mycompany.java.take.the.control.servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import logica.Controladora;
import logica.Usuarios;

@WebServlet(name = "SvEditar", urlPatterns = {"/SvEditar"})
public class SvEditar extends HttpServlet {

    Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id_editar = Integer.parseInt(request.getParameter("id_usuario_edit"));
        Usuarios usu = control.traerUsuario(id_editar);

        if (usu == null) {
            // Usuario no encontrado, redirigir a página de error o mostrar mensaje
            request.setAttribute("mensaje_error", "El usuario con ID " + id_editar + " no existe.");
            request.getRequestDispatcher("error_usuario.jsp").forward(request, response);
            return;
        }

        HttpSession misesion = request.getSession();
        misesion.setAttribute("usuEditar", usu);

        response.sendRedirect("editar.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Usuarios usu = (Usuarios) request.getSession().getAttribute("usuEditar");

        if (usu == null) {
            response.sendRedirect("error_usuario.jsp");
            return;
        }

        String nombre_usuario = request.getParameter("nombre_usuario");
        String nombre_cuenta_usuario = request.getParameter("nombre_cuenta_usuario");
        String clave_usuario = request.getParameter("clave_usuario");
        String correo_usuario = request.getParameter("correo_usuario");

        usu.setNombre_usuario(nombre_usuario);
        usu.setNombre_cuenta_usuario(nombre_cuenta_usuario);
        usu.setClave_usuario(clave_usuario);
        usu.setCorreo_usuario(correo_usuario);

        control.editarUsuario(usu);

        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
