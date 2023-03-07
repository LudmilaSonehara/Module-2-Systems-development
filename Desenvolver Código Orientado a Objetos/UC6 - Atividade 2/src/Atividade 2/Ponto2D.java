/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv2;

public class Ponto2D {
    
    private char A = 'A';
    private double posicaoX;
    private double posicaoY;
    
    public Ponto2D(char A, double posicaoX, double posicaoY){
        this.A = A;
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
    }
    
    public char getA(){
        return A;
    }
    
    public void setA(char A){
        this.A = A;
    }
    
    public double getPosicaoX(){
        return posicaoX;
    }
    
    public void setPosicaoX(double posicaoX){
        this.posicaoX = posicaoX;
    }
    
    public double getPosicaoY(){
        return posicaoY;
    }
    
    public void setPosicaoY(double posicaoY){
        this.posicaoY = posicaoY;
    }
    
}
