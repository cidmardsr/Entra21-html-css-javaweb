package br.com.entra21java.dao;

import br.com.entra21java.bean.AlunoBean;
import br.com.entra21java.database.Conexao;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Alunos
 */
public class AlunoDAO {
    public List<AlunoBean> obterTodos(){
        List<AlunoBean> alunos = new ArrayList<>();
        String sql = "SELECT * FROM alunos";
        
        try{
            Statement st = Conexao.obterConexao().createStatement();
            st.execute(sql);
            ResultSet resultSet = st.getResultSet();
            while(resultSet.next()){
            AlunoBean aluno = new AlunoBean();
            aluno.setId(resultSet.getInt("id"));
            aluno.setNome(resultSet.getString("nome"));
            aluno.setCodigo_da_matricula(resultSet.getString("codigo_da_matricula"));
            aluno.setNota_1(resultSet.getFloat("nota_1"));
            aluno.setNota_2(resultSet.getFloat("nota_2"));
            aluno.setNota_3(resultSet.getFloat("nota_3"));
            aluno.setFrequencia(resultSet.getByte("frequencia"));
            alunos.add(aluno);
        }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            Conexao.fecharConexao();
        }
        return alunos;
    }
}
