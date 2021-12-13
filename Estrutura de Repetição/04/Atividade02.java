package Exercicios;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double altura, homens = 0, maiorAltura=0.0, menorAltura= 100.0, totalAlturaM = 0, mediaAlturaM;
		int genero, i=0;
		
		do {
			i++;
			System.out.print("Digite a altura:");
			altura = sc.nextDouble();
			
			if(altura == 0) {
				i = i-1;
				break;
			}
			
			System.out.print("Digite o genero (1) Masculino (2) Femenino: ");
			genero = sc.nextInt();
			System.out.println("---------------------------------------------");
			
			if(genero == 2) {
				totalAlturaM = totalAlturaM + altura;
			}
			
			if(genero == 1) {
				homens ++;
			}
			
			if(altura > maiorAltura) {
				maiorAltura = altura;
			}
			
			if(altura < menorAltura) {
				menorAltura = altura;
			}
			
		}while(altura != 0);
		
		mediaAlturaM = totalAlturaM / i;
		
		System.out.println("Maior altura: " +maiorAltura);
		System.out.println("Menor altura: " +menorAltura);
		System.out.println("Média de altura das mulheres: " + mediaAlturaM);
		System.out.println("Número de homens: " + homens);
		sc.close();
	}
	
}