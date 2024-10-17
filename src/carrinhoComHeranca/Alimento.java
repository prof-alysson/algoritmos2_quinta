package src.carrinhoComHeranca;

import java.time.LocalDate;
import java.util.Date;

public class Alimento extends Produto{
    private LocalDate dataValidade;
    public Alimento(String nome, double preco, LocalDate dataValidade) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

    public Boolean podeVender(Comprador c) {
        LocalDate hoje = LocalDate.now();
        if (hoje.isAfter(dataValidade)) {
            return false;
        }
        return super.podeVender(c);
    }
}
