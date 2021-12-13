package Exercicios;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario, aumento=0, vale=0;
		
		System.out.print("Qual o seu salário? ");
		salario = sc.nextDouble();
		
		if(salario <= 1200) {
		aumento = salario + (salario * 0.13);
		System.out.println("salario: " +aumento);
		}else if(salario > 1200 && salario <= 1600) {
		aumento = salario + (salario * 0.11);
		System.out.println("salario: " +aumento);
		}else if(salario > 1600 && salario <= 2000) {
		aumento = salario + (salario * 0.09);
		System.out.println("salario: " +aumento);
		}else if(salario > 2000) {
		aumento = salario + (salario * 0.07);
		System.out.println("salario: " +aumento);
		}
	
		
		if(aumento < 1500) {
		vale = aumento + 300;
		System.out.println("O seu salário com o vale é: " +vale);
		}
		
		sc.close();
	}
}