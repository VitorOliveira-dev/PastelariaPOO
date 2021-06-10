package br.sp.senac.tads3a.grupo1.controllers;

import br.sp.senac.tads3a.grupo1.dao.RelatorioDAO;
import br.sp.senac.tads3a.grupo1.models.Funcionario;
import java.util.ArrayList;

public class RelatorioController {

    public static ArrayList<Funcionario> relatorio() {

        ArrayList<Funcionario> funcionarios = RelatorioDAO.relatorio();

        return funcionarios;
    }
}
