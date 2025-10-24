public class Main {
    public static void main(String[] args) {

        Funcionario[] listaDePagamento = new Funcionario[2];

        listaDePagamento[0] = new Gerente("Ana", "111.111.111-11");
        listaDePagamento[1] = new Programador("Carlos", "222.222.222-22");

        for (Funcionario f : listaDePagamento) {
            System.out.println("Funcionário: " + f.getNome());
            System.out.println("Salário: R$ " + f.calcularSalario());
            System.out.println("-------------------------");
        }
    }
}
