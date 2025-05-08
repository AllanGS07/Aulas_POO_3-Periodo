package biblioteca;

public class Livro {
    private String nome;
    private String autor;
    private String editora;
    private String edicao;
    private boolean emprestado = false;
    
    public Livro(String nome, String autor, String editora, String edicao) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.edicao = edicao;
    }
    
    public void setEmprestado(boolean emprestado) {
        this.emprestado = true;
    }

    public void setDevolvido() {
        this.emprestado = false;
    }

    public boolean isEmprestado() {
        return emprestado;
    }
    
    String getNome() {
        return nome;
    }
    
    String getAutor() {
        return autor;
    }
    
    String getEditora() {
        return editora;
    }
    
    String getEdicao() {
        return edicao;
    }
}