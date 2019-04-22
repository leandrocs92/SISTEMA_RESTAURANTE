/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 *
 * @author LEANDRO
 */
public class PessoaDAO {
    public static boolean criaPessoa(Pessoa novaPessoa){
        boolean resposta;
         public static void criaPessoa(Pessoa novaPessoa) {
        try (Connection con = FabricaConexao.criaConexao()) {
            String sql = "insert into pessoa (nome, datanascimento, cpf, rg, numeropis, email, telefone, "
                    + "senha, rua, numero, bairro, complemento, referencia, cep, cidade, estado, admin, respseguranca, pergseguranca) "
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement insere = con.prepareStatement(sql);
            insere.setString(1, novaPessoa.getNome());
            insere.setString(3, novaPessoa.getCpf());
            insere.setString(4, novaPessoa.getRg());
            insere.setString(6, novaPessoa.getEmail());
            insere.setString(7, novaPessoa.getTel());
            insere.setString(8, novaPessoa.getSenha());
            insere.setString(9, novaPessoa.getEndereco().getRua());
            insere.setInt(10, novaPessoa.getEndereco().getNumero());
            insere.setString(11, novaPessoa.getEndereco().getBairro());
            insere.setString(12, novaPessoa.getEndereco().getComplemento());
            insere.setString(13, novaPessoa.getEndereco().getReferencia());
            insere.setString(14, novaPessoa.getEndereco().getCep());
            insere.setString(15, novaPessoa.getEndereco().getCidade());
            insere.setString(16, novaPessoa.getEndereco().getEstado());
            insere.setBoolean(17, novaPessoa.isCargo());
            insere.execute();
        } catch (SQLException ex) {
            System.err.println("Erro na execução da sql!!");
            ex.printStackTrace();
        }
    }
        return resposta;
    }
}
