package Exercicios;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double preco1, preco2, diferenca, porcentagem;
		String nome;

		System.out.println("Qual o nome do produto?");
		nome = sc.next();

		System.out.println("Qual o preço do produto atual?");
		preco1 = sc.nextDouble();

		System.out.println("Qual o preço do produto no mês anterior?");
		preco2 = sc.nextDouble();

		diferenca = preco1 - preco2;
		porcentagem = (preco1 / preco2 - 1) * 100;

		System.out.println("O produto " + nome + " está R$ " + diferenca
				+ " mais caro, o que corresponde a um aumento de " + porcentagem + "%");
		sc.close();
	}

}