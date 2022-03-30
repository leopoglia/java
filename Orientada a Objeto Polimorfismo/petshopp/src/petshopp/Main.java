package petshopp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	private static ArrayList<Pet> listaPet = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("========================\nBEM-VINDO(A) AO PETSHOP!");
		menuPrincipal();
	}

	public static void menuPrincipal() {
		System.out.println("========================\n(X) MENU PRINCIPAL");
		System.out.print("(1) CADASTRAR PET\n(2) LISTAR PET\n(3) EDITAR PET\n(4) REMOVER PET\n(5) SAIR\n> ");
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			cadastrar();
			break;
		case 2:
			listar();
			break;
		case 3:
			editar();
			break;
		case 4:
			remover();
			break;
		case 5:
			System.exit(0);
			break;
		default:
			menuPrincipal();
			break;
		}
	}

	private static void cadastrar() {
		System.out.println("========================\n(X) MENU CADASTRAR");
		System.out.print("(1) CADASTRAR CACHORRO\n(2) CADASTRAR GATO\n(3) VOLTAR\n> ");
		int opcao = sc.nextInt();
		int indice = -1;

		switch (opcao) {
		case 1:
			cadastrarPet(opcao, indice);
			break;
		case 2:
			cadastrarPet(opcao, indice);
			break;
		default:
			menuPrincipal();
			break;
		}
		menuPrincipal();
	}
	
	private static void cadastrarPet(int opcao, int indice) {
		String tipo = null, tipo2;
		if (indice != -1) {
			tipo2 = "EDITAR";
		} else {
			tipo2 = "CADASTRAR";
		}
		if (opcao == 1) {
			tipo = "CACHORRO";
		} else {
			tipo = "GATO";
		}
		Pet pet = coletadados(opcao, indice, tipo, tipo2);
		
		if (indice == -1) {
			listaPet.add(pet);
		} else {
			listaPet.set(indice, pet);
		}
		
	}

	private static Pet coletadados(int opcao, int indice, String tipo, String tipo2) {
		System.out.println("========================\n(#)" + tipo2 + " " + tipo);
		System.out.print("(>) MATRICULA: ");
		int matricula = sc.nextInt();
		System.out.print("(>) NOME: ");
		String nome = sc.next();
		System.out.print("(>) IDADE: ");
		int idade = sc.nextInt();
		System.out.print("(>) PORTE: ");
		String porte = sc.next();
		System.out.print("(>) PELAGEM: ");
		String pelagem = sc.next();
		System.out.print("(>) COR:");
		String cor = sc.next();
		System.out.print("(>) RAÇA: ");
		String raca = sc.next();

		switch (opcao) {
		case 1:
			System.out.print("(>) BRINQUEDO FAVORITO: ");
			String brinquedoFavorito = sc.next();
			System.out.print("(>) OQUE GOSTA DE FAZER: ");
			String gostaDeFazer = sc.next();
			return new Cachorro(matricula, nome, idade, porte, pelagem, cor, raca,
					brinquedoFavorito, gostaDeFazer);
		case 2:
			System.out.print("(>) TEMPERAMENTO: ");
			Boolean temperamento = sc.nextBoolean();
			System.out.print("(>) COMIDA FAVORITA: ");
			String comidaFavorita = sc.next();
			return new Gato(matricula, nome, idade, porte, pelagem, cor, raca, temperamento,
					comidaFavorita);
		}
		return null;
	}

	private static void listar() {
		System.out.println("========================\n(X) MENU LISTAR");
		System.out.println("(1) LISTAR CACHORRO\n(2) LISTAR GATO\n(3) VOLTAR\n> ");
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("========================");
			for (Pet tipo : listaPet) {
				if(tipo instanceof Cachorro) {
					System.out.println(tipo.toString());
				}
			}
			break;
		case 2:
			System.out.println("========================");
			for (Pet tipo : listaPet) {
				if(tipo instanceof Gato) {
					System.out.println(tipo.toString());
				}
			}
			break;
		}
		menuPrincipal();
	}

	private static void editar() {
		System.out.println("========================\n(X) MENU EDITAR");
		System.out.print("(1) EDITAR CACHORRO\n(2) EDITAR GATO\n(3) VOLTAR\n> ");
		int opcao = sc.nextInt();
		int indice, matricula;

		switch (opcao) {
		case 1:
			System.out.print("INDECE DO CACHORRO: ");
			indice = sc.nextInt();
			matricula = validarPet(opcao, indice);
			cadastrarPet(opcao, matricula);
			break;
		case 2:
			System.out.print("INDECE DO GATO: ");
			indice = sc.nextInt();
			matricula = validarPet(opcao, indice);
			cadastrarPet(opcao, matricula);
			break;
		}
		menuPrincipal();
	}

	private static int validarPet(int opcao, int indice) {
		switch (opcao) {
		case 1:
			for (int i = 0; i < listaPet.size(); i++) {
				if (listaPet.get(i).getMatricula() == indice) {
					return i;
				}
			}
			break;
		case 2:
			for (int i = 0; i < listaPet.size(); i++) {
				if (listaPet.get(i).getMatricula() == indice) {
					return i;
				}
			}
			break;
		}
		return -1;
	}

	private static void remover() {
		System.out.println("========================\n(X) MENU REMOVER");
		System.out.println("(1) REMOVER CACHORRO\n(2) REMOVER GATO\n(3) VOLTAR\n> ");
		int opcao = sc.nextInt();
		int indice, matricula;

		switch (opcao) {
		case 1:
			System.out.print("INDECE DO CACHORRO: ");
			indice = sc.nextInt();
			matricula = validarPet(indice, opcao);
			listaPet.remove(matricula);
			break;
		case 2:
			System.out.print("INDECE DO CACHORRO: ");
			indice = sc.nextInt();
			matricula = validarPet(indice, opcao);
			listaPet.remove(matricula);
			break;
		}
		menuPrincipal();
	}
}