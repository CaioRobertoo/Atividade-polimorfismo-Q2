public class Gerente extends Funcionario {

    public Gerente(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public double calcularSalario() {
        return 1500.00 + 500.00; 
    }
}
