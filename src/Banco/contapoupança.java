package Banco;

public class contapoupança extends Conta {

    public contapoupança (Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirextrato() {
        System.out.println(" ### Extrato Conta Poupança: ### ");
        imprmirInfComuns();
    }

    @Override
    public void imprimirsaldo() {
        System.out.println("Saldo conta poupança: ");
        super.imprimirsaldo();
    }



    @Override
    public void imprimiracoes() {
        super.imprimiracoes();

    }


}


