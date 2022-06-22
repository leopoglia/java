public class OpcaoMenuInvalidaException extends RuntimeException {

	private static final long serialVersionUID = -2802460720399966979L;

	public OpcaoMenuInvalidaException(){
        super("Opção do menu inexistente!");
    }
}
