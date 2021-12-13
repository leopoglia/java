package Exercicios;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int resp1, resp2, resp3, resp4, resp5, total;

		System.out.print(
				"--------INTERROGATÓRIO--------\n-----RESPONDA AS PERGUNTAS-----\n-------(1) SIM | (0) NÃO-------");
		System.out.print("\nTelefonou para a vítima?");
		resp1 = sc.nextInt();

		System.out.print("\nEsteve no local do crime?");
		resp2 = sc.nextInt();

		System.out.print("\nMora perto da vítima?");
		resp3 = sc.nextInt();

		System.out.print("\nDevia para a vítima?");
		resp4 = sc.nextInt();

		System.out.print("\nJá trabalhou com a vítima?");
		resp5 = sc.nextInt();

		total = resp1 + resp2 + resp3 + resp4 + resp5;

		if (total <= 1) {
			System.out.println("----------Inocente----------");
		} else if (total == 2) {
			System.out.println("----------Suspeita----------");
		} else if (total == 3 || total == 4) {
			System.out.println("----------Cúmplice----------");
		} else if (total == 5) {
			System.out.println("----------Assassino---------");
		} else {
			System.out.println("-----------ERROR-----------");
		}

		sc.close();
	}

}
