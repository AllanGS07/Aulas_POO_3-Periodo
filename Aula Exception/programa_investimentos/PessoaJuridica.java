package programa_investimentos;

public class PessoaJuridica extends Cliente {
    private String cnpj;

    public PessoaJuridica(String nome, String email, String cnpj) {
        super(nome, email);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public String getIdentificadorDocumento() {
        return cnpj;
    }
}
