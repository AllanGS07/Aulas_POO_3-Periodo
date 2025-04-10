package biblioteca;

public class Emprestimo {
    private Livro livro;
    private Usuario usuario;
    private String dataEmprestimo;
    private int multa;
    private int renovacoes;
    
    public Emprestimo(Livro livro, Usuario usuario, String dataEmprestimo) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.multa = 0;
        this.renovacoes = 0;
    }
    
    public void renovar() {
        renovacoes++;
        if (renovacoes > 3) {
            multa = renovacoes - 3;
        }
    }
    
    public int entregar() {
        return multa;
    }

    public String getNome() {
        return livro.getNome();
    }
    
    public String getNomeUsuario() {
        return usuario.getNome();
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }
}