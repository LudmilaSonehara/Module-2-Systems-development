package pizzariaapp;
import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Set;


public class Pedido {
    Scanner t = new Scanner(System.in);
    private int nMesa;
    private List<Pizza> pPizzas = new LinkedList<Pizza>();
    private List<Bebida> pBebidas = new LinkedList<Bebida>();
    private double valorTotal = 0;

    public int getnMesa() {
        return nMesa;
    }

    public void setnMesa(int nMesa) {
        this.nMesa = nMesa;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public void getPPizzas(){
        if(this.pPizzas.isEmpty()){
            System.out.println("Não há Pizzas nessa comanda.");
        }
        else{
            for(Pizza p : this.pPizzas){
                System.out.println("Sabor: "+p.getNomeSabor());
                float tamanho = p.getTamanhoEscolhido();
                if(tamanho == 35.0f){
                    System.out.println("Tamanho: Grande("+p.getGrande()+"cm)");
                }

                else if(tamanho == 30.0f){
                    System.out.println("Tamanho: Média("+p.getMedia()+"cm)");
                }

                else{
                    System.out.println("Tamanho: Pequena("+p.getPequena()+"cm)");
                }
                System.out.println("Preço: "+p.getPrecoEscolhido());
            }
        }
    }
    
    public void getPBebidas(){
        if(this.pBebidas.isEmpty()){
            System.out.println("Não há Bebidas nessa comanda.");
        }
        
        else{
            for(Bebida b : this.pBebidas){
                System.out.println("Bebida: "+b.getNome());
                System.out.println("Preço: "+b.getPreco());
            }
        }
    }
    
    public void mostraPedido(){
        System.out.println("Mesa: "+this.getnMesa());
        System.out.println("Pizzas:");
        this.getPPizzas();
        System.out.println("Bebidas:");
        this.getPBebidas();
        System.out.print("Total:");
        System.out.println(this.getValorTotal());
    }
    
    public void registraPizza(Cardapio p){
        String sabor;
        String tamanho;
        float tamanhoCm = 0;
        float preco = 0;
        double precoTotal = this.valorTotal;
        
        System.out.println("Digite o sabor da pizza:");
        sabor = t.nextLine();
        while(!p.verificaPizza(sabor)){
            System.out.println("Sabor não encontrado!\nDigite um sabor válido:");
            sabor = t.nextLine();
        }
        
        System.out.println("Digite o tamanho da pizza:");
        tamanho = t.nextLine();
        while(!tamanho.equals("pequeno") && !tamanho.equals("medio") && !tamanho.equals("grande")){
            System.out.println("Digite pequeno, medio ou grande:");
            tamanho = t.nextLine();    
        }
        
        if(tamanho.equals("pequeno")){
            tamanhoCm = 25.0f;
            for(Pizza pi : p.pizzas){
                if(pi.getNomeSabor().equals(sabor)){
                   preco = pi.getPrecoP();
                   precoTotal += preco;
                }
            }
        }
        
        else if(tamanho.equals("medio")){
            tamanhoCm = 30.0f;
            for(Pizza pi : p.pizzas){
                if(pi.getNomeSabor().equals(sabor)){
                   preco = pi.getPrecoM();
                   precoTotal += preco;
                }
            }
        }
        
        else if(tamanho.equals("grande")){
            tamanhoCm = 35.0f;
            for(Pizza pi : p.pizzas){
                if(pi.getNomeSabor().equals(sabor)){
                   preco = pi.getPrecoG();
                   precoTotal += preco;
                }
            }
        }
        Pizza pizza = new Pizza(sabor, tamanhoCm, preco);
        this.setValorTotal(precoTotal);
        this.pPizzas.add(pizza);
        
    }
    
    public void registraBebida(Cardapio b){
       String nome;
       float preco = 0;
       double precoTotal = this.valorTotal;
       System.out.println("Digite o nome da bebida:");
       nome = t.nextLine();
       while(!b.verificaBebida(nome)){
           System.out.println("Bibida não registrada!\nDigite o nome de uma bebida válida:");
           nome = t.nextLine();
       }
       
       for(Bebida be : b.bebidas){
           if(be.getNome().equals(nome)){
               preco = be.getPreco();
               precoTotal += preco;
           }
       }
       
       Bebida bebida = new Bebida(nome, preco);
       this.setValorTotal(precoTotal);
       this.pBebidas.add(bebida);
    }
    
    public void anotaPedido(Cardapio c){
        System.out.println("Diginte o número da mesa:");
        int m = Integer.parseInt(t.nextLine());
        this.setnMesa(m);
        
        System.out.println("Deseja registrar uma pizza, bebida ou ambos? Digite 'S' para sair.");
        String opcao = t.nextLine();
        while(!opcao.equals("pizza") && !opcao.equals("bebida") && !opcao.equals("ambos") && !opcao.equals("S")){
            System.out.println("Didite uma opção válida!\npizza, bebida ou ambos:");
            opcao = t.nextLine();
        }
        while(!opcao.equals("S")){
            switch(opcao){
                case "pizza":
                    System.out.println("Registrando mais uma pizza no pedido: ");
                    this.registraPizza(c);
                    break;

                case "bebida":
                    System.out.println(" Registrando mais uma bebida no pedido:");
                    this.registraBebida(c);
                    break;

                case "ambos":
                    System.out.println();
                    System.out.println("Registrando mais uma pizza no pedido: ");
                    this.registraPizza(c);
                    System.out.println(" Registrando mais uma bebida no pedido:");
                    this.registraBebida(c);
                    break;
                }
            System.out.println("Deseja registrar mais uma pizza, bebida ou ambos? Digite 'S' para sair.");
            opcao = t.nextLine();
            while(!opcao.equals("pizza") && !opcao.equals("bebida") && !opcao.equals("ambos") && !opcao.equals("S")){
                System.out.println("Didite uma opção válida!\npizza, bebida ou ambos:");
                opcao = t.nextLine();
            }
        }    
            
        
    }
    
    
}
