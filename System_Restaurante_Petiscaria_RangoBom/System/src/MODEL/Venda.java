
package MODEL;

import java.sql.Date;


public class Venda {
    private String nomeProduto;
    private String nomePessoa;
    private double precoProduto;
    private double codProduto;
    private String cpfPessoa;
    private int codVenda;
    private String formaPagamento;
    private double precoVenda;
    private Date dataVenda;

    public Venda(String nomeProduto, String nomePessoa, double precoProduto, double codProduto, String cpfPessoa, String formaPagamento, double precoVenda, Date dataVenda) {
        this.nomeProduto = nomeProduto;
        this.nomePessoa = nomePessoa;
        this.precoProduto = precoProduto;
        this.codProduto = codProduto;
        this.cpfPessoa = cpfPessoa;
        this.formaPagamento = formaPagamento;
        this.precoVenda = precoVenda;
        this.dataVenda = dataVenda;
    }

    public Venda(String nomeProduto, String nomePessoa, double precoProduto, double codProduto, String cpfPessoa, int codVenda, String formaPagamento, double precoVenda, Date dataVenda) {
        this.nomeProduto = nomeProduto;
        this.nomePessoa = nomePessoa;
        this.precoProduto = precoProduto;
        this.codProduto = codProduto;
        this.cpfPessoa = cpfPessoa;
        this.codVenda = codVenda;
        this.formaPagamento = formaPagamento;
        this.precoVenda = precoVenda;
        this.dataVenda = dataVenda;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public double getCodProduto() {
        return codProduto;
    }

    public String getCpfPessoa() {
        return cpfPessoa;
    }

    public int getCodVenda() {
        return codVenda;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public Date getDataVenda() {
        return dataVenda;
    }
    
    
}
