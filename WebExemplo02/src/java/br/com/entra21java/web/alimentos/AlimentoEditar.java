package br.com.entra21java.web.alimentos;

import br.com.entra21java.bean.AlimentoBean;
import br.com.entra21java.dao.AlimentoDAO;
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
@WebServlet(urlPatterns="/alimentos/editar")
public class AlimentoEditar extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, 
    HttpServletResponse resp) throws ServletException, 
    IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        AlimentoBean alimento = new AlimentoDAO().obterPeloId(id);
        
        
        PrintWriter out = resp.getWriter();
    out.print ("<!DOCTYPE html>");
    out.print ("<html>");
    out.print ("<head>");
    out.print ("<title>Alimentos - Editar</title>");
    out.print ("</head>");
    out.print ("<body>");
    out.print ("<form action='/WebExemplo02/alimentos/update' method='post'>");
    out.print ("<input type='hidden' name='id' value='" + alimento.getId() + "'>");
    out.print ("<div>");
    out.print ("<label for='campo-nome'>Nome</label>");
    out.print ("<input type='text' id='campo-nome' name='nome' value='" + alimento.getNome() +"'>");
    out.print ("</div>");
    out.print ("<div>");
    out.print ("<label for='campo-quantidade'>Quantidade</label>");
    out.print ("<input type='text' id='campo-quantidade' name='quantidade' value='" + alimento.getQuantidade() +"'>");
    out.print ("</div>");
    out.print ("<div>");
    out.print ("<label for='campo-preco'>Preço</label>");
    out.print ("<input type='text' id='campo-preco' name='preco' value='" + alimento.getPreco() +"'>");
    out.print ("</div>");
    out.print ("<div>");
    out.print ("<label for='campo-descricao'>Descrição</label>");
    out.print ("<textarea id='campo-descricao' name='descricao'>" + alimento.getDescricao() +"</textarea>");
    out.print ("</div>");
    out.print ("<input type='submit' value='Alterar'>");
    out.print ("</form>");
    out.print ("</body>");
    out.print ("</html>");
    }
    
    
}
