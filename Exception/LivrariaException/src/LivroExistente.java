
public class LivroExistente extends RuntimeException{

	private static final long serialVersionUID = 5739046777878672234L;
	
	public LivroExistente() {
		super("Esse livro já existe!");
	}
}
