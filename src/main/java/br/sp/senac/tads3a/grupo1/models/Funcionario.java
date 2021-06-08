package br.sp.senac.tads3a.grupo1.models;

import java.util.Date;

public class Funcionario extends Pessoa {

    private int funcionarioId;

    public Funcionario(String nome, Date dataNascimento, String CPF, int funcionarioId) {
        super(nome, dataNascimento, CPF);
        this.funcionarioId = funcionarioId;
    }

    public int getFuncionarioId() {
        return funcionarioId;
    }

    public void setFuncionarioId(int funcionarioId) {
        this.funcionarioId = funcionarioId;
    }

}
