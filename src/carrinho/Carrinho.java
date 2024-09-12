package src.carrinho;

import java.util.ArrayList;

public class Carrinho {
    Cliente dono;
    Integer valorTotal = 0;
    ArrayList<Produto> produtos = new ArrayList<Produto>();
    ArrayList<Integer> quantidade = new ArrayList<Integer>();



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
        this.valorTotal += p.getPrecoCentavos() * qtde;
        produtos.add(p);
        quantidade.add(qtde);
    }

    public void removerProduto(Produto p, Integer qtde) {
        this.valorTotal -= p.getPrecoCentavos() * qtde;
        int posicao = produtos.indexOf(p);
        if (qtde == 0){
            produtos.remove(posicao);
            quantidade.remove(posicao);
            this.valorTotal -= p.getPrecoCentavos() * qtde;
        }
        else {
            Integer valorAntigo = quantidade.get(posicao);
            if (valorAntigo > qtde){
                quantidade.add(posicao, qtde);
                this.valorTotal -= p.getPrecoCentavos() * qtde;
            }
            else {
                System.out.printf("Quantidade Maior que o valor atual no carrinho!");
            }
        }
    }

}
