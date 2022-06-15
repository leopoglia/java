package lanchonete;

public class PesoInvalido extends RuntimeException {
	
	private static final long serialVersionUID = -5086064981562854826L;

	public PesoInvalido() {
		super("Peso inválido!");
	}

}
