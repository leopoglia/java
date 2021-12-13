package Exercicios;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String genero;

		System.out.print("Digite o seu gênero (M) Masculino ou (F) Femenino: ");
		genero = sc.next();
		
		if(genero.equals("M")|| genero.equals("m") || genero.equals("Masculino") || genero.equals("masculino") ) {
			System.out.println("Masculino");
		} else {
			System.out.println("Femenino");
		}
		sc.close();
		
	}

}
