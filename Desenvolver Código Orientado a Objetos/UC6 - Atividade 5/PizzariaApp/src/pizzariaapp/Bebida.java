package pizzariaapp;

public class Bebida implements Comparable<Bebida>{
    private String nome = null;
    private float ml = 0;
    private float preco = 0;
    
    // Aqui segue a mesma lógica do contrutor da classe Pizza, exclusivo para o registro de pedidos
    public Bebida(String nome, float preco){
    this.nome = nome;
    this.preco = preco;
    }
    
    public Bebida(String nome, float ml, float preco){
        this.nome = nome;
        this.ml = ml;
        this.preco = preco;
    }
    
    
    @Override
    public int compareTo(Bebida o){
        return this.nome.compareTo(o.nome);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getMl() {
        return ml;
    }

    public void setMl(float ml) {
        this.ml = ml;
    }

    

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
    
}
