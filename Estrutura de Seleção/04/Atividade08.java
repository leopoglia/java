package Exercicios;

import java.util.Scanner;

public class Atividade08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, n;
		
		System.out.println("Condições: a<b, c<d e a<c.");
		
		System.out.print("Digite a parte A: ");
		a = sc.nextInt();
		
		System.out.print("Digite a parte B: ");
		b = sc.nextInt();
		
		System.out.print("Digite a parte C: ");
		c = sc.nextInt();
		
		System.out.print("Digite a parte D: ");
		d = sc.nextInt();
		
		System.out.print("Digite a parte n: ");
		n = sc.nextInt();
		
		
		if(((n > a && n < b) && (n > c && n < d))  ||  ((n > c && n < d) && (n < c && n > d))){
			System.out.println("n está entre A e B e C e D");
		}else if((n > a && n < b) || (n < a && n > b)){
			System.out.println("n está entre A e B");
		}else if((n > c && n < d)||(n < c && n > d)){
			System.out.println("n está entre C e D");
		}else {
			System.out.println("n não está entre nenhum desses.");
		}
		sc.close();
	}

}
