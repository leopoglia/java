package lanchonete;

public class TamanhoInvalido extends RuntimeException{

	private static final long serialVersionUID = -6311278837499315646L;

	public TamanhoInvalido() {
		super("Tamanho inválido!");
	}
}
