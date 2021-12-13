package Exercicios;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero1, alg1, alg2, alg3;

		System.out.println("Escreva um número de 3 algarismo para invertermos ele.");
		numero1 = sc.nextInt();

		alg1 = numero1 / 100 % 1000;
		alg2 = numero1 / 10 % 10;
		alg3 = numero1 % 10;

		System.out.println("O número inverso é: " + alg3 + alg2 + alg1);
		sc.close();
	}

}
