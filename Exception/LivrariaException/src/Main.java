import java.util.Scanner;

public class Main {
	public static Pessoa usuario;
	public static int indice;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("-------------------------\n\tLIVRARIA");
		Pessoa diretor = new Diretor("Leonardo Heitor", "1", "Poglia", "leoanrdohp2004@gmail.com", "Masculino", "123");
		Pessoa.listaPessoa.add(diretor);
		Pessoa revisor = new Revisor("Vytor", "2", "Rosa", "vytorosa@gmail.com", "Masculino", "123");
		Pessoa.listaPessoa.add(revisor);
		Pessoa autor = new Autor("Romário", "3", "Hornburg", "romario@gmail.com", "Masculino", "123");
		Pessoa.listaPessoa.add(autor);
		Editora editora = new Editora("Editora do SENAI", "123");
		Editora.listaEditora.add(editora);
		menu();
	}

	private static void menu() {
		System.out.print("-------------------------\n(1) Logar-se\n(2) Cadastrar-se\n(3) Sair\n> ");
		int opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("-------------------------\n\tLOGAR-SE\n-------------------------");
			logarPessoa();
			break;
		case 2:
			System.out.println("-------------------------\n\tCADASTRA-SE\n-------------------------");
			Autor autor = (Autor) coletaDadosPessoa(1);
			Pessoa.listaPessoa.add(autor);
			break;
		case 3:
			System.exit(0);
		default:
			try {
				throw new OpcaoInvalida();
			} catch (RuntimeException erro) {
				System.out.println(erro.getLocalizedMessage());
			}
		}
		menu();
	}

	private static void logarPessoa() {
		System.out.print("CPF: ");
		String cpf = sc.next();
		System.out.print("Senha: ");
		String senha = sc.next();
		int pessoaVerificada = verificarPessoa(cpf, senha);
		if (pessoaVerificada != -1) {
			menuPessoa();
		} else {
			try {
				throw new UsuarioIncorreto();
			} catch (RuntimeException erro) {
				System.out.println(erro.getLocalizedMessage());
			}
		}
		menu();
	}

	private static Pessoa coletaDadosPessoa(int opcao) {
		System.out.print("Nome: ");
		String nome = sc.next();
		System.out.print("CPF: ");
		String cpf = sc.next();
		System.out.print("Sobrenome: ");
		String sobrenome = sc.next();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Genero: ");
		String genero = sc.next();
		System.out.print("Senha: ");
		String senha = sc.next();

		switch (opcao) {
		case 1:
			return new Autor(nome, cpf, sobrenome, email, genero, senha);
		case 2:
			return new Revisor(nome, cpf, sobrenome, email, genero, senha);
		}
		return null;
	}

	public static void menuPessoa() {
		System.out.println("-------------------------\n\tMENU\n-------------------------");
		String[] opcoes = usuario.opcoes();
		for (String opcao : opcoes) {
			System.out.println(opcao);
		}
		System.out.print("> ");
		int escolha = sc.nextInt();
		if (escolha == opcoes.length) {
			menu();
		} else if (escolha < 1 || escolha > opcoes.length) {
			try {
				throw new OpcaoInvalida();
			} catch (RuntimeException erro) {
				System.out.println(erro.getLocalizedMessage());
			}
		} else {
			switch (escolha) {
			case 1:
				System.out.println(usuario.listarAtividades());
				System.out.print("Você deseja Editar algum livro? \n(1) Sim \n(2) Não\n> ");
				int validacao = sc.nextInt();
				if (validacao == 1) {
					usuario.editarLivro();
				} else if (validacao != 1 && validacao != 2) {
					try {
						throw new OpcaoInvalida();
					} catch (RuntimeException erro) {
						System.out.println(erro.getLocalizedMessage());
					}
				}
				break;
			case 2:
				System.out.println(usuario.listarLivros());
				break;
			case 3:
				if (usuario instanceof Diretor) {
					cadastrarRevisor();
				} else {
					cadastrarLivro();
				}
				break;
			}
		}
		menuPessoa();
	}

	private static void cadastrarLivro() {
		System.out.println("-------------------------\n     CADASTRAR LIVRO\n-------------------------");
		System.out.print("Titulo: ");
		String titulo = sc.next();

		int qtdPaginas = 0;
		int i = 0;

		do {
			i = 0;
			
			System.out.print("Quantidade de Paginas: ");
			qtdPaginas = sc.nextInt();
			if (qtdPaginas < 1) {
				try {
					throw new QuantidadePaginaInvalido();
				} catch (RuntimeException erro) {
					i++;
					System.out.println(erro.getLocalizedMessage());
				}
			}
		} while (i != 0);

		String isbn;

		do {
			i = 0;
			System.out.print("ISBN: ");
			isbn = sc.next();

			int verificar = verificarLivro(isbn);

			if (verificar != -1) {
				try {
					throw new LivroExistente();
				} catch (RuntimeException erro) {
					i++;
					System.out.println(erro.getLocalizedMessage());
				}
			}
		} while (i != 0);

		Livro livro = new Livro(titulo, "Aguardando Revisão", qtdPaginas, isbn, (Autor) usuario, null, 0);
		Livro.listaLivro.add(livro);
	}

	private static void cadastrarRevisor() {
		Revisor revisor = (Revisor) coletaDadosPessoa(2);
		Pessoa.listaPessoa.add(revisor);
	}

	public static int selecionaEdicao(int indiceLivro) {
		System.out.println("Digite a quantidade de paginas que foram revisadas");
		int paginasLidas = sc.nextInt();
		Livro.listaLivro.get(indiceLivro).setPaginaRevisao(paginasLidas);
		System.out.println("Para qual Status você deseja alterar ele?");
		if (Livro.listaLivro.get(indiceLivro).getQtdPaginas() == paginasLidas) {
			System.out.print("(1) Reprovado \n(2) Aprovado\n(3) Aguardando Edição\n> ");
		} else {
			System.out.print("(1) Reprovado \n(2) Continuar Revisando\n(3) Aguardando Edição\n> ");
		}
		return sc.nextInt();
	}

	public static int selecionaEdicao() {
		System.out.println("Informe a ação a ser feita: ");
		System.out.print("(1) Publicado \n(2) Reprovado\n(3) Aguardando Revisão\n> ");
		return sc.nextInt();
	}

	private static int verificarPessoa(String cpf, String senha) {
		for (int i = 0; i < Pessoa.listaPessoa.size(); i++) {
			if (Pessoa.listaPessoa.get(i).getCpf().equals(cpf)) {
				if (Pessoa.listaPessoa.get(i).getSenha().equals(senha)) {
					usuario = Pessoa.listaPessoa.get(i);
					indice = i;
					return i;
				}
			}
		}
		return -1;
	}

	static int verificarLivro() {
		System.out.print("Digite o livro a ser editado: ");
		String isbn = sc.next();
		for (int i = 0; i < Pessoa.listaPessoa.size(); i++) {
			if (Livro.listaLivro.get(i).getisbn().equals(isbn)) {
				return i;
			}
		}
		return -1;
	}

	static int verificarLivro(String isbn) {
		for (int i = 0; i < Livro.listaLivro.size(); i++) {
			if (Livro.listaLivro.get(i).getisbn().equals(isbn)) {
				return i;
			}
		}
		return -1;
	}
}