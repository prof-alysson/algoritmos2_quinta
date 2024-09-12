package src.carrinho;

import java.util.ArrayList;

public class Carrinho {
    Cliente dono;
    Integer valorTotal;
    ArrayList<Produto> produtos;
    ArrayList<Integer> quantidade;

    public Cliente getDono() {
        return this.dono;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }

    public Double getTotal() {
        return this.valorTotal.doubleValue() / 100;
    }

    public void adicionarProduto(Produto p, Integer qtde) {

    }

    public void removerProduto(Produto p, Integer qtde) {

    }

}
