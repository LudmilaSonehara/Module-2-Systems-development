package supermercado;

public class ProdutoValidacao {
    // Validando o produto a ser salvo. Não consegui pensar em outra forma de validação. Já que´não é pra excluir o método, deixei do jeito que estava e adcionei uma mensagem de erro.
    public boolean validacao(ProdutoEntity produto){
        
        if(produto.getNome().equals("")){
            System.out.println("Produto inválido.");
            return false;
        } 
        else{
            
            return true;
        }
        
    }
}
