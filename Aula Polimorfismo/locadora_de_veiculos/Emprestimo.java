package locadora_de_veiculos;

public class Emprestimo {
    private Pessoa cliente;
    private Carro carro;
    private double valorTotal;
    private double valorMulta;
    private int quantidadeRenovacoes;

    public Emprestimo (Pessoa cliente, Carro carro){
        if(carro.isDisponivel()){
            if(cliente.podeRealizarEmprestimo()){
                this.cliente = cliente;
                this.carro = carro;
                this.cliente.realizarEmprestimo();
                this.carro.alugar();
                this.valorMulta = 0;
                this.valorTotal = 0;
                this.quantidadeRenovacoes = 0;
            } else{
                throw new IllegalArgumentException("Cliente não pode realizar mais empréstimos.");
            }
        } else{
            throw new IllegalArgumentException("Carro não está disponível para locação.");
        }
    }

    public void renovar(){
        this.quantidadeRenovacoes++;
    }

    public void devolver(){
        this.valorMulta = this.carro.calcularMulta(quantidadeRenovacoes);
        this.valorTotal = this.carro.getValorLocação() + this.valorMulta;
        this.cliente.devolverEmprestimo();
        this.carro.devolver();
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public double getValorMulta() {
        return valorMulta;
    }

}