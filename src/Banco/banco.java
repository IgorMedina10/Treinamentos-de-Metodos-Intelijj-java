package Banco;


import java.util.List;

public class banco extends Conta {
    private String nome;
    private List<Conta> contas;

    public banco(Cliente cliente) {
        super(cliente);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    @Override
    public void imprimirextrato() {

    }




}
