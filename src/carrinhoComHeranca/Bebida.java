package src.carrinhoComHeranca;

import java.time.LocalDate;
import java.util.Date;

public class Bebida extends Alimento{

    public Bebida(String nome, double preco, LocalDate dataValidade) {
        super(nome, preco, dataValidade);
    }

    public Boolean podeVender(Comprador c) {
        if(c.idade < 18) {
            return false;
        }
        return super.podeVender(c);
    }
}
