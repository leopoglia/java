import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, resultado;

		System.out.print("Digite um número: ");
		num = sc.nextInt();

		resultado = absoluto(num);
		System.out.println(resultado);
		sc.close();
	}

	static int absoluto(int num) {
		int resultado = 0;
		if (num < 0) {
			resultado = (num * -1);
		} else {
			resultado = num;
		}
		return resultado;
	}

}
