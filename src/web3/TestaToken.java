package src.web3;

public class TestaToken {
    public static void main(String[] args){
        TokenFugivel f = new TokenFugivel("webLogin", 132412341);
        f.setQuantidade(10);
        System.out.printf("Quantidade agora: %d\n",f.getQuantidade());
        Token t = f.usarToken();
        Token t1 = f.usarToken();
        Token t2 = f.usarToken();
        System.out.printf("Quantidade agora: %d\n",f.getQuantidade());
        System.out.println(t2.nome);
        System.out.println(t1.nome);
        System.out.println(t.nome);

        TokenNaoFugivel nf = new TokenNaoFugivel("NFT", 67645675);
        nf.setIdUnico(356);
        nf.transferirDono("Alysson");

    }
}
