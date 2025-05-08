package biblioteca;

public class Emprestimo {
    private Livro livro;
    private Usuario usuario;
    private String dataEmprestimo;
    private int multa;
    private int renovacoes;
    
    public Emprestimo(Livro livro, Usuario usuario, String dataEmprestimo) {
        if (livro.isEmprestado()) {
            throw new IllegalArgumentException("Livro já emprestado.");
        }
        this.livro = livro;
        this.livro.setEmprestado(true);
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.multa = 0;
        this.renovacoes = 0;
    }
    
    public void renovar() {
        renovacoes++;
        if (renovacoes > 3) {
            calcularMulta();
        }
    }

    public int calcularMulta(){
        return multa = renovacoes - 3;
    }
    
    public int entregar() {
        livro.setDevolvido();
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