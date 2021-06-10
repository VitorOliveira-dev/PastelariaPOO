package br.sp.senac.tads3a.grupo1.models;

import java.util.Date;


public  abstract class  Pessoa implements Pagavel {

private String nome;
private String CPF;

public Pessoa(String nome, String CPF){
    this.nome = nome;
    this.CPF = CPF;
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }


}
