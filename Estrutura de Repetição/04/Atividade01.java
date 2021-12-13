package Exercicios;

import java.util.Scanner;

public class Atividade01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double kWhPreco, kWhMes = 0, kWhPrecoTotal, kWhMesTotal = 0, mediaTotalkWh, maiorConsumo = 0, menorConsumo = 999999, totalRes = 0, totalCon = 0, totalIn = 0;
		int numConsumidor, codigo, contador = 0;
		
		System.out.print("Qual o preço do KWh: R$");
		kWhPreco = sc.nextDouble();

		do {
			contador++;
			System.out.println("\n----------CADASTRO " + contador + "----------");
			System.out.print("Digite o número do consumidor: ");
			numConsumidor = sc.nextInt();

			if (numConsumidor == 0) {
				break;
			}

			System.out.print("Qual a quantidade de KWh consumidos no mês: ");
			kWhMes = sc.nextDouble();

			do {
				System.out.print("Digite o codigo: (1) Residencial | (2) Comercial | (3) Industrial |:");
				codigo = sc.nextInt();
			} while (codigo > 3 || codigo < 1);

			kWhPrecoTotal = kWhPreco * kWhMes;
			kWhMesTotal = kWhMesTotal + kWhMes;

			System.out.println("Numero do Consumidor:" + numConsumidor + "\nPreço a pagar: R$" + kWhPrecoTotal);

			if (kWhMes < menorConsumo) {
				menorConsumo = kWhMes;
			}
			if (kWhMes > maiorConsumo) {
				maiorConsumo = kWhMes;
			}

			switch (codigo) {
			case 1:
				totalRes = totalRes + kWhMes;
				break;
			case 2:
				totalCon = totalCon + kWhMes;
				break;
			case 3:
				totalIn = totalIn + kWhMes;
			}
		} while (numConsumidor != 0);

		mediaTotalkWh = kWhMesTotal / (contador - 1);
		System.out.println("------------------------------");
		System.out.println("O maior Consumo: " + maiorConsumo);
		System.out.println("O menor Consumo: " + menorConsumo);
		System.out.println("Total Consumo\nResidencial: " + totalRes + "\nComercial: " + totalCon + "\nIndustrial: " + totalIn);
		System.out.printf("Media geral de consumo: %.2f", mediaTotalkWh);
		sc.close();
	}
}