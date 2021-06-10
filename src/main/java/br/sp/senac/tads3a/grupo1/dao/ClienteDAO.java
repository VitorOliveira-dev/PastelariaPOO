/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sp.senac.tads3a.grupo1.dao;

import br.sp.senac.tads3a.grupo1.models.Cliente;
import br.sp.senac.tads3a.grupo1.utils.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author paulo
 */
public class ClienteDAO {
    
     public static boolean salvarCliente(Cliente cad) {

        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            System.out.println("entrou");
            conexao = Conexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("INSERT INTO Cliente (nome, cpf) VALUES(?,?)");

            instrucaoSQL.setString(1, cad.getNome());
            instrucaoSQL.setString(2, cad.getCPF());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println("cadastrado com sucesso");
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
