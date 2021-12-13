package Exercicio;

import java.util.Scanner;

public class Atividade07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario, total, inss, sind, ir, bruto;
		int hora;
		
		System.out.println("Para saber as informações sobre seu salário digite a quantidade de horas trabalhadas no mês");
		hora = sc.nextInt();
		System.out.println("Agora digite o quanto você ganha por hora");
		salario = sc.nextDouble();
		total = hora * salario;
		inss = total * 0.08;
		ir = total * 0.11;
		sind = total * 0.05;
		bruto = total - (total * 0.24);
		
				
		System.out.println("O seu salário líquido  é " + total + " reais");
		System.out.println("O seu Imposto de Renda é " + ir + " reais");
		System.out.println("O seu INSS é " + inss + " reais");
		System.out.println("O seu sindicato é " + sind + " reais");
		System.out.println("O seu salário bruto é " + bruto + " reais" );
		sc.close();
	}

}
