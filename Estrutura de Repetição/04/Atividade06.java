package Exercicios;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int massaInicial = 0, tempoTotal=50, horas = 0, minutos = 0, segundos = 0;
		
		System.out.print("Digite a massa inicial: ");
		massaInicial = sc.nextInt();
		
		while(massaInicial >= 0.5) {
			massaInicial = massaInicial / 2;
			tempoTotal = tempoTotal + 50;
			
			if(massaInicial <= 0.5) {
				break;
			}
		}
		
		horas= (tempoTotal/3600);
		minutos= (tempoTotal/60);
		segundos= tempoTotal%60;
		
		System.out.println("MassaFinal: " +massaInicial+" \nHoras: " +horas+"\nMinutos: " +minutos+ "\nSegundos: " +segundos);
		sc.close();
	}
}