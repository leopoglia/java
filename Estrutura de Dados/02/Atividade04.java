package Exercicios;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nomes[] = new String[5], situacao[] = {"Impar", "Par"};
		Double notas[] = new Double[5], totalNotas = 0.0, mediaNotas, maiorNota=0.0, menorNota=11.0, maior7=0.0, menor7=0.0;
		int pares=0, impares=0;
		
		for(int i = 0; i < nomes.length; i++) {
			System.out.print("Digite o seu nome: ");
			nomes[i] = sc.next();
			
			System.out.print("Digite sua Nota: ");
			notas[i] = sc.nextDouble();
			
			System.out.println("-----------------");
			
			totalNotas = totalNotas + notas[i];
			if(notas[i] > maiorNota) {
				maiorNota = notas[i];
			}
			if(notas[i] < menorNota) {
				menorNota = notas[i];
			}
			
			if(notas[i] >= 7) {
				maior7++;
			}else if(notas[i] < 7) {
				menor7++;
			}
		}

		for(int i = 0; i < notas.length; i++) {
			if((notas[i] % 2) == 0) {
				System.out.println("Nome:" + nomes[i] + " Nota:" + notas[i] + " Situação: " +situacao[1]);
				pares++;
			}else {
				System.out.println("Nome:" + nomes[i] + " Nota:" + notas[i] + " Situação: " +situacao[0] );
				impares++;
			}
		}
		mediaNotas = totalNotas / notas.length;
		System.out.println("Posições do vetor:" + (notas.length + nomes.length));
		System.out.println("Média das notas: " + mediaNotas);
		System.out.println("Maior nota: " +maiorNota);
		System.out.println("Menor nota: " +menorNota);
		System.out.println("Quantida de notas pares:" + pares);
		System.out.println("Quantida de notas Impares:" + impares);
		System.out.println("Quantidade de notas maiores ou igual a 7: " +maior7);
		System.out.println("Quantidade de notas menores de 7: " +menor7);
		sc.close();
	}
}