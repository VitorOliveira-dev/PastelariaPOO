package br.sp.senac.tads3a.grupo1.models;

import java.util.ArrayList;
import java.util.Date;


public class Venda {
    
private int vendaId;
private Date dataVenda;
private float valorTotal;
private Cliente cliente;
private Funcionario funcionario;
private Produto produto;
private FuncionarioComissao funcionarioComissao;

ArrayList<Pedido> listar;


 

public Venda(int vendaId, Date dataVenda, float valorTotal, Cliente cliente,Funcionario funcionario, Produto produto,FuncionarioComissao funcionarioComissao){
    this.vendaId = vendaId;
    this.dataVenda = dataVenda;
    this.valorTotal = valorTotal;
    this.cliente= cliente;
    this.funcionario = funcionario;
    this.produto = produto;
    this.funcionarioComissao = funcionarioComissao;
}

    public FuncionarioComissao getFuncionarioComissao() {
        return funcionarioComissao;
    }

    public void setFuncionarioComissao(FuncionarioComissao funcionarioComissao) {
        this.funcionarioComissao = funcionarioComissao;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
    public ArrayList<Pedido> getListar() {
        return listar;
    }

    public void setListar(ArrayList<Pedido> listar) {
        this.listar = listar;
    }

}
