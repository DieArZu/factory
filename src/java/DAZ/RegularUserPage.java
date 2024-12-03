package DAZ;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegularUserPage implements Page {
    @Override
    public String getPageContent() {
        return "<html><body>" +
               "<h1>Bienvenido Usuario</h1>" +
               "<p>Esta es la página para usuarios regulares.</p>" +
               "</body></html>";
    }
}
