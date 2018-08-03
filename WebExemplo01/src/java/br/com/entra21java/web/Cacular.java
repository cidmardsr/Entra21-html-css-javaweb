package br.com.entra21java.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Alunos
 */
@WebServlet(urlPatterns = "/Calcular")
public class Cacular extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, 
HttpServletResponse resp) throws ServletException, 
IOException {
        
        int numero01 = Integer.parseInt(
                        req.getParameter("numero-01"));
        int numero02 = Integer.parseInt(
                        req.getParameter("numero-02"));
        int soma = numero01 + numero02;
        
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head></head><body>");
        out.println("<h3>A soma é: " + soma + "</h3>");
        out.println("</body></html>");
        
        
    }
    
    
         
}
