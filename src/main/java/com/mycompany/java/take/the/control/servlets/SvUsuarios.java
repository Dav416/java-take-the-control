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
import logica.Usuario;

@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Usuario("Camila", "Cami44", "cami@44", "camilahrnz@outlook.com"));
        listaUsuarios.add(new Usuario("Pablo", "Pablito12", "pabloaccess123", "pablito12@outlook.com"));
        listaUsuarios.add(new Usuario("Alejandro", "Alejo26", "alejo001232*", "alejo26@outlook.com"));
        
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
            
            System.out.println("Nombre: " + nombre_usuario);
            System.out.println("Nombre usuario: " + nombre_cuenta_usuario);
            System.out.println("Contraseña: " + clave_usuario);
            System.out.println("Correo: " + correo_usuario);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
