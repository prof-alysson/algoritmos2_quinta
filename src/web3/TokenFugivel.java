package src.web3;

public class TokenFugivel extends Token{
    Integer quantidade = 0;

    TokenFugivel(String nome, Integer valor) {
        super(nome, valor);
    }

    void setQuantidade(Integer quantidade) {
            if (quantidade > 0) {
                this.quantidade = quantidade;
            } else {
                this.quantidade = 1;
            }
    }

    public Integer getQuantidade() {
        return this.quantidade;
    }

    Token usarToken(){
        if(quantidade > 0){
            quantidade--;
            return new Token(this.nome, this.valor);
        }
        return null;
    }
}
