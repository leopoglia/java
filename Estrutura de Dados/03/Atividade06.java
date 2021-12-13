package Exercicios;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matriz[][] = new int[5][5], numero;
		
		System.out.print("Digite um número: ");
		numero = sc.nextInt();
		
		
		for(int colunas = 0; colunas < matriz.length; colunas++) {
			for(int linhas = 0; linhas < matriz[0].length; linhas++) {
				if(colunas == 0 || colunas == 4) {
					matriz[colunas][0] = numero;
					matriz[colunas][4] = numero;
				}
				if(colunas == 1 || colunas == 2 || colunas == 3) {
					matriz[colunas][1] = numero;
					matriz[colunas][2] = numero;
					matriz[colunas][3] = numero;
				}
			}
		}
		for(int colunas = 0; colunas < matriz.length; colunas++) {
			for(int linhas = 0; linhas < matriz[0].length; linhas++) {
				System.out.println(matriz[colunas][linhas]);
			}
		}
		sc.close();
	}
}