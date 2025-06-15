
public abstract class Funcionario extends Pessoa {

    private float salario;

    public Funcionario(String nome, String endereco, String telefone, String cpf, float salario) {
        super(nome, endereco, telefone, cpf);
        if (salario >= 0) {
            this.salario = salario;
        }
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        if (salario >= 0) {
            this.salario = salario;
        }
    }
}
