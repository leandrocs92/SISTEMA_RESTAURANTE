
package MODEL;


public class Pessoa {
    private String nome;
    private String cpf;
    private String rg;
    private String tel;
    private Endereco endereco;
    private boolean cargo;
    private String email;
    private String senha;

    public Pessoa(String nome, String cpf, String rg, String tel, Endereco endereco, boolean cargo, String email, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.tel = tel;
        this.endereco = endereco;
        this.cargo = cargo;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getTel() {
        return tel;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public boolean isCargo() {
        return cargo;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setCargo(boolean cargo) {
        this.cargo = cargo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
