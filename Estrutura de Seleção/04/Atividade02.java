package Exercicios;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, divisivel7, divisivel3, soma;
		
		System.out.print("Digite um número: ");
		numero = sc.nextInt();
		
		divisivel7 = numero % 7;
		
		divisivel3 = numero % 3;
		
		soma = divisivel7+divisivel3;
		
		
		switch(soma){
			case 0: System.out.println("Seu número é divisivel por 7 e 3.");
			break;
			default: System.out.println("Seu número não é divisivel por 7 e 3.");
		}
		sc.close();
	}

}
