package Exercicios;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int canal, qtdpessoas = 0, totalPessoas = 0,  i = 0, audiencia4 = 0, audiencia5 = 0, audiencia7 = 0, audiencia12 = 0, canal4, canal5, canal7, canal12;
		
		do {
			i++;
			System.out.println("-------------------CASA " +i+"-------------------");
			do {
			System.out.print("Qual canal estava assistindo? 4, 5, 7 ou 12: ");
			canal = sc.nextInt();
			if(canal == 0) {
				break;
			}
			
			}while(canal !=4 && canal !=5 && canal !=7 && canal !=12);
			
			if(canal == 0) {
				break;
			}
			System.out.print("Quantidade de pessoas assistindo: ");
			qtdpessoas = sc.nextInt();
			totalPessoas = totalPessoas + qtdpessoas;

			
			if(canal == 4) {
				audiencia4 = audiencia4 + qtdpessoas;
			}else if(canal == 5) {
				audiencia5 = audiencia5 + qtdpessoas;
			}else if(canal == 7) {
				audiencia7 = audiencia7 + qtdpessoas;
			}else if(canal == 12) {
				audiencia12 = audiencia12 + qtdpessoas;
			}
						
		}while(canal != 0);
		
		canal4 = (audiencia4*100)/totalPessoas;
		canal5 = (audiencia5*100)/totalPessoas;
		canal7 = (audiencia7*100)/totalPessoas;
		canal12 = (audiencia12*100)/totalPessoas;

		System.out.print("--------------------------------------------");
		System.out.println(totalPessoas);
		System.out.print("\nCanal 4: " +canal4+"%\n");
		System.out.print("Canal 5: " +canal5+"%\n");
		System.out.print("Canal 7: " +canal7+"%\n");
		System.out.print("Canal 12: " +canal12+"%\n");
		sc.close();
	}
}