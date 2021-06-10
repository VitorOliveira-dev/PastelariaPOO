package br.sp.senac.tads3a.grupo1.models;

import java.util.Date;


public class FuncionarioComissao extends Funcionario{
    
    private float Comissao;
    
    public FuncionarioComissao(String nome, String CPF, int funcionarioId, float Comissao,String departamento){
        super(nome,  CPF, funcionarioId, departamento);
        this.Comissao = Comissao;
    }

    public float getComissao() {
        return Comissao;
    }

    public void setComissao(float Comissao) {
        this.Comissao = Comissao;
    }
    
    @Override
    public float getCalculaGanhos(){
        
    return getComissao();
    }


}
