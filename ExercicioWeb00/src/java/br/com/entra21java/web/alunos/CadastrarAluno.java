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
    out.println("link rel='stylesheet' type='text/css' href='/ExercicioWeb00/bootstrap/css/bootstrap.css'>");
    out.print("<script src='/Exercicioweb00/cadastrar-alunos.js'></script>");
    out.println("</head>");
    out.println("<body>");
    out.println("<div class='container-fluid'>");
    out.print("<form action ='/ExercicioWeb00/alunos/store' method='post' onsubmit='validarFormulario()'>");
    out.println("<div id='div-campo-nome class='form-group'>");
    out.println("<label for='campo-nome'>Nome <span class='text-danger font-weight-bold'>*</span></label>");
    out.println("<input type='text' id='campo-nome' name='nome'required='required'>");
    out.println("</div>");
    out.println("<div id='div-campo-codigo-da-matricula' class='form-group'>");
    out.println("<label for='campo-codigo-da-matricula'>Código da Matrícula <span class='text-danger font-weight-bold'>*</span></label>");
    out.println("<input type='number' id='campo-codigo-da-matricula' name='codigo-da-matricula' required='required'>");
    out.println("</div>");
    out.println("<div id='div-campo-nota-1' class='form-group'>");
    out.println("<label for='campo-nota-1'>Nota 1 <span class='text danger font-weight-bold'>*</span></label>");
    out.println("<input type='text' id='campo-nota-1' name='nota-1' required='required'>");
    out.println("</div>");
    out.println("<div id='div-campo-nota-2' class='form-group'>");
    out.println("<label for='campo-nota-2'>Nota 2 <span class='text-danger font-weight-bold'>*</span></label>");
    out.println("<input type='text' id='campo-nota-2' name='nota-2' required='required'>");
    out.println("</div>");
    out.println("<div id='div-campo-nota-3' class='form-group'>");
    out.println("<label for='campo-nota-3'>Nota 3 <span class='text-danger font-weight-bold'>*</span></label>");
    out.println("<input type='text' id='campo-nota-3' name='nota-3' required='required'>");
    out.println("</div>");
    out.println("<div id='div-campo-frequencia' class='form-group'>");
    out.println("<label for='campo-frequencia'>Frequência <span class='text-danger font-weight-bold'>*</span></label>");
    out.println("<input type='text' id='campo-frequencia' name='frequencia' required='required'>");
    out.println("</div>");
    out.println("<input class='btn btn-sucess' type='submit' value='Cadastrar'>");
    out.println("</div>");
    out.println("</body>");
    out.println("</html>");
    }
    
}
