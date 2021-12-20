import java.util.Scanner;

public class Atividade08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, alg1, alg2, alg3, alg4, soma;
		System.out.print("digite um numero: ");
		numero = sc.nextInt();
		
		alg1 = numero / 1000;
		alg2 = (numero / 100) % 10;
		alg3 = (numero / 10) % 10;
		alg4 = (numero / 1) % 10;
		System.out.println(alg1 + " " + alg2 + " " + alg3 + " " + alg4);
		
		String resultado1 = alg1 + "" + alg2;
		String resultado2 = alg3 + "" + alg4;
		soma = resultado1 + resultado2;
		System.out.println(resultado1 + resultado2);
	}

}
