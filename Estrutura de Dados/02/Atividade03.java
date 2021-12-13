package Exercicios;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double vetor[] = new double[10], soma = 0, media = 0, positivos = 0, negativos = 0, maiorMedia = 0, igualMedia = 0, porcMaior, porcIgual;
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o " + (i+1)+ "º valor:");
			vetor[i] = sc.nextInt();
			soma= soma + vetor[i];
		}
		media = soma / vetor.length;

		for(int i = 0; i < vetor.length; i++) {			
			if(vetor[i] > media) {
				maiorMedia++;
			}else if(vetor[i] == media) {
				igualMedia++;
			}
			
			if(vetor[i] < 0) {
				negativos++;
			}else if(vetor[i] > 0) {
				positivos++;
			}
		}
		porcMaior = (maiorMedia / vetor.length)*100;
		porcIgual = (igualMedia / vetor.length)*100;
		
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
		System.out.println("Maior que a média: " + maiorMedia);
		System.out.println("Igual a média: " + igualMedia);
		System.out.println("Porcentagem maior: " + porcMaior + "%");
		System.out.println("Porcentagem menor: " + porcIgual + "%");
		System.out.println("Média: " + media);
		System.out.println("Positivos: " + positivos);
		System.out.println("Negativos: " + negativos);
		sc.close();
	}
}