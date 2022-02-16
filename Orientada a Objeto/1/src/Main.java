import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa p1 = new Pessoa();

		p1.nome = "Otavinho";
		p1.altura = 1.98;
		p1.corCabelo = "Roxo";
		p1.corOlho = "Branco";
		p1.cpf = 323454324;
		p1.genero = "Neutro";
		p1.idade = 13;
		p1.peso = 60;

		Pessoa p2 = new Pessoa();

		p2.nome = "Shiba";
		p2.altura = 1.7;
		p2.corCabelo = "Loiro";
		p2.corOlho = "Preto";
		p2.cpf = 321432543;
		p2.genero = "Masculino";
		p2.idade = 18;
		p2.peso = 80;

		Pessoa p3 = new Pessoa();

		System.out.print("Nome: ");
		p3.nome = sc.next();
		System.out.print("Altura: ");
		p3.altura = sc.nextDouble();
		System.out.print("Cor do Cabelo: ");
		p3.corCabelo = sc.next();
		System.out.print("Cor do Olho: ");
		p3.corOlho = sc.next();
		System.out.print("CPF: ");
		p3.cpf = sc.nextInt();
		System.out.print("Genero: ");
		p3.genero = sc.next();
		System.out.print("Idade: ");
		p3.idade = sc.nextInt();
		System.out.print("Peso: ");
		p3.peso = sc.nextDouble();
		System.out.print(p1.nome + ", " + p1.altura + ", " + p1.corCabelo + ", " + p1.corOlho + ", " + p1.cpf + ", "
				+ p1.genero + ", " + p1.idade + ", " + p1.peso + "\n");
		System.out.print(p2.nome + ", " + p2.altura + ", " + p2.corCabelo + ", " + p2.corOlho + ", " + p2.cpf + ", "
				+ p2.genero + ", " + p2.idade + ", " + p2.peso + "\n");
		System.out.print(p3.nome + ", " + p3.altura + ", " + p3.corCabelo + ", " + p3.corOlho + ", " + p3.cpf + ", "
				+ p3.genero + ", " + p3.idade + ", " + p3.peso + "\n");
		
		

		Carro c1 = new Carro();
		
		c1 = c1.cadastro();
		c1.saida();
		
		Carro c2 = new Carro();

		c2 = c2.cadastro();
		c2.saida();

		Carro c3 = new Carro();

		c3 = c3.cadastro();
		c3.saida();
	

		sc.close();
	}
}