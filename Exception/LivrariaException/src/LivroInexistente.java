
public class LivroInexistente extends RuntimeException{
	
	private static final long serialVersionUID = 5739046777878672234L;

	public LivroInexistente() {
		super("Esse livro não existe!");
	}
}
