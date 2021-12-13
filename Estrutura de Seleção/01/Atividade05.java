package Exercicios;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, media;

		System.out.print("Para saber se você foi aprovado, digite a sua primeia nota:");
		n1 = sc.nextDouble();

		System.out.print("Digite a segunda nota:");
		n2 = sc.nextDouble();

		media = (n1 + n2) / 2;

		if (media < 7) {
			System.out.println("Reprovado");
		}
			else if (media == 10){
			System.out.println("Aprovado com Distinção");
			
		} else {
			System.out.println("Aprovado");
		}
		sc.close();
	}

}
