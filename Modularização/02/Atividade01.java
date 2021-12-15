import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double fahrenheit, resultado;
		
		System.out.print("Digite a temperatura em Fahrenheit");
		fahrenheit = sc.nextDouble();
		
		resultado = conta(fahrenheit);
		System.out.println(resultado);
		sc.close();
	}

	static double conta(double fahrenheit) {
		double graus = (fahrenheit - 32) * 5/9;
		return graus;
	}

}
