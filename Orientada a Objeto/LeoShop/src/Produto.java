import java.util.ArrayList;

public class Produto {
	
	static ArrayList<Produto> listaProduto = new ArrayList<Produto>();
	
	private String descricao;
	private String marca;
	private String modelo;
	private int codigo;
	private int quantidade;
	private double valor;
	
	public static void reduzirEstoque() {
		
	}

	@Override
	public String toString() {
		return "Produto [descricao=" + descricao + ", marca=" + marca + ", modelo=" + modelo + ", codigo=" + codigo
				+ ", quantidade=" + quantidade + ", valor=" + valor + "]";
	}

	public Produto(String descricao, String marca, String modelo, int codigo, int quantidade, double valor) {
		super();
		this.descricao = descricao;
		this.marca = marca;
		this.modelo = modelo;
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	public Produto() {
		super();
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	

}
