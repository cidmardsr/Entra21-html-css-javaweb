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
    out.println("</head>");
    out.println("<body>");
    out.println("<div>");
    
    out.println("<div>");
    out.println("<div>");
    out.println("<h3></h3>");
    out.println("</div>");
    out.println("</div>");
    
    out.println("<div>");
    out.println("<div>");
    out.println("<a href=''></a>");
    out.println("</div>");
    out.println("</div>");
    
    gerarTabela(alunos);
    
    out.println("</div>");
    out.println("</body>");
    out.println("</html>");
    }

    private void gerarTabela(List<AlunoBean> alunos) {
        
    }
    
    
}
