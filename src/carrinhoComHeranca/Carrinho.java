package src.carrinhoComHeranca;

import java.util.ArrayList;

public class Carrinho {
    Comprador comprador;
    ArrayList<Produto> produtos;

    public Carrinho(Comprador comprador) {
        this.produtos = new ArrayList<>();
        this.comprador = comprador;
    }

    public Boolean addProduto(Produto produto) throws ProdutoInexistente {
        if(produto != null) {
            if(produto.podeVender(comprador)){
                produtos.add(produto);
                return true;
            }
            else {
                return false;
            }
        }
        else{
            throw new ProdutoInexistente("insira um produto válido!");
        }
    }
}
