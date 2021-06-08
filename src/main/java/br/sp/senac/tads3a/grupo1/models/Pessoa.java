package br.sp.senac.tads3a.grupo1.models;

import java.util.Date;


public class  Pessoa {

private String nome;
private Date dataNascimento;
private String CPF;

public Pessoa(String nome, Date dataNascimento, String CPF){
    this.nome = nome;
    this.dataNascimento = dataNascimento;
    this.CPF = CPF;
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }


}
