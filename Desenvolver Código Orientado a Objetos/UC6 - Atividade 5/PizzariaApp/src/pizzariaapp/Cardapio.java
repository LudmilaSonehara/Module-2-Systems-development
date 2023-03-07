package pizzariaapp;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Cardapio {
    Scanner t = new Scanner(System.in);
    String nomePizzaria;
    Set<Pizza> pizzas = new TreeSet<Pizza>();
    Set<Bebida> bebidas = new TreeSet<Bebida>();
    
    
    
    public Cardapio(String nome){
        this.nomePizzaria = nome;
    }
    
    public void cadastraPizza(){
        
            System.out.println("Digite o sabor da pizza:");
            String nome = t.nextLine();
            
            System.out.println("Digite o tipo da pizza(Doce ou Salgada):");
            String tipo = t.nextLine();
            while(!tipo.equals("Doce") && !tipo.equals("Salgada")){
                System.out.println("Digite um tipo válido!");
                System.out.println("Digite o tipo da pizza(Doce ou Salgada):");
                tipo = t.nextLine();
                
            }
            
            System.out.println("Digite o preço relativo à pizza pequena (25 cm) desse sabor:");
            float preco1 = Float.parseFloat(t.nextLine());
            System.out.println("Digite o preço relativo à pizza média (30 cm) desse sabor:");
            float preco2 = Float.parseFloat(t.nextLine());
            System.out.println("Digite o preço relativo à pizza de grande (35 cm) desse sabor:");
            float preco3 = Float.parseFloat(t.nextLine());
            
            
            Pizza pizza = new Pizza(nome, tipo, preco1, preco2, preco3);
            pizza.addIngredientes();
            this.pizzas.add(pizza);
            
            
        
    }
    
    public void cadastraBebida(){
        
             System.out.println("Digite o nome da bebida:");
             String nome = t.nextLine();
             System.out.println("Digite a quantidade da bebida em mililítros(ml):");
             float ml = Float.parseFloat(t.nextLine());
             System.out.println("Digite o preço da bebida:");
             float preco = Float.parseFloat(t.nextLine());
             
             Bebida bebida = new Bebida(nome, ml, preco);
             this.bebidas.add(bebida);
             
            
    }
        
    public boolean verificaPizza(String sabor){
        for(Pizza p : this.pizzas){
            if(p.getNomeSabor().equals(sabor)){
               return true; 
            }
        }
        return false;
    }
    
    public boolean verificaBebida(String nome){
        for(Bebida b : this.bebidas){
            if(b.getNome().equals(nome)){
               return true; 
            }
        }
        return false;
    }
    
    
    public void mostraCardapio(){
        System.out.println("Pizzaria: "+this.nomePizzaria);
        System.out.println("Pizzas:");
        for(Pizza p : this.pizzas){
            System.out.println("Pizza: "+p.getNomeSabor());
            System.out.println(p.getTipo());
            System.out.println(p.getPequena()+" centímetros -> preço: R$"+p.getPrecoP());
            System.out.println(p.getMedia()+" centímetros -> preço: R$"+p.getPrecoM());
            System.out.println(p.getGrande()+" centímetros -> preço: R$"+p.getPrecoG());
            p.getIngredientes();
            System.out.println("--------------------------------------------------");
        }
        
        System.out.println("Bebidas:");
        for(Bebida b : this.bebidas){
            System.out.println(b.getNome());
            System.out.println(b.getMl()+"ml");
            System.out.println("R$"+b.getPreco());
            System.out.println("--------------------------------------------------");
        }
    }
}
