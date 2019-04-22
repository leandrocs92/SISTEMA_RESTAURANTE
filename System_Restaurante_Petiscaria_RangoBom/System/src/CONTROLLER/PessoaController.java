/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import DAO.PessoaDAO;
import MODEL.Pessoa;

/**
 *
 * @author LEANDRO
 */
public class PessoaController {
    public static boolean criaPessoa(Pessoa novaPessoa){
        boolean resposta = PessoaDAO.criaPessoa(novaPessoa);
        return resposta;
    }
}
