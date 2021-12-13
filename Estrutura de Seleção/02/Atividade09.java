package Exercicios;

import java.util.Scanner;

public class Atividade09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ano, soma;

		System.out.print("Digite em que ano você está:");
		ano = sc.nextInt();

		soma = ano % 4;

		if (soma == 0) {
			System.out.println("O ano é bissexto!");
		} else {
			System.out.println("O ano não é bissexto");
		}
		sc.close();
	}

}