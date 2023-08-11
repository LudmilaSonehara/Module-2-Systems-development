package Dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class FilmeDao {
 
    Connection conn;
    PreparedStatement st;
    ResultSet rs;
    
    public boolean conectar(){
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cenaflix_bd", "root","14728360Meub@nco");
            return true;
        }catch(ClassNotFoundException | SQLException ex){
            return false;
        }
    }
    
    public int cadastrar(Filme filme){
        int status;
        try{
            st = conn.prepareStatement("insert into filmes (nome, lancamento, categoria) values(?,?,?)");
            st.setString(1,filme.getNome());
            st.setString(2,filme.getData());
            st.setString(3, filme.getCategoria());
            status = st.executeUpdate();
            return status;
        }catch(SQLException ex){
            return ex.getErrorCode();
        }
    }
    
    public Filme pesquisaId(int id){
        Filme filme = new Filme();
        
         
            try{
                st = conn.prepareStatement("select nome, DATE_FORMAT(lancamento,'%d/%m/%Y') as lancamento, categoria from filmes where id = ?");
                st.setInt(1,id);
                rs = st.executeQuery();
                if(rs.next()){
                    filme.setId(id);
                    filme.setNome(rs.getString("nome"));
                    filme.setData(rs.getString("lancamento"));
                    filme.setCategoria(rs.getString("categoria"));
                    return filme;
                }
                else{
                    return null;
                }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Deu algo errado, meu chapa: "+ex.getMessage());
                return null;
            }
            
            
        }
    
    public int atualizarId(Filme filme){
    
        int status;
        try{
            
            st = conn.prepareStatement("update filmes set nome = ?, lancamento = ?, categoria = ? where id = ?");
            st.setString(1, filme.getNome());
            st.setString(2, filme.getData());
            st.setString(3, filme.getCategoria());
            st.setInt(4,filme.getId());
            status =  st.executeUpdate();
            return status;
            
        }catch(SQLException ex){
            System.out.println(ex.getErrorCode());
            return ex.getErrorCode();
        }
    
    }
    
    public int atualizarNome(Filme filme){
    
        int status;
        try{
            
            st = conn.prepareStatement("update filmes set nome = ?, lancamento = ?, categoria = ? where nome = ?");
            st.setString(1, filme.getNomeAlteracao());
            st.setString(2, filme.getData());
            st.setString(3, filme.getCategoria());
            st.setString(4,filme.getNome());
            status =  st.executeUpdate();
            return status;
            
        }catch(SQLException ex){
            System.out.println(ex.getErrorCode());
            return ex.getErrorCode();
        }
    
    }
    
    
    public Filme pesquisaNome(String nome){
        Filme filme = new Filme();
        
         
            try{
                st = conn.prepareStatement("select id, nome, DATE_FORMAT(lancamento,'%d/%m/%Y') as lancamento, categoria from filmes where nome = ?");
                st.setString(1,nome);
                rs = st.executeQuery();
                if(rs.next()){
                    filme.setId(rs.getInt("id"));
                    filme.setNome(rs.getString("nome"));
                    filme.setData(rs.getString("lancamento"));
                    filme.setCategoria(rs.getString("categoria"));
                    return filme;
                }
                else{
                    return null;
                }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Deu algo errado, meu chapa: "+ex.getMessage());
                return null;
            }
            
            
        }
        
    
    public boolean excluirId(int id){
        try{
            st = conn.prepareStatement("delete from filmes where id = ?");
            st.setInt(1, id);
            st.executeUpdate();
            return true;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Deu algo errado ao excluir, meu chapa: "+ex.getMessage());
            return false;
        }
    
    }
    
    public boolean excluirNome(String nome){
        try{
            st = conn.prepareStatement("delete from filmes where nome = ?");
            st.setString(1, nome);
            st.executeUpdate();
            return true;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Deu algo errado ao excluir, meu chapa: "+ex.getMessage());
            return false;
        }
    
    }
    
    public void desconectar(){
        try{
            conn.close();
        }catch(SQLException ex){
        
        }
    }
    
        
}
    

