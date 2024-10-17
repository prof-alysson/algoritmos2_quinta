package src.contaComHeranca;

public class ContaComLimite extends Conta{
    protected Integer limite = 0;

    public ContaComLimite(String titular, Double saldoInicial, Double limiteInicial) {
        super(titular, saldoInicial);
        this.limite = this.converterMoeda(limiteInicial);
    }

    public void concedeLimite(Double valor){
        Double valorEmCentavos = valor * 100;
        this.limite = valorEmCentavos.intValue();
    }

    public Boolean sacar(Double valor) throws ValorInvalido{
        if (valor <= 0)
            throw new ValorInvalido("Valor invalido");

        Double valorEmCentavos = valor * 100;
        Integer valorInteiro = valorEmCentavos.intValue();

        if(valorInteiro<=(this.saldo+this.limite)){
            this.saldo -= valorInteiro;
            return true;
        }
        return false;
    }
}
