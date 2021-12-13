package Exercicios;

import java.util.Scanner;

public class Atividade07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cateto1, cateto2, valor1, hipotenusa;

		System.out.printf("Para descobrir a hipotenusa de seu triangulo retângulo digita um dos catetos: ");
		cateto1 = sc.nextDouble();

		System.out.printf("Digite o outro cateto: ");
		cateto2 = sc.nextDouble();

		valor1 = (cateto1 * cateto1) + (cateto2 * cateto2);
		hipotenusa = Math.sqrt(valor1);

		System.out.println("A sua hipotenusa é: " + hipotenusa);
		sc.close();

	}

}
