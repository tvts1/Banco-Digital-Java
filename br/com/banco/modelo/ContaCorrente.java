package br.com.banco.modelo;

public class ContaCorrente extends Conta {

    private static final double TARIFA_SAQUE = 1.0;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void sacar(double valor) {
        double valorTotal = valor + TARIFA_SAQUE;
        if (saldo >= valorTotal) {
            saldo -= valorTotal;
        } else {
            System.out.println("Saldo insuficiente para saque com tarifa.");
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }
}
