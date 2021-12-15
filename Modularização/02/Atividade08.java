import java.util.Scanner;

public class Atividade08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char caractere;
		char resultado;

		System.out.print("Digite um caractere: ");
		caractere = sc.next().charAt(0);

		resultado = verificacao(caractere);
		System.out.println(resultado);
		sc.close();
	}

	static char verificacao(char caractere) {
		char resultado = ' ';
		char minusculo[] = {'a', 'b', 'c', 'd' ,'e' , 'f', 'g' , 'h' ,  'i' , 'j' , 'k',  'l' ,  'm', 'n' , 'o' , 'p' ,'q' ,'r' ,'s' , 't', 'u' , 'v', 'w' , 'x' ,  'y', 'z'};
		char maisculo[] = {'A', 'B', 'C', 'D' ,'E' , 'F', 'G' , 'H' ,  'I' , 'J' , 'K',  'L' ,  'M', 'N' , 'O' , 'P' ,'Q' ,'R' ,'S' , 'T', 'U' , 'V', 'W' , 'X' ,  'Y', 'Z'};
		
		for(int i = 0; i < minusculo.length; i++) {
			if(caractere == minusculo[i]) {
				resultado = maisculo[i];
			}else {
			}
		}

		return resultado;
	}
}