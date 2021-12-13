package Exercicios;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double preco1, preco2, desconto1, desconto2, porcentagem;

		System.out.println("Para saber a porcentagem de desconto de um produto, digite o preço original dele.");
		preco1 = sc.nextDouble();
		System.out.println("E agora digite o preço com desconto");
		preco2 = sc.nextDouble();

		desconto1 = preco1 - preco2;
		desconto2 = desconto1 / 100;
		porcentagem = preco1 * desconto2;

		System.out.println("A porcentagem de desconto é de: " + porcentagem + "%.");
		sc.close();
	}

}
