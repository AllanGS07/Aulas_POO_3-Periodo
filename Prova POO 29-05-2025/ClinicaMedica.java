import java.util.ArrayList;

public class ClinicaMedica extends Empresa{
    private String registroCRM;
    private ArrayList<Funcionario> funcionariosEmpregados;

    public ClinicaMedica(String nome, String endereco, String cnpj, String registroCRM) {
        super(nome, endereco, cnpj);
        this.registroCRM = registroCRM;
    }

    public String getRegistroCRM() {
        return registroCRM;
    }
    public void setRegistroCRM(String registroCRM) {
        this.registroCRM = registroCRM;
    }

    public ArrayList<Funcionario> getFuncionariosEmpregados() {
        return funcionariosEmpregados;
    }

    public void setFuncionariosEmpregados(Funcionario funcionariosEmpregados) {
        this.funcionariosEmpregados.add(funcionariosEmpregados);
    }
}
