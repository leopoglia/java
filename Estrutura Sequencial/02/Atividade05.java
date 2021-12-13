package Exercicio;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double altura, homem, mulher;


		System.out.println("Teste para saber seu peso ideal, escreva a sua altura");
		altura = sc.nextDouble();

		homem = (72.7 * altura) - 58;
		mulher = (62.1 * altura) - 44.7;

			System.out.println("Se você é homem seu peso ideal é " + homem);

			System.out.println("Se você é mulher seu peso ideal é " + mulher);
		
		sc.close();
	}

}