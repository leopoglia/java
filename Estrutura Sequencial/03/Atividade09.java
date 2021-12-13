package Exercicios;

import java.util.Scanner;

public class Atividade09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soma, a, b, c, x;

		System.out.println("Para somar o calculo de Bhaskara digite seu A: ");
		a = sc.nextInt();

		System.out.println("Agora digite o seu B: ");
		b = sc.nextInt();

		System.out.println("Agora digite o seu C: ");
		c = sc.nextInt();
		
		x=1;
		soma = (a * x*x + b*x -c);
		
		System.out.println("A soma do seu calculo é " + soma);
		sc.close();
	}

}
