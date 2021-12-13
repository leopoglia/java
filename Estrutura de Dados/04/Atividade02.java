package Exercicios;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double populacao[][] = new double[2][10], maiorPop=0, numeroEstado = 0, totalPopCapitais = 0, mediaCapitais = 0;
		int i;
		
		for(i = 0; i < populacao.length; i++) {
			System.out.println("\n+----------ESTADO " + (i+1) + "----------+" );
			for(int ii = 0; ii < populacao[0].length; ii++) {
				System.out.print("DIGITE A POPOULAÇÃO DO MUNICIPIO: ");
				populacao[i][ii] = sc.nextDouble();
				if(populacao[i][ii] > maiorPop) {
					maiorPop = populacao[i][ii];
					numeroEstado = i;
				}
				if(populacao[i][0] == populacao[i][ii]) {
					totalPopCapitais = totalPopCapitais + populacao[i][ii]; 
				}
				mediaCapitais = totalPopCapitais / populacao.length;
			}
		}
		System.out.println("Municipio mais populoso: " + maiorPop + ", fica no estado número: " +(numeroEstado+1));
		System.out.println("Media da populações das capitais: " + mediaCapitais);
		sc.close();
	}
}