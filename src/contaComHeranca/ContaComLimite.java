package src.contaComHeranca;

public class ContaComLimite extends Conta{
    protected Integer limite = 0;

    public void concedeLimite(Double valor){
        Double valorEmCentavos = valor * 100;
        this.limite = valorEmCentavos.intValue();
    }

    public void sacar(Double valor){
        Double valorEmCentavos = valor * 100;
        Integer valorInteiro = valorEmCentavos.intValue();

        if(valorInteiro<=(this.saldo+this.limite)){
            this.saldo -= valorInteiro;
        }
    }
}
