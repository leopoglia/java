package Exercicios;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int quantidadeNotas, i = 0;
		double notas, totalNotas = 0, media;

		System.out.print("Digite a quantidade de notas: ");
		quantidadeNotas = sc.nextInt();

		while (i < quantidadeNotas) {
			System.out.print("Digite sua nota: ");
			notas = sc.nextDouble();
			totalNotas = totalNotas + notas;
			i++;

		}
		
		media = totalNotas / quantidadeNotas;
		System.out.println(media);
		
		sc.close();
	}

}
