
package br.sp.senac.tads3a.grupo1.models;

import java.util.Date;


public class Cliente extends Pessoa{

private int clienteId;

public Cliente(String nome, Date dataNascimento, String CPF, int clienteId){
    super(nome, dataNascimento, CPF);
    this.clienteId = clienteId;
}


    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

}
