package Exercicios;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double nota1, nota2, media;

		System.out.print("Digite a sua primeira nota:");
		nota1 = sc.nextDouble();

		System.out.print("Digite a sua segunda nota:");
		nota2 = sc.nextDouble();

		media = (nota1 + nota2) / 2;

		if (media >= 0 && media <= 3.9) {
			System.out.print("Conceito E\n REPROVADO");
		} else if (media >= 4 && media <= 5.9) {
			System.out.print("Conceito D\n REPROVADO");
		} else if (media >= 6 && media <= 7.4) {
			System.out.print("Coneito C\n APROVADO");
		} else if (media >= 7.5 && media <= 8.9) {
			System.out.print("Conceito B\n APROVADO");
		} else if (media >= 9 && media <= 10) {
			System.out.print("Conceito A\n APROVADO");
		} else {
			System.out.print("Error");
		}
		sc.close();
	}
}