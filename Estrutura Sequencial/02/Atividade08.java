package Exercicio;

import java.util.Scanner;

public class Atividade08 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int metro, litro, lata, preco;
	
	
	System.out.println("Para sabermos o a quantidade de latas de tintas a serem compradas, digite a quantidade de metros quadrados.");
	metro = sc.nextInt();
	
	litro = metro / 3;
	lata = (litro / 18 +1);
	preco = lata * 80;
	
	
	System.out.println("Quantidade de litros " + litro);
	System.out.println("Quantidade de latas "+ lata); 
	System.out.println("Preço = " +preco+ " reais");
	sc.close();
	}
}