import java.util.Scanner;

public class Autor extends Pessoa {

	static Scanner sc = new Scanner(System.in);

	@Override
	public String listarAtividades() {
		String livros = "";
		for (int i = 0; i < Livro.listaLivro.size(); i++) {
			if (Livro.listaLivro.get(i).getAutor() == Main.usuario
					&& Livro.listaLivro.get(i).getStatus() == "Aguardando Edição") {
				livros += Livro.listaLivro.get(i).toString();
			}
		}
		return livros;
	}

	@Override
	public String listarLivros() {
		String livros = "";
		for (int i = 0; i < Livro.listaLivro.size(); i++) {
			if (Livro.listaLivro.get(i).getAutor() == Main.usuario) {
				livros += Livro.listaLivro.get(i).toString();
			}
		}
		return livros;
	}

	@Override
	public void editarLivro() {
		int indiceLivro = Main.verificarLivro();
		if (indiceLivro != -1) {
			Livro.listaLivro.get(indiceLivro).setStatus("Aguardando Revisão");
		} else {
			try {
				throw new LivroInexistente();
			} catch (RuntimeException erro) {
				System.out.println(erro.getLocalizedMessage());
			}
		}
	}

	@Override
	public String[] opcoes() {
		return new String[] { "(1) Listar Atividades", "(2) Listar seus Livros", "(3) Cadastrar Livro", "(4) Voltar" };

	}

	public Autor(String nome, String cpf, String sobrenome, String email, String genero, String senha) {
		super(nome, cpf, sobrenome, email, genero, senha);

	}

	@Override
	public String toString() {
		return super.toString();
	}

}