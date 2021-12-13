package Exercicios;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valores[] = new int[10], maior=-99999999, menor=99999999;
		
		for(int i = 0; i < valores.length; i++) {
			System.out.print((i + 1) + "º valor: ");
			valores[i] = sc.nextInt();
			
			if(valores[i] > maior) {
				maior = valores[i];
			}
			if(valores[i] < menor) {
				menor = valores[i];
			}	
		}
		System.out.println("Maior número: "  +maior);
		System.out.println("Menor número: "  +menor);
		sc.close();
	}
}
