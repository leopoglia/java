
public class Pessoa extends Endereco {
	
	private String nome;
	private String cpf;
	private String email;
	private String telefone;
	private String genero;
	private int idade;
	
	public static void comprar() {
		
	}
	
	@Override
	public String toString() {
		return "NOME: " + nome + "\nCPF: " + cpf + "\nEMAIL:" + email + "\nTELEFONE: " + telefone + "\nTELEFONE: "
				+ genero + "\nIDADE: " + idade + "\n";
	}

	public Pessoa(String nome, String cpf, String email, String telefone, String genero, int idade) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.genero = genero;
		this.idade = idade;
	}

	public Pessoa() {
		super();
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	

}
