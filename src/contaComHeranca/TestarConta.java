package src.contaComHeranca;

public class TestarConta {
    public static void main(String[] args) {
        Conta conta = new Conta();
        ContaComLimite limite = new ContaComLimite();

        conta.depositar(1000.0);
        conta.sacar(200.0);
        System.out.printf("Saldo de %.2f\n", conta.saldo());

        conta.sacar(1000.0);
        System.out.printf("Saldo de %.2f\n", conta.saldo());

        limite.concedeLimite(1000.0);
        limite.depositar(1000.0);
        limite.sacar(200.0);
        System.out.printf("Saldo de %.2f\n", limite.saldo());

        limite.sacar(1000.0);
        System.out.printf("Saldo de %.2f\n", limite.saldo());

        ContaComRendimento renda = new ContaComRendimento();
        renda.setTaxaRendimento(10.0); // rende 10%
        renda.depositar(1000.0);
        System.out.printf("Saldo de %.2f\n", renda.saldo());
        renda.gerarRendimento();
        System.out.printf("Saldo de %.2f\n", renda.saldo());
        renda.gerarRendimento();
        System.out.printf("Saldo de %.2f\n", renda.saldo());
        renda.gerarRendimento();
        System.out.printf("Saldo de %.2f\n", renda.saldo());
        renda.gerarRendimento();
        System.out.printf("Saldo de %.2f\n", renda.saldo());
    }
}
