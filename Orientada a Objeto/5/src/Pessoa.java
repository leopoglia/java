import java.util.Scanner;

public class Pessoa {

	private String nome;
	private int idade;
	private int cpf;
	private String genero;
	
	public void cadastro() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);		
		System.out.print("Insira o nome do terceiro: ");
		this.setNome(sc.next());

		System.out.print("Insira a idade: ");
		this.setIdade(sc.nextInt());

		System.out.print("Insira o gênero: ");
		this.setGenero(sc.next());

		System.out.print("Insira o CPF: ");
		this.setCpf(sc.nextInt());
	}
	
	public String getNome() {
		return nome;
	}
 	public void setNome(String nome) {
		this.nome = nome;
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
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

}