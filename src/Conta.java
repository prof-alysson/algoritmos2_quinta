package src;

public class Conta {
    Integer saldo = 0;
    Integer limite = 0;
    Cliente titular;

    void setTitular(Cliente novoTitular){
        this.titular = novoTitular;
    }

    String getTitular(){
        return this.titular.getNome();
    }

    void depositar(Double valor){
        valor = valor * 100;
        Integer valorEmCentavos = valor.intValue();
        if(valorEmCentavos > 0){
            this.saldo += valorEmCentavos;
        }
        else {
            System.out.println("O valor de depósito precisa ser maior que zero");
        }
    }

    Double consultarSaldo(){
        Double saldoEmReais = this.saldo.doubleValue() / 100;
        return saldoEmReais;
    }

    void sacar(Double valor){
        valor = valor * 100;
        Integer valorEmCentavos = valor.intValue();
        if(valorEmCentavos > 0){
            if( (this.saldo+this.limite) >= valorEmCentavos) {
                this.saldo -= valorEmCentavos;
            }
            else {
                System.out.println("Saldo insuficiente!");
            }
        }
        else {
            System.out.println("O valor de sacar precisa ser maior que zero");
        }
    }

    Boolean solicitarLimite( Double valor){
        valor = valor * 100;
        Integer valorEmCentavos = valor.intValue();
        if (valor > 0){
            this.limite = valorEmCentavos;
            return true;
        }
        else {
            return false;
        }
    }

    Double verificarLimite(){
        Double limiteEmReais = this.limite.doubleValue() / 100;
        return limiteEmReais;
    }
}