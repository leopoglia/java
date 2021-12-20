import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texto1, texto2, resultado;

		System.out.print("Digite o texto 1: ");
		texto1 = sc.nextLine();

		System.out.print("Digite o texto 2: ");
		texto2 = sc.nextLine();

		resultado = verificacao(texto1, texto2);
		System.out.println(resultado);
		sc.close();
	}

	static String verificacao(String texto1, String texto2) {
		String resultado;
		if (texto1.equals(texto2)) {
			resultado = "Textos iguais";
		} else {
			resultado = "Textos diferentes";
		}
		return resultado;
	}
}