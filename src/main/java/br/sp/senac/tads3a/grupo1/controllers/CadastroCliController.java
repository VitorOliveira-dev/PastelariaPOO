/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sp.senac.tads3a.grupo1.controllers;

import br.sp.senac.tads3a.grupo1.dao.ClienteDAO;
import br.sp.senac.tads3a.grupo1.models.Cliente;

/**
 *
 * @author paulo
 */
public class CadastroCliController {
    public static boolean Cadastrar(String nomecli, String cpfcli){
        Cliente cliente = new Cliente();
        cliente.setNome(nomecli);
        cliente.setCPF(cpfcli);
        
        
        
        
      return ClienteDAO.salvarCliente(cliente);
    }
}
