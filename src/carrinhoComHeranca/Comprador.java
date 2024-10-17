package src.carrinhoComHeranca;

public class Comprador {
    Integer idade;
    String nome;

    public Comprador(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
}
