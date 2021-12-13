package Exercicios;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tabuada, soma, i=1;
		
		System.out.print("Qual tabuada você deseja? ");
		tabuada = sc.nextInt();
		
		while(i <=10) {
			soma = tabuada * i;
			System.out.println(tabuada + " x "+ i + " = " + soma);
			i++;
		}
		sc.close();
	}

}
