package br.com.banco.app;

import br.com.banco.modelo.*;

public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setNome("Banco GPT");

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Maria");

        Conta cc1 = new ContaCorrente(cliente1);
        Conta cp1 = new ContaPoupanca(cliente1);

        cc1.depositar(500);
        cc1.sacar(100);
        cc1.transferir(200, cp1);

        ((ContaPoupanca) cp1).renderJuros();

        banco.adicionarConta(cc1);
        banco.adicionarConta(cp1);

        banco.listarContas();
    }
}
