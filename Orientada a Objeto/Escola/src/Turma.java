import java.util.ArrayList;

public class Turma {

	private String nome;
	private int codigo;
	
	public ArrayList<Turma> materias = new ArrayList<Turma>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Turma [nome=" + nome + ", codigo=" + codigo + ", materias=" + materias + "]";
	}

	public Turma(String nome, int codigo) {
		super();
		this.nome = nome;
		this.codigo = codigo;
	}

	public Turma() {
		super();
	}
}