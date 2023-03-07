/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atv2;

import java.util.Scanner;
public class Atv2 {

    public static void main(String[] args) {
        
        Trajetoria items;
        Scanner entrada = new Scanner(System.in);
        String opcao = "";
        Ponto2D[] objetos = new Ponto2D[2];
        
        do{
            
            System.out.println("Digite uma opção: ");
            System.out.println("[1] - CALCULAR DISTÂNCIA DE 2 OBJETOS || [2] - CALCULAR DISTÂNCIA DE VÁRIOS OBJETOS || [3] - SAIR");
            opcao = entrada.nextLine();
            
            while(!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3")){
                System.out.println("Digite uma opção: ");
                System.out.println("[1] - CALCULAR DISTÂNCIA DE 2 OBJETOS || [2] - CALCULAR DISTÂNCIA DE VÁRIOS OBJETOS || [3] - SAIR");
                opcao = entrada.nextLine();
            }
            
            switch(opcao){
                
                case "1":
        
                    char A = 'A';
                    String change = "";
                    double multiplicador = 0;
                    double resultado = 0;
                    
                    for(int i = 0; i < objetos.length; i++){
                        System.out.println("Digite o valor X & Y do objeto: " + "[" + A + "]");
                        objetos[i] = new Ponto2D(A, entrada.nextDouble(), entrada.nextDouble());
                        A++;
                    }
                    
                    System.out.println("Valores dos objetos: ");
                    
                    for(int i = 0; i < objetos.length; i++){
                        System.out.println("[" + objetos[i].getA() + "]" + " " + "(" + objetos[i].getPosicaoX() + ", " +
                                objetos[i].getPosicaoY() + ")");
                    }
                    
                    for(int i = 0; i < objetos.length -1; i++){
                        resultado = Math.sqrt(Math.pow(objetos[i+1].getPosicaoX() - objetos[i].getPosicaoX(),2)
                                + Math.pow(objetos[i+1].getPosicaoY() - objetos[i].getPosicaoY(),2));
                        
                        System.out.println("A distância entre A e B é de: " + String.format("%.1f",resultado));
                    }
                    
                    entrada.nextLine();
                    
                    do{
                        
                        System.out.println("[1] - Multiplicar posição X e Y objeto (A) || [2] - VOLTAR");
                        change = entrada.nextLine();
                        
                        while(!change.equals("1") && !change.equals("2")){
                            System.out.println("[1] - Multiplicar posição X e Y objeto (A) || [2] - VOLTAR");
                            change = entrada.nextLine();
                        }
                        
                        if(change.equals("1")){
                            System.out.println("Deseja multiplicar o objeto [A] por qual número?: ");
                            multiplicador = entrada.nextDouble();
                        
                            objetos[0].setPosicaoX(multiplicador * objetos[0].getPosicaoX());
                            objetos[0].setPosicaoY(multiplicador * objetos[0].getPosicaoY());
                        
                            System.out.println("Novos valores: ");
                        
                            for(int i = 0; i < objetos.length; i++){
                                if(objetos[i].getA() == 'A'){
                                    System.out.println("[" + objetos[i].getA() + "]" + " " + "(" + objetos[i].getPosicaoX() + ", " +
                                    objetos[i].getPosicaoY() + ")" + " " + "ALTERADO!");
                                }else{
                                    System.out.println("[" + objetos[i].getA() + "]" + " " + "(" + objetos[i].getPosicaoX() + ", " +
                                    objetos[i].getPosicaoY() + ")");
                                }
                            }
                        
                            for(int i = 0; i < objetos.length -1; i++){
                                resultado = Math.sqrt(Math.pow(objetos[i+1].getPosicaoX() - objetos[i].getPosicaoX(),2)
                                + Math.pow(objetos[i+1].getPosicaoY() - objetos[i].getPosicaoY(),2));
                        
                                System.out.println("A [NOVA DISTÂNCIA] entre A e B é de: " + String.format("%.1f",resultado));
                            }
                            
                            entrada.nextLine();
                            
                        }
                        
                    }while(!change.equals("2"));
                    
                    break;
                    
                case "2":
                    
                    A = 'A';
                    change = "";
                    multiplicador = 0;
                    
                    System.out.println("Digite a quantidade de objetos");
                    items = new Trajetoria(entrada.nextInt());
                    
                    for(int i = 0; i < items.objeto.length; i++){
                        System.out.println("Digite o valor X & Y do objeto: " + "[" + A + "]");
                        items.objeto[i] = new Ponto2D(A, entrada.nextDouble(), entrada.nextDouble());
                        A++;
                    }
                    
                    System.out.println("Valores dos objetos: ");
                    for(int i = 0; i < items.objeto.length; i++){
                        System.out.println("[" + items.objeto[i].getA() + "]" + " " + "(" + items.objeto[i].getPosicaoX() + ", " +
                                items.objeto[i].getPosicaoY() + ")");
                    }
                    
                    System.out.println("Resultados das distâncias");
                    items.CalcularDistancia();
                    
                    entrada.nextLine();
                    
                    do{
                        
                        System.out.println("[1] - Multiplicar valores dos objetos || [2] - VOLTAR");
                        change = entrada.nextLine();
                        
                        while(!change.equals("1") && !change.equals("2")){
                            System.out.println("[1] - Multiplicar valores dos objetos || [2] - VOLTAR");
                            change = entrada.nextLine();
                        }
                        
                        if(change.equals("1")){
                            System.out.println("Deseja multiplicar os valores dos objetos por qual número?");
                            multiplicador = entrada.nextDouble();
                            
                            for(int i = 0; i < items.objeto.length; i++){
                                items.objeto[i].setPosicaoX(multiplicador * items.objeto[i].getPosicaoX());
                                items.objeto[i].setPosicaoY(multiplicador * items.objeto[i].getPosicaoY());
                            }
                            
                            System.out.println("Novos valores: ");
                        
                            for(int i = 0; i < items.objeto.length; i++){
                                
                                System.out.println("[" + items.objeto[i].getA() + "]" + " " + "(" + items.objeto[i].getPosicaoX() + ", " +
                                items.objeto[i].getPosicaoY() + ")" + " " + "ALTERADO!");
                                
                            }
                            
                            System.out.println("A nova distância da trajetoria é de: ");
                            items.CalcularDistancia();
                            
                            entrada.nextLine();
                        }
                        
                    }while(change.equals("1"));
                    break;
                
            }
            
        }while(!opcao.equals("3"));
        
    }
    
}
