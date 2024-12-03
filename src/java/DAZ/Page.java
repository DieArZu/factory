package DAZ;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Page {
    /**
     * Método para obtener el contenido HTML de la página.
     * @return String con el contenido HTML.
     */
    String getPageContent();
}
