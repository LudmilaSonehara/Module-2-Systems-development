package persistencia;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Podcast {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String produtor;
    private String episodio;
    private int numero;
    private String duracao;
    private String url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public String getEpisodio() {
        return episodio;
    }

    public void setEpisodio(String episodio) {
        this.episodio = episodio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    
    
}
