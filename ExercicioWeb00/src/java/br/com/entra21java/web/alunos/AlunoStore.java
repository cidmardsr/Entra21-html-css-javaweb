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
@WebServlet("/alunos/store")
public class AlunoStore extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, 
    HttpServletResponse resp) throws ServletException, 
    IOException {
        String nome = req.getParameter("nome");
        String codigo_da_matricula = req.getParameter("codigo_da_matricula");
        float nota_1 = Float.parseFloat(req.getParameter("nota_1"));
        float nota_2 = Float.parseFloat(req.getParameter("nota_2"));
        float nota_3 = Float.parseFloat(req.getParameter("nota_3"));
        byte frequencia = Byte.parseByte(req.getParameter("frequencia"));
        AlunoBean aluno = new AlunoBean();
        aluno.setNome(nome);
        aluno.setCodigo_da_matricula(codigo_da_matricula);
        aluno.setNota_1(nota_1);
        aluno.setNota_2(nota_2);
        aluno.setNota_3(nota_3);
        aluno.setFrequencia(frequencia);
         int codigo = new AlunoDAO().adicionar(aluno);
         if(codigo > 0){
             resp.sendRedirect("/ExercicioWeb00/alunos");
         }
    }
    
}
