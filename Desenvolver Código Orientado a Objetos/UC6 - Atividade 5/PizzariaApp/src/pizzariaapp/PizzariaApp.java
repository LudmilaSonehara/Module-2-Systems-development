package pizzariaapp;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.lang.Thread;

public class PizzariaApp {
    
    public static void main(String[] args) throws InterruptedException {
        Scanner t = new Scanner(System.in);
        Queue<Pedido> pedidos = new LinkedList<Pedido>();
        
        
        Cardapio cardapio;
        String opcao;
        String nomePizzaria;
        
        System.out.println("Iniciando programa...");
        
        System.out.println("Digite o nome da pizzaria:");
        nomePizzaria = t.nextLine();
        cardapio = new Cardapio(nomePizzaria);
        
        System.out.println("Escolha uma ação:");
        System.out.println("RP(Registrar Pizza no cardápio)\nRB(Registrar Bebida no cardápio)\nM(Mostrar cardápio)\nC(Cadastrar pedido para cozinha)\n"
                + "LP(Mostrar a lista de pedidos)\nR(Retirar pedido)\nS(Sair)");
        opcao =  t.nextLine();
        
        while(!opcao.equals("RP") && !opcao.equals("RB") && !opcao.equals("M") && !opcao.equals("C") && 
                !opcao.equals("LP") && !opcao.equals("R") && !opcao.equals("S")){
            
            System.out.println("Escolha uma ação válida:");
            System.out.println("RP(Registrar Pizza no cardápio)\nRB(Registrar Bebida no cardápio)\nM(Mostrar cardápio)\nC(Cadastrar pedido para cozinha)\n"
                + "LP(Mostrar a lista de pedidos)\nR(Retirar pedido)\nS(Sair)");
            opcao =  t.nextLine();
        }
        
        while(!opcao.equals("S")){
            switch(opcao){
                case "RP":
                    cardapio.cadastraPizza();
                    break;
                    
                case "RB":
                    cardapio.cadastraBebida();
                    break;
                    
                case "M":
                    cardapio.mostraCardapio();
                    Thread.sleep(5000);
                    break;
                    
                case "C":
                    Pedido pedido = new Pedido();
                    pedido.anotaPedido(cardapio);
                    System.out.println("O seu pedido foi:");
                    System.out.println("-------------------------------------------");
                    pedido.mostraPedido();
                    System.out.println("-------------------------------------------");
                    pedidos.add(pedido);
                    Thread.sleep(5000);
                    break;
                    
                case "LP":
                    int i = 1;
                    if(pedidos.isEmpty()){
                        System.out.println("Não há pedidos registrados no momento.");
                    }
                    else{
                        for(Pedido p : pedidos){
                            System.out.println(i+"º pedido:");
                            System.out.println("-------------------------------------------");
                            p.mostraPedido();
                            System.out.println("-------------------------------------------");
                            i++;
                        }
                    }
                    
                    Thread.sleep(5000);
                    break;
                    
                case "R":
                    if(pedidos.isEmpty()){
                        System.out.println("Não há pedidos registrados no momento.");
                        Thread.sleep(5000);
                    }
                    else{
                        System.out.println("Saindo:");
                        pedidos.remove().mostraPedido();
                        Thread.sleep(5000);
                        break;
                    }
                    
            }
            
            System.out.println("Escolha uma ação:");
            System.out.println("RP(Registrar Pizza no cardápio)\nRB(Registrar Bebida no cardápio)\nM(Mostrar cardápio)\nC(Cadastrar pedido para cozinha)\n"
                + "LP(Mostrar a lista de pedidos)\nR(Retirar pedido)\nS(Sair)");
            opcao =  t.nextLine();
        
        }
        
       
    }
}   
