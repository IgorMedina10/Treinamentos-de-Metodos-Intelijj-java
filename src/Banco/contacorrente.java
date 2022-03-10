package Banco;

import java.sql.SQLOutput;

public class contacorrente extends Conta{
    public contacorrente (Cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirextrato() {
        System.out.println(" ### Extrato conta corrente: ### ");
        super.imprmirInfComuns();

    }




    @Override
    public void imprimiracoes() {
        super.imprimiracoes();

    }

}

