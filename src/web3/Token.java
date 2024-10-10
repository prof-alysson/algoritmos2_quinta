package src.web3;

public class Token {
    protected String nome;
    protected Integer valor;

    Token(String nome, Integer valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getValor() {
        return valor;
    }
}
