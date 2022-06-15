package lanchonete;

public class OpcaoInvalida extends RuntimeException{

	private static final long serialVersionUID = 4706492673962683130L;

	public OpcaoInvalida() {
		super("Opção Inválida!");
	}
}
