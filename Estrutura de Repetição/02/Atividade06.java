package Exercicios;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade=0, i = 0, maiorIdade = 0, menorIdade = 1000, mulheres = 0, genero, generoMenorSalario = 0, idadeMenorSalario = 0;
		double salario, totalSalarios = 0, mediaSalarios, menorSalario = 999999999;
		
		while(idade >= 0) {
			System.out.print("\nDigite sua idade: ");
			idade = sc.nextInt();
			
			if(idade < 0) {
				break;
			}
			
			
			if(idade < menorIdade) {
				menorIdade = idade;
			}
			
			if(idade > maiorIdade) {
				maiorIdade = idade;
			}
			
			
			
			System.out.print("Digite seu genêro F (1) M (2): ");
			genero = sc.nextInt();
			
			if(genero == 1) {
				mulheres++;
			}
			
			System.out.print("Digite seu salário: ");
			salario = sc.nextDouble();
			
			i++;
			totalSalarios = totalSalarios + salario;
			
			if(salario < menorSalario) {
				menorSalario = salario;
				generoMenorSalario = genero;
				idadeMenorSalario = idade;
				
			}
			
		}
		
		mediaSalarios = totalSalarios / i;
		System.out.println("Média do Salário do Grupo: " + mediaSalarios);
		System.out.println("Menor idade: " + menorIdade);
		System.out.println("Maior idade: " + maiorIdade);
		System.out.println("Quantidade de mulheres: " + mulheres);
		System.out.println("\nMenor salário: " + menorSalario + " Genero: " +generoMenorSalario+ " Idade: " + idadeMenorSalario);
		
		sc.close();
	}
}
