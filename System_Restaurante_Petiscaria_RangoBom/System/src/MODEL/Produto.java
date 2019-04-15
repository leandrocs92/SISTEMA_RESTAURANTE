
package MODEL;


public class Produto {
    private String nome;
    private double codigo;
    private String tipo;
    private double precoVenda;
    private double quantidadeEstoque;
    private double quantidadeMinima;
    private String fornecedor;
    private double precoCusto;

    public Produto(String nome, double codigo, String tipo, double precoVenda, double quantidadeEstoque, double quantidadeMinima, String fornecedor, double precoCusto) {
        this.nome = nome;
        this.codigo = codigo;
        this.tipo = tipo;
        this.precoVenda = precoVenda;
        this.quantidadeEstoque = quantidadeEstoque;
        this.quantidadeMinima = quantidadeMinima;
        this.fornecedor = fornecedor;
        this.precoCusto = precoCusto;
    }

    public String getNome() {
        return nome;
    }

    public double getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public double getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public double getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public void setQuantidadeEstoque(double quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void setQuantidadeMinima(double quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }
    
    
}
