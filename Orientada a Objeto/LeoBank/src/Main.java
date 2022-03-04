import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("BEM-VINDO(A) AO LEOBANK!");
		menuPrincipal();
	}

	public static void menuPrincipal() {		
		System.out.println("------------------");

		System.out.println("> MENU PRINCIPAL <");
		System.out.print("(1) GERÊNCIA\n(2) USUÁRIO\n(3) FECHAR\n");
		System.out.print("> ");
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
			System.out.println("------------------\nOPÇÃO INVÁLIDA!");
			menuPrincipal();
			break;
		}
	}

	private static void menuUsuario() {
		System.out.println("------------------");
		System.out.println("> MENU  USUÁRIO <");
		System.out.println("(1) ESCOLHER CONTA\n(2) VOLTAR");
		System.out.print("> ");
		int opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			escolherConta();
			break;
		case 2:
			menuPrincipal();
		default:
			System.out.println("------------------\nOPÇÃO INVÁLIDA!");
			menuUsuario();
			break;
		}
	}

	private static void escolherConta() {
		System.out.println("------------------");
		System.out.println("> ESCOLHER CONTA");
		System.out.println("(1) CORRENTE\n(2) CRÉDITO\n(3) POUPANÇA\n(4) VOLTAR");
		System.out.print("> ");
		int opcao = sc.nextInt();
		int conta, numero;

		switch (opcao) {
		case 1:
			System.out.println("------------------");
			System.out.print("DIGITE O NÚMERO DA SUA CONTA CORRENTE: ");
			numero = sc.nextInt();
		    conta = validaConta(opcao, numero);
		    if (conta != -1) {
		    System.out.println("------------------");
		    System.out.print ("DIGITE A SUA SENHA: ");
		    String senha = sc.next();
			if(validaSenha(opcao, conta, senha)) {
			if(Corrente.listaCorrente.get(conta).getStatus() == false) {
				System.out.println("------------------\nSUA CONTA ESTA BLOQUEADA!");
				menuPrincipal();
					}
				}else {
					System.out.println("------------------\nSUA SENHA ESTA INCORRETA!");
					escolherConta();
				}
		    }else {
		    	System.out.println("------------------\nESSA CONTA NÃO EXISTE!");
		    	menuPrincipal();
		    }
			usuarioCorrente(conta, opcao);
			break;
		case 2:
			System.out.println("------------------");
			System.out.print("DIGITE O NÚMERO DA SUA CONTA DE CRÉDITO: ");
			numero = sc.nextInt();
		    conta = validaConta(opcao, numero);
		    if (conta != -1) {
			if(Credito.listaCredito.get(conta).getStatus() == false) {
				System.out.println("------------------\nSUA CONTA ESTA BLOQUEADA!");
				menuPrincipal();
				}
		    }else {
		    	System.out.println("------------------\nESSA CONTA NÃO EXISTE!");
		    	menuPrincipal();
		    }
			usuarioCredito(conta, opcao);
			break;
		case 3:
			System.out.println("------------------");
			System.out.print("DIGITE O NÚMERO DA SUA CONTA POUPANÇA: ");
			numero = sc.nextInt();
		    conta = validaConta(opcao, numero);
		    if (conta != -1) {
			if(Poupanca.listaPoupanca.get(conta).getStatus() == false) {
				System.out.println("------------------\nSUA CONTA ESTA BLOQUEADA!");
				menuPrincipal();
				}
		    }else {
		    	System.out.println("------------------\nESSA CONTA NÃO EXISTE!");
		    	menuPrincipal();
		    }
			usuarioPoupanca(conta, opcao);
			break;
		case 4:
			menuUsuario();
			break;
		default:
			System.out.println("------------------\nOPÇÃO INVÁLIDA!");
			escolherConta();
			break;
		}
	}
	
	private static int validaConta(int opcao, int numero) {
		switch(opcao) {
		case 1:
			for(int i = 0; i < Corrente.listaCorrente.size(); i++) {
				if(numero == Corrente.listaCorrente.get(i).getNumero()) {
					return i;
				}
			}
			break;
		case 2:
			for(int i = 0; i < Credito.listaCredito.size(); i++) {
				if(numero == Credito.listaCredito.get(i).getNumero()) {
					return i;
				}
			}
			break;
		case 3:
			for(int i = 0; i < Poupanca.listaPoupanca.size(); i++) {
				if(numero == Poupanca.listaPoupanca.get(i).getNumero()) {
					return i;
				}
			}
			break;
		}
		return -1;
	}
	
	private static boolean validaSenha(int opcao, int indice, String senha) {
		switch(opcao) {
		case 1:
			if(senha.equals(Corrente.listaCorrente.get(indice).getSenha())) {
				return true;
			}
			break;
		case 2:
			if(senha.equals(Credito.listaCredito.get(indice).getSenha())) {
				return true;
			}
			break;
		case 3:
			if(senha.equals(Poupanca.listaPoupanca.get(indice).getSenha())) {
				return true;
			}
			break;
		}
		return false;
	}

	private static void usuarioCorrente(int conta, int opcao) {
		System.out.println("------------------");
		System.out.println("> CONTA CORRENTE");
		System.out.println("(1) DEPOSITAR\n(2) PAGAMENTO\n(3) TRANSFERIR\n(4) SALDO\n(5) SAQUE\n(6) VOLTAR");
		System.out.print("> ");
		int opcao1 = sc.nextInt();

		switch (opcao1) {
		case 1:
			Corrente.listaCorrente.get(conta).deposito(conta);
			break;
		case 2:
			Corrente.listaCorrente.get(conta).pagamento(conta);
			break;
		case 3:
			Corrente.listaCorrente.get(conta).transferencia(conta);
			break;
		case 4:
			Conta.saldo(conta, opcao);
			break;
		case 5:
			Conta.saque(conta, opcao);
			break;
		case 6:
			escolherConta();
			break;
		default:
			System.out.println("------------------\nOPÇÃO INVÁLIDA!");
			escolherConta();
			break;
		}
		usuarioCorrente(conta, opcao);
	}

	private static void usuarioPoupanca(int conta, int opcao) {
		System.out.println("------------------");
		System.out.println("> CONTA POUPANÇA");
		System.out.println("(1) DEPOSITAR\n(2) TRANSFERIR\n(3) SAQUE\n(4) SALDO\n(5) VOLTAR");
		System.out.print("> ");
		int opcao1 = sc.nextInt();

		switch (opcao1) {
		case 1:
			Poupanca.listaPoupanca.get(conta).deposito(conta);
			break;
		case 2:
			Poupanca.listaPoupanca.get(conta).transferencia(conta);
			break;
		case 3:
			Conta.saque(conta, opcao);
			break;
		case 4:
			Conta.saldo(conta, opcao);
			break;
		case 5:
			escolherConta();
			break;
		default:
			System.out.println("------------------\nOPÇÃO INVÁLIDA!");
			escolherConta();
			break;
		}
		usuarioPoupanca(conta, opcao);
	}

	private static void usuarioCredito(int conta, int opcao) {
		System.out.println("------------------");
		System.out.println("> CONTA DE CRÉDITO");
		System.out.println("(1) FATURA\n(2) PAGAMENTO\n(3) SAQUE\n(4) SALDO\n(5) VOLTAR");
		System.out.print("> ");
		int opcao1 = sc.nextInt();

		switch (opcao1) {
		case 1:
			System.out.println("------------------\nVOCÊ AINDA NÃO TEM UMA FATURA!");
			break;
		case 2:
			Credito.listaCredito.get(conta).pagamento(conta);
			break;
		case 3:
			Conta.saque(conta, opcao);
			break;
		case 4:
			Conta.saldo(conta, opcao);
			break;
		case 5:
			escolherConta();
			break;
		default:
			System.out.println("------------------\nOPÇÃO INVÁLIDA!");
			escolherConta();
			break;
		}
		usuarioCredito(conta, opcao);
	}

	public static void menuGerencia() {
		System.out.println("------------------");
		System.out.println("> MENU  GERÊNCIA <");
		System.out.println("(1) CADASTRAR CONTA\n(2) BLOQUEAR CONTA\n(3) LISTAR CONTAS\n(4) VOLTAR");
		System.out.print("> ");
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
			System.out.println("------------------\nOPÇÃO INVÁLIDA!");
			menuGerencia();
			break;
		}
	}

	private static void menuListar() {
		System.out.println("------------------");
		System.out.println("> MENU LISTAR <");
		System.out.println("(1) CORRENTE\n(2) CRÉDITO\n(3) POUPANÇA\n(4) VOLTAR");
		System.out.print("> ");
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
			if(Corrente.listaCorrente.size() == 0) {
				System.out.println("------------------\nNÃO HÁ CONTAS CORRENTES CADASTRADAS!");
			}else {
			for (int i = 0; i < Corrente.listaCorrente.size(); i++) {
				System.out.println(Corrente.listaCorrente.get(i).toString());
				}
			}
			break;
		case 2:
			if(Credito.listaCredito.size() == 0) {
				System.out.println("------------------\nNÃO HÁ CONTAS DE CRÉDITO CADASTRADAS!");
			}else {
			for (int i = 0; i < Credito.listaCredito.size(); i++) {
				System.out.println(Credito.listaCredito.get(i).toString());
				}
			}
			break;
		case 3:
			if(Poupanca.listaPoupanca.size() == 0) {
				System.out.println("------------------\nNÃO HÁ CONTAS POUPANÇA CADASTRADAS!");
			}else {
			for (int i = 0; i < Poupanca.listaPoupanca.size(); i++) {
				System.out.println(Poupanca.listaPoupanca.get(i).toString());
				}
			}
			break;
		}
		menuListar();
	}

	private static void menuBloqueio() {
		System.out.println("------------------");
		System.out.println("> MENU BLOQUEIO <");
		System.out.println("(1) CORRENTE\n(2) CRÉDITO\n(3) POUPANÇA\n(4) VOLTAR");
		System.out.print("> ");
		int opcao = sc.nextInt();

		if (opcao > 0 && opcao < 4) {
			System.out.println("------------------");
			System.out.print("INFORME A CONTA: ");
			int numero = sc.nextInt();
			
			int conta = validaConta(opcao, numero);
			if (conta != -1) {
				cancelar(opcao, conta);
			} else if (opcao == 4) {
				menuGerencia();
			} else {
			menuBloqueio();
			}
			menuBloqueio();
		}
	}
	

	private static void cancelar(int opcao, int conta) {
		switch (opcao) {
		case 1:
			Corrente.listaCorrente.get(conta).setStatus(false);		
			System.out.println("------------------\nA CONTA FOI BLOQUEADA");
			break;
		case 2:
			Credito.listaCredito.get(conta).setStatus(false);
			System.out.println("------------------\nA CONTA FOI BLOQUEADA");
			break;
		case 3:
			Poupanca.listaPoupanca.get(conta).setStatus(false);
			System.out.println("------------------\nA CONTA FOI BLOQUEADA");
			break;
		default:
			System.out.println("------------------\nOPÇÃO INVÁLIDA!");
			menuBloqueio();
			break;
		}
	}

	public static void menuCadastro() {
		System.out.println("------------------");
		System.out.println("> MENU CADASTRO <");
		System.out.println("(1) CORRENTE\n(2) CRÉDITO\n(3) POUPANÇA\n(4) VOLTAR");
		System.out.print("> ");
		int opcao = sc.nextInt();

		if (opcao > 0 && opcao < 4) {
			cadastrar(opcao);
		} else if (opcao == 4) {
			menuGerencia();
		} else {
			System.out.println("------------------\nOPÇÃO INVÁLIDA!");
			menuCadastro();
		}
		menuGerencia();
	}

	private static void cadastrar(int opcao) {
		System.out.println("------------------");
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
			saldo = limite;
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
		default:
			System.out.println("------------------\nOPÇÃO INVÁLIDA!");
			menuCadastro();
			break;
		}
		System.out.println("------------------\nCADASTRO REALIZADO!");
		menuCadastro();
	}
}