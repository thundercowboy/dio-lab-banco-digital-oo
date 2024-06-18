package application;

import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.setNome("Raphael");

        Conta cc = new ContaCorrente(c1);
        Conta poupanca = new ContaPoupanca(c1);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}