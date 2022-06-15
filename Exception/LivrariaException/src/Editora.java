import java.util.ArrayList;

public class Editora {

	private String nome, CNPJ;
	
	static ArrayList<Editora> listaEditora = new ArrayList<>();
	

	public Editora(String nome, String cNPJ) {
		super();
		this.nome = nome;
		CNPJ = cNPJ;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	@Override
	public String toString() {
		return "Editora [ Nome: " + nome + ", CNPJ: " + CNPJ +"]";
	}
}