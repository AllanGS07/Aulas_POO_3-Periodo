package locadora_de_veiculos;

public class PessoaFisica extends Pessoa{
    private String cpf;

    public PessoaFisica(String cpf, String endereco, String nome, String telefone) {
        super(endereco, nome, telefone,1);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}