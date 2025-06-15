public class AnotacoesConsulta {
    private String sintomasPaciente;
    private String prescricaoMedicamentos;
    private String pedidoExames;

    public AnotacoesConsulta(String sintomasPaciente, String prescricaoMedicamentos, String pedidoExames) {
        if (sintomasPaciente != null) {
            this.sintomasPaciente = sintomasPaciente;
        }
        if (prescricaoMedicamentos != null) {
            this.prescricaoMedicamentos = prescricaoMedicamentos;
        }
        if (pedidoExames != null) {
            this.pedidoExames = pedidoExames;
        }
    }

    public String getSintomasPaciente() {
        return sintomasPaciente;
    }

    public void setSintomasPaciente(String sintomasPaciente) {
        this.sintomasPaciente = sintomasPaciente;
    }

    public String getPrescricaoMedicamentos() {
        return prescricaoMedicamentos;
    }

    public void setPrescricaoMedicamentos(String prescricaoMedicamentos) {
        this.prescricaoMedicamentos = prescricaoMedicamentos;
    }

    public String getPedidoExames() {
        return pedidoExames;
    }

    public void setPedidoExames(String pedidoExames) {
        this.pedidoExames = pedidoExames;
    }
}