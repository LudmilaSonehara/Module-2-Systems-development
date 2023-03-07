
package atividade4;

import java.util.ArrayList;

public class Pagamentos {
    
    String nomeEmpresa;
    ArrayList<Imposto> impostos = new ArrayList<Imposto>();

    public Pagamentos(String nomeEmpresa, Imposto imposto) {
        this.nomeEmpresa = nomeEmpresa;
        this.impostos.add(imposto);
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public ArrayList<Imposto> getImpostos() {
        return impostos;
    }

    public void setImpostos(ArrayList<Imposto> impostos) {
        this.impostos = impostos;
    }
    
    public  void mostraDescricao() {
        
          for (Imposto imposto : impostos) {
              
            System.out.println("-------Descrição--------\n" + 
                    "Nome da empresa: " + getNomeEmpresa());
                 
            imposto.mostraImposto();
                
            System.out.println("Valor total do imposto: R$ " + imposto.calculaImposto() + "\n");
                
        }
    }
}
