package locadora_de_veiculos;

public abstract class Pessoa {
    private String nome;
    private String telefone;
    private String endereco;
    private int quantidadeEmprestimos;
    private int limite;

    public Pessoa(String nome, String telefone, String endereco, int limite) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.limite = limite;
        this.quantidadeEmprestimos = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getQuantidadeEmprestimos() {
        return quantidadeEmprestimos;
    }

    public void realizarEmprestimo() {
        this.quantidadeEmprestimos++;
    }

    public void devolverEmprestimo() {
        this.quantidadeEmprestimos--;
    }

    public int getLimite() {
        return limite;
    }

    public boolean podeRealizarEmprestimo(){
        return this.getQuantidadeEmprestimos() < this.limite;
    }
}