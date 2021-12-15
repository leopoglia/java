import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase, resultado;
		

		System.out.print("Digite um caractere: ");
		frase = sc.nextLine();

		resultado = verificacao(frase);
		System.out.println(resultado);
		sc.close();
	}

	static String verificacao(String frase) {
	return frase.toLowerCase();
	}
}