package br.sp.senac.tads3a.grupo1.controllers;

import br.sp.senac.tads3a.grupo1.dao.VendaDAO;
import br.sp.senac.tads3a.grupo1.models.Cliente;
import br.sp.senac.tads3a.grupo1.models.Funcionario;
import br.sp.senac.tads3a.grupo1.models.Produto;
import java.util.ArrayList;

public class VendaController {

    public static ArrayList<Produto> buscarProdutos() {

        ArrayList<Produto> produtos = VendaDAO.vendaBuscarProduto();

        return produtos;
    }

    public static ArrayList<Cliente> buscarClientes() {

        ArrayList<Cliente> clientes = VendaDAO.vendaBuscarCliente();

        return clientes;
    }
    
        public static ArrayList<Funcionario> buscarFuncionarios() {

        ArrayList<Funcionario> funcionarios = VendaDAO.vendaBuscarFuncionario();

        return funcionarios;
    }

}
