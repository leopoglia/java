import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texto;
		Boolean resultado;
		
		System.out.print("Digite um texto: ");
		texto = sc.next();
		
		resultado = verificacao(texto);
		System.out.println(resultado);
		sc.close();
	}

	static Boolean verificacao(String texto) {
		Boolean resultado;
		if (texto.toLowerCase().equals(texto)) {
			resultado = true;
		}else {
			resultado = false;
		}
		return resultado;
	}

}
