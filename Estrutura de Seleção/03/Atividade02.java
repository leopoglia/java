package Exercicios;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num, soma;
		int operacao;

		System.out.print("Digite um número:");
		num = sc.nextDouble();

		System.out.println("Escolha a operação: \n(1)Par ou ímpar;\n(2)Positivo ou negativo;\n(3)Inteiro ou decimal.");
		operacao = sc.nextInt();

		if (operacao == 1) {
			soma = num % 2;
			if (soma == 0) {
				System.out.println("Seu número é par");
			} else {
				System.out.println("Seu número é impar");
			}
		} else if (operacao == 2) {
			if (num > 0) {
				System.out.println("Seu número é positivo");
			} else {
				System.out.println("Seu número é negativo");
			}
		} else if (operacao == 3) {
			soma = (num * 10) % 10;

			if (soma > 0) {
				System.out.println("Seu número é decimal");
			} else {
				System.out.println("Seu número é inteiro");
			}
		}
		sc.close();
	}

}
