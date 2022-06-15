
public class Diretor extends Pessoa {

	public Diretor(String nome, String cpf, String sobrenome, String email, String genero, String senha) {
		super(nome, cpf, sobrenome, email, genero, senha);
	}
	
	@Override
	public String listarAtividades() {
		int vezes = 0;
		String livros = "", erro = "Não há nenhum livro Aprovado";
		for (int i = 0; i < Livro.listaLivro.size(); i++) {
			if (Livro.listaLivro.get(i).getStatus().equals("Aprovado")) {
				vezes += 1;
				livros += Livro.listaLivro.get(i).toString();
			}
		}
		if (vezes == 0) {
			return erro;
		} else {
			return livros;
		}
	}

	public String listarLivros() {
		int qtd = 0;
		String livros = null, erro = "Não há livros!";
		for (int i = 0; i < Livro.listaLivro.size(); i++) {
			livros += Livro.listaLivro.get(i).toString();
			qtd += 1;
		}

		if (qtd == 0) {
			return erro;
		}
		return livros;
	}

	public void editarLivro() {
		int indiceLivro = Main.verificarLivro();
		if (indiceLivro != -1) {
			int status = Main.selecionaEdicao();

			switch (status) {
			case 1:
				Livro.listaLivro.get(indiceLivro).setStatus("Publicado");
				Livro.listaLivro.get(indiceLivro).setEditora(Editora.listaEditora.get(0).toString());
				break;
			case 2:
				Livro.listaLivro.get(indiceLivro).setStatus("Reprovado");
				break;
			case 3:
				Livro.listaLivro.get(indiceLivro).setStatus("Aguardando Revisão");
				break;
			}
		}
	}
	
	@Override
	public String[] opcoes() {
		return new String[] {"(1) Listar Atividades", "(2) Listar seus Livros", "(3) Cadastrar Revisor", "(4) Voltar"};
	}

	@Override
	public String toString() {
		return super.toString() + "Diretor []";
	}
}