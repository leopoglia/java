package Exercicio;

import java.util.Scanner;

public class Atividade09 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int metro, litro, lata1, lata2, preco1 , preco2;
	
	
	System.out.println("Para sabermos a quantidade de latas de tintas a serem compradas, digite a quantidade de metros quadrados.");
	metro = sc.nextInt();
	
	litro = metro / 6;
	lata1 = (litro + 1 / 18);
	lata2 = litro + 1/ (36 / 10 );
	preco1 = (lata1 * 80);
	preco2 = (lata2 * 25);

	
	System.out.println("Quantidade de latas de 18 litros " + lata1 );
	System.out.println("Quantidade de latas de 3,6 litros " + lata2);
	System.out.println("Preço ao comprar " +lata1 + " latas é " +preco1+ " reais");
	System.out.println("Preço ao comprar " +lata2+ " latas é " +preco2+ " reais");
	sc.close();
	}
}
