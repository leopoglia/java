import java.util.ArrayList;

public class Materia {
	
	private int codigo;
	private String nome, areaAtuacao;

	static public ArrayList<Materia> listaMaterias = new ArrayList<Materia>();

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAreaAtuacao() {
		return areaAtuacao;
	}

	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}

	@Override
	public String toString() {
		return "CODIGO: " + codigo + " NOME: " + nome + " AREA ATUAÇÃO: " + areaAtuacao;
	}

	public Materia(int codigo, String nome, String areaAtuacao) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.areaAtuacao = areaAtuacao;
	}

	public Materia() {
		super();
	}

}