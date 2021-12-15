import java.util.Scanner;

public class Atividade14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palavra, resultado;
		
		System.out.print("Digite uma palavra: ");
		palavra = sc.nextLine();
		resultado = reverso(palavra);
		System.out.println(resultado);
		sc.close();
	}

	static String reverso(String palavra) {
		String resultado, verso = palavra;
		StringBuilder strb = new StringBuilder(verso);
		String inverso = strb.reverse().toString();
		if(verso.equals(inverso)) {
			resultado =  "É um palíndromo";
		}else {
			resultado =  "Não é um palíndromo";
		}
		return resultado;
	}
}