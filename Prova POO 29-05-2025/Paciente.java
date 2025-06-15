public class Paciente extends Pessoa{
    private String dataDeNascimento;
    private String profissao;
    
    public Paciente(String nome, String endereco, String telefone, String cpf, String dataDeNascimento,
            String profissao) {
        super(nome, endereco, telefone, cpf);
        this.dataDeNascimento = dataDeNascimento;
        this.profissao = profissao;
    }
    public String getDataDeNascimento() {
        return dataDeNascimento;
    }
    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
