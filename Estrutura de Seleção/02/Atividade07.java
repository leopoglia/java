package Exercicios;

import java.util.Scanner;

public class Atividade07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double lado1, lado2, lado3;

		System.out.print("Para saber qual é seu triangulo\nDigite o lado 1: ");
		lado1 = sc.nextDouble();

		System.out.print("Digite o lado2: ");
		lado2 = sc.nextDouble();

		System.out.print("Digite o lado3: ");
		lado3 = sc.nextDouble();

		if (lado1 == lado2 && lado1 == lado3) {
			System.out.println("Triângulo Equilátero");
		} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("Triângulo Isósceles");
		} else if (lado1 != lado2 && lado1 != lado3) {
			System.out.println("Triângulo Escaleno");
		} else {
			System.out.println("Triângulo Invalido");
		}
		sc.close();
	}
}