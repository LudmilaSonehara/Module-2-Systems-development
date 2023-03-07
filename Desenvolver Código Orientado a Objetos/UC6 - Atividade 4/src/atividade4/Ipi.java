
package atividade4;

public class Ipi extends    Imposto{
    
    private double frete;
    private double seguro;
    private double outrasDispesas;

    public Ipi(double frete, double seguro, double outrasDispesas, double aliquota, double valorProduto) {
        super(aliquota, valorProduto);
        this.frete = frete;
        this.seguro = seguro;
        this.outrasDispesas = outrasDispesas;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public double getSeguro() {
        return seguro;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }

    public double getOutrasDispesas() {
        return outrasDispesas;
    }

    public void setOutrasDispesas(double outrasDispesas) {
        this.outrasDispesas = outrasDispesas;
    }

    @Override
    public double calculaImposto() {
       
        double calculo1 = getValor2() + frete + seguro+ outrasDispesas;
        
        return (calculo1 * getValor1()) / 100;
    }

    @Override
    public void mostraImposto() {
       
        System.out.println("IPI (Imposto sobre Produtos Industrializados)");
        
    }
}

