package Exercicios;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade = 1, idade2 = 0, media, i;
		
		for(i=1; idade >0; i++) {
			System.out.print("Digite a idade: ");
			idade = sc.nextInt();
			idade2 = idade2 + idade;
			
			if(idade == 0) {
				break;
			}
		}
		media = idade2 / (i - 1);
		System.out.println(media);
		sc.close();
	}
}