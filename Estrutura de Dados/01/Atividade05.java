import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vetorA[] = new int[10], totalNum = 0;
		
		for(int i = 0; i < 10; i ++) {
			System.out.print("Digite o " + (i+1)+"º número: ");
			vetorA[i] = sc.nextInt();
			totalNum = totalNum + (vetorA[i] *= vetorA[i]);
		}
		System.out.println("Soma dos quadrados: " + totalNum);
		
		sc.close();
	}

}
