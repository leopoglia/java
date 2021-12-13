package Exercicios;

import java.util.Scanner;

public class Atividade09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int estoque, demanda, falta;
		
		
		System.out.print("-------------ESTOQUE-------------\nDIGITE A QUANTIDADE EM ESTOQUE: ");
		estoque = sc.nextInt();
		
		System.out.println("---------------------------------");
		System.out.print("DIGITE A QUANTIDADE DE DEMANDA: ");
		demanda = sc.nextInt();
		System.out.println("---------------------------------");
		
		if(estoque >= demanda) {
			System.out.println("PRODUTO COM ESTOQUE SUFICIENTE! :)");
		}else {
			System.out.println("PRODUTO SEM ESTOQUE SUFICIENTE! :(");
			falta = demanda - estoque;
			System.out.println("---------------------------------\nCOMPRE "+falta+" PRODUTOS PARA A DEMANDA\n---------------------------------");
		}
		sc.close();
	}

}
