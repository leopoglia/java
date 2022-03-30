public class Moto extends Automovel {
	
	String tipo;
	double suspensao;
	String tamanho;
	
	public Moto() {
		super();
	}

	public Moto(String modelo, String placa, int ano) {
		super(modelo, placa, ano);
	}

	public Moto(String modelo, String placa, int ano, String tipo, double suspensao, String tamanho) {
		super(modelo, placa, ano);
		this.tipo = tipo;
		this.suspensao = suspensao;
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		return super.toString() + "TIPO: " + tipo + "\nSUSPENSÃO: " + suspensao + "\nTAMANHO: " + tamanho;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSuspensao() {
		return suspensao;
	}
	public void setSuspensao(double suspensao) {
		this.suspensao = suspensao;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
}