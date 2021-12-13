package Exercicios;

import java.util.Scanner;

public class Atividade09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dia1, mes1, ano1, dia2, mes2, ano2;

		System.out.println("DIGITE A PRIMEIRA DATA (DIA MES ANO):");
		dia1 = sc.nextInt();
		mes1 = sc.nextInt();
		ano1 = sc.nextInt();

		System.out.println("DIGITA A SEGUNDA DATA (DIA MES ANO):");
		dia2 = sc.nextInt();
		mes2 = sc.nextInt();
		ano2 = sc.nextInt();

		if (ano1 < ano2) {
			System.out.println("DATA 1 OCORREU ANTES");
		} else if (ano1 > ano2) {
			System.out.println("DATA 2 OCORREU ANTES");
		} else if (ano1 == ano2) {
			if (mes1 < mes2) {
				System.out.println("DATA 1 OCORREU ANTES");
			} else if (mes1 > mes2) {
				System.out.println("DATA 2 OCORREU ANTES");
			} else if (mes1 == mes2) {
				if (dia1 < dia2) {
					System.out.println("DATA 1 OCORREU ANTES");
				} else if (dia1 > dia2) {
					System.out.println("DATA 2 OCORREU ANTES");
				} else if (dia1 == dia2) {
					System.out.println("É O MESMO DIA");
				}
				sc.close();
			}
		}
	}

}
