
package problema1;

//Relativo ao atendimento de eventos, o hotel necessita de uma
//funcionalidade que indique qual de seus dois auditórios é o mais
//adequado para um evento. O auditório Alfa conta com 150 lugares e
//espaço para até 70 cadeiras adicionais. O auditório Beta conta com 350
//lugares, sem espaço para mais cadeiras. Desenvolva um programa Java
//que receba o número de convidados do evento e faça uma verificação
//sobre a quantidade: se for maior que 350 ou se for menor que zero, mostre
//a mensagem “Número de convidados inválido”. Se o valor informado é
//válido, mostre na tela qual dos auditórios é o mais adequado. No caso do
//auditório Alfa, calcule ainda quantas cadeiras adicionais serão
//necessárias, observando o limite citado acima.



import java.util.Scanner;

public class Problema1 {
    
    public static void main(String[] args) {
        
    final int auditorioAlfa = 150;
    final int cadeirasAdicionais = 70;
    final int auditorioBeta = 350;
    int numeroConvidados;
    
    Scanner entrada = new Scanner (System.in);
    
    System.out.println("Informe o número de convidaddos: ");
        numeroConvidados = entrada.nextInt();
        
        
        if (numeroConvidados > 0 ) {
            
            if(numeroConvidados <= auditorioAlfa + cadeirasAdicionais && numeroConvidados > auditorioAlfa){
            
            int cadeirasIncluidas = numeroConvidados - auditorioAlfa ;
                
                System.out.println("Use o auditório Alfa \n" +
                        "Inclua mais " + cadeirasIncluidas + " cadeiras");
                
            }
            
            if (numeroConvidados <= auditorioAlfa) {
                
                System.out.println("Use o auditório Alfa");
                
            }
            
            if (numeroConvidados <= auditorioBeta && numeroConvidados > auditorioAlfa + cadeirasAdicionais) {
                
                System.out.println("Use o auditório Beta");
                
            }
        } 
        else {
            
            System.out.println("Valor inválido");
            
        }
    }
}
    