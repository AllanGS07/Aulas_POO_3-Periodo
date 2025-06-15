public class Especialidade {
    private String nome;
    private String numeroCRM;
    
    public Especialidade(String nome, String numeroCRM) {
        this.nome = nome;
        this.numeroCRM = numeroCRM;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroCRM() {
        return numeroCRM;
    }

    public void setNumeroCRM(String numeroCRM) {
        this.numeroCRM = numeroCRM;
    }
}
