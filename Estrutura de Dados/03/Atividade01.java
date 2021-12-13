package Exercicios;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int matriz[][] = new int[6][6];
		int x = 0, encontrado = 0;
		
		System.out.print("Digite o valor de x: ");
		x = sc.nextInt();
		
		for(int colunas = 0; colunas < matriz[0].length; colunas++) {
			System.out.println("Coluna " + (colunas+1) + ": ");
			
			for(int linhas = 0; linhas < matriz.length; linhas++) {
			System.out.print("Digite os números: ");
			matriz[linhas][colunas] = sc.nextInt();
			}
		}
		
	
		for(int colunas = 0; colunas < matriz[0].length; colunas++) {
			for(int linhas = 0; linhas < matriz.length; linhas++) {
				if(matriz[linhas][colunas] == x) {
				System.out.println("O x está na coluna: " +(colunas+1)+ "\nNa linha: " +(linhas+1));
				encontrado++;
				}
			}
		}
		if(encontrado == 0) {
			System.out.println("O X NÃO FOI ENCONTRADO!!!!");
		}
		sc.close();
	}
}