package lanchonete;

public class PrecoInvalido extends RuntimeException{
	
	private static final long serialVersionUID = -3904134846951585929L;

	public PrecoInvalido() {
		super("Preço inválido!");
		}

}
