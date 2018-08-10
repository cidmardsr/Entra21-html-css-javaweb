package br.com.entra21java.web.alunos;

import br.com.entra21java.dao.AlunoDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Alunos
 */
@WebServlet("/alunos/excluir")
public class ExcluirAluno extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, 
    HttpServletResponse resp) throws ServletException, 
    IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        boolean excluiu = new AlunoDAO().excluir(id);
        
        if(excluiu){
            resp.getWriter().print("Dados excluidos com sucesso");
        }else{
            resp.getWriter().print("Não foi possível excluir os dados do aluno");
        }
    }
    
}
