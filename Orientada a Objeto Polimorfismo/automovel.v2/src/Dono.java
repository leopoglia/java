import java.util.Scanner;

public class Dono extends Pessoa {
	
	private double salarioDono = 30000;

	public Dono(String nome, String cpf, String telefone, String genero, int idade, int matricula, int senha, double salarioDono) {
		super(nome, cpf, telefone, genero, idade, matricula, senha);
		this.salarioDono = salarioDono;
	}
	
	static Scanner sc = new Scanner(System.in);
	
	@Override
	public String toString() {
		return super.toString() + "SALARIO: " + salarioDono;
	}

	public double getSalarioDono() {
		return salarioDono;
	}

	public void setSalarioDono(double salarioDono) {
		this.salarioDono = salarioDono;
	}

	@Override
	public String[] menu() {	
		return new String[] { "(1) LISTAR", "(2) CADASTRAR PRODUTO", "(3) EDITAR PRODUTO",
				"(4) EXCLUIR PRODUTO", "(5) VENDER PRODUTO", "(6) CADASTRAR FUNCIONÁRIO", "(7) EXCLUIR FUNCIONÁRIO", "(8) VOLTAR"};
	}


}