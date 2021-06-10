package br.sp.senac.tads3a.grupo1.models;


public class Pedido {

    private int pedidoId;
    private float valorUnitario;
    private int quantidade;
    private float valorTotal;
    private Produto produto;
   private Venda venda ;
    
    public Pedido(int pedidoId, float valorUnitario, int quantidade, float valorTotal, Produto produto,Venda venda){
        this.pedidoId = pedidoId;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
        this.produto=produto;
        this.venda = venda;
    }

    public int getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
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

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }


    
    
}
