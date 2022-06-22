import java.util.Scanner;

public class Executavel {
	private static Scanner sc = new Scanner(System.in);
	private static Banco banco = new Banco();

	public static void main(String[] args) {
		do {
			try {
				menuPrincipal();
			} catch (RuntimeException exception) {
				System.out.println(exception.getClass().getSimpleName() + ": " + exception.getMessage());
			}
		} while (true);
	}

	private static void menuPrincipal() {
		System.out.print(">>>>> MENU PRINCIPAL <<<<<\n1- Criar conta\n2- Selecionar conta\n3- Remover conta\n4- Gerar relatório\n5- Finalizar\n> ");
		switch (sc.nextInt()) {
		case 1:
			banco.inserir(coletarDados());
			break;
		case 2:
			menuConta(escolherConta());
			break;
		case 3:
			banco.remover(escolherConta());
			break;
		case 4:
			System.out.print(banco.mostrarContas());
			break;
		case 5:
			System.exit(0);
			break;
		default:
			throw new OpcaoInvalidaException();
		}
	}

	private static void menuConta(ContaBancaria conta) {
		int opcao;
		do {
			System.out.print(">>>>> MENU CONTA <<<<<\n1- Depositar\n2- Sacar\n3- Transferir\n4- Gerar relatório\n5- Retornar ao menu anterior\n> ");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				conta.depositar(valor());
				break;
			case 2:
				conta.sacar(valor());
				break;
			case 3:
				conta.transferir(escolherConta(), valor());
				break;
			case 4:
				System.out.println(conta.mostrarDados());
				break;
			case 5:
				System.out.println("Volte sempre!");
				break;
			default:
				throw new OpcaoInvalidaException();
			}
		} while (opcao != 5);
	}

	private static double valor() {
		System.out.print("Informe o valor da operação: \n> ");
		return sc.nextDouble();
	}

	private static ContaBancaria escolherConta() {
		System.out.print("Informe o número da conta: \n> ");
		return banco.procurarConta(sc.nextInt());
	}

	private static ContaBancaria coletarDados() {
		System.out.print("Qual conta deseja criar?\n1- Corrente\n2- Poupança\n> ");
		int opcao = sc.nextInt();
		double taxaDeOperacao;
		switch (opcao) {
		case 1:
			System.out.print("Informe a taxa de operação: \n> ");
			taxaDeOperacao = sc.nextDouble();
			System.out.print("Informe o limite da conta: \n> ");
			double limite = sc.nextDouble();
			return new ContaCorrente(taxaDeOperacao, limite);
		case 2:
			System.out.print("Informe a taxa de operação: \n> ");
			taxaDeOperacao = sc.nextDouble();
			return new ContaPoupanca(taxaDeOperacao);
		default:
			throw new OpcaoInvalidaException();
		}
	}
}
