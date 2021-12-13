package Exercicios;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int diaDaSemana;

		System.out.println("Digite 1 (Domingo), 2 (Segunda), 3 (Terça), 4 (Quarta), 5 (Quinta) 6 (Sexta), 7 (Sabado)");
		diaDaSemana = sc.nextInt();

		if (diaDaSemana == 1) {
			System.out.println("Domingo");
		} else if (diaDaSemana == 2) {
			System.out.println("Segunda");
		} else if (diaDaSemana == 3) {
			System.out.println("Terça");
		} else if (diaDaSemana == 4) {
			System.out.println("Quarta");
		} else if (diaDaSemana == 5) {
			System.out.println("Quinta");
		} else if (diaDaSemana == 6) {
			System.out.println("Sexta");
		} else {
			System.out.println("Não existe esse dia da semana");
		}
		sc.close();
	}

}