import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	static ArrayList<Automovel> listaAutomovel = new ArrayList<>();
	static ArrayList<Automovel> listaAutomovelvendido = new ArrayList<>();
	static ArrayList<Pessoa> listaPessoa = new ArrayList<>();
	public static Pessoa usuario;
	public static Automovel automovel;

	public static void main(String[] args) {
		Pessoa dono = new Dono("Dono", "123456", "479889244", "MASCULINO", 17, 1, 123, 30000);
		listaPessoa.add(dono);

		Pessoa cliente = new Cliente("Cliente", "123456", "479889244", "MASCULINO", 17, 2, 123);
		listaPessoa.add(cliente);

		Pessoa funcionario = new Funcionario("Funcionario", "123456", "479889244", "MASCULINO", 17, 3, 123, 1500);
		listaPessoa.add(funcionario);

		Carro carro = new Carro("1", "1", 1, 1, 1, "1", 1);
		listaAutomovel.add(carro);

		logar();
	}

	public static void logar() {
		System.out.println("LOJA DE AUTOMOVEIS");
		System.out.print("MATRICULA: ");
		int matricula = sc.nextInt();
		System.out.print("SENHA:");
		int senha = sc.nextInt();
		if (verificarPessoa(matricula, senha) != -1) {
			menu();
		}
	}

	public static void menu() {
		String[] opcoes = usuario.menu();
		for (String opcao : opcoes) {
			System.out.println(opcao);
		}
		System.out.print("> ");

		int escolha = sc.nextInt();
		if (escolha == opcoes.length) {
			logar();
		} else if (escolha < 1 || escolha > opcoes.length) {
			menu();
		} else {
			switch (escolha) {
			case 1:
				listar();
				break;
			case 2:
				cadastrarVeiculo(-1, 0, 0);
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
				cadastrarPessoa(2);
				break;
			case 7:
				System.out.print("MATRICULA: ");
				int matricula = sc.nextInt();
				listaPessoa.remove(matricula);
				break;
			}
		}
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
		System.out.print("SENHA: ");
		int senha = sc.nextInt();

		switch (opcao) {
		case 1:
			return new Cliente(nome, cpf, telefone, genero, idade, matricula, senha);
		case 2:
			return new Funcionario(nome, cpf, telefone, genero, idade, matricula, senha, 1250);
		}
		return null;
	}

	public static void cadastrarVeiculo(int indice, int matricula, int opcaoedit) {
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
		System.out.println("PRECO: ");
		double preco = sc.nextDouble();

		switch (opcao) {
		case 1:
			System.out.print("PORTAS: ");
			int portas = sc.nextInt();
			System.out.print("CAVALOS: ");
			int cavalos = sc.nextInt();
			System.out.print("TIPO CARROCERIA: ");
			String estilo = sc.next();
			return new Carro(modelo, placa, ano, portas, cavalos, estilo, preco);
		case 2:
			System.out.print("TIPO: ");
			String tipo = sc.next();
			System.out.print("SUSPENSÃO: ");
			double suspensao = sc.nextInt();
			System.out.print("TAMANHO: ");
			String tamanho = sc.next();
			return new Moto(modelo, placa, ano, tipo, suspensao, tamanho, preco);
		}
		return null;
	}

	public static void listar() {
		System.out.println("LISTAR\n(1) CARRO\n(2) MOTO\n(3) CARRO VENDIDO\n(4) MOTO VENDIDA\n(5) VOLTAR");
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

	public static void editar() {
		System.out.println("MENU EDITAR\n(1) CARRO\n(2) MOTO\n(3) VOLTAR");
		int opcao = sc.nextInt();
		int matricula;

		System.out.print("INDECE DO VEÍCULO: ");
		String indice = sc.next();
		matricula = verificarPlaca(indice);
		cadastrarVeiculo(opcao, matricula, opcao);
	}

	private static int retornaDono(String nomeCliente) {
		for (int i = 0; i < listaPessoa.size(); i++) {
			int cont = 0;
			for (int i2 = 0; i2 < nomeCliente.length(); i2++) {
				if (listaPessoa.get(i).getNome().toUpperCase().charAt(i2) == nomeCliente.toUpperCase().charAt(i2)) {
					cont++;
				}
			}
			if (cont == nomeCliente.length()) {
				System.out.println(listaPessoa.get(i).getNome() + " (" + listaPessoa.get(i).getMatricula() + ")");
			}
		}
		System.out.println("ESCOLHA A MATRICULA: ");
		int matricula = sc.nextInt();
		int donoVerificado = verificarPessoa(matricula, -999);
		return donoVerificado;
	}

	public static void vender() {
		System.out.println("DIGITE O NÚMERO DA PLACA: ");
		String placa = sc.next();
		System.out.println("DIGITE O NOME DO NOVO DONO: ");
		String dono = sc.next();
		int donoNovo = retornaDono(dono);
		int cod = verificarPlaca(placa);
		int funcionario = verificarPessoa(usuario.getMatricula(), usuario.getSenha());
		automovel.vender(donoNovo, funcionario, cod);
	}

	public static void excluir() {
		System.out.println("DIGITE O NÚMERO DA PLACA: ");
		String placa = sc.next();
		int cod = verificarPlaca(placa);
		automovel.excluir(cod);
		excluir();
	}

	private static int verificarPlaca(String placa) {
		for (int i = 0; i < listaAutomovel.size(); i++) {
			if (listaAutomovel.get(i).getPlaca().equals(placa)) {
				automovel = listaAutomovel.get(i);
				return i;
			}
		}
		return -1;
	}
	private static int verificarPessoa(int matricula, int senha) {
		for (int i = 0; i < listaPessoa.size(); i++) {
			if (listaPessoa.get(i).getMatricula() == matricula) {
				if (listaPessoa.get(i).getSenha() == senha) {
					usuario = listaPessoa.get(i);
					return i;
				}
			}
		}
		return -1;
	}
}