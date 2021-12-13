package Exercicios;

import java.util.Scanner;

public class Atividade07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vetor1[] = new int[10], vetor2[] = new int[10], vetor3[] = new int[10];
		int matriz[][] = new int[10][3], diminuidor = 9; 
		
		System.out.println("VETOR 1");
		for(int i = 0; i < vetor1.length; i++) {
			System.out.print("Digite o " + i + "º vetor?");
			vetor1[i] = sc.nextInt();
		}
		System.out.println("VETOR 2");
		for(int i = 0; i < vetor1.length; i++) {
			System.out.print("Digite o " + i + "º vetor?");
			vetor2[i] = sc.nextInt();
		}
		System.out.println("VETOR 3");
		for(int i = 0; i < vetor1.length; i++) {
			System.out.print("Digite o " + i + "º vetor?");
			vetor3[i] = sc.nextInt();
		}
		
		System.out.println("MATRIZ");
		for(int i = 0; i < vetor1.length; i++) {	
			matriz[i][0] = vetor1[i];
			matriz[i][1] = vetor2[diminuidor];
			matriz[i][2] = vetor3[i];
			diminuidor--;
		}
		
		for(int coluna = 0; coluna < matriz[0].length; coluna++) {
			System.out.println("Coluna" + coluna);
			for(int linha = 0; linha < matriz.length; linha++) {
				System.out.println(matriz[linha][coluna]);
			}
		}
		sc.close();
	}
}