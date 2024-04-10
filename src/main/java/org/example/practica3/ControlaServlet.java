package org.example.practica3;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class ControlaServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String redireccion = request.getParameter("redireccion");
        switch (redireccion) {
            case "1":
                RequestDispatcher dispatcher = this.getServletContext().getNamedDispatcher("HelloServlet");
                if (dispatcher != null) dispatcher.forward(request, response);
                break;
            case "2":
                RequestDispatcher crossContextDispatcher = this.getServletContext().getContext("/compras").getNamedDispatcher("LoginServlet");
                if (crossContextDispatcher != null) crossContextDispatcher.forward(request, response);
                break;
            case "3":
                response.sendRedirect("http://www.google.com.ar");
                break;
            default:
                response.sendRedirect("index.jsp");
        }
    }
}