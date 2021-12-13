package Exercicios;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vetor[] = new int[6], posicaopar[] = new int[6], pares = 0;
		
		for(int i = 0; i < vetor.length; i ++) {
			System.out.print("Digite o " + (i + 1)+ "º valor:");
			vetor[i] = sc.nextInt();
			
			if((vetor[i] % 2) == 0) {
				pares++;
				posicaopar[i] = i;
			}else{
				posicaopar[i] = 999;
			}
		}
		System.out.println("Quantidade de pares: " + pares);
		for(int i = 0; i < vetor.length; i++) {
			if(posicaopar[i] != 999) {
			System.out.println("Posição:" + posicaopar[i]);
			}
		}
		sc.close();
	}
}

