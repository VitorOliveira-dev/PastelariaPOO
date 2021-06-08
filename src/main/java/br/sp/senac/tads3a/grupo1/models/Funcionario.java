package br.sp.senac.tads3a.grupo1.models;

import java.util.Date;

public class Funcionario extends Pessoa{
       

       private int funcionarioId;
       private String departamento;

    public Funcionario(String nome, Date dataNascimento, String CPF, int funcionarioId, String departamento) {
        super(nome, dataNascimento, CPF);
        this.funcionarioId = funcionarioId;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public int getFuncionarioId() {
        return funcionarioId;
    }

    public void setFuncionarioId(int funcionarioId) {
        this.funcionarioId = funcionarioId;
    }

    
       
}
