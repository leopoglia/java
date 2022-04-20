public abstract class Automovel {

	String modelo, dono;
	String placa;
	int ano;
	double preco;
	
	public abstract void excluir(int cod);
	public abstract void vender(int donoNovo, int funcionario, int cod);
	public abstract void listar(int opcao);

	
	public Automovel() {
		super();
	}

	public Automovel(String modelo, String placa, int ano, double preco) {
		super();
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
		this.preco = preco;
	}

	public String toString() {
		return "MODELO: " + modelo + "\nPLACA: " + placa + "\nANO: " + ano + "\nPREÇO: " + preco + "\nDONO: " + dono + "\n" ;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}
	
	
	
}
