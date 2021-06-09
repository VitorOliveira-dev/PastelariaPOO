package br.sp.senac.tads3a.grupo1.models;

import java.util.ArrayList;
import java.util.Date;


public class Venda {
    
private int vendaId;
private Date dataVenda;
private float valorTotal;
private int clienteid; // foreignkey cliente
private int funcionarioid; // foreignkey funcionario
private int  produtoid; // foreignkey produto
private FuncionarioComissao funcionarioComissao;
private ArrayList<Pedido> listar;


 

public Venda(int vendaId, Date dataVenda, float valorTotal, int clienteid,int funcionarioid, int  produtoid,FuncionarioComissao funcionarioComissao){
    this.vendaId = vendaId;
    this.dataVenda = dataVenda;
    this.valorTotal = valorTotal;
    this.clienteid= clienteid;
    this.funcionarioid = funcionarioid;
    this.produtoid = produtoid;
    this.funcionarioComissao = funcionarioComissao;
}
  public Venda(){
    }

    public ArrayList<Pedido> getListar() {
        return listar;
    }

    public void setListar(ArrayList<Pedido> listar) {
        this.listar = listar;
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

    public int getClienteid() {
        return clienteid;
    }

    public void setClienteid(int clienteid) {
        this.clienteid = clienteid;
    }

    public int getFuncionarioid() {
        return funcionarioid;
    }

    public void setFuncionarioid(int funcionarioid) {
        this.funcionarioid = funcionarioid;
    }

    public int getProdutoid() {
        return produtoid;
    }

    public void setProdutoid(int produtoid) {
        this.produtoid = produtoid;
    }

    public FuncionarioComissao getFuncionarioComissao() {
        return funcionarioComissao;
    }

    public void setFuncionarioComissao(FuncionarioComissao funcionarioComissao) {
        this.funcionarioComissao = funcionarioComissao;
    }


   
}
