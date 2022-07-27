
package web;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/miRuta")
public class HolaMundo extends HttpServlet{
    
     @Override
     protected void doGet(HttpServletRequest petision, HttpServletResponse respuesta) throws IOException{
         respuesta.setContentType("text/html;charset=UTF-8");
         PrintWriter salida= respuesta.getWriter();
         salida.println("Aca podria poder todo un codigo HTML,no es recomendable. Hola desde el servlet");
     }
}
