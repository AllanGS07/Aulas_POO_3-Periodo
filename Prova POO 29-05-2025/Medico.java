import java.util.ArrayList;

public class Medico extends Funcionario{
    public String crm;
    public String horarioInicioAtendimento;
    public String horarioFimAtendimento;
    private ArrayList<PlanoDeSaude> listaPlanosDeSaude;
    private Especialidade especialidade;

    public Medico(String nome, String endereco, String telefone, String cpf, float salario, String crm,
            String horarioInicioAtendimento, String horarioFimAtendimento, PlanoDeSaude listaPlanosDeSaude,
            Especialidade especialidade) {
        super(nome, endereco, telefone, cpf, salario);
        this.crm = crm;
        this.horarioInicioAtendimento = horarioInicioAtendimento;
        this.horarioFimAtendimento = horarioFimAtendimento;
        this.listaPlanosDeSaude.add(listaPlanosDeSaude);
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getHorarioInicioAtendimento() {
        return horarioInicioAtendimento;
    }

    public void setHorarioInicioAtendimento(String horarioInicioAtendimento) {
        this.horarioInicioAtendimento = horarioInicioAtendimento;
    }

    public String getHorarioFimAtendimento() {
        return horarioFimAtendimento;
    }

    public void setHorarioFimAtendimento(String horarioFimAtendimento) {
        this.horarioFimAtendimento = horarioFimAtendimento;
    }

    public ArrayList<PlanoDeSaude> getListaPlanosDeSaude() {
        return listaPlanosDeSaude;
    }

    public void setListaPlanosDeSaude(PlanoDeSaude listaPlanosDeSaude) {
        this.listaPlanosDeSaude.add(listaPlanosDeSaude);
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }
}
