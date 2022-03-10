package Banco;

import java.util.Scanner;

public abstract class Conta implements iconta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected double saldocp;
    protected double saldocc;
    protected static double saldopp;

    protected Cliente cliente;


    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo = saldo - valor;
    }

    @Override
    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirsaldo() {
        System.out.println(String.format("Saldo: %.2f", this.saldo));

    }


    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


    protected void imprmirInfComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    public void imprimiracoes() {
        Scanner scan = new Scanner(System.in);
        int acoes;
        int contas;
        double acoes2;


        System.out.println(" ### O que será feito hoje? ### ");
        System.out.println("1 - Saldo: ");
        System.out.println("2 - Agencia e Conta: ");
        System.out.println("3 - Depositar: ");
        System.out.println("4 - Sacar: ");
        System.out.println("5 - Transferir: ");
        acoes = scan.nextInt();



        while (0 == acoes) {
            System.out.println("Escolha Um numero válido");
            acoes = scan.nextInt();

        }
        while (acoes > 10) {
            System.out.println("Escolha um numero válido");
            acoes = scan.nextInt();
        }


        while (acoes == 1) {

            imprimirsaldo();
            acoes = scan.nextInt();
            System.out.println("Obrigado por utilizar nossos serviços");

        }

        if (acoes == 2) {
            System.out.println(String.format("Agencia: %d", this.agencia));
            System.out.println(String.format("Numero: %d", this.numero));
            System.out.println("Obrigado por utilizar nossos serviços");


        }
        if (acoes == 3) {
            System.out.println("Digite o valor que será depositado");
            acoes2 = scan.nextDouble();
            System.out.println("O seu saldo atual é de: " + (saldo = saldo + acoes2) + "$");
            System.out.println("Obrigado por utilizar nossos serviços");
        }
        if (acoes == 4) {
            System.out.println("Digite o valor que irá sacar: ");
            acoes2 = scan.nextDouble();
            System.out.println("O seu saldo atual é de: " + (saldo = saldo - acoes2) + "$");
            System.out.println("Obrigado por utilizar nossos serviços");
        }
        if (acoes == 5) {
            System.out.println("Digite os dados da agencia: ");
            acoes = scan.nextInt();
            System.out.println("Digite os dados da conta: ");
            acoes = scan.nextInt();
            System.out.println("Digite o CPF do titular: ");
            acoes2 = scan.nextDouble();
            System.out.println("Digite o valor que irá tranfererir: ");
            acoes = scan.nextInt();
            System.out.println("Tranferência realizada com sucesso, comprovante será encaminhado em seu e-mail");
        }
        if (acoes == 9) {
            System.out.println("Obrigado por utilizar nossos serviços");
        }

    }
}