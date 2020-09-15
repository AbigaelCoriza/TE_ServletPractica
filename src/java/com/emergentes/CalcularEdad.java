
package com.emergentes;


import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(name = "CalcularEdad", urlPatterns = {"/CalcularEdad"})
public class CalcularEdad extends HttpServlet {
    
       

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
      try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Calcular edad(formularios)</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CalcularEdad</h1>");
            out.println("<br> <br>");
            out.println("<form action ='' method ='post' >");
            out.println("Nombre :");
            out.println("<input type='text' name ='nombre' required>");
            out.println("<br>");
            out.println("Año actual :");
            out.println("<input type='text' name ='actual' required>");
            out.println("<br>");
            out.println("Año de Nacimiento :");
            out.println("<input type='text' name ='año' required>");
            out.println("<br>");
            out.println("<input type ='submit' value ='Enviar'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        
          }finally  {
            out.close();
          }
        }

 @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
         
             throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
 
              try{
             out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
           out.println("<title>Calacular Edad </title>");
           out.println("</head>");
           out.println("<body>");
           out.println("<h1>Los datos recibidos son  </h1>");
      int año= Integer.parseInt(request.getParameter("año"));
      int actual= Integer.parseInt(request.getParameter("actual"));
      out.println(""+actual);
      out.println(" "+año);
      out.println("la edad es : "+(actual-año)+ "");
       int edad=actual-año;
        out.println("la edad es : "+edad );       
    out.println("</body>");
         out.println("</html>");
        }finally {
            out.close();
          }
        }
}
      


  
  


