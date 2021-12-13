package Exercicios;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0, soma, impar = 0, par = 0;
		
		for(int i=1; i <=10; i++) {
			System.out.print("Digite o número: ");
			num = sc.nextInt();
			
			soma = num % 2;
			if(soma == 0) {
				par = par + 1;
			}else if(soma != 0) {
				impar = impar + 1;
			}
		}	
		
		System.out.println("PARES: " + par +"\nIMPARES: " + impar);
		sc.close();
	}
}