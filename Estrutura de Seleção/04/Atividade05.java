package Exercicios;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1, nota2, media, mediaFinal, provaFinal;
		
		System.out.print("Digite a sua primeira nota: ");
		nota1 = sc.nextDouble();
		
		System.out.print("Digite a sua segunda nota: ");
		nota2 = sc.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(media >= 7) {
			System.out.println("Aprovado!\nMédia Final: " + media);
		}else if(media <5) {
			System.out.println("Reprovado!\nMédia Final: " +media);
		}else {
			System.out.print("Digite sua nota da Prova Final: ");
			provaFinal = sc.nextDouble();
			mediaFinal = (media + provaFinal) / 2;
			if(mediaFinal > 6) {
				System.out.print("Aprovado\nMédia Final:" +media);
			}else {
				System.out.println("Reprovado :(");
			}
			sc.close();
		}
	}

}
