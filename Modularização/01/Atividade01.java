import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Digite um número: ");
		num = sc.nextInt();

		resultado(num);
		sc.close();
	}

	static void resultado(int num) {
		for (int i = 1; i < 11; i++) {
			System.out.println(i + " x " + num + " = " + (num * i));
		}
	}
}