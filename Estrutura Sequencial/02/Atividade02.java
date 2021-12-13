package Exercicio;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double graus, soma;
		System.out.println("Digite a temperatura em graus Celsius para transformar em Graus Fahrenheit");
		graus = sc.nextDouble();

		soma = graus * 1.8 + 32;

		System.out.println(
				"A temperatura " + graus + " em Graus Celsius, transformada em Fahrenheit dará " + soma + " graus");
		sc.close();
	}

}
