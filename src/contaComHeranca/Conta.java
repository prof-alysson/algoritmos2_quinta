package src.contaComHeranca;

class ValorInvalido extends Exception {
    public ValorInvalido(String msg) {
        super(msg);
    }
}

public class Conta {
    protected Integer numero;
    protected Integer saldo = 0;
    protected String titular;

    Integer converterMoeda(Double valor){
        Double valorEmCentavos = valor * 100;
        return valorEmCentavos.intValue();
    }

    Double converterMoeda(Integer valor){
        return valor.doubleValue() / 100;
    }

    public Conta(String titular, Double saldoInicial) {
        this.titular = titular;
        this.saldo = this.converterMoeda(saldoInicial);
    }


    public Boolean sacar(Double valor) throws ValorInvalido {
        if(valor<=0){
            throw new ValorInvalido("Saldo Insuficiente!");
        }
        Double valorEmCentavos = valor * 100;
        Integer valorInteiro = valorEmCentavos.intValue();

        if(valorInteiro<=this.saldo){
            this.saldo -= valorInteiro;
            return true;
        }
        return false;
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
