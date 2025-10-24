public class Programador extends Funcionario {

    public Programador(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public double calcularSalario() {
        return 1500.00 + (1500.00 * 0.20);
    }
}
