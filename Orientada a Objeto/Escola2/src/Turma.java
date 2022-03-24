import java.util.ArrayList;

public class Turma {

	private String nome;
	private int codigo;
	
	static public ArrayList<Turma> listaTurma = new ArrayList<Turma>();
	public ArrayList<Materia> listaMateriasTurma = new ArrayList<Materia>();

	
	
	public ArrayList<Materia> getListaMateriasTurma() {
		return listaMateriasTurma;
	}

	public void setListaMateriasTurma(ArrayList<Materia> listaMateriasTurma) {
		this.listaMateriasTurma = listaMateriasTurma;
	}

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
		return "Turma [nome=" + nome + ", codigo=" + codigo + ", materias=" + listaMateriasTurma + "]";
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