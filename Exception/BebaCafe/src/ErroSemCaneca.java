
public class ErroSemCaneca extends Exception{
	
	private static final long serialVersionUID = -5128295053180705840L;

	public ErroSemCaneca() {
		super("Você deixou o café na mesa, mas esqueceu que não tem café lá!");
	}
}
