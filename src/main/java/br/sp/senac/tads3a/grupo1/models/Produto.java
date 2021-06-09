package br.sp.senac.tads3a.grupo1.models;


public class Produto {

private String descricao;
private float preco;
private int produtoId;
private float valorUnitario;
private int quantidade;


public Produto(String descricao, float preco, int produtoId, float valorUnitario, int quantidade){
    this.descricao = descricao;
    this.preco = preco;
    this.produtoId = produtoId;
    this.valorUnitario = valorUnitario;
    this.quantidade = quantidade;
}

    public Produto() {

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

 
}