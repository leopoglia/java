import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, resultado;

		System.out.print("Digite o número 1: ");
		num1 = sc.nextInt();

		System.out.print("Digite o número 2: ");
		num2 = sc.nextInt();

		resultado = conta(num1, num2);
		System.out.println(resultado);
		sc.close();
	}

	static int conta(int num1, int num2) {
		int soma = 0;
		for (int i = 0; i < num2; i++) {
			soma = soma + num1;
		}
		return soma;
	}

}
