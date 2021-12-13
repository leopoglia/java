import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pessoas[] = new int[5], idade[] = new int[5], tamanho[] = new int[5];
		
		for(int i = 0; i < pessoas.length ; i++) {
			System.out.println("PESSOA " +(i + 1)+ ": ");

			System.out.print("Digite sua idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Digite sua altura em cm: ");
			tamanho[i] = sc.nextInt();
		}
		
		for(int i = 5; i >= 0;) {
			System.out.println(i);
			i= i - 1;
			System.out.println("PESSOA" +i+": IDADE: " + idade[i] + " TAMANHO: " + tamanho[i]);
		}
		sc.close();
	}
}