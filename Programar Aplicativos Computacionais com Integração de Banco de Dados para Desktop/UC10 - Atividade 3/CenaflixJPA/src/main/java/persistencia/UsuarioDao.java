/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author LUDMILA
 */
public class UsuarioDao {
    EntityManager em = JPAUtil.getEntityManager();
    
    
    public String retornaTipo(Usuario user){
        List<Usuario> usuarios;
        String sql = "select u from Usuario u where u.login = :login and u.senha = :senha";
        Usuario usuarioEncontrado = null;
        try{
            Query consulta =  em.createQuery(sql);

            consulta.setParameter("login", user.getLogin());
            consulta.setParameter("senha",user.getSenha());

            usuarios = consulta.getResultList();
            if(!usuarios.isEmpty()){
                for(Usuario u: usuarios){
                    usuarioEncontrado.setId(u.getId());
                    usuarioEncontrado.setLogin(u.getLogin());
                    usuarioEncontrado.setSenha(u.getSenha());
                    usuarioEncontrado.setTipo(u.getTipo());
                }
            }
            return usuarioEncontrado.getTipo();
        }catch(Exception e){
            return null;
        }
            
    }
        
    
    public Usuario validar(Usuario user){
        List<Usuario> usuarios;
        String sql = "select u from Usuario u where u.login = :login and u.senha = :senha";
        Usuario usuarioEncontrado = null;
        try{
            Query consulta =  em.createQuery(sql);

            consulta.setParameter("login", user.getLogin());
            consulta.setParameter("senha",user.getSenha());

            usuarios = consulta.getResultList();
            if(!usuarios.isEmpty()){
                for(Usuario u: usuarios){
                    usuarioEncontrado = new Usuario();
                    usuarioEncontrado.setId(u.getId());
                    usuarioEncontrado.setLogin(u.getLogin());
                    usuarioEncontrado.setSenha(u.getSenha());
                    usuarioEncontrado.setTipo(u.getTipo());
                }
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return usuarioEncontrado;
    
    }
    
    
    
    
}
    
    

