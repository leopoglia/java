public class Cachorro extends Pet {
	
	private String brinquedoFavorito;
	private String gostaDeFazer;
	
	public Cachorro() {
		super();
	}

	public Cachorro(int matricula, String nome, int idade, String porte, String pelagem, String cor, String raca, String brinquedoFavorito, String gostaDeFazer) {
		super(matricula, nome, idade, porte, pelagem, cor, raca);
		this.brinquedoFavorito = brinquedoFavorito;
		this.gostaDeFazer = gostaDeFazer;
	}

	@Override
	public String toString() {
		return super.toString() + "(@) BRINQUEDO FAVORITO: " + brinquedoFavorito + "\n(@) GOSTA DE FAZER: " + gostaDeFazer + "";
	}
	
	public String getBrinquedoFavorito() {
		return brinquedoFavorito;
	}
	public void setBrinquedoFavorito(String brinquedoFavorito) {
		this.brinquedoFavorito = brinquedoFavorito;
	}
	public String getGostaDeFazer() {
		return gostaDeFazer;
	}
	public void setGostaDeFazer(String gostaDeFazer) {
		this.gostaDeFazer = gostaDeFazer;
	}
}
