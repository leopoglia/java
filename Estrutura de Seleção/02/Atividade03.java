package Exercicios;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario;
		double aumento20, aumento15, aumento10, aumento5;
		double valor20, valor15, valor10, valor5;

		System.out.print("Digite o seu sálario para saber o reajuste: ");
		salario = sc.nextDouble();

		aumento20 = salario * 1.2;
		aumento15 = salario * 1.15;
		aumento10 = salario * 1.1;
		aumento5 = salario * 1.05;

		valor20 = salario * 0.2;
		valor15 = salario * 0.15;
		valor10 = salario * 0.1;
		valor5 = salario * 0.05;

		if (salario <= 1500) {
			System.out.print("Salario:" + salario + "\nPorcentual aumento: 20% \nValor do aumento:" + valor20
					+ " \nNovo sálario:" + aumento20);
		} else if (salario > 1500 && salario < 2500) {
			System.out.print("Salario:" + salario + "\nPorcentual aumento: 15% \nValor do aumento:" + valor15
					+ " \nNovo sálario:" + aumento15);
		} else if (salario >= 2500 && salario <= 3500) {
			System.out.print("Salario:" + salario + "\nPorcentual aumento: 10% \nValor do aumento: " + valor10
					+ " \nNovo sálario:" + aumento10);
		} else if (salario > 3500) {
			System.out.print("Salario:" + salario + "\nPorcentual aumento: 5% \nValor do aumento: " + valor5
					+ " \nNovo sálario:" + aumento5);
		}
		sc.close();
	}

}
