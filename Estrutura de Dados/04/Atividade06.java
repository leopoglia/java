package Exercicios;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vetorA[] = new int[10], vetorB[] = new int[10], vetorC[] = new int[10], diminuidor = 9;
		
		System.out.println("VETOR A");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("Valor " +i+ ": ");
			vetorA[i] = sc.nextInt();
		}
		
		System.out.println("\nVETOR B");
		for(int i = 0; i < vetorB.length; i++) {
			System.out.print("Valor " +i+ ": ");
			vetorB[i] = sc.nextInt();
		}
		
		for(int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[diminuidor];
			diminuidor--;
			System.out.println(vetorC[i]);
		}
		sc.close();
	}

}
