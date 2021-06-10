package br.sp.senac.tads3a.grupo1.models;

import java.util.Date;


public class FuncionarioComissao extends Funcionario{
    
    private float Comissao;
    private float vendas;
    
    public FuncionarioComissao(String nome, String CPF, int funcionarioId, float Comissao, float vendas,String departamento){
        super(nome,  CPF, funcionarioId, departamento);
        this.Comissao = Comissao;
        this.vendas = vendas;
    }

    public float getComissao() {
        return Comissao;
    }

    public void setComissao(float Comissao) {
        this.Comissao = Comissao;
    }

    public float getVendas() {
        return vendas;
    }

    public void setVendas(float vendas) {
        this.vendas = vendas;
    }

    
    @Override
    public float getCalculaGanhos(){
        
    return getComissao();
    }


}
