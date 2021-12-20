import java.util.Scanner;

public class Atividade07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		verificacao();
		sc.close();
	}

	static String verificacao() {
		String resultado = null;
		for (int i = 1000; i < 10000; i++) {
			String izao = Integer.toString(i);
			String verso = izao;
			StringBuilder strb = new StringBuilder(verso);
			String inverso = strb.reverse().toString();
			if (verso.equals(inverso)) {
				System.out.println(inverso);
			}
		}
		return resultado;
	}
}