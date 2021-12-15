import java.util.Scanner;

public class Atividade13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texto, resultado;

		System.out.println("Digite a sequência: ");
		texto = sc.next();

		resultado = binario(texto);
		System.out.println(resultado);
		sc.close();
	}

	static String binario(String texto) {
		String procurarPor0 = "0", procurarPor1 = "1", procurarPor2 = "2", procurarPor3 = "3", procurarPor4 = "4",
				procurarPor5 = "5", procurarPor6 = "6", procurarPor7 = "7", procurarPor8 = "8", procurarPor9 = "9";
		String resultado = null;

		Boolean certo0 = texto.toLowerCase().contains(procurarPor0.toLowerCase()),
				certo1 = texto.toLowerCase().contains(procurarPor1.toLowerCase()),
				certo2 = texto.toLowerCase().contains(procurarPor2.toLowerCase()),
				certo3 = texto.toLowerCase().contains(procurarPor3.toLowerCase()),
				certo4 = texto.toLowerCase().contains(procurarPor4.toLowerCase()),
				certo5 = texto.toLowerCase().contains(procurarPor5.toLowerCase()),
				certo6 = texto.toLowerCase().contains(procurarPor6.toLowerCase()),
				certo7 = texto.toLowerCase().contains(procurarPor7.toLowerCase()),
				certo8 = texto.toLowerCase().contains(procurarPor8.toLowerCase()),
				certo9 = texto.toLowerCase().contains(procurarPor9.toLowerCase());
		
		if (certo2 == true || certo3 == true || certo4 == true || certo5 == true || certo6 == true || certo7 == true
				|| certo8 == true || certo9 == true) {
			resultado = "Sua sequência não é binaria!!!";
		}
		if (certo0 == true && certo1 == true) {
			resultado = "Sua sequência é binaria =)";
		}
		return resultado;
	}

}
