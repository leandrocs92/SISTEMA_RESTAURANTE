/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import DAO.PessoaDAO;
import MODEL.Pessoa;
import java.sql.SQLException;

/**
 *
 * @author LEANDRO
 */
public class PessoaController {
    public static boolean criaPessoa(Pessoa novaPessoa){
        boolean resposta = PessoaDAO.criaPessoa(novaPessoa);
        return resposta;
    }

    public static Pessoa verificaUser(String cpf, String senha) throws SQLException {
        Pessoa novaPessoa = PessoaDAO.buscaPessoa(cpf, senha);
        return novaPessoa;
    }
}
