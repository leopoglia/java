
public class UsuarioIncorreto extends RuntimeException{

	private static final long serialVersionUID = -1639768949199759908L;

	public UsuarioIncorreto() {
		super("Usuário ou senha Incorretos!");
	}
}
