/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv3;

/**
 *
 * @author ludmi
 */
public class Assalariado extends Funcionario{
    
    private float salario;
    
    public Assalariado(String _nome, String _endereco, String _setor, String _cpf, String _telefone, float _salario){
        super(_nome, _endereco, _setor, _cpf, _telefone);
        this.salario = _salario;
    }

    @Override
    public float DadosDePagamento() {
        return this.salario;
    }

    @Override
    public void AplicarAumento(int porcentagem) {
        this.salario = salario + (((float)porcentagem / 100) * salario);
    }

    
    
}
