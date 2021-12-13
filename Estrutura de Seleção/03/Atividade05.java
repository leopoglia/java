package Exercicios;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double kiloMorango, kiloMaca, precoMorango = 0, precoMaca = 0, kiloConjunto, precoConjunto, precoFinal = 0;

		System.out.println("FRUTEIRA DA JOANA");
		System.out.print("QUILOS DE MORANGO: ");
		kiloMorango = sc.nextDouble();
		System.out.print("QUILOS DE MAÇA: ");
		kiloMaca = sc.nextDouble();

		if (kiloMaca <= 3) {
			precoMaca = kiloMaca * 10;
		} else {
			precoMaca = kiloMorango * 7.50;
		}

		if (kiloMorango <= 3) {
			precoMorango = kiloMorango * 12.50;
		} else {
			precoMorango = kiloMorango * 10;
		}

		precoConjunto = precoMorango + precoMaca;
		kiloConjunto = kiloMorango + kiloMaca;

		if (precoConjunto > 50 || kiloConjunto > 8) {
			precoFinal = precoConjunto - precoConjunto * 0.1;
		} else {
			precoFinal = precoConjunto;
		}

		System.out.printf("QUILOS TOTAIS: %.2f KG\nPREÇO TOTAL:  R$%.2f", kiloConjunto, precoFinal);

		sc.close();
	}

}