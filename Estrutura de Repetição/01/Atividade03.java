package Exercicios;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, resultado;
		
		System.out.print("Digite o valor a ser dividido: ");
		numero = sc.nextInt();
		
		
		for(int i=1; i <=10; i++) {
		resultado = numero * i;
		System.out.println(numero +"x"+i+"="+resultado);
		sc.close();

	}
	}
	
}
