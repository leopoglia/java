import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		Boolean resultado;

		System.out.print("Digite o número 1: ");
		num1 = sc.nextInt();

		System.out.print("Digite o número 2: ");
		num2 = sc.nextInt();

		resultado = multiplo(num1, num2);
		System.out.println(resultado);
		sc.close();
	}

	static Boolean multiplo(int num1, int num2) {
		Boolean multiplo;
		if (num2 / num1 == 0) {
			multiplo = true;
		} else {
			multiplo = false;
		}
		return multiplo;
	}
}