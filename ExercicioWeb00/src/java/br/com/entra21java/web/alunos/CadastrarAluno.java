package br.com.entra21java.web.alunos;

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
@WebServlet("/alunos/cadastrar")
public class CadastrarAluno extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, 
    HttpServletResponse resp) throws ServletException, 
    IOException {
        PrintWriter out = resp.getWriter();
        
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<title>Alunos - Cadastrar</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<div>");
    out.println("<div>");
    out.println("<label for='campo-nome'>Nome <span class='text-danger font-weight-bold'>*</span></label>");
    out.println("<input type='text' id='campo-nome' name='nome'required='required'>");
    out.println("</div>");
    out.println("<div>");
    out.println("<label for='campo-codigo-da-matricula'>Código da Matricula <span class='text-danger font-weight-bold'>*</span></label>");
    out.println("<input type='number' id='campo-codigo-da-matricula' name='codigo-da-matricula' required='required'>");
    out.println("</div>");
    out.println("<div>");
    out.println("<label for='campo-nota-1'>Nota 1 <span class='text danger font-weight-bold'>*</span></label>");
    out.println("<input type='text' id='campo-nota-1' name='nota-1' required='required'>");
    out.println("</div>");
    out.println("<div>");
    out.println("<label for='campo-nota-2'>Nota 2 <span class='text-danger font-weight-bold'>*</span></label>");
    out.println("<input type='text' id='campo-nota-2' name='nota-2' required='required'>");
    out.println("</div>");
    out.println("<div>");
    out.println("<label for='campo-nota-3'>Nota 3 <span class='text-danger font-weight-bold'>*</span></label>");
    out.println("<input type='text' id='campo-nota-3' name='nota-3' required='required'>");
    out.println("</div>");
    out.println("<div>");
    out.println("<label for='campo-frequencia'>Frequência <span class='text-danger font-weight-bold'>*</span></label>");
    out.println("<input type='text' id='campo-frequencia' name='frequencia' required='required'>");
    out.println("</div>");
    out.println("<input class='btn btn-sucess' type='submit' value='Cadastrar'>");
    out.println("</div>");
    out.println("</body>");
    out.println("</html>");
    }
    
}
