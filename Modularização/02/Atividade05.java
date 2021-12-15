import java.util.Scanner;

public class Atividade05 {

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
		if (caractere == 'A' || caractere == 'B' || caractere == 'C' || caractere == 'D' || caractere == 'E'
				|| caractere == 'F' || caractere == 'G' || caractere == 'H' || caractere == 'I' || caractere == 'J'
				|| caractere == 'K' || caractere == 'L' || caractere == 'M' || caractere == 'N' || caractere == 'O'
				|| caractere == 'P' || caractere == 'Q' || caractere == 'R' || caractere == 'S' || caractere == 'T'
				|| caractere == 'U' | caractere == 'V' || caractere == 'W' || caractere == 'X' || caractere == 'Y'
				|| caractere == 'Z') {
			resultado = true;
		} else {
			resultado = false;
		}
		return resultado;
	}
}