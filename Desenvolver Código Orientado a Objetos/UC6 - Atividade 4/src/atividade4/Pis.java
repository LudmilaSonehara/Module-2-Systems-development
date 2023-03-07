
package atividade4;

public class Pis extends Imposto {

    public Pis(double debito, double credito) {
        super(debito, credito);
    }
    
    @Override
    public double calculaImposto() {
       
        double porcentagem = 1.65;
        
        return ((getValor1() - getValor2()) * porcentagem / 100);
        
    }

     @Override
    public void mostraImposto() {
       
        System.out.println("PIS (Programa de Integração Social)");
        
    }  
}
