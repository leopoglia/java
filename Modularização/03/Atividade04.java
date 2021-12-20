import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.print("Digite um número: ");
		num = sc.nextInt();

		verificacao(num);
		sc.close();
	}

	static void verificacao(int num) {
		int contador = 0;
		while (num != 0) {
			num = num / 10;
			contador++;
		}
		System.out.println(contador);
	}
}