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



public class PageFactory {
    public static Page getPage(String userType) {
        if (userType == null) {
            throw new IllegalArgumentException("El tipo de usuario no puede ser nulo.");
        }

        switch (userType.toLowerCase()) {
            case "admin":
                return new AdminPage();
            case "regular":
                return new RegularUserPage();
            default:
                throw new IllegalArgumentException("Tipo de usuario no soportado: " + userType);
        }
    }
}
