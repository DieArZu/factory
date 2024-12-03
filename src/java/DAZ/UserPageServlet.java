package DAZ;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import java.io.IOException;

@WebServlet(name = "UserPageServlet", urlPatterns = {"/userPage"})


public class UserPageServlet extends HttpServlet {
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
