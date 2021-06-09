package br.sp.senac.tads3a.grupo1.controllers;

import br.sp.senac.tads3a.grupo1.dao.VendaDAO;
import br.sp.senac.tads3a.grupo1.models.Cliente;
import br.sp.senac.tads3a.grupo1.models.Funcionario;
import br.sp.senac.tads3a.grupo1.models.FuncionarioComissao;
import br.sp.senac.tads3a.grupo1.models.Produto;
import br.sp.senac.tads3a.grupo1.models.Venda;
import java.util.ArrayList;
import java.util.Date;

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
        
   
        
            public static boolean vendaVender(float valortotal, int id_cliente, int  id_produto, int  id_funcionario) {
                 Venda vender = new Venda();
                vender.setClienteid(id_cliente);
                vender.setProdutoid(id_produto);
                vender.setFuncionarioid(id_funcionario);
                vender.setValorTotal(valortotal);
                
                
                
                
                
       return VendaDAO.vendaVender(vender);
    }
        
        

}
