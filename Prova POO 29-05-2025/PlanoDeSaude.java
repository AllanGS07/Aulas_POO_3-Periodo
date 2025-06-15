public class PlanoDeSaude extends Empresa{
    private String telefone;
    public PlanoDeSaude(String nome, String endereco, String telefone, String cnpj) {
        super(nome, endereco, cnpj);
        this.telefone = telefone;
    }
    
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
