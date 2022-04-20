import java.util.Scanner;

public class Cliente extends Pessoa {

	@Override
	public String toString() {
		return super.toString() + "Cliente []";
	}

	static Scanner sc = new Scanner(System.in);

	public String[] menu() {
		return new String[] { "(1) LISTAR", "(2) VOLTAR" };
	}

	public Cliente(String nome, String cpf, String telefone, String genero, int idade, int matricula, int senha) {
		super(nome, cpf, telefone, genero, idade, matricula, senha);
	}

}