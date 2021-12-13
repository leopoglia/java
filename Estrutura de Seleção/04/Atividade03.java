package Exercicios;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int diaNascimento, mesNascimento, anoNascimento, diaHoje, mesHoje, anoHoje, idade, soma;

		System.out.println("Digite o dia, mes e ano de seu Nascimento (dia mes ano): ");
		diaNascimento = sc.nextInt();
		mesNascimento = sc.nextInt();
		anoNascimento = sc.nextInt();

		System.out.println("Digite o dia, mes e ano de HOJE (dia mes ano): ");
		diaHoje = sc.nextInt();
		mesHoje = sc.nextInt();
		anoHoje = sc.nextInt();

		
		if (anoHoje > anoNascimento) {
			idade = anoHoje - anoNascimento;
	
			if (mesHoje < mesNascimento) {
				soma = idade - 1;
				System.out.println("Idade: " + soma);
			} else if (mesHoje == mesNascimento) {
				if (diaHoje < diaNascimento) {
					soma = idade - 1;
				} else if (diaHoje == diaNascimento) {
					System.out.println("Feliz aniversário =)");
				} else {
					System.out.println("Idade:" +idade);
				}
			}

		} else {
			System.out.println("Digite um ano de nascimento válido");
		}
		sc.close();
	}
}
