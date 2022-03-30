public class Automovel {

	String modelo;
	String placa;
	int ano;
	
	public Automovel() {
		super();
	}

	public Automovel(String modelo, String placa, int ano) {
		super();
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
	}

	public String toString() {
		return "MODELO: " + modelo + "\nPLACA: " + placa + "\nANO: " + ano + "\nVENDIDO: ";
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
}