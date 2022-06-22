import java.util.Collections;
import java.util.Scanner;

public class Executavel {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		addPadrao();
		
		do {
			try {
				menuPrincipal();
			} catch (RuntimeException exception) {
				System.out.println(exception.getClass().getSimpleName() + ": " + exception.getMessage());
			}
		} while (true);
	}

	private static void menuPrincipal() {
		System.out.print(">>>>> MENU PRINCIPAL <<<<<\n1- Adicionar ao cardápio\n2- Mostrar o cardápio\n3- Remover do cardápio\n4- Fazer pedido\n5- Finalizar\n> ");
		switch (sc.nextInt()) {
		case 1:
			coletarDados().inserir();
			break;
		case 2:
			System.out.print(Opcao.mostrarOpcoes());
			break;
		case 3:
			escolherOpcao().remover();
			break;
		case 4:
			fazerPedido();
			break;
		case 5:
			System.exit(0);
			break;
		default:
			throw new OpcaoMenuInvalidaException();
		}
	}

	private static void fazerPedido() {
		Pedido pedido = new Pedido();
		int opcao;
		do {
			System.out.print(
					">>>>> FAÇA SEU PEDIDO <<<<<\n1) Adicionar ao pedido\n2) Mostrar o pedido\n3) Remover do pedido\n4) Finalizar pedido\n> ");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.println(Opcao.mostrarOpcoes());
				pedido.inserir();
				break;
			case 2:
				System.out.println(pedido.toString());
				break;
			case 3:
				pedido.remover();
				break;
			case 4:
				System.out.println(pedido.toString());
				System.out.println("Volte sempre!");
				break;
			default:
				throw new OpcaoMenuInvalidaException();
			}
		} while (opcao != 4);
	}

	public static Opcao escolherOpcao() {
		System.out.print("Informe a opção desejada: \n> ");
		return Opcao.procurarOpcao(sc.nextInt());
	}

	private static Opcao coletarDados() {
		System.out.print("Qual tipo deseja adicionar?\n1- Lanche\n2- Porção\n3- Bebida\n>");
		int opcao = sc.nextInt();
		System.out.print("Informe a descrição: \n> ");
		String descricao = sc.next();
		System.out.print("Informe o preço: \n> R$ ");
		double preco = sc.nextDouble();
		switch (opcao) {
		case 1:
			System.out.print("Informe o peso (em quilos): \n> ");
			double peso = sc.nextDouble();
			return new Lanche(descricao, preco, peso);
		case 2:
			System.out.print("Informe o tamanho: \n> ");
			String tamanho = sc.next();
			return new Porcao(descricao, preco, tamanho);
		case 3:
			System.out.print("Informe o volume (em litros): \n> ");
			double volume = sc.nextDouble();
			return new Bebida(descricao, preco, volume);
		default:
			throw new OpcaoMenuInvalidaException();
		}
	}

	private static void addPadrao() {
		Lanche xsalada = new Lanche("X-Salada", 12.0, 0.8);
		Lanche xtudo = new Lanche("X-Tudo", 18.0, 1.2);
		Lanche xburger = new Lanche("X-Burger", 10.0, 0.6);
		Lanche xbacon = new Lanche("X-Bacon", 15.0, 1.0);
		Collections.addAll(Opcao.cardapio, xsalada, xtudo, xburger, xbacon);
		
		Bebida refri200 = new Bebida("Refrigerante", 5.0, 0.2);
		Bebida refri500 = new Bebida("Refrigerante", 10.0, 0.5);
		Bebida suco200 = new Bebida("Suco", 6.0, 0.2);
		Bebida suco500 = new Bebida("Suco", 12.0, 0.5);
		Collections.addAll(Opcao.cardapio, refri200, refri500, suco200, suco500);

		Porcao fritasP = new Porcao("Batata Frita", 3.5, "Pequena");
		Porcao fritasM = new Porcao("Batata Frita", 4.5, "Média");
		Porcao fritasG = new Porcao("Batata Frita", 5.5, "Grande");
		Porcao salada = new Porcao("Salada", 8.0, "Média");
		Collections.addAll(Opcao.cardapio, fritasP, fritasM, fritasG, salada);

	}
}
