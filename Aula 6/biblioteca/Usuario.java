package biblioteca;

public class Usuario {
    private String nome;
    private String cpf;
    private String email;
    
    public Usuario(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }
    
    String getNome() {
        return nome;
    }
    
    String getCpf() {
        return cpf;
    }
    
    String getEmail() {
        return email;
    }
}
