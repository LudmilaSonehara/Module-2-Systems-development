
package atividade4;

import java.util.Scanner;
import java.util.ArrayList;

public class Atividade4 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        ArrayList<Pagamentos> pagamentos = new ArrayList<Pagamentos>();
        
        String opcao = " ", nomeEmpresa;
       
       while(!opcao.equals("Pare")) {
            
             System.out.println("Digite o tipo de imposto (PIS/IPI) ou Pare para parar o programa: \n");
             opcao = entrada.next();
             
             Pagamentos pagamento;
             
             switch (opcao) {
                 
                case "PIS":
                
                    double debito, credito;
                    
                    System.out.println("Digite o nome da empresa: \n");
                    nomeEmpresa = entrada.next();
                    
                    System.out.println("Informe o valor do débito da empresa: \n");
                    debito = entrada.nextDouble();
                    
                    System.out.println("Informe o valor do crédito da empresa: \n");
                    credito = entrada.nextDouble();
                    
                    Pis pis = new Pis(debito, credito);
                    
                    pagamento = new Pagamentos(nomeEmpresa, pis);
                    
                    pagamentos.add(pagamento);
                    
                    break;
                
                case "IPI":
                    
                    double frete, seguro, outrasDispesas, aliquota, valorProduto;
                    
                    System.out.println("Digite o nome da empresa: \n");
                    nomeEmpresa = entrada.next();
             
                    System.out.println("Informe o valor de frete: \n");
                    frete = entrada.nextDouble();
                    
                    System.out.println("Informe o valor do seguro: \n");
                    seguro = entrada.nextDouble();
                    
                    System.out.println("Informe o valor de outras despesas: \n");
                    outrasDispesas = entrada.nextDouble();
                    
                    System.out.println("Informe a alíquota: \n");
                    aliquota = entrada.nextDouble();
                    
                    System.out.println("Informe o valor do produto: \n");
                    valorProduto = entrada.nextDouble();
                    
                    Ipi ipi = new Ipi(frete, seguro, outrasDispesas, aliquota, valorProduto);
                    
                    pagamento = new Pagamentos(nomeEmpresa, ipi);
                    
                    pagamentos.add(pagamento);
                    
                    break;
                    
                case "Pare":
                    
                    break;
              
            }
        }    
       
       for (Pagamentos pagamento : pagamentos) {
                 
            pagamento.mostraDescricao();
              
        }
    }    
}

