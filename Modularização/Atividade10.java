import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sexo;
		double altura, resultado;
		
		System.out.print("Digite o seu sexo (1) Masculino (2) Femenino: ");
		sexo = sc.nextInt();
		
		System.out.print("Digite a sua altura (M): ");
		altura = sc.nextDouble();
		
		resultado = calculo(sexo, altura);
		System.out.println("Peso ideal: " + resultado);
		sc.close();
	}

	static double calculo(int sexo, double altura) {
		double resultado = 0;
		if(sexo == 1) {
			resultado = (72.7 * altura) - 58;
		}else {
			resultado = (62.1 * altura) - 44.7;
		}
		return resultado;
	}

}
