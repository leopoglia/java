package petshopp;

public class Gato extends Pet {
	
	private Boolean temperamento;
	private String comidaFavorita;
	
	public Gato() {
		super();
	}
	public Gato(int matricula, String nome, int idade, String porte, String pelagem, String cor, String raca, Boolean temperamento, String comidaFavorita) {
		super(matricula, nome, idade, porte, pelagem, cor, raca);
		this.temperamento = temperamento;
		this.comidaFavorita = comidaFavorita;
	}
	
	@Override
	public String toString() {
		return super.toString() + "(@) TEMPERAMENTO: " + temperamento + "(@) COMIDA FAVORITA: " + comidaFavorita + "";
	}
	public Boolean getTemperamento() {
		return temperamento;
	}
	public void setTemperamento(Boolean temperamento) {
		this.temperamento = temperamento;
	}
	public String getComidaFavorita() {
		return comidaFavorita;
	}
	public void setComidaFavorita(String comidaFavorita) {
		this.comidaFavorita = comidaFavorita;
	}
}