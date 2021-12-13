package Exercicios;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador = 0, lucroBaixo = 0, lucroMedio = 0, lucroGrande = 0;
		double precoCompra = 0, precoVenda, lucro, margem, lucroTotal = 0, totalCompra = 0, totalVenda = 0;
		String nome;

		do {
			contador++;
			System.out.println("------CADASTRO " + contador + "------");
			System.out.print("Nome mercadoria: ");
			nome = sc.next();

			System.out.print("Preço de compra: R$");
			precoCompra = sc.nextDouble();

			System.out.print("Preço de venda: R$");
			precoVenda = sc.nextDouble();

			lucro = precoVenda - precoCompra;
			margem = (lucro / precoCompra) * 100;
			lucroTotal = lucroTotal + lucro;
			totalCompra = totalCompra + precoCompra;
			totalVenda = totalVenda + precoVenda;

			if (margem < 10) {
				lucroBaixo++;
			}

			if (margem >= 10 || margem <= 20) {
				lucroMedio++;
			}
			if (margem > 20) {
				lucroGrande++;
			}

		} while (nome != "pare");
		
		System.out.println("Lucro < 10%: " +lucroBaixo);
		System.out.println("Lucro >= 10% e <=20%: " +lucroMedio);
		System.out.println("Lucro > 20%: " +lucroGrande);
		sc.close();
	}
}
