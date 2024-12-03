/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package DAZ;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author diego
 */
@WebServlet(name = "a", urlPatterns = {"/a"})



public class a extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Configurar el tipo de contenido como HTML
        response.setContentType("text/html");

        // Obtener el parámetro "userType" de la URL
        String userType = request.getParameter("userType");

        try {
            // Usar la fábrica para obtener la página correcta
            Page page = PageFactory.getPage(userType);

            // Escribir el contenido de la página en la respuesta
            response.getWriter().write(page.getPageContent());
        } catch (IllegalArgumentException e) {
            // Manejar errores (tipo de usuario no válido)
            response.getWriter().write("<html><body>" +
                                       "<h1>Error</h1>" +
                                       "<p>" + e.getMessage() + "</p>" +
                                       "</body></html>");
        }
    }
}
