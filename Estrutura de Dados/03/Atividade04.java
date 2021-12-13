package Exercicios;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matriz[][] = new int[4][4];
		
		for(int colunas = 0; colunas < matriz.length; colunas++) {
			System.out.println("Coluna " + (colunas+1));
			for(int linhas = 0; linhas < matriz[0].length; linhas++) {
				System.out.print("Digite o " + (linhas+1) + "º número: ");
				matriz[linhas][colunas] = sc.nextInt();
			}
		}
		
		for(int colunas = 0; colunas < matriz.length; colunas++) {
			for(int linhas = 0; linhas < matriz[0].length; linhas++) {
				if(matriz[linhas][colunas] < 0) {
					matriz[linhas][colunas] = 0;
				}
			}
		}
		
		for(int colunas = 0; colunas < matriz.length; colunas++) {
			for(int linhas = 0; linhas < matriz[0].length; linhas++) {
				System.out.println(matriz[linhas][colunas]);
			}
		}
		sc.close();
	}
}