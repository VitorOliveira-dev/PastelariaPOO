/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sp.senac.tads3a.grupo1.controllers;

import br.sp.senac.tads3a.grupo1.dao.ProdutoDAO;
import br.sp.senac.tads3a.grupo1.models.Produto;

/**
 *
 * @author paulo
 */
public class CadastroProdutoController {
    
    public static boolean CadastrarProduto(String descricao, float preco){
       Produto produto = new Produto();
        produto.setDescricao(descricao);
        produto.setPreco(preco);
        
        
        
        
      return ProdutoDAO.salvarProduto(produto);
    }
}
