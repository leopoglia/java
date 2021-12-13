package Exercicios;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um número entre 12 e 20: ");
		numero = sc.nextInt();
		
		while(numero < 12 || numero >20) {
			System.out.print("Número invalido, Digite um número entre 12 e 20: ");
			numero = sc.nextInt();
		}
		sc.close();
	}

}
