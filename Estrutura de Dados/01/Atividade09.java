import java.util.Scanner;

public class Atividade09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double mediaMes[] = new double[12];
		String mes[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		double totalTemp = 0, mediaAnual;
		
		for(int i = 0; i < mediaMes.length ; i++) {
			System.out.print("Média mês " + (i+1) + ": ");
			mediaMes[i] = sc.nextDouble();
			totalTemp += mediaMes[i];
		}
		
		mediaAnual = totalTemp/mediaMes.length;
		System.out.println("-----------------------");
		
		for(int i = 0; i< 12; i++) {
			System.out.println((i+1) + " - " + mes[i] + ": " +mediaMes[i]);
		}
		
		System.out.println("Média Anual: " +mediaAnual);
		sc.close();
	}

}
