/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv3;


public abstract class Funcionario {
    
    private String nome, endereco, setor, cpf, telefone;
    
    public Funcionario(String _nome, String _endereco, String _setor, String _cpf, String _telefone){
        this.nome = _nome;
        this.endereco = _endereco;
        this.setor = _setor;
        this.cpf = _cpf;
        this.telefone = _telefone;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getEndereco(){
        return this.endereco;
    }
    
    public String getSetor(){
        return this.setor;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    
    public abstract float DadosDePagamento();
    public abstract void AplicarAumento(int porcentagem);
}
