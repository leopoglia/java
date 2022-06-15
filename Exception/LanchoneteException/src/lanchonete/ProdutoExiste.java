package lanchonete;

public class ProdutoExiste extends RuntimeException {

	private static final long serialVersionUID = -699197174648916425L;

	public ProdutoExiste() {
		super("Produto já existe!");
	}

}
