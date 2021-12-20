import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texto, resultado;

		System.out.println("Digite o texto: ");
		texto = sc.nextLine();

		resultado = verificacao(texto);
		System.out.println(resultado);
		sc.close();
	}

	static String verificacao(String texto) {
		return null;
	}

}
