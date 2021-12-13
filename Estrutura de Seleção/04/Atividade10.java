package Exercicios;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salario, taxa, emprestimo;
		int opcao, idade;
		
		System.out.print("DIGITE O SEU SALÁRIO: ");
		salario = sc.nextDouble();
		
		System.out.print("DIGITE A SUA IDADE: ");
		idade = sc.nextInt();
		
		System.out.print("ESCOLHA O QUE VOCÊ DESEJA VIZUALIZAR: \n(1) TAXA MANUTENÇÃO DE CONTA CORRENTE\n(2) TAXA DE EMPRESTIMO\nDIGITE:");
		opcao = sc.nextInt();
		
		if(opcao == 1) {
			if(salario <= 1500) {
				System.out.println("SEM TAXA =)");
			}else if(salario >1500 && salario <= 2500) {
				taxa = salario*0.03;
				System.out.println("TAXA (3%): " +taxa);
			}else if(salario >2500 && salario <= 5000) {
				taxa = salario*0.04;
				System.out.println("TAXA (4%): " +taxa);
			}else if(salario >5000 && salario <= 7000) {
				taxa = salario*0.05;
				System.out.println("TAXA (5%): " +taxa);
			}else {
				taxa = salario*0.06;
				System.out.println("TAXA (6%): " +taxa);
			}
		}else if(opcao == 2) {
			System.out.print("DIGITE A QUANTIDADE DE EMPRESTIMO: R$");
			emprestimo = sc.nextDouble();
			if(idade <=28 && salario <3000) {
				taxa = emprestimo * 0.05;
				System.out.println("TAXA (5%): "+taxa);
			}else if(idade >28 && idade <39 && salario > 3000 && salario <= 5000) {
				taxa = emprestimo * 0.07;
				System.out.println("TAXA (7%): "+taxa);
			}else if(idade >39 && idade <50 && salario > 5000 && salario <=7000) {
				taxa = emprestimo * 0.09;
				System.out.println("TAXA (9%):" +taxa);
			}else if(idade >=50) {
				taxa = emprestimo * 1.11;
						System.out.println("TAXA (11%):" +taxa);
			}else {
				taxa = emprestimo * 1;
				System.out.println("TAXA (10%):" +taxa);
			}
		}else {
			System.out.println("OPÇÃO INVALIDA!");
		}
		sc.close();
	}

}
