package Exercicio;

import java.util.Scanner;

public class Atividade10 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double MB, Mbps, minuto;
	
	
	System.out.println("Quantos MB tem seu arquivo?");
	MB = sc.nextDouble();
	
	System.out.println("Quantos Mbps tem a velocidade da sua internet?");
	Mbps = sc.nextDouble();
	
	minuto = ((MB * 8)/ Mbps)/60;
	
	System.out.println("Você terá que esperar " +minuto+ " minutos");
	sc.close();
	}
}
