import java.util.Scanner;

public class Atividade09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sexo, idade, altura;
		double peso, GEB;
		
		System.out.print("Digite o seu sexo (1) Masculino; (2) Femenino; : ");
		sexo = sc.nextInt();
		
		System.out.print("Digite a sua idade: ");
		idade = sc.nextInt();
		
		System.out.print("Digite a sua altura (CM): ");
		altura = sc.nextInt();
		
		System.out.print("Digite o seu peso (KG): ");
		peso = sc.nextDouble();
		
		GEB = calculo(sexo, idade, altura, peso);
		System.out.println(GEB);
		sc.close();
	}

	static double calculo(int sexo, int idade, int altura, double peso) {
		double GEB;
		if(sexo == 1) {
			GEB = 66.5 + (13.75 * peso) + (5.003 * altura) - (6.775 * idade);
		}else {
			GEB = 655.1 + (9.563 * peso) + (1.85 * altura) - (4.676 * idade);
		}
		return GEB;
	}
}