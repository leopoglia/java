import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	private static ArrayList<Automovel> listaAutomovel = new ArrayList<>();
	private static ArrayList<Automovel> listaAutomovelvendido = new ArrayList<>();
	private static ArrayList<Pessoa> listaPessoa = new ArrayList<>();

	public static void main(String[] args) {
		Pessoa dono = new Dono("LEONARDO", "123456", "479889244", "MASCULINO", 17, 1, 123);
		listaPessoa.add(dono);
		
		menu();
	}

	private static void menu() {
		System.out.println("MENU\n(1) CLIENTE\n(2) FUNCIONÁRIO\n(3) SAIR");
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			loginCliente();
			break;
		case 2:
			loginFuncionario();
			break;
		case 3:
			System.exit(0);
			break;
		}
	}
	
	private static void loginCliente() {
		System.out.print("LOGIN\nMATRICULA: ");
		int matricula = sc.nextInt();
		int verificacaoMatricula = verificarPessoa(matricula);

		if (verificacaoMatricula != -1) {
			menuCliente(verificacaoMatricula);
		} else {
			System.out.println("MATRICULA ERRADA!");
			menu();
		}
	}

	private static void menuCliente(int verificacaoMatricula) {
		System.out.println("MENU CLIENTE\n(1) LISTAR\n(2) COMPRAR\n(3) VOLTAR");
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			listar();
			break;
		case 2:
			comprar(verificacaoMatricula);
			break;
		case 3:
			menu();
			break;
		default:
			menu();
		}
		menuCliente(verificacaoMatricula);
	}

	private static void comprar(int verificacaoMatricula) {
		System.out.println("MENU COMPRAR\n(1) COMPRAR CARRO\n(2) COMPRAR MOTO");
		int opcao = sc.nextInt();
		String placa = null;
		int arrayPlaca = 0, confirmacao = 0;

		if(opcao == 1) {
			System.out.print("QUAL A PLACA DO CARRO QUE VOCÊ DESEJA COMPRAR?");
		}else {
			System.out.print("QUAL A PLACA DA MOTO QUE VOCÊ DESEJA COMPRAR?");
		}
		placa = sc.next();
		arrayPlaca = verificarPlaca(placa);
		System.out.println("VOCÊ CONFIRMA A COMPRA? (1) SIM (2) NÃO");
		confirmacao = sc.nextInt();
		if(confirmacao == 1) {
			listaAutomovel.remove(arrayPlaca);
			System.out.println("VOCÊ COMPROU O AUTOMOVEL!!!");
		}
	}

	private static void loginFuncionario() {
		System.out.print("LOGIN\nMATRICULA: ");
		int matricula = sc.nextInt();
		int verificacaoMatricula = verificarPessoa(matricula);

		if (verificacaoMatricula != -1) {
			System.out.print("SENHA:");
			int senha = sc.nextInt();
			System.out.println(senha);

			if (matricula != 1) {
				menuFuncionario();
			}
			menuDono(verificacaoMatricula);
		} else {
			System.out.println("MATRICULA ERRADA!");
			loginFuncionario();
		}
	}

	private static void menuDono(int verificacaoMatricula) {
		System.out.println("MENU DONO - AÇÕES COM:\n(1) CLIENTE\n(2) FUNCIONÁRIO\n(3) VEÍCULO\n(4) VOLTAR");
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			acoesPessoa(opcao);
			break;
		case 2:
			acoesPessoa(opcao);
			break;
		case 3:
			acoesVeiculos();
			break;
		case 4:
			menu();
		default:
			menu();
		}
	}

	private static void acoesVeiculos() {
		System.out.println("MENU DONO\n(1) CADASTRAR\n(2) LISTAR\n(3) EDITAR\n(4) EXCLUIR\n(5) VENDER\n(6) VOLTAR");
		int opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			cadastrar(-1, 0, 0);
			break;
		case 2:
			listar();
			break;
		case 3:
			editar();
			break;
		case 4:
			excluir();
		case 5:
			vender();
		default:
			menu();
			break;
		}
	}

	private static void acoesPessoa(int tipo) {
		int opcao = 0;
		if (tipo == 1) {
			System.out.println(
					"MENU DONO\n(1) CADASTRAR CLIENTE\n(2) EDITAR CLIENTE\n(3) EXCLUIR CLIENTE\n(4) LISTAR CLIENTES\n(5) VOLTAR");
			opcao = sc.nextInt();
		} else {
			System.out.println(
					"MENU DONO\n(1) CADASTRAR FUNCIONÁRIO\n(2) EDITAR FUNCIONÁRIO\n(3) EXCLUIR FUNCIONÁRIO\n(4) LISTAR FUNCIONÁRIOS\n(5) VOLTAR");
			opcao = sc.nextInt();
		}

		switch (opcao) {
		case 1:
			if (tipo == 1) {
				Cliente cliente = (Cliente) cadastrarPessoa(tipo);
				listaPessoa.add(cliente);
			} else {
				Funcionario funcionario = (Funcionario) cadastrarPessoa(tipo);
				listaPessoa.add(funcionario);
			}
			break;
		case 2:
			System.out.println("MATRICULA: ");
			int matricula = sc.nextInt();
			System.out.println(tipo);
			int verificacaoMatricula = verificarPessoa(matricula);

			if (tipo == 1) {
				Cliente cliente = (Cliente) cadastrarPessoa(tipo);
				listaPessoa.set(verificacaoMatricula, cliente);
			} else {
				Funcionario funcionario = (Funcionario) cadastrarPessoa(tipo);
				listaPessoa.set(verificacaoMatricula, funcionario);
			}
			break;
		case 3:
			excluirPessoa();
			break;
		case 4:
			listarPessoa(tipo);
			break;
		case 5:
			menu();
		}
		acoesPessoa(tipo);
	}

	private static void listarPessoa(int tipo) {
		if (tipo == 1) {
			for (Pessoa opcao : listaPessoa) {
				if (opcao instanceof Cliente) {
					System.out.println(opcao.toString()); 
					
				}
			}
		} else {
			for (Pessoa opcao : listaPessoa) {
				if (opcao instanceof Funcionario) {
					System.out.println(opcao.toString()); 
					
				}
			}
		}
	}

	private static void excluirPessoa() {
		System.out.print("MATRICULA: ");
		int matricula = sc.nextInt();

		listaPessoa.remove(matricula);
	}

	private static Pessoa cadastrarPessoa(int opcao) {
		System.out.print("NOME: ");
		String nome = sc.next();
		System.out.print("CPF: ");
		String cpf = sc.next();
		System.out.print("TELEFONE: ");
		String telefone = sc.next();
		System.out.print("GENERO: ");
		String genero = sc.next();
		System.out.print("IDADE: ");
		int idade = sc.nextInt();
		System.out.print("MATRICULA: ");
		int matricula = sc.nextInt();

		int senha = 0;
		if (opcao == 2) {
			System.out.print("SENHA: ");
			senha = sc.nextInt();
		}

		switch (opcao) {
		case 1:
			return new Cliente(nome, cpf, telefone, genero, idade, matricula);
		case 2:
			return new Funcionario(nome, cpf, telefone, genero, idade, matricula, senha);
		case 3:
			break;
		}
		return null;
	}

	private static void menuFuncionario() {
		System.out.println(
				"MENU FUNCIONARIO\n(1) CADASTRAR PRODUTO\n(2) LISTAR PRODUTO\n(3) EDITAR PRODUTO\n(4) EXCLUIR PRODUTO\n(5) VENDER PRODUTO\n(6) VOLTAR");
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			cadastrar(-1, 0, 0);
			break;
		case 2:
			listar();
			break;
		case 3:
			editar();
			break;
		case 4:
			excluir();
			break;
		case 5:
			vender();
			break;
		case 6:
			menu();
			break;
		}
	}

	private static void cadastrar(int indice, int matricula, int opcaoedit) {
		int opcao = 0;
		if (indice == -1) {
			System.out.println("MENU CADASTRAR\n(1) CARRO\n(2) MOTO\n(3) VOLTAR");
			opcao = sc.nextInt();
		} else {
			opcao = opcaoedit;
		}

		switch (opcao) {
		case 1:
			Automovel carro = coletarDados(opcao);
			if (indice == -1) {
				listaAutomovel.add(carro);
				System.out.println("CARRO ADICIONADO COM SUCESSO!");
			} else {
				listaAutomovel.set(matricula, carro);
				System.out.println("CARRO EDITADO COM SUCESSO!");
			}
			break;
		case 2:
			Automovel moto = coletarDados(opcao);
			if (indice == -1) {
				listaAutomovel.add(moto);
				System.out.println("MOTO ADICIONADO COM SUCESSO!");
			} else {
				listaAutomovel.set(matricula, moto);
				System.out.println("MOTO EDITADO COM SUCESSO!");
			}
			break;
		}
		menu();
	}

	private static Automovel coletarDados(int opcao) {
		System.out.print("MODELO: ");
		String modelo = sc.next();
		System.out.print("PLACA: ");
		String placa = sc.next();
		System.out.print("ANO: ");
		int ano = sc.nextInt();

		switch (opcao) {
		case 1:
			System.out.print("PORTAS: ");
			int portas = sc.nextInt();
			System.out.print("CAVALOS: ");
			int cavalos = sc.nextInt();
			System.out.print("TIPO CARROCERIA: ");
			String estilo = sc.next();
			return new Carro(modelo, placa, ano, portas, cavalos, estilo);
		case 2:
			System.out.print("TIPO: ");
			String tipo = sc.next();
			System.out.print("SUSPENSÃO: ");
			double suspensao = sc.nextInt();
			System.out.print("TAMANHO: ");
			String tamanho = sc.next();
			return new Moto(modelo, placa, ano, tipo, suspensao, tamanho);
		}
		return null;
	}

	private static void listar() {
		System.out.println("MENU LISTAR\n(1) CARRO\n(2) MOTO\n(3) CARRO VENDIDO\n(4) MOTO VENDIDA\n(5) VOLTAR");
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			listarCarro();
			break;
		case 2:
			listarMoto();
			break;
		case 3:
			listaCarroVendido();
			break;
		case 4:
			listaMotoVendida();
			break;
		default:
			menu();
			break;
		}
		listar();
	}

	private static void listarCarro() {
		for (Automovel opcao : listaAutomovel) {
			if (opcao instanceof Carro)
				System.out.println(opcao.toString());
		}
	}

	private static void listarMoto() {
		for (Automovel opcao : listaAutomovel) {
			if (opcao instanceof Moto)
				System.out.println(opcao.toString());
		}
	}

	private static void listaCarroVendido() {
		for (Automovel opcao : listaAutomovelvendido) {
			if (opcao instanceof Carro) {
				System.out.println(opcao.toString());
			}
		}
	}

	private static void listaMotoVendida() {
		for (Automovel opcao : listaAutomovelvendido) {
			if (opcao instanceof Moto) {
				System.out.println(opcao.toString());
			}
		}
	}

	private static void editar() {
		System.out.println("MENU EDITAR\n(1) CARRO\n(2) MOTO\n(3) VOLTAR");
		int opcao = sc.nextInt();
		int matricula;

		switch (opcao) {
		case 1:
			System.out.print("INDECE DO CARRO: ");
			String indice = sc.next();
			matricula = verificarPlaca(indice);
			cadastrar(opcao, matricula, opcao);
			break;
		case 2:
			System.out.print("INDECE DA MOTO: ");
			indice = sc.next();
			matricula = verificarPlaca(indice);
			cadastrar(opcao, matricula, opcao);
			break;
		}
	}

	private static void vender() {
		System.out.println("MENU VENDER\n(1) CARRO\n(2) MOTO\n(3) VOLTAR");
		int opcao = sc.nextInt();
		String placa = null;

		if (opcao == 1 || opcao == 2) {
			System.out.println("DIGITE O NÚMERO DA PLACA: ");
			placa = sc.next();
		}
		int cod = verificarPlaca(placa);

		switch (opcao) {
		case 1:
			listaAutomovelvendido.add(listaAutomovel.get(cod));
			listaAutomovel.remove(cod);
			System.out.println("CARRO VENDIDO!!!");
			break;
		case 2:
			listaAutomovelvendido.add(listaAutomovel.get(cod));
			listaAutomovel.remove(cod);
			System.out.println("MOTO VENDIDA!!!");
			break;
		}
		menu();
	}

	private static void excluir() {
		System.out.println("MENU EXCLUIR\n(1) CARRO\n(2) MOTO\n(3) VOLTAR");
		int opcao = sc.nextInt();
		String placa = null;

		if (opcao == 1 || opcao == 2) {
			System.out.println("DIGITE O NÚMERO DA PLACA: ");
			placa = sc.next();
		}
		int cod = verificarPlaca(placa);

		switch (opcao) {
		case 1:
			if (cod != -1) {
				listaAutomovel.remove(cod);
				System.out.println("CARRO REMOVIDO COM SUCESSO!\n");
			} else {
				System.out.println("ESSA PLACA NÃO EXISTE!\n");
			}
			break;
		case 2:
			if (cod != -1) {
				listaAutomovel.remove(cod);
				System.out.println("MOTO REMOVIDA COM SUCESSO!\n");
			} else {
				System.out.println("ESSA PLACA NÃO EXISTE!\n");
			}
			break;
		default:
			menu();
			break;
		}
		excluir();
	}

	private static int verificarPlaca(String placa) {
		for (int i = 0; i < listaAutomovel.size(); i++) {
			if (listaAutomovel.get(i).getPlaca().equals(placa)) {
				return i;
			}
		}
		return -1;
	}

	private static int verificarPessoa(int matricula) {
		for (int i = 0; i < listaPessoa.size(); i++) {
			if (listaPessoa.get(i).getMatricula() == matricula) {
				return i;
			}
		}
		return -1;
	}
}