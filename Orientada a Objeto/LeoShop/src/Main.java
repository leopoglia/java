import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		
		//ADICIONADO ADMIN//		
		Gerente.listaGerente.get(0).setNome("admin");
		Gerente.listaGerente.get(0).setSenha("admina");
		
		
		System.out.println("---------------------");
		System.out.println("BEM-VINDO AO LEOSHOP!");
		menuPrincipal();

	}
	
	public static void opcaoInvalida() {
		System.out.println("---------------------");
		System.out.println("   OPÇÃO INVALIDA!");
		System.out.println("---------------------");
	}
	
	public static void menuPrincipal() {
		System.out.println("---------------------");
		System.out.println("> MENU  PRINCIPAL");
		System.out.println("(1) CLIENTE\n(2) FUNCIONÁRIO\n(3) GERENTE\n(4) FECHAR");
		System.out.print("> ");
		int opcao = sc.nextInt();
		
		switch(opcao) {
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
			menuPrincipal();
		}
	}
	
	public static void menuCliente() {
		System.out.println("---------------------");
		System.out.println("> MENU CLIENTE");
	}
	
	public static void menuFuncionario() {
		System.out.println("---------------------");
		System.out.println("> MENU FUNCIONÁRIO");
		System.out.println("(1) VENDER\n(2) CADASTRAR CLIENTE\n(3) CADASTRAR PRODUTO\n(4) VERIFICAR ESTOQUE\n(5) VOLTAR");
		System.out.print("> ");
		int opcao = sc.nextInt();
		
		switch(opcao) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			menuPrincipal();
			break;
		default:
			opcaoInvalida();
			menuPrincipal();	
		}
	}
	
	public static void menuGerente() {
		System.out.println("---------------------");
		System.out.println("> MENU GERENTE");
		System.out.println("(1) VENDER\n(2) CADASTRAR CLIENTE\n(3) CADASTRAR PRODUTO\n(4) VERIFICAR ESTOQUE\n(5) CADASTRAR FUNCIONARIO\n(6) VOLTAR");
		int opcao = sc.nextInt();
		
		switch(opcao) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			menuPrincipal();
			break;
		default:
			opcaoInvalida();
			menuPrincipal();	
		}
	}

}
