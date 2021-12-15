import java.util.Scanner;

public class Atividade12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		String sobrenome;

		System.out.print("Digite o seu nome inteiro: ");
		nome = sc.nextLine();

		sobrenome = operacao(nome);
		System.out.println(sobrenome);
		sc.close();

	}

	static String operacao(String nome) {
		String resultadoSobrenome;
		String[] parte = nome.split(" ");
		resultadoSobrenome = parte[2];
		return resultadoSobrenome;
	}
}