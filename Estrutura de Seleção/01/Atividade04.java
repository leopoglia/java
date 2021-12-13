package Exercicios;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String letra;
		
		System.out.print("Digite uma letra para saber se ela é vogal ou consoante: ");
		letra = sc.next();
				
		if(letra.equals("A")|| letra.equals("a") || letra.equals("E") || letra.equals("e") || letra.equals("I") || letra.equals("i") || letra.equals("O") || letra.equals("o") || letra.equals("U") || letra.equals("u")) {
			System.out.println("Vogal");
		} else {
			System.out.println("Consoante");
		}
		sc.close();
	}
}
