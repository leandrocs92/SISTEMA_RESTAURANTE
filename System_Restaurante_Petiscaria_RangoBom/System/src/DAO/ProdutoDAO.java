package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Vector;
import MODEL.Produto;
import TOOLS.FabricaConexao;

public class ProdutoDAO {

    public static Produto buscaProduto(double codMerc) {
        try (Connection con = FabricaConexao.criaConexao()) {
            String sql = "select * from produto where codigo = ?";
            //configurando a sql para ser executada em banco de dados
            PreparedStatement consulta = con.prepareStatement(sql);
            consulta.setDouble(1, codMerc);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                String nome = resultado.getString("nome");
                Double codigoProd = resultado.getDouble("codigo");
                Double precoVenda = resultado.getDouble("precovenda");
                Double quantidadeEstoque = resultado.getDouble("quantidadeestoque");
                Produto novoProduto = new Produto(nome, codigoProd, precoVenda, quantidadeEstoque);
                return novoProduto;
            }
        } catch (SQLException ex) {
            System.err.println("Erro na sql...");
        }
        return null;
    }
}
