package Exercicios;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;

		System.out.print("Digite o número 1: ");
		num1 = sc.nextInt();

		System.out.print("Digite o número 2: ");
		num2 = sc.nextInt();

		System.out.print("Digite o número 3: ");
		num3 = sc.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println("O maior é: " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O maior é: " + num2);
		} else {
			System.out.println("O maior é: " + num3);
		}

		if (num1 < num2 && num1 > num3) {
			System.out.println("O do meio é: " + num1);
		} else if (num2 < num1 && num2 > num3) {
			System.out.println("O do meio é: " + num2);
		} else {
			System.out.println("O do meio é: " + num3);
		}

		if (num1 < num2 && num1 < num3) {
			System.out.println("O menor é: " + num1);
		} else if (num2 < num1 && num2 < num3) {
			System.out.println("O menor é: " + num2);
		} else {
			System.out.println("O menor é:" + num3);
		}

		sc.close();

	}

}
