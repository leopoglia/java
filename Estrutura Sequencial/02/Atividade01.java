package Exercicio;

import java.util.Scanner;

public class Atividade01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double graus, soma;

		System.out.println("Digite a temperatua em Graus Fahrenheit para transformar em Graus Celsius");
		graus = sc.nextDouble();

		soma = (graus - 32) / 1.8;
		System.out.println(
				"A temperatura " + graus + " em Graus Fahrenheit, transformada em Celsius dará " + soma + " graus");
		sc.close();
	}
}
