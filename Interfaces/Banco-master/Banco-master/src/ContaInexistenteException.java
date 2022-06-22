public class ContaInexistenteException extends RuntimeException {

	private static final long serialVersionUID = -7465479843554715578L;

	public ContaInexistenteException() {
        super("Conta não encontrada!");
    }
}
