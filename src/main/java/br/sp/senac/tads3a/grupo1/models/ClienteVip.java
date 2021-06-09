
package br.sp.senac.tads3a.grupo1.models;

import java.util.Date;


public class ClienteVip extends Cliente{
    
private float desconto;

    public ClienteVip(String nome, String CPF, int clienteId, float desconto) {
        super(nome, CPF, clienteId);
        this.desconto = desconto;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }



}
