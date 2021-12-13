package Exercicios;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1, nota2, nota3, nota4, soma;

		System.out.print("Digite a primeira nota para saber a média ponderada: ");
		nota1 = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		System.out.print("Digite a terceira nota: ");
		nota3 = sc.nextDouble();
		System.out.print("Digite a quarta nota: ");
		nota4 = sc.nextDouble();

		soma = (nota1 * 1 + nota2 * 2 + nota3 * 3 + nota4 * 4) / 10;

		System.out.println("Sua nota pondera é de " + soma);
		sc.close();
	}

}
