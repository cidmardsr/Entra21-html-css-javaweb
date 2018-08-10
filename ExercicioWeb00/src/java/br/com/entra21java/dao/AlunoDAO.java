package br.com.entra21java.dao;

import br.com.entra21java.bean.AlunoBean;
import br.com.entra21java.database.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Conexao.fecharConexao();
        }
        return alunos;
    }
    
    public int adicionar(AlunoBean aluno){
        String sql = "INSERT INTO alunos(nome, codigo_da_matricula, nota_1, nota_2, nota_3, frequencia)"
                   + "VALUES (?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement ps = Conexao.obterConexao().prepareStatement(sql, 
            PreparedStatement.RETURN_GENERATED_KEYS);
            
        int quatidade = 1;
        
        ps.setString(quatidade++, aluno.getNome());
        ps.setString(quatidade++, aluno.getCodigo_da_matricula());
        ps.setFloat(quatidade++, aluno.getNota_1());
        ps.setFloat(quatidade++, aluno.getNota_2());
        ps.setFloat(quatidade++, aluno.getNota_3());
        ps.setByte(quatidade++, aluno.getFrequencia());
        
        ps.execute();
        
        ResultSet resultSet = ps.getGeneratedKeys();
        
        if(resultSet.next()){
            return resultSet.getInt(1);
        }
            
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Conexao.fecharConexao();
            
        }return -1;
        
    }
    
    public boolean excluir(int id){
        String sql = "DELETE FROM alunos WHERE id=?";
        try{
            PreparedStatement ps = Conexao.obterConexao().prepareStatement(sql);
            ps.setInt(1, id);
            return ps.executeUpdate() == 1;
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Conexao.fecharConexao();
        }
        return false;
    }
    
    public boolean alterar(AlunoBean aluno){
        String sql = "UPDATE alunos SET nome = ?, "
                   + "codigo_da_matricula = ?, "
                   + "nota_1 = ?, "
                   + "nota_2 = ?, "
                   + "nota_3 = ?, "
                   + "frequencia = ? WHERE id = ?";
        
        try{
           PreparedStatement ps = Conexao.obterConexao().prepareStatement(sql);
           
           int quantidade = 1;
           
           ps.setString(quantidade++, aluno.getNome());
           ps.setString(quantidade++, aluno.getCodigo_da_matricula());
           ps.setFloat(quantidade++, aluno.getNota_1());
           ps.setFloat(quantidade++, aluno.getNota_2());
           ps.setFloat(quantidade++, aluno.getNota_3());
           ps.setByte(quantidade++, aluno.getFrequencia());
           ps.setInt(quantidade++, aluno.getId());
           return ps.executeUpdate() == 1;
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Conexao.fecharConexao();
        }
        return false;
    }

    public AlunoBean obterPeloId(int id) {
        String sql = "SELECT * FROM alunos WHERE id = ?";
        try{
            PreparedStatement ps = Conexao.obterConexao().prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            if(resultSet.next()){
                AlunoBean aluno = new AlunoBean();
                aluno.setId(id);
                aluno.setNome(resultSet.getString("nome"));
                aluno.setCodigo_da_matricula(resultSet.getString("codigo_da_matricula"));
                aluno.setNota_1(resultSet.getFloat("nota_1"));
                aluno.setNota_2(resultSet.getFloat("nota_2"));
                aluno.setNota_3(resultSet.getFloat("nota_3"));
                aluno.setFrequencia(resultSet.getByte("frequencia"));
            return aluno;
            }
            
            
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            Conexao.fecharConexao();
        }
        return null;
    }
}
