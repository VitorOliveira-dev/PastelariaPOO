package br.sp.senac.tads3a.grupo1.dao;

import br.sp.senac.tads3a.grupo1.models.Funcionario;
import br.sp.senac.tads3a.grupo1.models.FuncionarioAssalariado;
import br.sp.senac.tads3a.grupo1.models.FuncionarioAssalariadoEComissao;
import br.sp.senac.tads3a.grupo1.models.FuncionarioComissao;
import br.sp.senac.tads3a.grupo1.utils.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RelatorioDAO {

    public static ArrayList<Funcionario> relatorio() {

        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            conexao = Conexao.abrirConexao();
            comandoSQL = conexao.prepareStatement("SELECT * FROM funcionario");

            rs = comandoSQL.executeQuery();

            while (rs.next()) {
                String departamento = rs.getString("departamento");

                switch (departamento) {
                    case "Vendas":
                        funcionarios.add(new FuncionarioComissao(rs.getString("nome"), rs.getString("CPF"), rs.getInt("funcionarioid"), rs.getFloat("comissao"), departamento));
                        break;
                    case "Gerente":
                        funcionarios.add(new FuncionarioAssalariadoEComissao(rs.getString("nome"), rs.getString("CPF"), rs.getInt("funcionarioid"), rs.getFloat("comissao"), departamento, rs.getFloat("salario")));
                        break;
                    case "Limpeza":
                        funcionarios.add(new FuncionarioAssalariado(rs.getString("nome"), rs.getString("CPF"), rs.getInt("funcionarioid"), rs.getFloat("salario"), departamento));
                        break;
                }

            }

        } catch (ClassNotFoundException | SQLException e) {
            funcionarios = null;
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
        return funcionarios;
    }
}
