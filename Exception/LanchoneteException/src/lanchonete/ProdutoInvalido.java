package lanchonete;

public class ProdutoInvalido extends RuntimeException {

	private static final long serialVersionUID = 1999114977624738898L;

	public ProdutoInvalido() {
		super("Produto Inválido");
	}

}
