/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sp.senac.tads3a.grupo1.dao;

import br.sp.senac.tads3a.grupo1.models.Cliente;
import br.sp.senac.tads3a.grupo1.models.Produto;
import br.sp.senac.tads3a.grupo1.utils.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author paulo
 */
public class ProdutoDAO {
public static boolean salvarProduto(Produto cad) {

        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {

            conexao = Conexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("INSERT INTO produto (descricao, preco, quantidade, valorUnitario) VALUES(?,?,?,?)");

            instrucaoSQL.setString(1, cad.getDescricao());
            instrucaoSQL.setFloat(2, cad.getPreco());
            instrucaoSQL.setInt(3, cad.getQuantidade());
            instrucaoSQL.setFloat(4,cad.getValorUnitario());

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
