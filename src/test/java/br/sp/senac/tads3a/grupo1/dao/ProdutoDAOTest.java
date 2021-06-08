/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sp.senac.tads3a.grupo1.dao;

import br.sp.senac.tads3a.grupo1.models.Produto;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author paulo
 */
public class ProdutoDAOTest {
    
   
    @org.junit.Test
    public void testSalvarProduto() {
            Produto produto = new Produto();
            
            produto.setDescricao("pastel");
            produto.setQuantidade(1);
            produto.setValorUnitario(10);
            produto.setPreco(10);
            ProdutoDAO dao = new ProdutoDAO();
            
            if (dao.salvarProduto(produto))
            {
                System.out.println("salvo com sucesso");
            }
            else{
                System.out.println("falha ao salvar");
            }
    }
    
}
