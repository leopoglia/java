package Exercicios;

import java.util.Scanner;

public class Atividade09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int qtdCriancas, qtdMortas = 0 , mascMorta = 0, porcMascMorta=0, menos24Mes = 0, porcMenos24Mes ,genero, meses, porcMortas;
		
		System.out.print("Quantas crianças nasceram?");
		qtdCriancas = sc.nextInt();
		
		
		do {
			System.out.print("Digite o genero da criança morta: 1 (Femenino) 2 (Masculino) 3 (Parar)");
			genero = sc.nextInt();
			
			if(genero == 3) {
				break;
			}
			qtdMortas++;
			System.out.print("Meses da criança: ");
			meses = sc.nextInt();
			
			if(genero == 2) {
				mascMorta++;
			}
			
			if(meses <= 24) {
				menos24Mes++;
			}
			
		}while(genero != 3);
		
		porcMortas = (qtdMortas*100)/qtdCriancas;
		porcMascMorta = (mascMorta*100)/qtdMortas;
		porcMenos24Mes = (menos24Mes*100)/qtdMortas;
		
		System.out.println("Porcentagem de crianças mortas: " +porcMortas+ "%\nPorcentagem de meninos mortos: " +porcMascMorta+ "%\nPorcentagem de crianças que viveram menos de 24 meses: " +porcMenos24Mes +"%");
		sc.close();
	}	

}
