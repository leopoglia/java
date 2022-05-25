
public class ErroCanecaVazia extends Exception {

	private static final long serialVersionUID = 2817247591814943489L;

	public ErroCanecaVazia() {
		super("Você tentou tomar café, mas esqueceu de por o café na caneca!");
	}
}
