package Exercicios;

import java.util.Scanner;

public class Atividade08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double valorA, valorB, valorC, delta;

		System.out.print("VALOR A: ");
		valorA = sc.nextDouble();

		System.out.print("VALOR B: ");
		valorB = sc.nextDouble();

		System.out.print("VALOR C: ");
		valorC = sc.nextDouble();

		delta = (valorB * valorB) - (4 * valorA * valorC);

		if (valorA == 0) {
			System.out.println("A EQUAÇÃO NÃO É DE SEGUNDO GRAU!");
		} else if (delta < 0) {
			System.out.println("NÃO POSSUI RAIZES REAIS");
		} else if (delta == 0) {
			System.out.println("POSSUI APENAS UMA RAIZ REAL");
		} else {
			System.out.println("POSSUI DUAS RAIZ REAL");
		}
		sc.close();
	}

}
