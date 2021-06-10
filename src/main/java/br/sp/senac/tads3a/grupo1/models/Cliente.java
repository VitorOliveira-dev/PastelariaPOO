package br.sp.senac.tads3a.grupo1.models;

public class Cliente extends Pessoa {

    private int clienteId;

    public Cliente(String nome, String CPF, int clienteId) {
        super(nome, CPF);
        this.clienteId = clienteId;
    }

    public Cliente() {
   
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    @Override
    public float getCalculaGanhos() {
        return 0;
    }

}
