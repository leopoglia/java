import java.util.Scanner;

public class Atividade08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int posicao, resultado;
		
		System.out.print("Qual posição do Fibonacci você deseja?");
		posicao = sc.nextInt();
		
		resultado = fibonacci(posicao);
		System.out.println(resultado);
		sc.close();
	}

	static int fibonacci(int posicao) {
		int F1 = 1, F2 = 0, F3, resultado = 0;
		for(int i = 0; i < 46; i++) {	
			F3 = F1 + F2;
			F1 = F2;
			F2 = F3;		
			
			if(posicao == (i + 1)) {
				resultado = F3;
			}
		}
		return resultado;
	}
}