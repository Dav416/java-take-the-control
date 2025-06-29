package com.mycompany.java.take.the.control.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import logica.Controladora;
import logica.Usuarios;

@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {
Controladora control = new Controladora();
    
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Usuarios> listaUsuarios = new ArrayList<>();
        listaUsuarios = control.traerUsuarios();
        
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaUsuarios", listaUsuarios);
        
        response.sendRedirect("mostrarUsuarios.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre_usuario = request.getParameter("nombre_usuario");
        String nombre_cuenta_usuario = request.getParameter("nombre_cuenta_usuario");
        String clave_usuario = request.getParameter("clave_usuario");
        String correo_usuario = request.getParameter("correo_usuario");

        Usuarios usu = new Usuarios();
        
        usu.setNombre_usuario(nombre_usuario);
        usu.setNombre_cuenta_usuario(nombre_cuenta_usuario);
        usu.setClave_usuario(clave_usuario);
        usu.setCorreo_usuario(correo_usuario);
        
        control.crearUsuario(usu);
        
        response.sendRedirect("index.jsp");

    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
