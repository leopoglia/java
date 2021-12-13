package Exercicios;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char personagem, contrapersonagem = 0;
		int i = 0, posicaoX = 0, posicaoY = 0;
		char jogodavelha[][] = new char[3][3];
		
		System.out.println("BEM-VINDO AO JOGO DA VELHA\n");
		System.out.println("FUNCIONAMENTO DAS POSI합ES EXPLICADAS: ");
		System.out.println("    0     1     2");
		System.out.println("0  0/0   1/0   2/0");
		System.out.println("1  0/1   1/1   2/1");
		System.out.println("2  0/2   1/2   2/2\n");

		System.out.print("ESCOLHA X OU O:");
		personagem = sc.next().charAt(0);
		
		if(personagem == 'X' || personagem == 'x') {
			contrapersonagem = 'O';
		}else if(personagem == 'O' || personagem =='o') {
			contrapersonagem = 'X';
		}
		do {
		i++;
		
		for(int coluna = 0; coluna < 3; coluna++) {
			for(int linha = 0; linha < 3; linha++) {
				jogodavelha[linha][coluna] = '-';
			}
		}
		for(int jogo = 0; jogo < 6; jogo++) {
			do {
				System.out.print("\nESCOLHA A POSI플O DESEJADA " +personagem+": ");
				posicaoY = sc.nextInt();
				posicaoX = sc.nextInt();
				if(jogodavelha[posicaoY][posicaoX] != '-') {
					System.out.println("ESCOLHA OUTRA POSI플O!");
			}
		}while(jogodavelha[posicaoY][posicaoX] != '-');
		jogodavelha[posicaoY][posicaoX] = personagem;

		System.out.println("   0  1  2");
		System.out.println("0  "+jogodavelha[0][0]+"  "+jogodavelha[1][0]+"  "+jogodavelha[2][0]);
		System.out.println("1  "+jogodavelha[0][1]+"  "+jogodavelha[1][1]+"  "+jogodavelha[2][1]);
		System.out.println("2  "+jogodavelha[0][2]+"  "+jogodavelha[1][2]+"  "+jogodavelha[2][2]);
		
		for(int win1 = 0; win1 < 3; win1++) {
			if((jogodavelha[win1][0] == personagem && jogodavelha[win1][1] == personagem && jogodavelha[win1][2] == personagem) || (jogodavelha[0][0] == personagem && jogodavelha[1][0] == personagem && jogodavelha[2][0] == personagem)
					|| (jogodavelha[0][1] == personagem && jogodavelha[1][1] == personagem && jogodavelha[2][1] == personagem)|| (jogodavelha[0][2] == personagem && jogodavelha[1][2] == personagem && jogodavelha[2][2] == personagem) || (jogodavelha[0][0] == personagem && jogodavelha[1][1] == personagem && jogodavelha[2][2] == personagem ) || (jogodavelha[0][2] == personagem && jogodavelha[1][1] == personagem && jogodavelha[2][0] == personagem)){
				System.out.println("O JOGADOR " +personagem+ " GANHOU!!!");
				return;
			}
		}
		do {
		System.out.print("\nESCOLHA A POSI플O DESEJADA " +contrapersonagem+": ");
		posicaoY = sc.nextInt();
		posicaoX = sc.nextInt();
		if(jogodavelha[posicaoY][posicaoX] != '-') {
			System.out.println("ESCOLHA OUTRA POSI플O!");
		}
		}while(jogodavelha[posicaoY][posicaoX] != '-');
		jogodavelha[posicaoY][posicaoX] = contrapersonagem;

		System.out.println("   0  1  2");
		System.out.println("0  "+jogodavelha[0][0]+"  "+jogodavelha[1][0]+"  "+jogodavelha[2][0]);
		System.out.println("1  "+jogodavelha[0][1]+"  "+jogodavelha[1][1]+"  "+jogodavelha[2][1]);
		System.out.println("2  "+jogodavelha[0][2]+"  "+jogodavelha[1][2]+"  "+jogodavelha[2][2]);

		for(int win1 = 0; win1 < 3; win1++) {
			if((jogodavelha[win1][0] == contrapersonagem && jogodavelha[win1][1] == contrapersonagem && jogodavelha[win1][2] == contrapersonagem) || (jogodavelha[0][0] == contrapersonagem && jogodavelha[1][0] == contrapersonagem && jogodavelha[2][0] == contrapersonagem)
					|| (jogodavelha[0][1] == contrapersonagem && jogodavelha[1][1] == contrapersonagem && jogodavelha[2][1] == contrapersonagem)|| (jogodavelha[0][2] == contrapersonagem && jogodavelha[1][2] == contrapersonagem && jogodavelha[2][2] == contrapersonagem)|| (jogodavelha[0][0] == contrapersonagem && jogodavelha[1][1] == contrapersonagem && jogodavelha[2][2] == contrapersonagem ) || (jogodavelha[0][2] == contrapersonagem && jogodavelha[1][1] == contrapersonagem && jogodavelha[2][0] == contrapersonagem)){
				System.out.println("O JOGADOR " +contrapersonagem+ " GANHOU!!!");
				return;
				}
			}
		
		}
		sc.close();
		}while(i!= 0);
		sc.close();
	}
}