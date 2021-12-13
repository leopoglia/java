import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int escolha;
		
		do {
			
			System.out.println("ESCOLHA (1) OU (0)");
			escolha = sc.nextInt();
			
			
		}while(escolha < 0 || escolha > 1);
		
		sc.close();
		
	}

}
