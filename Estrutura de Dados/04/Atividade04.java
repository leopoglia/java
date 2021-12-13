package Exercicios;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double temperaturas[] = new double[7], totalTemperaturas=0.0, mediaTemperaturas, maiorMedia=0.0;
		String dias[] = {"Domingo","Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sabado"};
		
		for(int i = 0; i < temperaturas.length; i++) {
			System.out.print("Digite a temperatura de " +dias[i]+ ":");
			temperaturas[i] = sc.nextInt();
			totalTemperaturas += temperaturas[i];
		}
		mediaTemperaturas = totalTemperaturas / temperaturas.length;
		
		for(int i = 0; i < temperaturas.length; i++) {
			if(temperaturas[i] > mediaTemperaturas) {
				maiorMedia++;
			}
		}
		
		System.out.println("Média de temperatura: " + mediaTemperaturas + "\nMaiores que a média: " +maiorMedia);
		sc.close();
	}
}