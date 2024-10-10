package src.contaComHeranca;

public class Conta {
    protected Integer numero;
    protected Integer saldo = 0;
    protected String titular;

    public void sacar(Double valor){
        Double valorEmCentavos = valor * 100;
        Integer valorInteiro = valorEmCentavos.intValue();

        if(valorInteiro<=this.saldo){
            this.saldo -= valorInteiro;
        }
    }

    public void depositar(Double valor){
        Double valorEmCentavos = valor * 100;
        Integer valorInteiro = valorEmCentavos.intValue();
        this.saldo += valorInteiro;
    }

    public Double saldo(){
        return this.saldo.doubleValue() / 100;
    }
}
