package Exercicios;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2;

		System.out.print("Digite o número 01: ");
		num1 = sc.nextDouble();

		System.out.print("Digite o número 02: ");
		num2 = sc.nextDouble();

		if (num1 > num2) {
			System.out.println("Numero " + num1 + " é maior que o " + num2);
		} else {
			System.out.println("Numero " + num2 + " é maior que o " + num1);
			sc.close();
		}
	}

}
