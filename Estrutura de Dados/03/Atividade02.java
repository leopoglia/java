package Exercicios;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matriz[][] = new int[4][4];
		
		for(int colunas = 0; colunas < matriz[0].length; colunas++) {
			System.out.print("\n");
			for(int linhas = 0; linhas < matriz.length; linhas++) {
				System.out.print((linhas) + "º número da Coluna " + (colunas) + ": ");
				matriz[linhas][colunas] = sc.nextInt();
			}
		}
		
		for(int colunas = 0; colunas < matriz[0].length; colunas++) {
			System.out.println(matriz[colunas][colunas]);		
		}
		
		System.out.println("/n");

		for(int colunas = 0; colunas < matriz[0].length; colunas++) {
			for(int linhas = 0; linhas < matriz.length; linhas++) {
				if(linhas == colunas) {
					break;
				}else {
				System.out.println(matriz[linhas][colunas]);
				}
			}
		}
		
		System.out.println("/n");
		
			for(int linhas = 0; linhas < matriz.length; linhas++) {
				if(linhas == 3 ) {
					System.out.println(matriz[(linhas-3)][linhas]);
				}
				if(linhas == 2) {
					System.out.println(matriz[(linhas-1)][linhas]);
				}
				if(linhas == 1) {
					System.out.println(matriz[(linhas+1)][linhas]);
				}
				if(linhas == 0) {
					System.out.println(matriz[(linhas+3)][linhas]);
				}
		}
		sc.close();
	}
}