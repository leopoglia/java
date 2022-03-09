import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("---------------------");
		System.out.println("BEM-VINDO AO LEOSHOP!");
		menuPrincipal();
	}

	public static void opcaoInvalida() {
		System.out.println("---------------------");
		System.out.println("   OPÇÃO INVALIDA!");
		menuPrincipal();
	}

	public static void menuPrincipal() {
		System.out.println("---------------------");
		System.out.println("> MENU  PRINCIPAL");
		System.out.println("(1) CLIENTE\n(2) FUNCIONÁRIO\n(3) GERENTE\n(4) FECHAR");
		System.out.print("> ");
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			menuCliente();
			break;
		case 2:
			menuFuncionario();
			break;
		case 3:
			menuGerente();
			break;
		case 4:
			System.exit(0);
			break;
		default:
			opcaoInvalida();
		}
	}

	public static void menuCliente() {
		System.out.println("---------------------");
		System.out.println("> MENU CLIENTE");
	}

	public static void menuFuncionario() {
		System.out.println("---------------------");
		if (Funcionario.listaFuncionario.size() == 0) {
			System.out.println("NÃO TEM FUNCIONÁRIOS");
			menuPrincipal();
		} else {
			System.out.print("DIGITE A MATRICULA: ");
			int matricula = sc.nextInt();
			System.out.print("DIGITE A SENHA: ");
			String senha = sc.next();
			System.out.println("---------------------");

			int posicaoArray = verificarFuncionario(matricula);

			if (posicaoArray != -1) {
				System.out.println("> MENU FUNCIONÁRIO");
				System.out.println(
						"(1) VENDER PRODUTO\n(2) CADASTRAR CLIENTE\n(3) CADASTRAR PRODUTO\n(4) VERIFICAR ESTOQUE\n(5) VOLTAR");
				System.out.print("> ");
				int opcao = sc.nextInt();

				switch (opcao) {
				case 1:
					venderProduto();
					break;
				case 2:
					CadastrarCliente();
					break;
				case 3:
					CadastrarProduto();
					break;
				case 4:
					verificarEstoque();
					menuFuncionario();
					break;
				case 5:
					menuPrincipal();
					break;
				default:
					opcaoInvalida();
				}
			}else {
				opcaoInvalida();
			}
		}
	}

	private static int verificarFuncionario(int matricula) {
		for (int i = 0; i < Funcionario.listaFuncionario.size(); i++) {
			if (matricula == Funcionario.listaFuncionario.get(i).getMatricula()) {
				return i;
			}
		}
		return -1;
	}

	private static void venderProduto() {
		System.out.println("---------------------");
		System.out.println("> VENDER PRODUTO");
		System.out.print("CODIGO DO PRODUTO: ");
		int codigo = sc.nextInt();

		int posicaoArray = verificarProduto(codigo);

		if (posicaoArray != -1) {
			System.out.print("QUANTIDADE DE PRODUTOS: ");
			int quantidade = sc.nextInt();
			System.out.print("CADASTRO DO COMPRADOR: ");
			int cadastroComprador = sc.nextInt();

			if (Produto.listaProduto.get(posicaoArray).getQuantidade() > quantidade) {
				Produto.reduzirEstoque(posicaoArray, quantidade);

				System.out.println("---------------------");
				System.out.println("VALOR TOTAL: " + Produto.listaProduto.get(posicaoArray).getValor() * quantidade);
			} else {
				System.out.println("---------------------");
				System.out.println("NÃO HÁ ESSA QUANTIDADE DE PRODUTO!");
				venderProduto();
			}
		} else {
			System.out.println("---------------------");
			System.out.println("ESSE PRODUTO NÃO EXISTE!");
			menuPrincipal();
		}
		menuFuncionario();
	}

	private static int verificarProduto(int codigo) {
		for (int i = 0; i < Produto.listaProduto.size(); i++) {
			if (codigo == Produto.listaProduto.get(i).getCodigo()) {
				return i;
			}
		}
		return -1;
	}

	private static void verificarEstoque() {
		System.out.println("---------------------");
		for (int i = 0; i < Produto.listaProduto.size(); i++) {
			System.out.println(Produto.listaProduto.get(i).toString());
			if (i + 1 != Produto.listaProduto.size()) {
				System.out.println("---------------------");
			}
		}
		menuPrincipal();
	}

	public static void CadastrarCliente() {
		System.out.println("---------------------");
		System.out.println("> CADASTRAR CLIENTE");
		System.out.print("NOME: ");
		String nome = sc.next();
		System.out.print("CPF: ");
		String cpf = sc.next();
		System.out.print("EMAIL: ");
		String email = sc.next();
		System.out.print("TELEFONE: ");
		String telefone = sc.next();
		System.out.print("GENERO: ");
		String genero = sc.next();
		System.out.print("IDADE: ");
		int idade = sc.nextInt();
		System.out.print("NÚMERO DO CADASTRO: ");
		int cadastro = sc.nextInt();
		Cliente clientetemp = new Cliente(nome, cpf, email, telefone, genero, idade, cadastro);
		Cliente.listaCliente.add(clientetemp);
		menuPrincipal();
	}

	public static void CadastrarProduto() {
		System.out.println("---------------------");
		System.out.println("> CADASTRAR PRODUTO");
		System.out.print("DESCRIÇÃO:");
		String descricao = sc.next();
		System.out.print("MARCA: ");
		String marca = sc.next();
		System.out.print("MODELO: ");
		String modelo = sc.next();
		System.out.print("CODIGO: ");
		int codigo = sc.nextInt();
		System.out.print("QUANTIDADE: ");
		int quantidade = sc.nextInt();
		System.out.print("VALOR: ");
		double valor = sc.nextDouble();
		Produto produtotemp = new Produto(descricao, marca, modelo, codigo, quantidade, valor);
		Produto.listaProduto.add(produtotemp);
		menuFuncionario();
	}

	public static void menuGerente() {
		Gerente admin = new Gerente(null, null, null, null, null, 0, "admin", 1);
		Gerente.listaGerente.add(admin);
		System.out.println("---------------------");
		System.out.print("DIGITE A MATRICULA: ");
		int matricula = sc.nextInt();
		System.out.print("DIGITE A SENHA: ");
		String senha = sc.next();

		if (Gerente.listaGerente.get(0).getMatricula() == matricula
				&& Gerente.listaGerente.get(0).getSenha().equals(senha)) {

			System.out.println("---------------------");
			System.out.println("> MENU GERENTE");
			System.out.println(
					"(1) VENDER\n(2) CADASTRAR CLIENTE\n(3) CADASTRAR PRODUTO\n(4) VERIFICAR ESTOQUE\n(5) CADASTRAR FUNCIONARIO\n(6) VOLTAR");
			System.out.print("> ");
			int opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				venderProduto();
				break;
			case 2:
				CadastrarCliente();
				break;
			case 3:
				CadastrarProduto();
				menuPrincipal();
				break;
			case 4:
				verificarEstoque();
				break;
			case 5:
				cadastrarFuncionario();
				break;
			case 6:
				menuPrincipal();
				break;
			default:
				opcaoInvalida();
			}
		} else {
			System.out.println("---------------------");
			System.out.println("SENHA OU MATRICULA ERRADA!");
			menuPrincipal();
		}
	}

	private static void cadastrarFuncionario() {
		System.out.println("---------------------");
		System.out.println("> CADASTRAR FUNCIONARIO");
		System.out.print("NOME: ");
		String nome = sc.next();
		System.out.print("CPF: ");
		String cpf = sc.next();
		System.out.print("EMAIL: ");
		String email = sc.next();
		System.out.print("TELEFONE: ");
		String telefone = sc.next();
		System.out.print("GENERO: ");
		String genero = sc.next();
		System.out.print("IDADE: ");
		int idade = sc.nextInt();
		System.out.print("SENHA: ");
		String senha = sc.next();
		System.out.print("MATRICULA: ");
		int matricula = sc.nextInt();

		Funcionario funcionariotemp = new Funcionario(nome, cpf, email, telefone, genero, idade, senha, matricula);
		Funcionario.listaFuncionario.add(funcionariotemp);
		menuPrincipal();
	}
}