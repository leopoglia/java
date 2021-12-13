package Exercicios;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, soma;

		System.out.print("Digite um número: ");
		num = sc.nextInt();
		
		soma = num % 2;
		
		if (num == 0){
		System.out.println("O número é neutro");
		}else if(soma == 0) {
			System.out.println("O número é par");
		}else {
			System.out.println("O número é impar");
			
			sc.close();
		}
	}

}
