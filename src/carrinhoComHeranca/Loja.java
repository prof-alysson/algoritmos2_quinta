package src.carrinhoComHeranca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Loja {

    public static void main(String[] args) throws ProdutoInexistente {
        DateTimeFormatter parserData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Comprador mateus = new Comprador("Mateus", 20);
        Comprador joao = new Comprador("João", 16);

        Alimento arroz = new Alimento("Arroz", 25.30, LocalDate.parse("01/10/2025", parserData));
        Alimento feijao = new Alimento("Feijão", 18.00, LocalDate.parse("01/10/2024", parserData));
        Alimento farinha = new Alimento("Farinha", 30.00, LocalDate.parse("31/12/2024", parserData));

        Bebida skoll = new Bebida("Skoll", 12.0, LocalDate.parse("01/01/2025", parserData));
        Bebida Whisk = new Bebida("Natu Nobilis", 28.0, LocalDate.parse("01/01/2023", parserData));

        Carrinho carrinhoMateus = new Carrinho(mateus);
        Carrinho carrinhoJoao = new Carrinho(joao);

        if( !carrinhoJoao.addProduto(skoll)) {
            System.out.printf("%s não pode comprar %s\n",joao.getNome(), skoll.getNome());
        }
        ;
        if( !carrinhoMateus.addProduto(skoll)) {
            System.out.printf("%s não pode comprar %s\n",mateus.getNome(), skoll.getNome());
        }
        ;
        if( !carrinhoMateus.addProduto(feijao)) {
            System.out.printf("%s não pode comprar %s\n",mateus.getNome(), feijao.getNome());
        }

    }
}
