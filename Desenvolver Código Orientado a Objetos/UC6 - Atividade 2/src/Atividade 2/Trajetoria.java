/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv2;

public class Trajetoria {
    
    private double resultadoTotal = 0;
    protected Ponto2D[] objeto;
    
    public Trajetoria(int numeroObjetos){
        this.objeto = new Ponto2D[numeroObjetos];
    }
    
    public void CalcularDistancia(){
        int cont  = 0;
        
        for(int i = 0; i < objeto.length -1; i++){
            cont +=1;
            double resultado = 0;
            
            resultado = Math.sqrt(Math.pow(objeto[cont].getPosicaoX() - objeto[i].getPosicaoX(), 2) + 
                    Math.pow(objeto[cont].getPosicaoY() - objeto[i].getPosicaoY(), 2));
            
            resultadoTotal = resultadoTotal + resultado;
            
            System.out.println("(" + objeto[i].getPosicaoX() + " " + objeto[i].getPosicaoY() + ")" + " a " + 
                    "(" + objeto[cont].getPosicaoX() + " " + objeto[cont].getPosicaoY() + ")" + " - distancia " + String.format("%.1f", resultado));
            
        }
        
        System.out.println("Total da distancia: " + String.format("%.1f", resultadoTotal));
        
    }
    
}
