package Exercicios;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horasTrabalhadas;
		double salarioHora, salarioBruto, iR, sindicato, descontoTotal, salarioLiquido;
		
		System.out.print("Cálculo da folha da pagamento. \nDigite o seu salário por hora: ");
		salarioHora = sc.nextDouble();
		
		System.out.print("Digite as horas trabalhadas: ");
		horasTrabalhadas = sc.nextInt();
		
		salarioBruto = salarioHora * horasTrabalhadas;
		sindicato = salarioBruto*0.03;

		if(salarioBruto <= 1903.98) {
			iR = salarioBruto* 0; 
		}else if (salarioBruto > 1903.98 && salarioBruto <= 2826.65) {
			iR = salarioBruto*0.075;
			descontoTotal = sindicato + iR;
			salarioLiquido = salarioBruto - descontoTotal;
			System.out.printf("IR  (-7,5%%):     R$%.2f" , iR);
			System.out.printf("\nSindicato (-3%%): R$" + sindicato);
			System.out.printf("\nFGTS (11,2%%):    R$" +salarioBruto*0.112);
			System.out.printf("\nTotal descontos:R$" + descontoTotal);
			System.out.println("\nSaláio Liquído: R$" + salarioLiquido);
		}else if(salarioBruto > 2826.65 && salarioBruto <= 3751.05) {
			iR = salarioBruto*0.15;
			descontoTotal = sindicato + iR;
			salarioLiquido = salarioBruto - descontoTotal;
			System.out.printf("IR (-15%%):       R$%.2f" , iR);
			System.out.printf("\nSindicato (-3%%): R$" + sindicato);
			System.out.printf("\nFGTS (11,2%%):    R$" +salarioBruto*0.112);
			System.out.printf("\nTotal descontos:R$" + descontoTotal);
			System.out.println("\nSaláio Liquído: R$" + salarioLiquido);
			
		}else if(salarioBruto > 3751.05 && salarioBruto <= 4664.68) {
			iR = salarioBruto*0.225;
			descontoTotal = sindicato + iR;
			salarioLiquido = salarioBruto - descontoTotal;
			System.out.printf("IR (-22,5%%):     R$%.2f" , iR);
			System.out.printf("\nSindicato (-3%%): R$" + sindicato);
			System.out.printf("\nFGTS (11,2%%):    R$" +salarioBruto*0.112);
			System.out.printf("\nTotal descontos:R$" + descontoTotal);
			System.out.println("\nSaláio Liquído: R$" + salarioLiquido);
			
		}else if(salarioBruto > 4664.68) {
			iR = salarioBruto*0.275;
			descontoTotal = sindicato + iR;
			salarioLiquido = salarioBruto - descontoTotal;
			System.out.printf("IR (27,5%%):      R$%.2f" , iR);
			System.out.printf("\nSindicato (-3%%): R$" + sindicato);
			System.out.printf("\nFGTS (11,2%%):    R$" +salarioBruto*0.112);
			System.out.printf("\nTotal descontos:R$" + descontoTotal);
			System.out.println("\nSaláio Liquído: R$" + salarioLiquido);
		}else {
			System.out.printf("Error404");
		}
		
		sc.close();
	}

}