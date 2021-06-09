/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sp.senac.tads3a.grupo1.dao;

import br.sp.senac.tads3a.grupo1.models.Cliente;
import br.sp.senac.tads3a.grupo1.models.Funcionario;
import br.sp.senac.tads3a.grupo1.models.Pedido;
import br.sp.senac.tads3a.grupo1.models.Produto;
import br.sp.senac.tads3a.grupo1.models.Venda;
import br.sp.senac.tads3a.grupo1.utils.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author paulo
 */
public class VendaDAO {

    public static boolean vendaVender(Venda venda) {

        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;

        try {
            conexao = Conexao.abrirConexao();

            comandoSQL = conexao.prepareStatement("INSERT INTO Venda(datavenda,valortotal, clienteid,funcionarioid,produtoid )"
                    + " VALUES (NOW(), ?, ?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);

            comandoSQL.setFloat(1, venda.getValorTotal());
            comandoSQL.setInt(2, venda.getCliente().getClienteId());
             comandoSQL.setInt(3, venda.getFuncionario().getFuncionarioId());
             comandoSQL.setInt(4, venda.getProduto().getProdutoId());
             
            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
                
                
            } else {
                retorno = false;
            }

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("ERROR " + e.getMessage());
            retorno = false;
        } finally {
            try {
                if (comandoSQL != null) {
                    comandoSQL.close();

                    Conexao.fecharConexao();
                }
            } catch (SQLException e) {
            }
        }

        return retorno;
    }

    public static ArrayList<Produto> vendaBuscarProduto() {

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            conexao = Conexao.abrirConexao();
            comandoSQL = conexao.prepareStatement("SELECT * FROM produto");

            rs = comandoSQL.executeQuery();

            while (rs.next()) {
                Produto p = new Produto();

                p.setDescricao(rs.getString("descricao"));
                p.setProdutoId(rs.getInt("produtoid"));

                listaProdutos.add(p);
            }

        } catch (ClassNotFoundException | SQLException e) {
            listaProdutos = null;
            System.out.println("ERROR " + e);
        } finally {

            //Libero os recursos da memória
            try {
                if (comandoSQL != null) {
                    comandoSQL.close();
                }

                Conexao.fecharConexao();

            } catch (SQLException ex) {
                System.out.println("ERROR " + ex);
            }
        }

        return listaProdutos;

    }

    public static ArrayList<Cliente> vendaBuscarCliente() {

        ArrayList<Cliente> listaClientes = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            conexao = Conexao.abrirConexao();
            comandoSQL = conexao.prepareStatement("SELECT * FROM cliente");

            rs = comandoSQL.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente(rs.getString("nome"), rs.getString("cpf"), rs.getInt("clienteid"));

                listaClientes.add(c);
            }

        } catch (ClassNotFoundException | SQLException e) {
            listaClientes = null;
            System.out.println("ERROR " + e);
        } finally {

            //Libero os recursos da memória
            try {
                if (comandoSQL != null) {
                    comandoSQL.close();
                }

                Conexao.fecharConexao();

            } catch (SQLException ex) {
                System.out.println("ERROR " + ex);
            }
        }

        return listaClientes;

    }

    public static ArrayList<Funcionario> vendaBuscarFuncionario() {

        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            conexao = Conexao.abrirConexao();
            comandoSQL = conexao.prepareStatement("SELECT * FROM funcionario WHERE departamento like 'venda'");

            rs = comandoSQL.executeQuery();

            while (rs.next()) {
                Funcionario f = new Funcionario(rs.getString("nome"), rs.getString("cpf"), rs.getInt("funcionarioid"), rs.getString("departamento"));

                listaFuncionarios.add(f);
            }

        } catch (ClassNotFoundException | SQLException e) {
            listaFuncionarios = null;
            System.out.println("ERROR " + e);
        } finally {

            //Libero os recursos da memória
            try {
                if (comandoSQL != null) {
                    comandoSQL.close();
                }

                Conexao.fecharConexao();

            } catch (SQLException ex) {
                System.out.println("ERROR " + ex);
            }
        }

        return listaFuncionarios;

    }

}
