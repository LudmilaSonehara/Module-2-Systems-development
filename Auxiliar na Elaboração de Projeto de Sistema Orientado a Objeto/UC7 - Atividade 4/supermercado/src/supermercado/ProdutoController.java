/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado;

/**
 *
 *   @author ludmi
 */
public class ProdutoController {
    // aqui ocorre todo o processo de validação e salvamento do produto
    public boolean salvarProduto(ProdutoEntity produto) {
        
        ProdutoValidacao validacaoProduto = new ProdutoValidacao();
        BancoDados bd = new BancoDados();
        if(validacaoProduto.validacao(produto)){
            // Salvando no banco de dados
            bd.salvarDadosNoBanco(produto);
            return true;
        }
        
        else{
            return false;
        }
    }
    
    
    
    
        
}
