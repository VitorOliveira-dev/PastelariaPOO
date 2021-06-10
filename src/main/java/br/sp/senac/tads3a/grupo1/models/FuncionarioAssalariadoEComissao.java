package br.sp.senac.tads3a.grupo1.models;


public class FuncionarioAssalariadoEComissao extends FuncionarioComissao{
    
    private float salario;
    
    public FuncionarioAssalariadoEComissao(String nome, String CPF, int funcionarioId, float Comissao, String departamento, float salario){
        super(nome,  CPF, funcionarioId, Comissao, departamento);
      this.salario = salario;
    }

    
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    @Override
    public float getCalculaGanhos(){
        
    return getSalario() + getComissao();
    }
    
}
