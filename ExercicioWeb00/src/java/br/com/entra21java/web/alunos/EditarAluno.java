package br.com.entra21java.web.alunos;

import br.com.entra21java.bean.AlunoBean;
import br.com.entra21java.dao.AlunoDAO;
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
@WebServlet("/alunos/editar")
public class EditarAluno extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, 
    HttpServletResponse resp) throws ServletException, 
    IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        AlunoBean aluno = new AlunoDAO().obterPeloId(id);
        
        
        PrintWriter out = resp.getWriter();
        
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<title>Alunos - Editar</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<form action='/ExercicioWeb00/alunos/update' method='post'>");
    out.println("<input type='hidden' name='id' value='" + aluno.getId() + "'>");
    out.println("<div>");
    out.println("<label for='campo-nome'>Nome <span class='text-danger font-weight-bold'>*</span></label>");
    out.println("<input type='text' id='campo-nome' name='nome' value='" + aluno.getNome() + "'>");
    out.println("</div>");
    out.println("<div>");
    out.println("<label for='campo-codigo-da-matricula'>Código da Matricula <span class='text-danger font-weight-bold'>*</span></label>");
    out.println("<input type='number' id='campo-codigo-da-matricula' name='codigo-da-matricula' value='" + aluno.getCodigo_da_matricula() + "'>");
    out.println("</div>");
    out.println("<div>");
    out.println("<label for='campo-nota-1'>Nota 1 <span class='text danger font-weight-bold'>*</span></label>");
    out.println("<input type='text' id='campo-nota-1' name='nota-1' value='" + aluno.getNota_1() + "'>");
    out.println("</div>");
    out.println("<div>");
    out.println("<label for='campo-nota-2'>Nota 2 <span class='text-danger font-weight-bold'>*</span></label>");
    out.println("<input type='text' id='campo-nota-2' name='nota-2' value='" + aluno.getNota_2() + "'>");
    out.println("</div>");
    out.println("<div>");
    out.println("<label for='campo-nota-3'>Nota 3 <span class='text-danger font-weight-bold'>*</span></label>");
    out.println("<input type='text' id='campo-nota-3' name='nota-3' value='" + aluno.getNota_3() + "'>");
    out.println("</div>");
    out.println("<div>");
    out.println("<label for='campo-frequencia'>Frequência <span class='text-danger font-weight-bold'>*</span></label>");
    out.println("<input type='text' id='campo-frequencia' name='frequencia' value='" + aluno.getFrequencia() +  "'>");
    out.println("</div>");
    out.println("<input type='submit' value='Alterar'>");
    out.print("</form>");
    out.println("</body>");
    out.println("</html>");
    }
    
    
}
