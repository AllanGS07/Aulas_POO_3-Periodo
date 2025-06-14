package locadora_de_veiculos;

public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private PessoaFisica representante;

    public PessoaJuridica(String cnpj, PessoaFisica representante, String endereco, String nome, String telefone) {
        super(endereco, nome, telefone, Integer.MAX_VALUE);
        this.cnpj = cnpj;
        this.representante = representante;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public PessoaFisica getRepresentante() {
        return representante;
    }

    public void setRepresentante(PessoaFisica representante) {
        this.representante = representante;
    }
}