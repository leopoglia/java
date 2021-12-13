package Exercicios;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double dolar, cotacao, real;

		System.out.println("Digite quantos dolares para saber o valor em real.");
		dolar = sc.nextDouble();

		System.out.println("Digite a cotação do dolar de hoje.");
		cotacao = sc.nextDouble();
		real = dolar * cotacao;

		System.out.printf("O valor de %.1f dolares, está valendo %.2f reais", dolar, real);
		sc.close();
	}

}
