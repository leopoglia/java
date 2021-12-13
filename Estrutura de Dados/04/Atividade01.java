package Exercicios;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double voos[][] = new double[3][10];
		int coluna, identidadePassageiro, vooDesejado, passageiro=0, quantidadeLugares[] = new int[10], calculo, situacao = 0;
		
		for(coluna = 0; coluna < voos[0].length; coluna++) {
			System.out.println("+----VÔO " + (coluna+1) + "-----+");
			
			System.out.print("Número de vôo: ");
			voos[0][coluna] = sc.nextInt();
				
			System.out.print("Tipo de avião: ");
			voos[1][coluna] = sc.nextInt();
			
			if(voos[1][coluna] == 707 ) {
				quantidadeLugares[coluna] = 200;
			}else if(voos[1][coluna] == 727) {
				quantidadeLugares[coluna] = 170;
			}else if(voos[1][coluna] == 737 ) {
				quantidadeLugares[coluna] = 120;
			}
			
			System.out.print("Preço passagem: ");
			voos[2][coluna] = sc.nextInt();
			}
		
		
		System.out.println();
		
		do {
			passageiro++;
			System.out.println("+--PASSAGEIRO " + (passageiro) + "--+");
			System.out.print("Número da Identidade do passageiro: ");
			identidadePassageiro = sc.nextInt();
			
			System.out.print("Número do vôo desejado: ");
			vooDesejado = sc.nextInt();
			
			for(int i = 0; i < voos[0].length; i++) {
				if(vooDesejado == voos[0][i] && quantidadeLugares[i] > 0) {
					System.out.println("+---------INFOS---------+");
					System.out.println("IDENTIDADE DO PASSAGEIRO: " + identidadePassageiro);
					System.out.println("NÚMERO DO VÔO DESEJADO: " + vooDesejado);
					System.out.println("PREÇO DA PASSAGEM: " + voos[2][i]);
					System.out.println("RESERVA CONFIRMADA!");
					quantidadeLugares[i] = quantidadeLugares[i] - 1;
				}else if(vooDesejado == voos[0][i] && quantidadeLugares[i] <= 0) {
					System.out.println("VÔO ESTÁ LOTADO!");
				}
			}
			
		}while(identidadePassageiro != 0);
		
		System.out.println("+---INFOS VOÔS---+");
		
		for(coluna = 0; coluna < voos[0].length; coluna++) {
			if(voos[1][coluna] == 707) {
				calculo = quantidadeLugares[coluna] - 120;
				if(calculo >= quantidadeLugares[coluna]) {
					System.out.println("Voô " +(coluna+1)+ " Lucro!");
					situacao++;
				}else {
					System.out.println("Voô " +(coluna+1)+ " Prejuizo!a");
				}
			}else if(voos[1][coluna] == 727) {
				calculo = quantidadeLugares[coluna] - 102;
				if(calculo >= quantidadeLugares[coluna]) {
					System.out.println("Voô " +(coluna+1)+ " Lucro!");
					situacao++;
				}else {
					System.out.println("Voô " +(coluna+1)+ " Prejuizo!");
				}
				
			}else if(voos[1][coluna] == 737) {
				calculo = quantidadeLugares[coluna] - 72;
				if(calculo >= quantidadeLugares[coluna]) {
					System.out.println("Voô " +(coluna+1)+ " Lucro!");
					situacao++;
				}else {
					System.out.println("Voô " +(coluna+1)+ " Prejuizo");
				}
				
			}
		}
		System.out.println("+---INFOS AVIAÇÃO---+");
		if(situacao > (voos[0].length/1.5)) {
			System.out.println("Aviação Lucrou!");
		}else {
			System.out.println("Aviação teve Prejuizo!");
		}
		sc.close();
	}
}