import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double numero, contador = 0, media = 0;
		
		do {
			
			System.out.print("Digite um número real: ");
			numero = sc.nextDouble();
			
			contador ++;
			
			media = media + numero;
			
		}while(numero > 0);
		
		contador= contador - 1;
		
		media = media / contador;
		
		System.out.println("Você digitou " +contador+  " números\nA média desses dá " +media);
		
		sc.close();
	}

}
