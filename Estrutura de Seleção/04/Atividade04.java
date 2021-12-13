package Exercicios;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero1, numero2, operacao, soma;

		System.out.println("Escolha: (1)Adição | (2) Subtração | (3) Multiplicação | (4) Divisão ");
		operacao = sc.nextInt();

		System.out.print("Digite o número 1: ");
		numero1 = sc.nextInt();

		System.out.print("Digite o número 2: ");
		numero2 = sc.nextInt();

		switch (operacao) {
		case 1:
			soma = numero1 + numero2;
			System.out.println("Resultado: " + soma);
			break;

		case 2:
			soma = numero1 - numero2;
			System.out.println("Resultado: " + soma);
			break;
		case 3:
			soma = numero1 * numero2;
			System.out.println("Resultado: " +soma);
			break;
		case 4:
			soma = numero1 / numero2;
			System.out.println("Resultado: " +soma);
		break;
		default: System.out.println("Operação não correta.");
		}
		sc.close();
	}

}
