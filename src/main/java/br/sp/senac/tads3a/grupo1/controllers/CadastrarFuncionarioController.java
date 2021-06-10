/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sp.senac.tads3a.grupo1.controllers;

import br.sp.senac.tads3a.grupo1.dao.FuncionarioDAO;
import br.sp.senac.tads3a.grupo1.models.Funcionario;
import br.sp.senac.tads3a.grupo1.models.FuncionarioAssalariado;

/**
 *
 * @author paulo
 */
public class CadastrarFuncionarioController {
    public static boolean CadastrarFuncionario(String nomeF, String cpf, float salario, String departamento) {
        Funcionario funcionario = new Funcionario();
        FuncionarioAssalariado func = new FuncionarioAssalariado();
        func.setNome(nomeF);
        func.setCPF(cpf);
        func.setDepartamento(departamento);
        func.setSalario(salario);
        
        
        
    return FuncionarioDAO.CadastrarFunc(func);
    }
    
    
    
}
