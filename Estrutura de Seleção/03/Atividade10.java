package Exercicios;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ano, bissexto, divisivel400, divisivel100;

		System.out.print("Digite o ano que você está para saber se é bissexto:");
		ano = sc.nextInt();

		bissexto = ano % 4;
		divisivel400 = ano % 400;
		divisivel100 = ano % 100;

		if ((divisivel400 == 0 && divisivel100 == 0) || (divisivel100 != 0 && bissexto == 0)) {
			System.out.println("Ano bissexto");
		} else if(divisivel400 != 0 && divisivel100 == 0) {
			System.out.println("Não bissexto");
		}else {
			System.out.println("Não é bissexto");
		}
		sc.close();
	}
}
