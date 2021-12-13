package Exercicios;

import java.util.Scanner;

public class Atividade08{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double produto1, produto2, produto3;

		System.out.print("Digite o preço do produto 1: ");
		produto1 = sc.nextDouble();

		System.out.print("Digite o preço do produto 2: ");
		produto2 = sc.nextDouble();

		System.out.print("Digite o preço do produto 3: ");
		produto3 = sc.nextDouble();

		if (produto1 < produto2 && produto1 < produto3) {
			System.out.println("O preço menor é: " + produto1);
		} else if (produto2 < produto1 && produto2 < produto3) {
			System.out.println("O preço menor é: " + produto2);
		} else {
			System.out.println("O preço menor é: " + produto3);
		}

		sc.close();
	}
}
