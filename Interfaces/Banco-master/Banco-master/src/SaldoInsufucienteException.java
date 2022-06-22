public class SaldoInsufucienteException extends RuntimeException {

	private static final long serialVersionUID = 2736757689105016617L;

	public SaldoInsufucienteException() {
        super("Saldo insuficiente!");
    }
}
