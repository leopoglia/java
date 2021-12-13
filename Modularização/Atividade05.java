import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ano;
		Boolean resultado;

		System.out.print("Digite o ano para saber se é bissexto: ");
		ano = sc.nextInt();

		resultado = bissexto(ano);
		System.out.println(resultado);
		sc.close();
	}

	static Boolean bissexto(int ano) {
		Boolean resultado;

		if (ano % 4 == 0) {
			resultado = true;
		} else {
			resultado = false;
		}
		
		if(ano % 100 == 0 && ano % 400 != 0) {
			resultado = false;
		}
		return resultado;
	}
}