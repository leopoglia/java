
public class Pet {

	private int matricula;
	private String nome;
	private int idade;
	private String porte;
	private String pelagem;
	private String cor;
	private String raca;
	
	public Pet() {
		super();
	}

	public Pet(int matricula, String nome, int idade, String porte, String pelagem, String cor, String raca) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.idade = idade;
		this.porte = porte;
		this.pelagem = pelagem;
		this.cor = cor;
		this.raca = raca;
	}

	@Override
	public String toString() {
		return "(@) PET\n(@) MATRICULA: " + matricula + "\n(@) NOME: " + nome + "\n(@) IDADE: " + idade + "\n(@)PORTE: " + porte + "\n(@) PELAGEM: " + pelagem + "\n(@) COR: " + cor
				+ "\n(@) RAÇA: " + raca + "\n";
	}
	
	
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
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
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public String getPelagem() {
		return pelagem;
	}
	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}

}