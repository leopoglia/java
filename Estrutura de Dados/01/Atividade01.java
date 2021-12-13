import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeros[] = new int[20], impares [] = new int[20], pares [] = new int[20];
		
		for(int i = 0; i < numeros.length ; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			numeros[i] = sc.nextInt();
			
			if(numeros[i] == -1) {
				break;
			}
			
			if((numeros[i] % 2) == 0) {
				pares[i]++;
				pares[i] = numeros[i];
			}else {
				impares[i]++;
				impares[i] = numeros[i];
			}
		}
		
		
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] != 0) {
			System.out.println("NÚMEROS: " + numeros[i]);
			}
		}
		
		System.out.println("\n");
		
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] != 0 && impares[i] !=0) {
			System.out.println("IMPARES: " + impares[i]);
			}
		}
		
		System.out.println("\n");

		
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] != 0 && pares[i] !=0) {
			System.out.println("PARES: " + pares[i]);
			}
		}
		sc.close();
	}
}
