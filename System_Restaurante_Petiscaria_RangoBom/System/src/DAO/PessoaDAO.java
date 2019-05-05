/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.Pessoa;
import TOOLS.FabricaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LEANDRO
 */
public class PessoaDAO {

    public static boolean criaPessoa(Pessoa novaPessoa) {
        try {
            if (!consultaCpf(novaPessoa.getCpf())) {
                try (Connection con = FabricaConexao.criaConexao()) {
                    String sql = "insert into pessoa (nome, cpf, rg, telefone, cargo, email, senha"
                            + "values(?,?,?,?,?,?,?)";
                    PreparedStatement insere = con.prepareStatement(sql);
                    insere.setString(1, novaPessoa.getNome());
                    insere.setString(2, novaPessoa.getCpf());
                    insere.setString(3, novaPessoa.getRg());
                    insere.setString(4, novaPessoa.getTel());
                    insere.setBoolean(5, novaPessoa.isCargo());
                    insere.setString(6, novaPessoa.getEmail());
                    insere.setString(7, novaPessoa.getSenha());
                    insere.execute();
                } catch (SQLException ex) {
                    System.err.println("Erro na execução da sql!!");
                    ex.printStackTrace();
                }
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static boolean consultaCpf(String cpf) throws SQLException {
        int temp = 0;
        String cpfBanco = "";
        try (Connection con = FabricaConexao.criaConexao()) {
            String sql = "select * from pessoa where cpf = ?";
            PreparedStatement verifica = con.prepareStatement(sql);
            verifica.setString(1, cpf);
            ResultSet resultado = verifica.executeQuery();
            while (resultado.next()) {
                cpfBanco = resultado.getString("cpf");
                temp++;
            }
            if (temp == 0) {
                return false;
            } else {
                return true;
            }
        }
    }
}