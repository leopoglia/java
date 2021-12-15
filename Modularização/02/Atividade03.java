import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base, expoente, resultado;
		
		System.out.print("Digite a base: ");
		base = sc.nextInt();
		
		System.out.print("Digite o expoente: ");
		expoente = sc.nextInt();
		
		resultado = conta(base, expoente);
		System.out.println(resultado);
		sc.close();
	}

	static int conta(int base, int expoente) {
		int divisao = 1;
		for (int i = 0; i < expoente; i++) {
			divisao = divisao * base;
		}
		return divisao;
	}

}
