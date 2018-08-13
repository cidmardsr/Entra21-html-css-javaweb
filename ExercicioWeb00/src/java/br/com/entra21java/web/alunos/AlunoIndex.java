package br.com.entra21java.web.alunos;

import br.com.entra21java.bean.AlunoBean;
import br.com.entra21java.dao.AlunoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Alunos
 */
@WebServlet("/alunos")
public class AlunoIndex extends HttpServlet{
    private PrintWriter out;

    @Override
    protected void doGet(HttpServletRequest req, 
    HttpServletResponse resp) throws ServletException, 
    IOException {
        List<AlunoBean> alunos = new AlunoDAO().obterTodos();
        
    out = resp.getWriter();
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<title>Lista - Alunos</title>");
    out.println("<link rel='stylesheet' type='text/css' href='bootstrap/css/bootstrap.css'/>");
    out.print("<link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.2.0/css/all.css' integrity='sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ' crossorigin='anonymous'>");
    out.println("</head>");
    out.println("<body>");
    out.println("<div class='cotainer-fluid'>");
    
    out.println("<div class='row-3'>");
    out.println("<div class='col-md-12>");
    out.println("<h3 class='text-center'>Alunos</h3>");
    out.println("</div>");
    out.println("</div>");
    
    out.println("<div class='row'>");
    out.println("<div class='col-md-2 offset-md-10'>");
    out.println("<a href='/ExercicioWeb00/aluno/cadastrar' class'btn btn-primary float-right'><i class='fa fa-plus-square'></i>Novo Aluno</a>");
    out.println("</div>");
    out.println("</div>");
    
    gerarTabela(alunos);
    
    out.println("</div>");
    out.println("</body>");
    out.println("</html>");
    }

    private void gerarTabela(List<AlunoBean> alunos) {
        out.print("<div class='row-mt-1'>");
        out.print("<div class='col-md-8'>");
        out.print("<table class='table table-striped table hover'>");
        out.print("<thead>");
        out.print("<tr class='table-primary'>");
        out.print("<th>Nome</th>");
        out.println("<th>Código da Matrícula</th>");
        out.println("<th>Nota 1</th>");
        out.print("<th>Nota 2</th>");
        out.print("<th>Nota 3</th>");
        out.println("<th>Ação</th>");
        out.print("</tr>");
        out.print("</thead>");
        out.println("<tbody>");
        
        for(AlunoBean aluno : alunos){
        out.println("<td>" + aluno.getNome() + "</td>");
        out.print("<td>" + aluno.getCodigo_da_matricula() + "</td>");
        out.println("<td>" + aluno.getNota_1() + "</td>");
        out.println("<td>" + aluno.getNota_2() + "</td>");
        out.println("<td>" + aluno.getNota_3() + "</td>");
        out.println("<td>");
        out.print("<a href='/ExercicioWeb00/alunos/edtar?id=" + aluno.getId() + 
                "' class='btn btn-outline-success'><i class='fa fa-edit></i>Editar</a>");
        out.print("<a href='/ExercicioWeb00/aluos/excluir?id=" + aluno.getId() + "' class='botao-excluir'>Excluir</a>");
        
        out.print("</td>");
        out.print("</tr>");
        }
        
        out.print("</tbody>");
        out.print("<tfoot>");
        out.println("<tr>");
        out.println("<th>Nome</th>");
        out.println("<th>Código da Matrícula</th>");
        out.println("<th>Nota 1</th>");
        out.println("<th>Nota 2</th>");
        out.println("<th>Nota 3</th>");
        out.println("<th>Ação<th>");
        
        out.print("</tr>");
        out.println("</tfoot>");
        out.println("</table>");
        out.println("</div>");
        out.print("</div>");
    }
    
    
}
