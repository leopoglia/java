package Exercicios;

import java.util.Scanner;

public class Atividade07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int saque, alg1 = 0, alg2 = 0, alg3 = 0;

		System.out.println("INFORME A QUANTIDADE DO SAQUE (LIMITE R$600):");
		saque = sc.nextInt();

		if (saque <= 600) {
			alg1 = (saque / 100) % 10;
			alg2 = (saque / 10) % 10;
			alg3 = (saque / 1) % 10;
			System.out.println("NOTAS DE CEM:" + alg1);
		} else {
			System.out.println("DIGITE UMA QUANTIDADE MENOR DE R$600");
		}
		if (alg2 == 5) {
			System.out.println("NOTAS DE CINQUENTA: 1");
		} else if (alg2 == 4) {
			System.out.println("NOTAS DE DEZ: 4");
		} else if (alg2 == 3) {
			System.out.println("NOTAS DE DEZ: 3");
		} else if (alg2 == 2) {
			System.out.println("NOTAS DE DEZ: 2");
		} else if (alg2 == 1) {
			System.out.println("DEZ: 1");
		} else if (alg2 == 6) {
			System.out.println("NOTAS DE CINQUENTA: 1\nNOTAS DE DEZ: 1");
		} else if (alg2 == 7) {
			System.out.println("NOTAS DE CINQUENTA: 1\nNOTAS DE DEZ: 2");
		} else if (alg2 == 8) {
			System.out.println("NOTAS DE CINQUENTA: 1\nNOTAS DE DEZ: 3");
		} else if (alg2 == 9) {
			System.out.println("NOTAS DE CINQUENTA: 1\nNOTAS DE DEZ: 4");
		}
		if (alg3 == 1) {
			System.out.println("NOTA DE UM: 1");
		} else if (alg3 == 2) {
			System.out.println("NOTAS DE UM: 2");
		} else if (alg3 == 3) {
			System.out.println("NOTAS DE UM: 3");
		} else if (alg3 == 4) {
			System.out.println("NOTAS DE UM: 4");
		} else if (alg3 == 5) {
			System.out.println("NOTAS DE CINCO: 1");
		} else if (alg3 == 6) {
			System.out.println("NOTAS DE CINCO: 1\nNOTAS DE UM: 1");
		} else if (alg3 == 7) {
			System.out.println("NOTAS DE CINCO: 1\nNOTAS DE UM: 2");
		} else if (alg3 == 8) {
			System.out.println("NOTAS DE CINCO: 1\nNOTAS DE UM: 3");
		} else if (alg3 == 9) {
			System.out.println("NOTAS DE CINCO: 1\nNOTAS DE UM: 4");
		}
		sc.close();
	}
}