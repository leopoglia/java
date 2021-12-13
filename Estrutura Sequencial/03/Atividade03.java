package Exercicios;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero1, numero2, alg1, alg2, alg3, alg4;

		System.out.println("Digite um número de 3 algorismo.");
		numero1 = sc.nextInt();

		alg1 = numero1 / 100 % 1000;
		alg2 = numero1 / 10 % 10;
		alg3 = numero1 % 10;
		numero2 = alg1 + (alg2 * 3) + (alg3 * 5);
		alg4 = numero2 % 7;

		System.out.println("O numero é " + alg1 + alg2 + alg3 + alg4);
		sc.close();
	}

}
