package biblioteca;

public class Livro {
    private String nome;
    private String autor;
    private String editora;
    private String edicao;
    
    public Livro(String nome, String autor, String editora, String edicao) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.edicao = edicao;
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
