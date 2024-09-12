package src.carrinho;

public class Produto {
    private String nome;
    Integer preco; // em centavos, pois não temos como dividir em meio centavo.

    public void setPreco(Double preco) {
        /*Na API os valores são em reais
         Aqui também é um comentário

        */
        preco = preco * 100; // converte de reais em centavos
        if(preco > Integer.MAX_VALUE)
        {
            System.out.printf("Preço muito alto!");
        }
        else{
            Integer preco_centavos = preco.intValue(); // converte em inteiros
            this.preco = preco_centavos;
        }
    }

    public Double getPreco() {
        Double preco_reais = this.preco.doubleValue() / 100.0;
        return preco_reais;
    }
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
