import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		do {
			
			System.out.print("Escreva um número: ");
			numero = sc.nextInt();
			
		}while(numero > 1);
		
		sc.close();
	}

}
