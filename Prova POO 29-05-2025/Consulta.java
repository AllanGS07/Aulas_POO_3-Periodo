public class Consulta {
    private Paciente pacienteAtendido;
    private Medico medicoAtendimento;
    private Secretario secretarioAgendou;
    private String horaDaConsulta;
    private PlanoDeSaude planoDeSaude;
    private float valorConsulta;
    private AnotacoesConsulta anotacoesConsulta;

    public Consulta(Paciente pacienteAtendido, Medico medicoAtendimento, Secretario secretarioAgendou,
            String horaDaConsulta, PlanoDeSaude planoDeSaude, AnotacoesConsulta anotacoesConsulta) {
        this.pacienteAtendido = pacienteAtendido;
        this.medicoAtendimento = medicoAtendimento;
        this.secretarioAgendou = secretarioAgendou;
        this.horaDaConsulta = horaDaConsulta;
        this.planoDeSaude = planoDeSaude;
        this.anotacoesConsulta = anotacoesConsulta;
    }

    public Consulta(Paciente pacienteAtendido, Medico medicoAtendimento, Secretario secretarioAgendou,
            String horaDaConsulta, float valorConsulta, AnotacoesConsulta anotacoesConsulta) {
        this.pacienteAtendido = pacienteAtendido;
        this.medicoAtendimento = medicoAtendimento;
        this.secretarioAgendou = secretarioAgendou;
        this.horaDaConsulta = horaDaConsulta;
        this.valorConsulta = valorConsulta;
        this.anotacoesConsulta = anotacoesConsulta;
    }

    public Paciente getPacienteAtendido() {
        return pacienteAtendido;
    }

    public void setPacienteAtendido(Paciente pacienteAtendido) {
        this.pacienteAtendido = pacienteAtendido;
    }

    public Medico getMedicoAtendimento() {
        return medicoAtendimento;
    }

    public void setMedicoAtendimento(Medico medicoAtendimento) {
        this.medicoAtendimento = medicoAtendimento;
    }

    public Secretario getSecretarioAgendou() {
        return secretarioAgendou;
    }

    public void setSecretarioAgendou(Secretario secretarioAgendou) {
        this.secretarioAgendou = secretarioAgendou;
    }

    public String getHoraDaConsulta() {
        return horaDaConsulta;
    }

    public void setHoraDaConsulta(String horaDaConsulta) {
        this.horaDaConsulta = horaDaConsulta;
    }

    public PlanoDeSaude getPlanoDeSaude() {
        return planoDeSaude;
    }

    public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
    }

    public float getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(float valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public AnotacoesConsulta getAnotacoesConsulta() {
        return anotacoesConsulta;
    }

    public void setAnotacoesConsulta(AnotacoesConsulta anotacoesConsulta) {
        this.anotacoesConsulta = anotacoesConsulta;
    }
}
