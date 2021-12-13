package Exercicios;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1;

		System.out.print("Digite um número para saber se é positivo ou negativo: ");
		num1 = sc.nextDouble();

		if (num1 > 0) {
			System.out.println("Seu número é positivo.");
		} else {
			System.out.println("Seu número é negativo.");
			sc.close();
		}
	}

}
