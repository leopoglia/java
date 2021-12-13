package Exercicios;

import java.util.Scanner;

public class Atividade08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double preco, soma1, soma2;

		System.out.println("Digite o preço do produto para saber com o desconto de 9%");
		preco = sc.nextDouble();

		soma1 = preco * 0.09;
		soma2 = preco - soma1;

		System.out.println("O preço do produto com desconto foi de: " + soma2);
		sc.close();
	}
}
