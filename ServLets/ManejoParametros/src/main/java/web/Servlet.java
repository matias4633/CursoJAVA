package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //Primero leo lo paramaetros del formulario.
        String usuario = req.getParameter("usuario");
        String password = req.getParameter("password");

        System.out.println("usuario = " + usuario);//Esto va a la consola de glassfish.
        System.out.println("password = " + password);

        PrintWriter out = resp.getWriter(); //Esto se imprime como respuesta al cliente.
        out.print("<html>");
        out.print("<body>");
        out.print("El parametro usuario es: " + usuario);
        out.print("<br/>");
        out.print("El parametro password es: " + password);
        out.print("<br/>");
        out.print("</body>");
        out.print("</html>");
    }
}
