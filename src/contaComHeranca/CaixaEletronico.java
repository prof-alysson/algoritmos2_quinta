package src.contaComHeranca;

public class CaixaEletronico {

    public static void imprimirSaldo(Conta c){
        System.out.printf("Saldo da Conta: R$ %7.2f\n", c.saldo());
    }

    public static void main(String[] args) {
        ContaComLimite c = new ContaComLimite("Alysson", 100.0, 1000.0);
        imprimirSaldo(c);
        c.depositar(100.0);
        imprimirSaldo(c);
        try {
            if (c.sacar(200.0)) {
                imprimirSaldo(c);
            } else {
                System.out.printf("Saldo Insuficiente!");
            }

            if (c.sacar(100.0)) {
                imprimirSaldo(c);
            } else {
                System.out.printf("Saldo Insuficiente!");
            }
            if (c.sacar(-1000.0)) {
                imprimirSaldo(c);
            } else {
                System.out.printf("Saldo Insuficiente!");
            }
        }
        catch (ValorInvalido e) {
            System.out.printf("Erro:" + e.getMessage());
        }

    }
}
