import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char caractere;
		Boolean resultado;

		System.out.print("Digite um caractere: ");
		caractere = sc.next().charAt(0);

		resultado = verificacao(caractere);
		System.out.println(resultado);
		sc.close();
	}

	static Boolean verificacao(char caractere) {
		Boolean resultado = null;
		if (caractere == 'a' || caractere == 'b' || caractere == 'c' || caractere == 'd' || caractere == 'e'
				|| caractere == 'f' || caractere == 'g' || caractere == 'h' || caractere == 'i' || caractere == 'j'
				|| caractere == 'k' || caractere == 'l' || caractere == 'm' || caractere == 'n' || caractere == 'o'
				|| caractere == 'p' || caractere == 'q' || caractere == 'r' || caractere == 's' || caractere == 't'
				|| caractere == 'u' | caractere == 'v' || caractere == 'w' || caractere == 'x' || caractere == 'y'
				|| caractere == 'z') {
			resultado = true;
		} else {
			resultado = false;
		}
		return resultado;
	}
}