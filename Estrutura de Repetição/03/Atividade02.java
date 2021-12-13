import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numero, acumulador = 0;
		
		do {
			
			System.out.print("Escreva um número: ");
			numero = sc.nextInt();
			
			acumulador = acumulador + numero;
			
		}while(numero > 0 || numero < 0);
		
		System.out.println("A soma dos número digitados é: " + acumulador);
		sc.close();
	}

}
