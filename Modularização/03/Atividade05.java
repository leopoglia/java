import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		numerosPrimos();
		sc.close();
	}

	static void numerosPrimos() {
		int divisor = 0;
		for (int i = 1; i < 100; i++) {
			divisor = 0;
			for (int i2 = 1; i2 < i; i2++) {
				if (i % i2 == 0) {
					divisor += i;
				}
			}
			if (divisor == i) {
				System.out.println(i);
			}
		}
	}
}