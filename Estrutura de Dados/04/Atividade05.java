package Exercicios;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double temperaturas[] = new double[7];
		String dias[] = {"Domingo","Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sabado"}, abv[] = {"D", "S", "T", "Q", "Q", "S", "S"};
		
		for(int i = 0; i < temperaturas.length; i++) {
			System.out.print("Digite a temperatura de " +dias[i]+ ":");
			temperaturas[i] = sc.nextInt();
		}
		
		for(int i = 0; i < temperaturas.length; i++) {
			System.out.print("\n"+abv[i] + ": ");
			for(int ii = 0; ii < temperaturas[i]; ii++) {
				System.out.print("#");
			}
		}
		
		sc.close();
	}
}