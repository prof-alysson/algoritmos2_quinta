package src.carrinhoComHeranca;

class ProdutoInexistente extends Exception {
    public ProdutoInexistente(String msg) {
        super(msg);
    }
}

public class Produto {
    String nome;
    Integer preco;

    private Integer converterMoeda(Double valor){
        Double valorEmCentavos = valor * 100;
        return valorEmCentavos.intValue();
    }

    private Double converterMoeda(Integer valor){
        return valor.doubleValue() / 100;
    }

    public Produto(String nome, Double valor) {
        this.nome = nome;
        this.preco = converterMoeda(valor);
    }

    public String toString(){
        return "Produto: " + nome + ", preço: " + converterMoeda(this.preco).toString();
    }

    public Boolean podeVender(Comprador c){
        if (c != null){
            return true;
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPreco() {
        return preco;
    }
}
