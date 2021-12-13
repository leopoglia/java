import java.util.Scanner;

public class Atividade08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade[] = new int[30], altura[] = new int[30];
		int totalAltura = 0, mediaAltura, menorMedia = 0;
		
		
		for(int i = 0; i < altura.length; i++) {
			System.out.print("Digite sua idade: ");
			idade[i] = sc.nextInt();
			
			System.out.print("Digite sua altura em cm: ");
			altura[i] = sc.nextInt();
			
			totalAltura = totalAltura + altura[i];
		}
		
		mediaAltura = totalAltura / altura.length;
		
		for(int i = 0; i < 30; i++) {
			if(idade[i] > 13 && altura[i] <  mediaAltura) {
				menorMedia++;
			}
		}
		
		System.out.println("Quantidade de alunos com mais de 13 anos abaixo da média de altura é: " + menorMedia);
		sc.close();
	}
}