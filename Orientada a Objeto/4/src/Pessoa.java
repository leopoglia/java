import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa {

	static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

	private String nome;
	private String genero;
	private String corCabelo;
	private String corOlho;
	private int idade;
	private int cpf;
	private double altura;
	private double peso;

	public static Pessoa cadastro() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		System.out.println("Preencha as informações abaixo com suas características.");
		System.out.print("Nome: ");
		pessoa.nome = sc.next();
		System.out.print("Idade: ");
		pessoa.idade = sc.nextInt();
		System.out.print("Gênero: ");
		pessoa.genero = sc.next();
		System.out.print("Altura: ");
		pessoa.altura = sc.nextDouble();
		System.out.print("Peso: ");
		pessoa.peso = sc.nextDouble();
		System.out.print("CPF: ");
		pessoa.cpf = sc.nextInt();
		System.out.print("Cor de Cabelo: ");
		pessoa.corCabelo = sc.next();
		System.out.print("cor de Olho: ");
		pessoa.corOlho = sc.next();
		Pessoa.pessoas.add(pessoa);
		return pessoa;
	}

	public void saida() {
		System.out.println( "Nome: " + this.nome + "\nIdade: " + this.idade + "\nGenero:" + this.genero
				+ "\nAltura: " + this.altura + "\nPeso: " + this.peso + "\nCPF: " + this.cpf + "\nCor do Cabelo: "
				+ this.corCabelo + "\nCor do Olho: " + this.corOlho);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCorCabelo() {
		return corCabelo;
	}

	public void setCorCabelo(String corCabelo) {
		this.corCabelo = corCabelo;
	}

	public String getCorOlho() {
		return corOlho;
	}

	public void setCorOlho(String corOlho) {
		this.corOlho = corOlho;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
