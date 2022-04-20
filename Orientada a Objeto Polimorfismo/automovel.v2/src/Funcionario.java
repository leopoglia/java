import java.util.Scanner;

public class Funcionario extends Pessoa {
	private double salario;

	public Funcionario(String nome, String cpf, String telefone, String genero, int idade, int matricula, int senha,
			double salario) {
		super(nome, cpf, telefone, genero, idade, matricula, senha);
		this.salario = salario;
	}

	static Scanner sc = new Scanner(System.in);

	public void mudarSalario(double precoAuto) {
		this.salario += precoAuto * 0.02;
	}

	public void mudarSalario(double precoAuto, double porc) {
		this.salario += precoAuto * porc;
	}

	@Override
	public String toString() {
		return super.toString() + "Funcionario [senha=" + getSenha() + "]" + "salario: " + salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String[] menu() {
		return new String[] { "(1) LISTAR PRODUTO", "(2) CADASTRAR PRODUTO", "(3) EDITAR PRODUTO",
				"(4) EXCLUIR PRODUTO", "(5) VENDER PRODUTO", "(6) VOLTAR" };
	}

}