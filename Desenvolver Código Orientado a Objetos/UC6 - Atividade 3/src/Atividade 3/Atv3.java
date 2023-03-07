package atv3;

import java.util.Scanner;
public class Atv3 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int qtdFuncionarios, horasTrabalhadas, aumentoPorcentagem;
        String nome, endereco, setor, cpf, telefone, opcao = "";
        float salario;
        
        System.out.println("Deseja informar quantos funcionários?");
        
        qtdFuncionarios = entrada.nextInt();
        
        while(qtdFuncionarios <= 0 || qtdFuncionarios > 10){
            System.out.println("Deseja informar quantos funcionários? Informe de 1 a 10.");
            qtdFuncionarios = entrada.nextInt();
        }
        
        Funcionario[] funcionarios = new Funcionario[qtdFuncionarios];
        
        entrada.nextLine();
        
        for(int i = 0; i<funcionarios.length; i++){
            
            System.out.println("--------------------------------");
            System.out.println("Digite dados do " + (i+1) + " funcionário.");
            System.out.println("Qual o tipo de funcionário?");
            System.out.println("[A] - Assalariado | [H] - Horista");
            
            opcao = entrada.nextLine();
            
            switch(opcao){
                
                case "A":
                    
                    System.out.println("*****************");
                    System.out.println("Digite o Nome: ");
                    nome = entrada.nextLine();
                    System.out.println("Digite o endereço: ");
                    endereco = entrada.nextLine();
                    System.out.println("Digite o setor: ");
                    setor = entrada.nextLine();
                    System.out.println("Digite o cpf: ");
                    cpf = entrada.nextLine();
                    System.out.println("Digite o telefone: ");
                    telefone = entrada.nextLine();
                    System.out.println("Digite o salario: ");
                    salario = entrada.nextFloat();
                    funcionarios[i] = new Assalariado(nome, endereco, setor, cpf, telefone, salario);
                    break;
                    
                case "H":
                    System.out.println("*****************");
                    System.out.println("Digite o Nome: ");
                    nome = entrada.nextLine();
                    System.out.println("Digite o endereço: ");
                    endereco = entrada.nextLine();
                    System.out.println("Digite o setor: ");
                    setor = entrada.nextLine();
                    System.out.println("Digite o cpf: ");
                    cpf = entrada.nextLine();
                    System.out.println("Digite o telefone: ");
                    telefone = entrada.nextLine();
                    System.out.println("Digite o salario POR HORA: ");
                    salario = entrada.nextFloat();
                    System.out.println("Digite as horas trabalhadas: ");
                    horasTrabalhadas = entrada.nextInt();
                    funcionarios[i] = new Horista(nome, endereco, setor, cpf, telefone, salario, horasTrabalhadas);
            }
            
            entrada.nextLine();
        }
        
        for(int i = 0; i < funcionarios.length; i++){
            System.out.println("**************");
            System.out.println("Dados do " + (i+1) + " funcionario.");
            System.out.println("Nome: " + funcionarios[i].getNome());
            System.out.println("Endereco: " + funcionarios[i].getEndereco());
            System.out.println("Setor: " + funcionarios[i].getSetor());
            System.out.println("Cpf: " + funcionarios[i].getCpf());
            System.out.println("Telefone: " + funcionarios[i].getTelefone());
            System.out.println("Salario: " + funcionarios[i].DadosDePagamento());
        }
        
        System.out.println("Informe o aumento em porcentagem.");
        
        aumentoPorcentagem = entrada.nextInt();
        
        for(int i = 0; i < funcionarios.length; i++){
            funcionarios[i].AplicarAumento(aumentoPorcentagem);
        }
        
        for(int i = 0; i < funcionarios.length; i++){
            System.out.println("**************");
            System.out.println("Dados do " + (i+1) + " funcionario.");
            System.out.println("Nome: " + funcionarios[i].getNome());
            System.out.println("Endereco: " + funcionarios[i].getEndereco());
            System.out.println("Setor: " + funcionarios[i].getSetor());
            System.out.println("Cpf: " + funcionarios[i].getCpf());
            System.out.println("Telefone: " + funcionarios[i].getTelefone());
            System.out.println("Novo Salario com aumento: " + funcionarios[i].DadosDePagamento());
        }
        
    }
    
}
