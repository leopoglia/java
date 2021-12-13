package Exercicios;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double notas[] = new double[5], media;
		int notaIgual7 = 0, notaMaior7 = 0, notaMenor7 = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Aluno " + (i+1));
			System.out.print("Digite sua nota: ");
			notas[i] = sc.nextDouble();

			if (notas[i] == 7) {
				notaIgual7++;
			} else if (notas[i] > 7) {
				notaMaior7++;
			} else {
				notaMenor7++;
			}
		}
			
		media = (notas[0] + notas[1] + notas[2] + notas[3] + notas[4]) / 5;
			
		System.out.println("Media dos alunos: " + media);
		System.out.println("Alunos com média maior de 7: " + notaMaior7);
		System.out.println("Alunos com média igual a 7: " + notaIgual7);
		System.out.println("Alunos com média menor de 7: " + notaMenor7);
		sc.close();
	}
}
