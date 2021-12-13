package Exercicios;

public class Atividade03 {

	public static void main(String[] args) {
		double cen=1, f=50;
		
		for(f = 50; f<=150; f++) {
			cen = (f - 32) * 5/9;
			System.out.printf("Farenheit = %.2f Centígrados = %.2f\n" ,f,cen);
		}
	}

}
