
public abstract class Pessoa {
    private String nome, cpf, telefone, genero;
    private int idade, matricula, senha;
    
	public abstract String[] menu();
    
	public Pessoa(String nome, String cpf, String telefone, String genero, int idade, int matricula, int senha) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.genero = genero;
		this.idade = idade;
		this.matricula = matricula;
		this.setSenha(senha);
	}
	

	@Override
	public String toString() {
		return "Pessoa nome:" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", genero=" + genero + ", idade="
				+ idade + ", matricula=" + matricula;
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
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
}