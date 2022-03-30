public class Carro extends Automovel {
	
	int portas;
	int cavalos;
	String estilo;
	
	public Carro() {
		super();
	}

	public Carro(String modelo, String placa, int ano, int portas, int cavalos, String estilo) {
		super(modelo, placa, ano);
		this.portas = portas;
		this.cavalos = cavalos;
		this.estilo = estilo;
	}
	
	@Override
	public String toString() {
		return super.toString() + "PORTAS: " + portas + "\nCAVALOS: " + cavalos + "\nESTILO: " + estilo;
	}
	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}
	public int getCavalos() {
		return cavalos;
	}
	public void setCavalos(int cavalos) {
		this.cavalos = cavalos;
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
}