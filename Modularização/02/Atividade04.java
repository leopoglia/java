import java.util.Scanner;

public class Atividade04 {

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
		if (caractere == 'A' || caractere == 'a' || caractere == 'B' || caractere == 'b' || caractere == 'C'
				|| caractere == 'c' || caractere == 'D' || caractere == 'd' || caractere == 'E' || caractere == 'e'
				|| caractere == 'F' || caractere == 'f' || caractere == 'G' || caractere == 'g' || caractere == 'H'
				|| caractere == 'h' || caractere == 'I' || caractere == 'i' || caractere == 'J' || caractere == 'j'
				|| caractere == 'K' || caractere == 'k' || caractere == 'L' || caractere == 'l' || caractere == 'M'
				|| caractere == 'm' || caractere == 'N' || caractere == 'n' || caractere == 'O' || caractere == 'o'
				|| caractere == 'P' || caractere == 'p' || caractere == 'Q' || caractere == 'q' || caractere == 'R'
				|| caractere == 'r' || caractere == 'S' || caractere == 's' || caractere == 'T' || caractere == 't'
				|| caractere == 'U' || caractere == 'u' || caractere == 'V' || caractere == 'v' || caractere == 'W'
				|| caractere == 'w' || caractere == 'X' || caractere == 'x' || caractere == 'Y' || caractere == 'y'
				|| caractere == 'Z' || caractere == 'z') {
			resultado = true;
		} else {
			resultado = false;
		}
		return resultado;
	}
}