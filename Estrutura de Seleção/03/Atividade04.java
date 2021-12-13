package Exercicios;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double litro, antes20, depois20;
		int tipoCombustivel;

		System.out.print("   POSTO DE GASOLINA\n(1) ÁLCOOL | (2) GASOLINA\nDIGITE:");
		tipoCombustivel = sc.nextInt();

		System.out.print("QUANTIDADE LITROS: ");
		litro = sc.nextDouble();

		if (tipoCombustivel == 1) {
			if (litro <= 20) {
				antes20 = litro * 4.365;
				System.out.println("PREÇO: " + antes20);
			} else if (litro > 20) {
				depois20 = litro * 4.275;
				System.out.println("PREÇO: " + depois20);
			}
		}
		if (tipoCombustivel == 2) {
			if (litro <= 20) {
				antes20 = litro * 5.28;
				System.out.println("PREÇO: " + antes20);
			} else if (litro > 20) {
				depois20 = litro * 5.17;
				System.out.println("PREÇO: " + depois20);
			}
			sc.close();
		}
	}
}