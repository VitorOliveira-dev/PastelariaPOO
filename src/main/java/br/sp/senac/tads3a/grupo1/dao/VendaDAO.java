/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sp.senac.tads3a.grupo1.dao;

import br.sp.senac.tads3a.grupo1.models.Cliente;
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

            comandoSQL = conexao.prepareStatement("INSERT INTO Venda(datavenda,valortotal, clienteid )"
                    + " VALUES (NOW(), ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);

            comandoSQL.setFloat(1, venda.getValorTotal());
            comandoSQL.setInt(2,  venda.getCliente().getClienteId());

            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

                ResultSet pk = comandoSQL.getGeneratedKeys();
                if (pk.next()) {
                    venda.setVendaId(pk.getInt(1));

                    for (Pedido item : venda.getListar()) {

                        PreparedStatement comandoSQLItens = conexao.prepareStatement("INSERT INTO pedido (produtoid, vendaid, quantidade,valorUnitario) VALUES (?,?,?,?)",
                                Statement.RETURN_GENERATED_KEYS);

                        comandoSQLItens.setInt(1, item.getProduto().getProdutoId());
                        comandoSQLItens.setInt(2, venda.getVendaId());
                        comandoSQLItens.setInt(3, item.getQuantidade());
                        comandoSQLItens.setFloat(4, item.getValorUnitario());

                        int itensAfetados = comandoSQLItens.executeUpdate();
                        if (itensAfetados < 0) {
                            throw new SQLException("Falha ao inserir itens do pedido");
                        }
                    }
                } else {
                    throw new SQLException("Falha ao obter o ID da venda");
                }
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

  /**  public static ArrayList<Cliente>  vendaBuscarCliente(String pNome, int Id) {

        ArrayList<Cliente> listaClientes = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            conexao = Conexao.abrirConexao();
            comandoSQL = conexao.prepareStatement("SELECT * FROM cliente WHERE id LIKE ? OR nome LIKE ?");
            comandoSQL.setInt(1, Id);
            comandoSQL.setString(2, pNome);

            rs = comandoSQL.executeQuery();

            while (rs.next()) {
                Cliente obj = new Cliente();

                obj.setCodCliente(rs.getInt("cod_cliente"));
                obj.setNomeCliente(rs.getString("nome"));
                obj.setCPF(rs.getString("CPF"));

                listaClientes.add(obj);
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

    public static ArrayList<Produto> vendaBuscarProduto(String pCodigo, String pInstrumento) {

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            conexao = Conexao.abrirConexao();
            comandoSQL = conexao.prepareStatement("SELECT * FROM produto WHERE cod_produto LIKE ? OR instrumento LIKE ?");
            comandoSQL.setString(1, pCodigo);
            comandoSQL.setString(2, pInstrumento);

            rs = comandoSQL.executeQuery();

            while (rs.next()) {
                Produto obj = new Produto();
                obj.setCodProduto(rs.getInt("cod_produto"));
                obj.setInstrumento(rs.getString("instrumento"));
                obj.setValor(rs.getFloat("valor"));
                obj.setQuantidade(rs.getInt("qtd"));

                listaProdutos.add(obj);
            }

        } catch (Exception e) {
            listaProdutos = null;
        } finally {

            //Libero os recursos da memória
            try {
                if (comandoSQL != null) {
                    comandoSQL.close();
                }

                GerenciadorConexao.fecharConexao();

            } catch (SQLException ex) {
                System.out.println("ERROR " + ex);
            }
        }

        return listaProdutos;

    }*/
    
    
}
 