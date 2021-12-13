package Exercicios;

import java.util.Scanner;

public class Atividade07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tamanhomatriz = 0;
		System.out.print("Qual o tamanho da matriz?");
		tamanhomatriz = sc.nextInt();
		int matriz[][] = new int[tamanhomatriz][tamanhomatriz], numero;

		System.out.print("Digite um número: ");
		numero = sc.nextInt();

		for (int colunas = 0; colunas < matriz.length; colunas++) {
			for (int linhas = 0; linhas < matriz[0].length; linhas++) {
				if(colunas == linhas) {
				matriz[linhas][colunas] = numero;
				}
				if(colunas == tamanhomatriz/tamanhomatriz) {
					matriz[linhas][colunas-1] = numero;
				}
			}
		}
		for (int colunas = 0; colunas < matriz.length; colunas++) {
			for (int linhas = 0; linhas < matriz[0].length; linhas++) {
				System.out.print(matriz[colunas][linhas]);
			}
		}
		sc.close();
	}
}