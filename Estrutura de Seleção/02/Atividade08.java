package Exercicios;

import java.util.Scanner;

public class Atividade08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inteiro, centena, dezena, unidade;

		System.out.print("Digite um numero menor de 1000 para saber sua centenas, dezenas e unidades:");
		inteiro = sc.nextInt();

		if (inteiro < 1000) {
			centena = inteiro / 100 % 100;
			dezena = inteiro / 10 % 10;
			unidade = inteiro % 10;
			System.out.printf(
					+inteiro + " = " + centena + " centenas, " + dezena + " dezenas e " + unidade + " unidades");
		} else{ System.out.println("Escolha um número menor de 1000.");
		}
		
		sc.close();
	}

}