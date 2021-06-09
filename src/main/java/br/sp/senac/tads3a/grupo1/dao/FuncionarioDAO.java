/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sp.senac.tads3a.grupo1.dao;

import br.sp.senac.tads3a.grupo1.models.FuncionarioAssalariado;
import br.sp.senac.tads3a.grupo1.models.FuncionarioComissao;
import br.sp.senac.tads3a.grupo1.utils.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author paulo
 */
public class FuncionarioDAO {
    
     public static boolean CadastrarFunc(FuncionarioAssalariado cad) {

        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
                
            conexao = Conexao.abrirConexao();
            

            
            instrucaoSQL = conexao.prepareStatement("INSERT INTO funcionario (nome, cpf,departamento, salario) VALUES(?,?,?,?)");

            instrucaoSQL.setString(1, cad.getNome());
            instrucaoSQL.setString(2, cad.getCPF());
            instrucaoSQL.setString(3, cad.getDepartamento());
            instrucaoSQL.setFloat(4, cad.getSalario());
            
            
            
            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

            } else {
                retorno = false;
            }

        } catch (SQLException | ClassNotFoundException | NullPointerException ex ) {
            System.out.println("ERROR " + ex.getMessage());
            retorno = false;
        } finally {

            //Libero os recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                if (conexao != null) {
                    Conexao.fecharConexao();
                }

            } catch (SQLException ex) {

            }
        }

        return retorno;

    }
     
          public static boolean CadastrarFunc2(FuncionarioComissao cad) {

        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
                
            conexao = Conexao.abrirConexao();
            

            
            instrucaoSQL = conexao.prepareStatement("INSERT INTO funcionario (nome, cpf,departamento, salario) VALUES(?,?,?)");

            instrucaoSQL.setString(1, cad.getNome());
            instrucaoSQL.setString(2, cad.getCPF());
            instrucaoSQL.setFloat(3, cad.getSalario());
  
            
            
            
            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

            } else {
                retorno = false;
            }

        } catch (SQLException | ClassNotFoundException | NullPointerException ex ) {
            System.out.println("ERROR " + ex.getMessage());
            retorno = false;
        } finally {

            //Libero os recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                if (conexao != null) {
                    Conexao.fecharConexao();
                }

            } catch (SQLException ex) {

            }
        }

        return retorno;

    }
          
          
     
    
}
