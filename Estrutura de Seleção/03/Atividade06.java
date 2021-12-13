package Exercicios;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tipoCarne, tipoPagamento;
		double quantidadeCarne, preco = 0, precoFinal, desconto;

		System.out.print("ESCOLHA O TIPO DE CARNE:\n(1)FILE\n(2)ALCATRA\n(3)PICANHA\nR:");
		tipoCarne = sc.nextInt();

		System.out.print("DIGITE QUANTOS KILOS VOCÊ DESEJA:");
		quantidadeCarne = sc.nextDouble();

		System.out.print("\nESCOLHA A FORMA DE PAGAMENTO:\n(1)DINHEIRO\n(2)CARTÃO\nR:");
		tipoPagamento = sc.nextInt();

		if (tipoCarne == 1) {
			if (quantidadeCarne <= 5) {
				preco = quantidadeCarne * 34.90;
				System.out.println("\nTIPO DE CARNE: FILE\n");
				System.out.println("KILOS:" + quantidadeCarne);
			} else if (quantidadeCarne > 5) {
				preco = quantidadeCarne * 29.90;
				System.out.println("\nTIPO DE CARNE: FILE\n");
				System.out.println("KILOS:" + quantidadeCarne);
			} else {
				System.out.println("ERRADO");
			}
		} else if (tipoCarne == 2) {
			if (quantidadeCarne <= 5) {
				preco = quantidadeCarne * 39.90;
				System.out.println("\nTIPO DE CARNE: ALCATRA\n");
				System.out.println("KILOS:" + quantidadeCarne);
			} else if (quantidadeCarne > 5) {
				preco = quantidadeCarne * 34.90;
				System.out.println("\nTIPO DE CARNE: ALCATRA\n");
				System.out.println("KILOS:" + quantidadeCarne);
			} else {
				System.out.println("ERRADO");
			}
		} else if (tipoCarne == 3) {
			if (quantidadeCarne <= 5) {
				preco = quantidadeCarne * 44.90;
				System.out.println("\nTIPO DE CARNE: PICANHA\n");
				System.out.println("KILOS:" + quantidadeCarne);
			} else if (quantidadeCarne > 5) {
				preco = quantidadeCarne * 39.90;
				System.out.println("\nTIPO DE CARNE: PICANHA\n");
				System.out.println("KILOS:" + quantidadeCarne);
			} else {
				System.out.println("ERRADO");
			}
		} else {
			System.out.println("ERRADO");
		}

		if (tipoPagamento == 2) {
			precoFinal = preco - preco * 0.1;
			desconto = preco * 0.1;
			System.out.println("\nPAGAMENTO: CARTÃO");
			System.out.println("\nPREÇO TOTAL:" + precoFinal);
			System.out.println("\nDESCONTO:" + desconto);
		} else if (tipoPagamento == 1) {
			precoFinal = preco;
			System.out.println("\nPAGAMENTO: DINHEIRO");
			System.out.println("\nPREÇO TOTAL:" + precoFinal);
			System.out.println("\nSEM DESCONTO.");
		} else {
			System.out.println("ESCOLHA OUTRO TIPO DE PAGAMENTO");
		}
		sc.close();
	}
}
