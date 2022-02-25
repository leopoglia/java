import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		menuPrincipal();
	}

	public static void menuPrincipal() {

		System.out.println("> MENU PRINCIPAL");
		System.out.println("(1) GERÊNCIA\n(2) USUÁRIO\n(3) FECHAR");
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			menuGerencia();

			break;
		case 2:
			menuUsuario();
			break;
		case 3:
			System.exit(0);
			break;
		default:
			menuPrincipal();
			break;
		}
	}

	private static void menuUsuario() {
		System.out.println("> MENU USUÁRIO");
		System.out.println("(1) ESCOLHER CONTA\n(2) VOLTAR");
		int opcao = sc.nextInt();
		switch(opcao) {
		case 1:
			escolherConta();
			break;
		case 2:
			menuPrincipal();
		}
	}

	private static void escolherConta() {
		System.out.println("> ESCOLHER CONTA");
		System.out.println("(1) CORRENTE\n(2) CRÉDITO\n(3) POUPANÇA\n(4) VOLTAR");
		int opcao = sc.nextInt();
		int conta;
		
		switch(opcao) {
		case 1:
			System.out.print("DIGITE O NUMERO DA SUA CONTA CORRENTE: ");
			conta = sc.nextInt();
		
			usuarioCorrente(conta);
			break;
		case 2:
			System.out.print("DIGITE O NUMERO DA SUA CONTA DE CRÉDITO: ");
			conta = sc.nextInt();

			usuarioCredito(conta);
			break;
		case 3:
			System.out.print("DIGITE O NUMERO DA SUA CONTA POUPANÇA: ");
			conta = sc.nextInt();

			usuarioPoupanca(conta);
			break;
		case 4:
			menuUsuario();
		}
	}
	
	private static void usuarioCorrente(int conta) {
		System.out.println("> CONTA CORRENTE");
		System.out.println("(1) DEPOSITAR\n(2) SACAR\n(3) TRANSFERIR\n(4) VOLTAR");
		int opcao = sc.nextInt();
		
		switch(opcao) {
		case 1:
			Corrente.listaCorrente.get(conta).deposito(conta);
			break;
		case 2:
			Corrente.listaCorrente.get(conta).pagamento(conta);
			break;
		case 3:
			break;
		case 4:
			escolherConta();
			break;
		}
	}

	private static void usuarioPoupanca(int conta) {
		System.out.println("> CONTA POUPANÇA");
		System.out.println("(1) DEPOSITAR\n(2) SACAR\n(3) TRANSFERIR\n(4) VOLTAR");
		int opcao = sc.nextInt();
		
		switch(opcao) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			escolherConta();
			break;
		}
	}

	private static void usuarioCredito(int conta) {
		System.out.println("> CONTA DE CRÉDITO");
		System.out.println("(1) FATURA\n(2) SACAR\n(3) TRANSFERIR\n(4) VOLTAR");
		int opcao = sc.nextInt();
		
		switch(opcao) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			escolherConta();
			break;
		}
	}

	public static void menuGerencia() {
		System.out.println("> MENU GERÊNCIA");
		System.out.println("(1) CADASTRAR CONTA\n(2) BLOQUEAR CONTA\n(3) LISTAR CONTAS\n(4) VOLTAR");
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			menuCadastro();
			break;
		case 2:
			menuBloqueio();
			break;
		case 3:
			menuListar();
			break;
		case 4:
			menuPrincipal();
			break;
		default:
			menuGerencia();
			break;
		}
	}

	private static void menuListar() {
		System.out.println("> MENU LISTAR");
		System.out.println("(1) CORRENTE\n(2) CRÉDITO\n(3) POUPANÇA\n(4) VOLTAR");
		int opcao = sc.nextInt();

		if (opcao > 0 && opcao < 4) {
			listar(opcao);
		} else if (opcao == 4) {
			menuGerencia();
		} else {
			menuListar();
		}
	}

	private static void listar(int opcao) {
		switch (opcao) {
		case 1:
			for (int i = 0; i < Corrente.listaCorrente.size(); i++) {
				System.out.println(Corrente.listaCorrente.get(i).toString());
				if (i + 1 != Corrente.listaCorrente.size()) {
					System.out.println("-------------------------");
				}
			}
			break;
		case 2:
			for (int i = 0; i < Credito.listaCredito.size(); i++) {
				System.out.println(Credito.listaCredito.get(i).toString());
				if (i + 1 != Credito.listaCredito.size()) {
					System.out.println("-------------------------");
				}
			}
			break;
		case 3:
			for (int i = 0; i < Poupanca.listaPoupanca.size(); i++) {
				System.out.println( Poupanca.listaPoupanca.get(i).toString());
				if (i + 1 != Poupanca.listaPoupanca.size()) {
					System.out.println("-------------------------");
				}
			}
			break;
		}
		menuListar();
	}

	private static void menuBloqueio() {
		System.out.println("> MENU BLOQUEIO");
		System.out.println("(1) CORRENTE\n(2) CRÉDITO\n(3) POUPANÇA\n(4) VOLTAR");
		int opcao = sc.nextInt();

		System.out.print("INFORME O NÚMERO DA CONTA A SER BLOQUADA:");
		int conta = sc.nextInt();

		if (opcao > 0 && opcao < 4) {
			cancelar(opcao, conta);
		} else if (opcao == 4) {
			menuGerencia();
		} else {
			menuBloqueio();
		}
	}

	private static void cancelar(int opcao, int conta) {
		switch (opcao) {
		case 1:
			Corrente.listaCorrente.get(conta).setStatus(false);
			break;
		case 2:
			Credito.listaCredito.get(conta).setStatus(false);
			break;
		case 3:
			Poupanca.listaPoupanca.get(conta).setStatus(false);
			break;
		}
	}

	public static void menuCadastro() {
		System.out.println("> MENU CADASTRO");
		System.out.println("(1) CORRENTE\n(2) CRÉDITO\n(3) POUPANÇA\n(4) VOLTAR");
		int opcao = sc.nextInt();

		if (opcao > 0 && opcao < 4) {
			cadastrar(opcao);
		} else if (opcao == 4) {
			menuGerencia();
		} else {
			menuCadastro();
		}
		menuGerencia();
	}

	private static void cadastrar(int opcao) {
		System.out.print("NÚMERO DA CONTA: ");
		int numero = sc.nextInt();
		System.out.print("TITULAR: ");
		String titular = sc.next();
		System.out.print("SENHA: ");
		String senha = sc.next();
		boolean status = true;
		double saldo = 0.0;

		switch (opcao) {
		case 1:
			System.out.print("LIMITE: ");
			double limite = sc.nextDouble();
			Corrente correnteTemp = new Corrente(saldo, titular, senha, status, numero, limite);
			Corrente.listaCorrente.add(correnteTemp);
			break;
		case 2:
			System.out.print("LIMITE: ");
			limite = sc.nextDouble();
			System.out.print("DATA DA FATURA: ");
			int dataFatura = sc.nextInt();
			Credito creditoTemp = new Credito(saldo, titular, senha, status, numero, limite, dataFatura);
			Credito.listaCredito.add(creditoTemp);
			break;
		case 3:
			System.out.print("RENDIMENTO: ");
			double rendimento = sc.nextDouble();
			Poupanca poupancaTemp = new Poupanca(saldo, titular, senha, status, numero, rendimento);
			Poupanca.listaPoupanca.add(poupancaTemp);
			break;
		}
		System.out.println("CADASTRO REALIZADO COM SUCESSO!\n");
		menuCadastro();
	}
}