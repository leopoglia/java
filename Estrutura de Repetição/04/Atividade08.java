package Exercicios;

import java.util.Scanner;

public class Atividade08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int registro, genero, resposta, totalMasc = 0, totalFem = 0, totalSim = 0, totalNao = 0, femSim = 0, mascNao = 0, porcFemSim, porcMascNao;
		
		do {			
			System.out.print("Novo registro? (1) Sim (2) Não: ");
			registro = sc.nextInt();
			
			if(registro == 2) {
				break;
			}
			
			System.out.print("Você gostou do produto? (1) Sim (2) Não: ");
			resposta = sc.nextInt();
			
			System.out.print("Digite o seu sexo: (1) Masculino (2) Femenino: ");
			genero = sc.nextInt();
			
			if(resposta == 1) {
				totalSim++;
			}else if(resposta == 2) {
				totalNao++;
			}
			
			
			if(genero == 1) {
				totalMasc ++;
			}else if(genero == 2) {
				totalFem ++;
			}
			
			if(genero == 2 && resposta == 1) {
				femSim++;
			}
			
			if(genero == 1 && resposta == 2) {
				mascNao++;
			}
			
			System.out.println();
		}while(registro != 2);
		
		porcFemSim = (femSim / totalFem) * 100;
		porcMascNao = (mascNao / totalMasc) * 100;
		
		System.out.println("Sim: " +totalSim+ "\nNão: " +totalNao+ "\n(%) Femenino / Sim: " +porcFemSim+ "%\n(%) Masculino / Não: " +porcMascNao+"%");
		sc.close();
	}

}
