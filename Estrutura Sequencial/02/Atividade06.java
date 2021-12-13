package Exercicio;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double kilo, excesso, multa;

		System.out.println("Quantos kilos o peixe tem?");
		kilo = sc.nextDouble();

		multa = (kilo - 50) * 4;
		excesso = kilo - 50;

		System.out.println("O excesso de kilos foi " + excesso + " e a multa foi de " + multa + " reais");
		sc.close();
	}

}