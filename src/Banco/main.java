package Banco;

public class main {

    public static void main(String[] args) {


        Cliente Igor = new Cliente();
        Igor.setNome("Igor");

        acoes ac = new acoes(Igor);

        Conta cc = new contacorrente(Igor);
        cc.depositar(100 + 100);


        Conta pp = new contapoupança(Igor);
        cc.transferir(150, pp);

        //cc.imprimirextrato();
        //pp.imprimirextrato();

       cc.imprimiracoes();


    }
}
