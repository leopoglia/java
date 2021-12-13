import java.util.Scanner;

public class Atividade07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		String resultado;
		
		System.out.print("Digite um número: ");
		num = sc.nextInt();
		
		resultado = fatorial(num);
		System.out.println(resultado + "1");
		sc.close();
	}

		static String fatorial(int num) {
		String total= "";
		for(int i = 0; i < num; i++) {
			if(num % 2 == 0){
				num = num / 2;
				total = (total + "2 * ");
			}else if(num % 3 == 0) {
				num = num / 3;
				total = (total + "3 * ");
			}else if(num % 5 == 0) {
				num = num / 5;
				total = (total + "5 * ");
			}else if(num % 9 == 0) {
				num = num / 5;
				total = (total + "9 * ");
			}else if(num % 11 == 0) {
				num = num / 11;
				total = (total + "11 * ");
			}
		}
		return total;
	}

}
