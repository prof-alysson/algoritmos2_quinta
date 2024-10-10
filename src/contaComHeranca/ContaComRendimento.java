package src.contaComHeranca;

public class ContaComRendimento extends Conta {
    protected Double taxaRendimento = 0.0;

    public void setTaxaRendimento(Double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public void gerarRendimento(){
        Double saldo = this.saldo * (taxaRendimento/100);
        this.saldo += saldo.intValue();
    }
}
