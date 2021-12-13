import java.util.Scanner;

public class Atividade07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vetor1[] = new int[10], vetor2[] = new int[10], vetor3[] = new int [10], i2 = 0, i3 = 0;
;
		
		System.out.println("VETOR 1");
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite o "+(i+1)+"º número: ");
			vetor1[i] = sc.nextInt();
			
		}
		
		System.out.println("VETOR 2");
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite o "+(i+1)+"º número: ");
			vetor2[i] = sc.nextInt();
		}
		
		System.out.println("VETOR 3");
		for(int i = 0; i < 20; i= i+2) {
			vetor3[i] = vetor1[i2];
			i2++;
		}
		
		for(int i = 1; i < 20; i= i+2){
			vetor3[i] = vetor2[i3];
			i3++;
		}
		
		for(int i = 0; i < 20; i++) {
			System.out.println(vetor3[i]);
		}
		sc.close();
	}
}