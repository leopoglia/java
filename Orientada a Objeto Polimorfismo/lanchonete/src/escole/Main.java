package escole;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static private Scanner sc = new Scanner(System.in);
	static private ArrayList<Pedido> listaPedido = new ArrayList<>();

	public static void main(String[] args) {
		menu();
	}

	private static void menu() {
		System.out.print("" + "----------MENU----------\n" + "1 - Listar\n" + "2 - Cadastrar\n" + "3 - Editar\n4 - Remover\n" + "5 - Encerrar\n" + "> ");
		switch (sc.nextInt()) {
		case 1:
			lista(selecionaTipo("listar"));
			break;
		case 2:
			cadastrar(selecionaTipo("cadastrar"));
			break;
		case 3:
			editar(selecionaTipo("editar"));
			break;
		case 4:
			remover(selecionaTipo("remover"));
			break;
		case 5:
			System.exit(0);
			break;
		}
	}

	private static void editar(int tipo) {
		System.out.println("Insira o codigo do item a ser editado: ");
		int posicao = valida(sc.nextInt());
		if (posicao == -1) {
			System.out.println("Item não encontrado!");
			editar(tipo);
		}
		System.out.println("Qual o novo preço? ");
		listaPedido.get(posicao).setPreco(sc.nextDouble());
		menu();
	}

	private static void remover(int tipo) {
		System.out.println("Insira o codigo do item a ser removido: ");
		int posicao = valida(sc.nextInt());
		if (posicao == -1) {
			System.out.println("Item não encontrado!");
			remover(tipo);
		}
		listaPedido.remove(posicao);
		menu();
	}

	private static int selecionaTipo(String operacao) {
		System.out.println("Selecione o que deseja " + operacao + ":\n" + "1 - Lanche\n" + "2 - Bebida\n" + "3 - Porcao");
		int tipo = sc.nextInt();
		if (tipo < 1 || tipo > 3) {
			selecionaTipo(operacao);
		}
		return tipo;
	}

	private static void cadastrar(int tipo) {
		Pedido pedido = null;
		while (pedido == null) {
			pedido = coletaDados(tipo);
		}
		listaPedido.add(pedido);
		menu();
	}

	private static Pedido coletaDados(int tipo) {
		Pedido pedido = new Pedido();
		System.out.println("Código: ");
		pedido.setCodigo(sc.nextInt());
		int posicao = valida(pedido.getCodigo());
		if (posicao != -1) {
			System.out.println("Código inválido!");
		} else {
			System.out.println("Descrição: ");
			pedido.setDescricao(sc.next());
			System.out.println("Preço: ");
			pedido.setPreco(sc.nextDouble());

			switch (tipo) {
			case 1:
				System.out.println("Peso: ");
				return new Lanche(pedido.getCodigo(), pedido.getPreco(), pedido.getDescricao(), sc.nextDouble());
			case 2:
				System.out.println("Volume: ");
				return new Bebida(pedido.getCodigo(), pedido.getPreco(), pedido.getDescricao(), sc.nextDouble());
			case 3:
				System.out.println("Tamanho: ");
				return new Porcao(pedido.getCodigo(), pedido.getPreco(), pedido.getDescricao(), sc.next());
			}
		}
		return null;
	}

	private static int valida(int codigo) {
		for (int i = 0; i < listaPedido.size(); i++) {
			if (codigo == listaPedido.get(i).getCodigo()) {
				return i;
			}
		}
		return -1;
	}

	private static void lista(int tipo) {
		switch (tipo) {
		case 1:
			for (Pedido opcao : listaPedido) {
				if (opcao instanceof Lanche) {
					System.out.println(opcao.toString());
				}
			}
			break;
		case 2:
			for (Pedido opcao : listaPedido) {
				if (opcao instanceof Bebida) {
					System.out.println(opcao.toString());
				}
			}
			break;
		case 3:
			for (Pedido opcao : listaPedido) {
				if (opcao instanceof Porcao) {
					System.out.println(opcao.toString());
				}
			}
			break;
		}
		menu();
	}
}