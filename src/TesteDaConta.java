package src;

public class TesteDaConta {

    public static void main(String[] args){
        Conta conta = new Conta();
        Cliente cliente = new Cliente();
        cliente.setNome("João");

        conta.setTitular(cliente);
        assert conta.getTitular().equals("João");

        conta.depositar(1000.00);
        assert conta.consultarSaldo().equals(1000.00);
        System.out.println("Saldo de " + conta.consultarSaldo().toString());

        conta.depositar(1000.00);
        assert conta.consultarSaldo().equals(2000.00);
        System.out.println("Saldo de " + conta.consultarSaldo().toString());

        conta.sacar(750.00);
        assert conta.consultarSaldo().equals(1250.00);
        System.out.println("Saldo de " + conta.consultarSaldo().toString());

        conta.sacar(1500.00);
        assert conta.consultarSaldo().equals(1250.00);
        System.out.println("Saldo de " + conta.consultarSaldo().toString());

        conta.sacar(250.50);
        System.out.println("Saldo de " + conta.consultarSaldo().toString());


        conta.sacar(0.01);
        System.out.println("Saldo de " + conta.consultarSaldo().toString());

        conta.solicitarLimite(1000.00);
        assert conta.verificarLimite().equals(1000.00);

        System.out.println("Limite de " + conta.verificarLimite().toString());

        conta.sacar(1500.00);
        System.out.println("Saldo de " + conta.consultarSaldo().toString());



    }
}
