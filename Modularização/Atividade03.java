import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		Boolean resultado;
		System.out.print("Digite o número: ");
		num = sc.nextInt();

		resultado = resultado(num);
		System.out.println(resultado);
		sc.close();
	}

	static Boolean resultado(double num) {
		Boolean resultado;
		if (num % 2 == 0) {
			resultado = true;
		} else {
			resultado = false;
		}
		return resultado;
	}

}
