import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double valores[] = new double[5];

		for (int i = 0; i < valores.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			valores[i] = sc.nextDouble();
		}
		System.out.println("\n");
		for (int i = 0; i < valores.length; i++) {
			System.out.println((i + 1) + "º número: " + valores[i]);
		}
		System.out.println("\nSoma: " + (valores[0] + valores[1] + valores[2] + valores[3] + valores[4]));
		System.out.println("\nSoma: " + (valores[0] * valores[1] * valores[2] * valores[3] * valores[4]));
		sc.close();
	}
}