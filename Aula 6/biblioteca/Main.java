package biblioteca;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Introdução ao desenvolvimento de games - Volume 1: Entendendo o universo dos jogos", "Steve Rabin", "Cengage Learning", "1ª");
        Usuario usuario1 = new Usuario("Allan", "12345678900", "allan@gmail.com");
        Emprestimo emprestimo = new Emprestimo(livro1, usuario1, "17/09/2025");
        
        System.out.println("Dados do Livro:");
        System.out.println("Nome: " + livro1.getNome());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Editora: " + livro1.getEditora());
        System.out.println("Edição: " + livro1.getEdicao());
        
        System.out.println("\nDados do Usuário:");
        System.out.println("Nome: " + usuario1.getNome());
        System.out.println("CPF: " + usuario1.getCpf());
        System.out.println("Email: " + usuario1.getEmail());

        System.out.println("\nDados do Empréstimo:");
        System.out.println("Livro: " + emprestimo.getNome());
        System.out.println("Cliente: " + emprestimo.getNomeUsuario());
        System.out.println("Data de empréstimo: " + emprestimo.getDataEmprestimo());
        
        emprestimo.renovar();
        emprestimo.renovar();
        emprestimo.renovar();
        emprestimo.renovar();
        emprestimo.renovar();
        emprestimo.renovar();
        
        int multaFinal = emprestimo.entregar();
        System.out.println("\nValor da multa: R$" + multaFinal);
    }
}
