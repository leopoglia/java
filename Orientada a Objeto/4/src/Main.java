import java.util.Scanner;
		
public class Main {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Quantas pessoas deseja adicionar?");
		int qtdPessoas = sc.nextInt();
		for(int i = 0; i < qtdPessoas; i++) {
			Pessoa.cadastro();
		}
		
		for(int i = 0; i < Pessoa.pessoas.size(); i++) {
			System.out.println("\nPESSOA: " + (i + 1));
			Pessoa.pessoas.get(i).saida();
		}
		
		/*------------------------------------------------------*/
		
		System.out.print("Quantos carros deseja adicionar?");
		int qtdCarros = sc.nextInt();
		for(int i = 0; i < qtdCarros; i++) {
			Carro.cadastro();
		}
		
		for(int i = 0; i < Carro.carros.size(); i++) {
			System.out.println("\nCARRO: " + (i + 1));
			Carro.carros.get(0).saida();
		}
		
		sc.close();
	}
}