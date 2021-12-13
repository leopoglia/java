import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int contador = 0, numero, maiorNumero = 0, menorNumero = 999999999;

		do {

			contador++;

			System.out.print("Digite o numero " + contador + ": ");
			numero = sc.nextInt();

			if (numero > maiorNumero) {
				maiorNumero = numero;
			}
			
			if(numero < menorNumero) {
				menorNumero = numero;
			}

		} while (contador < 10);

		System.out.println("\nO maior número é: " + maiorNumero + "\nO menor número é: " + menorNumero);
		sc.close();
	}

}
