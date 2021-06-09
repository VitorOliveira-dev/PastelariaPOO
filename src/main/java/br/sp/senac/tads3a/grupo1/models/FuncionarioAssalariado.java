package br.sp.senac.tads3a.grupo1.models;

import java.util.Date;


public class FuncionarioAssalariado extends Funcionario{
    
    private float salario;
    
    public FuncionarioAssalariado(String nome,  String CPF, int funcionarioId, float salario, String departamento){
        super(nome, CPF, funcionarioId, departamento);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }



    
    
}
