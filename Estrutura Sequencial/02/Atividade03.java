package Exercicio;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		double num3, res1, res2, res3;

		System.out.println("Digite um número inteiro para o cálculo das contas ");
		num1 = sc.nextInt();
		System.out.println("Digite um outro numero inteiro");
		num2 = sc.nextInt();
		System.out.println("Digite um numero real ");
		num3 = sc.nextDouble();

		res1 = (num1 * 2) + (num2 / 2);
		res2 = (num1 * 3) + num3;
		res3 = (num3 * num3 * num3);

		System.out.println("O produto do dobro do primeiro com metade do segundo " + res1);
		System.out.println("A soma do triplo do primeiro com o terceiro. " + res2);
		System.out.println("O terceiro elevado ao cubo. " + res3);
		sc.close();
	}

}
