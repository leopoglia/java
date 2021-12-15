import java.util.Scanner;

public class Atividade15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texto, resultado;
		
		System.out.print("Digite o texto: ");
		texto = sc.next();
		
		resultado = verificacao(texto);
		System.out.println(resultado);
		sc.close();
	}

	static String verificacao(String texto) {
		String resultado;
		if (texto.toUpperCase().equals (texto)) {
			resultado = ("TODOS SÃO MAISCULO");
		}else if(texto.toLowerCase().equals (texto)){
			resultado = ("todas são minusculo");
		}else {
			resultado = ("O TeXto É mIsto");
		}
		return resultado;
	}
}