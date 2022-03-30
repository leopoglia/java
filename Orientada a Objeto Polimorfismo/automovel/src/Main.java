import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	private static ArrayList<Automovel> listaAutomovel = new ArrayList<>();
	private static ArrayList<Automovel> listaAutomovelvendido = new ArrayList<>();

	public static void main(String[] args) {
		menuPrincipal();
	}

	private static void menuPrincipal() {
		System.out
				.println("MENU PRINCIPAL\n(1) CADASTRAR\n(2) LISTAR\n(3) EDITAR\n(4) EXCLUIR\n(5) VENDER\n(6) SAIR");
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
			System.exit(0);
			break;
		}
	}

	private static void cadastrar(int indice, int matricula, int opcaoedit) {
		int opcao = 0;
		if(indice == -1) {
		System.out.println("MENU CADASTRAR\n(1) CARRO\n(2) MOTO\n(3) VOLTAR");
		opcao = sc.nextInt();
		}else {
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
		menuPrincipal();
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
			menuPrincipal();
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
		menuPrincipal();
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
			menuPrincipal();
			break;
		}
		excluir();
	}

	private static int verificarPlaca(String placa) {
		for (int i = 0; i < listaAutomovel.size(); i++) {
			if (listaAutomovel.get(i).placa.equals(placa)) {
				return i;
			}
		}

		return -1;
	}
}