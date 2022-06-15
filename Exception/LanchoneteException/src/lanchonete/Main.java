package lanchonete;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static private Scanner sc = new Scanner(System.in);
	static ArrayList<Pedido> listaPedido = new ArrayList<>();

	public static void main(String[] args) {
		menu();
	}

	static void menu() {
		System.out.print("" + "----------MENU----------\n" + "1 - Listar\n" + "2 - Cadastrar\n"
				+ "3 - Editar\n4 - Remover\n" + "5 - Encerrar\n" + "> ");
		switch (sc.nextInt()) {
		case 1:
			lista(selecionaTipo("listar"));
			break;
		case 2:
			Pedido.cadastrar(selecionaTipo("cadastrar"));
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
		default:
			try {
				throw new OpcaoInvalida();
			} catch (RuntimeException erro) {
				System.out.println(erro.getLocalizedMessage());
			}
		}
		menu();

	}

	private static void editar(int tipo) {
		System.out.println("Insira o codigo do item a ser editado: ");
		int posicao = valida(sc.nextInt());
		if (posicao == -1) {
			try {
				throw new ProdutoInvalido();
			} catch (RuntimeException erro) {
				System.out.println(erro.getLocalizedMessage());
			}
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
			try {
				throw new ProdutoInvalido();
			} catch (RuntimeException erro) {
				System.out.println(erro.getLocalizedMessage());
			}
			remover(tipo);
		}
		listaPedido.remove(posicao);
		menu();
	}

	private static int selecionaTipo(String operacao) {
		System.out
				.println("Selecione o que deseja " + operacao + ":\n" + "1 - Lanche\n" + "2 - Bebida\n" + "3 - Porcao");
		int tipo = sc.nextInt();
		if (tipo < 1 || tipo > 3) {
			selecionaTipo(operacao);
		}
		return tipo;
	}

	static Pedido coletaDados(int tipo) {
		Pedido pedido = new Pedido();
		System.out.print("Código: ");
		pedido.setCodigo(sc.nextInt());
		int posicao = valida(pedido.getCodigo());
		if (posicao != -1) {
			try {
				throw new ProdutoExiste();
			} catch (RuntimeException erro) {
				System.out.println(erro.getLocalizedMessage());
			}
		} else {
			System.out.print("Descrição: ");
			pedido.setDescricao(sc.next());
			int i = 0;
			do {
				i = 0;
				System.out.print("Preço: ");
				double preco = sc.nextDouble();
				if (preco > 0) {
					pedido.setPreco(preco);
				} else {
					try {
						throw new PrecoInvalido();
					} catch (RuntimeException erro) {
						i++;
						System.out.println(erro.getLocalizedMessage());
					}
				}
			} while (i != 0);

			switch (tipo) {
			case 1:
				do {
					i = 0;
					System.out.print("Peso: ");
					double peso = sc.nextDouble();
					if (peso >= 0) {
						return new Lanche(pedido.getCodigo(), pedido.getPreco(), pedido.getDescricao(), peso);
					} else {
						try {
							throw new PesoInvalido();
						} catch (RuntimeException erro) {
							i++;
							System.out.println(erro.getLocalizedMessage());
						}
					}
				} while (i != 0);
			case 2:
				do {
					i = 0;
					System.out.print("Volume: ");
					double volume = sc.nextDouble();
					if (volume >= 0) {
						return new Bebida(pedido.getCodigo(), pedido.getPreco(), pedido.getDescricao(), volume);
					} else {
						try {
							throw new VolumeInvalido();
						} catch (RuntimeException erro) {
							i++;
							System.out.println(erro.getLocalizedMessage());
						}
					}
				} while (i != 0);
			case 3:
				do {
					i = 0;
					System.out.print("Tamanho: ");
					String tamanho = sc.next();
					if (tamanho.equals("P") || tamanho.equals("M")|| tamanho.equals("G")) {
						return new Porcao(pedido.getCodigo(), pedido.getPreco(), pedido.getDescricao(), tamanho);
					} else {
						try {
							throw new TamanhoInvalido();
						} catch (RuntimeException erro) {
							i++;
							System.out.println(erro.getLocalizedMessage());
						}
					}
				} while (i != 0);
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