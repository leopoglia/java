package Exercicios;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num, soma;

		System.out.println("Digite um número para saber se ele é inteiro ou decimal");
		num = sc.nextDouble();

		soma = (num * 10) % 10;

		if (soma > 0) {
			System.out.println("Seu número é decimal");
		} else {
			System.out.println("Seu número é inteiro");

			sc.close();
		}
	}

}
