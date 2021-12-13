package Exercicios;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0, dentro = 0, fora = 0;
		
		for(int i=1; i <=10; i++) {
			System.out.print("Digite o número: ");
			num = sc.nextInt();
			
			if(num >= 10 && num <=20) {
				dentro = dentro + 1;
			}else {
				fora = fora + 1;
			}
		}
		System.out.println("DENTRO DO INTRAVALO 10 - 20: " + dentro + "\nFORA DO INTERVALO: " + fora);
		sc.close();
	}
}
