/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv3;

public class Horista extends Funcionario{

    private int horasTrabalhadas;
    private float salarioPorHora;
    
    public Horista(String _nome, String _endereco, String _setor, String _cpf, String _telefone, float _salarioPorHora, int _horasTrabalhadas){
        super(_nome, _endereco, _setor, _cpf, _telefone);
        this.horasTrabalhadas = _horasTrabalhadas;
        this.salarioPorHora = _salarioPorHora;
    }
    
    public float DadosDePagamento() {
        return this.horasTrabalhadas * this.salarioPorHora;
    }

    @Override
    public void AplicarAumento(int porcentagem) {
        this.salarioPorHora = salarioPorHora + (((float)porcentagem / 100) * salarioPorHora);
    }

    
}
