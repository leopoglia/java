import java.util.ArrayList;

public abstract class Pessoa {
	private String nome, cpf, sobrenome, email, genero, senha;
	
	static ArrayList<Pessoa> listaPessoa = new ArrayList<>();
	
	public abstract String listarLivros();
	public abstract void editarLivro();
	public abstract String[] opcoes();
	public abstract String listarAtividades();
	

	public Pessoa(String nome, String cpf, String sobrenome, String email, String genero, String senha) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.sobrenome = sobrenome;
		this.email = email;
		this.genero = genero;
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "NOME: " + nome + ", CPF: " + cpf + ", SOBRENOME: " + sobrenome + ", EMAIL: " + email + ", GENERO: "
				+ genero + ", SENHA: " + senha;
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

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}