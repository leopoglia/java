import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mes;
		String resultado;

		System.out.print("Digite o número do mês: ");
		mes = sc.nextInt();

		resultado = mes(mes);
		System.out.println(resultado);
		sc.close();

	}

	static String mes(int mes) {
		String resultado = null;
		switch (mes) {
		case 1:
			resultado = "Janeiro";
			break;
		case 2:
			resultado = "Fevereiro";
			break;
		case 3:
			resultado = "Março";
			break;
		case 4:
			resultado = "Abril";
			break;
		case 5:
			resultado = "Maio";
			break;
		case 6:
			resultado = "Junho";
			break;
		case 7:
			resultado = "Julho";
			break;
		case 8:
			resultado = "Agosto";
			break;
		case 9:
			resultado = "Setembro";
			break;
		case 10:
			resultado = "Outubro";
			break;
		case 11:
			resultado = "Novembro";
			break;
		case 12:
			resultado = "Dezembro";
			break;
		}
		return resultado;
	}

}
