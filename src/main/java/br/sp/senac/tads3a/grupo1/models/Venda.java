package br.sp.senac.tads3a.grupo1.models;

import java.util.Date;


public class Venda {
    
private int vendaId;
private Date dataVenda;
private float valorTotal;

public Venda(int vendaId, Date dataVenda, float valorTotal){
    this.vendaId = vendaId;
    this.dataVenda = dataVenda;
    this.valorTotal = valorTotal;
}

    public int getVendaId() {
        return vendaId;
    }

    public void setVendaId(int vendaId) {
        this.vendaId = vendaId;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }


}
