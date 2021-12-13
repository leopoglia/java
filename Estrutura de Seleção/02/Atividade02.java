package Exercicios;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String turno;

		System.out.print("Em qual turno você está? M (matutino) ou V (vespertino) ou N (noturno): ");
		turno = sc.next();

		if (turno.equals("M")) {
			System.out.println("Bom dia =)");
		} else if (turno.equals("V")) {
			System.out.println("Boa tarde =)");
		} else if (turno.equals("N")) {
			System.out.println("Boa noite =)");
		} else {
			System.out.println("Turno indefinido");
		}

		sc.close();
	}

}
