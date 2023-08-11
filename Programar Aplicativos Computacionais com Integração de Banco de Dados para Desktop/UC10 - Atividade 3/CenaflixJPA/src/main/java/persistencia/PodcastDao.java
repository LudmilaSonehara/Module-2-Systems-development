package persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

public class PodcastDao {
    EntityManager em;
    
    public void cadastrar(Podcast p){
        em = JPAUtil.getEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        }catch(Exception e){
              em.getTransaction().rollback();
              throw e;
          }
          finally{
              JPAUtil.closeEntityManager();
          }
    
    }
    
    public List<Podcast> listar(String prod){
        em = JPAUtil.getEntityManager();
        List<Podcast> Podcasts = null;
        try{
            String query = "select p from Podcast p";
            if(!prod.isEmpty()){
                query = query + " where p.produtor = :produz";
            }
            Query consulta = em.createQuery(query);
            
            if(!prod.isEmpty()){
                consulta.setParameter("produz", prod);
            }
            
            Podcasts = consulta.getResultList();
            
        }finally{
          JPAUtil.closeEntityManager();
      }
        return Podcasts;
    }
    
    
    public void excluir(int id){
        em = JPAUtil.getEntityManager();
        try{
            Podcast p = procuraID(id);

            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
        }finally{
          JPAUtil.closeEntityManager();
        }
    }
    
    
    public Podcast procuraID(int id){
        em = JPAUtil.getEntityManager();
        Podcast p = em.find(Podcast.class, id);
        
        return p;
    }
    
}
