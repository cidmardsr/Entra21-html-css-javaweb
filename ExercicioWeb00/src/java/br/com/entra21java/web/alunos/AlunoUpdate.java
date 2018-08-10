package br.com.entra21java.web.alunos;

import br.com.entra21java.bean.AlunoBean;
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
@WebServlet("/alunos/update")
public class AlunoUpdate extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, 
    HttpServletResponse resp) throws ServletException, 
    IOException {
        AlunoBean aluno = new AlunoBean();
        
        aluno.setNome(req.getParameter("nome"));
        aluno.setCodigo_da_matricula(req.getParameter("codigo_da_matricula"));
        aluno.setNota_1(Float.parseFloat(req.getParameter("nota_1")));
        aluno.setNota_2(Float.parseFloat(req.getParameter("nota_2")));
        aluno.setNota_3(Float.parseFloat(req.getParameter("nota_3")));
        aluno.setFrequencia(Byte.parseByte(req.getParameter("frequencia")));
        boolean alterou = new AlunoDAO().alterar(aluno);
        
        if(alterou){
            resp.getWriter().print("Dados alterados com sucesso");
        }else{
            resp.getWriter().print("Não foi possível alterar os dados do aluno");
        }
    }
    
}
