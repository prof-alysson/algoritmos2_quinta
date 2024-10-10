package src.web3;

public class TokenNaoFugivel extends Token {
    Integer idUnico = 0;
    String dono;

    TokenNaoFugivel(String nome, Integer valor){
        super(nome, valor);
    }

    void transferirDono(String novoDono){
        this.dono = novoDono;
    }

    void setIdUnico(Integer idUnico){
        this.idUnico = idUnico;
    }

    Integer getIdUnico(){
        return this.idUnico;
    }
}
