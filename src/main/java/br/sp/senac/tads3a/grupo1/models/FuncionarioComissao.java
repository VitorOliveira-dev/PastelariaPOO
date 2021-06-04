package br.sp.senac.tads3a.grupo1.models;

import java.util.Date;


public class FuncionarioComissao extends Funcionario{
    
    private float taxaComissao;
    private float vendas;
    
    public FuncionarioComissao(String nome, Date dataNascimento, String CPF, int funcionarioId, float taxaComissao, float vendas){
        super(nome, dataNascimento, CPF, funcionarioId);
        this.taxaComissao = taxaComissao;
        this.vendas = vendas;
    }

    public float getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(float taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    public float getVendas() {
        return vendas;
    }

    public void setVendas(float vendas) {
        this.vendas = vendas;
    }
    
    
    public double ganhos(){
    return getTaxaComissao() * getVendas();
}
}
