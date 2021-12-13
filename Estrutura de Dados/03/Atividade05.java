package Exercicios;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matriz[][] = new int[5][5];
		
		for(int colunas = 0; colunas < matriz.length; colunas++) {
			System.out.println((colunas) + "ª Coluna: ");
			for(int linhas = 0; linhas < matriz[0].length; linhas++) {
				System.out.print((linhas) + "ºN: ");
				matriz[linhas][colunas] = sc.nextInt();
			}
		}
		
		for(int colunas = 0; colunas < matriz.length; colunas ++) {
			for(int linhas = 0; linhas < matriz[0].length; linhas++) {
				if(colunas == linhas) {
					System.out.println(matriz[linhas][colunas]);
				}
			}
		}
		sc.close();
	}
}