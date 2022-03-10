package Banco;

public interface iconta {

    void sacar (double valor);

    void depositar (double valor);

    void transferir (double valor, Conta contaDestino);

    void imprimirextrato();

    void imprimiracoes();

    default void imprimirsaldo() {

    }


}
