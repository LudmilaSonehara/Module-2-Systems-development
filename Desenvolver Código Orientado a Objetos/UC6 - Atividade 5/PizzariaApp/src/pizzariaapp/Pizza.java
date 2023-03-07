package pizzariaapp;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Pizza implements Comparable<Pizza> {
    Scanner t = new Scanner(System.in);
    private String nomeSabor = null;
    private float pequena = 25.0f;
    private float media = 30.0f;
    private float grande = 35.0f;
    // Os atributos tamanhoEscolhido e precoEscolhido foram criados para o registro de pedidos.
    private float tamanhoEscolhido = 0;
    private float precoEscolhido = 0;
    private float precoP;
    private float precoM;
    private float precoG;
    private String tipo;
    private List<String> ingredientes = new ArrayList<String>();
    
    
    
    
    public Pizza(String nome, String tipo, float preco1 , float preco2, float preco3){
        this.nomeSabor = nome;
        this.tipo = tipo;
        this.precoP = preco1;
        this.precoM = preco2;
        this.precoG = preco3;
        
    }
    
    /* Optei por criar esse construtor para registrar as pizzas no pedido,
    onde constará apenas o nome, o tamanho e o preço da pizza relativo ao tamanho em questão. 
    As outras informações da pizza já constam no cardápio, por isso optei por essa estrutura*/
    public Pizza(String nome, float tamanho, float preco){
        this.nomeSabor = nome;
        this.tamanhoEscolhido = tamanho;
        this.precoEscolhido = preco;
    }
    
    
    
    @Override
    public int compareTo(Pizza o){
        return this.nomeSabor.compareTo(o.nomeSabor);
    }
    
    public void addIngredientes(){
        String continua = "S";
        String ingrediente;
        while(!continua.equals("N")){
            System.out.println("Digite um ingrediente para a pizza:");
            ingrediente = t.nextLine();
            ingredientes.add(ingrediente);
            System.out.println("Deseja adicionar outro ingrediente?S/N");
            continua = t.nextLine();
            while(!continua.equals("N") && !continua.equals("S")){
                System.out.println("Digite S ou N:");
                continua = t.nextLine();
            }
        }
    }

    public float getTamanhoEscolhido() {
        return tamanhoEscolhido;
    }

    public void setTamanhoEscolhido(float tamanhoEscolhido) {
        this.tamanhoEscolhido = tamanhoEscolhido;
    }

    public float getPrecoEscolhido() {
        return precoEscolhido;
    }

    public void setPrecoEscolhido(float precoEscolhido) {
        this.precoEscolhido = precoEscolhido;
    }

    
    
    public String getNomeSabor() {
        return nomeSabor;
    }

    public void setNomeSabor(String nomeSabor) {
        this.nomeSabor = nomeSabor;
    }

    public float getPequena() {
        return pequena;
    }

    public void setPequena(float pequena) {
        this.pequena = pequena;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public float getGrande() {
        return grande;
    }

    public void setGrande(float grande) {
        this.grande = grande;
    }

    

    public float getPrecoP() {
        return precoP;
    }

    public void setPrecoP(float precoP) {
        this.precoP = precoP;
    }

    public float getPrecoM() {
        return precoM;
    }

    public void setPrecoM(float precoM) {
        this.precoM = precoM;
    }

    public float getPrecoG() {
        return precoG;
    }

    public void setPrecoG(float precoG) {
        this.precoG = precoG;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void getIngredientes() {
        System.out.println("Ingredientes:");
        for(String i:this.ingredientes){
            System.out.println(i);
        }
    }
    
    public void setIngredientes(){
        String opcao;
        System.out.println("Escolha [A]dicionar, [T]rocar, [R]emover, [S]air:");
        opcao = t.nextLine();
        while(!opcao.equals("A") && !opcao.equals("R") && !opcao.equals("T") && !opcao.equals("S")){
            System.out.println("Opção inválida!");
            System.out.println("Escolha [A]lterar, [R]emover, [S]air:");
            opcao = t.nextLine();
        }
        
        while(!opcao.equals("S")){
            String i;
            boolean temOuNao;
            switch(opcao){
                case "A":
                    System.out.println("Digite o nome do ingrediente que deseja adicionar:");
                    i = t.nextLine();
                    if(this.ingredientes.contains(i)){
                        System.out.println("Esse ingrediente já faz parte da pizza.");
                    }
                    else{
                        this.ingredientes.add(i);
                    }
                
                
                case "T":
                    System.out.println("Digite o nome do ingrediente que deseja alterar:");
                    i = t.nextLine();
                    temOuNao = this.ingredientes.remove(i);
                    if(temOuNao == false){
                        System.out.println("A pizza em questão não possui esse ingrediente!");
                    }
                    else{
                        System.out.println("Digite o nome do ingrediente que substituirá o anterior:");
                        i = t.nextLine();
                        this.ingredientes.add(i);
                        System.out.println("Ingrediente alterado com sucesso!");
                    }
                    break;
                
                case "R":
                    System.out.println("Digite o nome do ingrediente que deseja alterar:");
                    i = t.nextLine();
                    temOuNao = this.ingredientes.remove(i);
                    if(temOuNao == false){
                        System.out.println("A pizza em questão não possui esse ingrediente!");
                    }
                    else{
                        System.out.println("O ingrediente "+temOuNao+" foi removido da pizza de "+this.nomeSabor+".");
                        
                    }
                    break;
            }
        }
        System.out.println("Deseja alterar ou remover outro ingrediente?\nEscolha [A]lterar, [R]emover, [S]air:");
        opcao = t.nextLine();
        while(!opcao.equals("A") && !opcao.equals("R") && !opcao.equals("S")){
            System.out.println("Opção inválida!");
            System.out.println("Escolha [A]lterar, [R]emover, [S]air:");
            opcao = t.nextLine();
        }
    }   
}
