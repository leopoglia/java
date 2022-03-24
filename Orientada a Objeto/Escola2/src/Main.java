import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		System.out.println(
				"MENU:" + "\n1 - Cadastrar" + "\n2 - Editar" + "\n3 - Remover" + "\n4 - Listar" + "\n5 - Encerrar");

		int opcaoMenu = sc.nextInt();
		switch (opcaoMenu) {
		case 1:
			cadastrar();
			break;
		case 2:
			editar();
			break;
		case 3:
			excluir();
			break;
		case 4:
			listar();
			break;
		case 5:
			System.exit(0);
			break;
		}
	}


	public static void cadastrar() {
		int opcaoTipo = selecionaTipo("Cadastrar");
		switch (opcaoTipo) {
		case 1:
			Professor.listaProfessores.add(coletaDadosProfessor());
			break;
		case 2:
			Aluno.listaAlunos.add(coletaDadosAluno());
			break;
		case 3:
			Materia.listaMaterias.add(coletaDadosMateria());
			break;
		case 4:
			Turma.listaTurma.add(coletaDadosTurma());
			break;
		}
		menu();
	}

	public static void editar() {
		int opcaoTipo = selecionaTipo("Editar");
		int opcaoEditar = selecionaEditar();
		int matricula = coletaMatricula();
		switch (opcaoTipo) {
		case 1:
			int indice = validaProfessor(Professor.listaProfessores, matricula);
			if (indice != -1) {
				switch (opcaoEditar) {
				case 1:
					Professor.listaProfessores.set(indice, coletaDadosProfessor());
					break;
				case 2:
					editaAtributo(selecionaAtributo(opcaoTipo), opcaoTipo, indice, Professor.listaProfessores,
							Aluno.listaAlunos);
					break;
				}
			}
			break;
		case 2:
			indice = validaAluno(Aluno.listaAlunos, matricula);
			if (indice != -1) {
				switch (opcaoEditar) {
				case 1:
					Aluno.listaAlunos.set(indice, coletaDadosAluno());
					break;
				case 2:
					editaAtributo(selecionaAtributo(opcaoTipo), opcaoTipo, indice, Professor.listaProfessores,
							Aluno.listaAlunos);
					break;
				}
			}
			break;
		}
		menu();
	}

	public static void excluir() {
		int opcaoTipo = selecionaTipo("Excluir");
		int matricula = coletaMatricula();
		switch (opcaoTipo) {
		case 1:
			int indice = validaProfessor(Professor.listaProfessores, matricula);
			if (confirmaExcluir((Pessoa) Professor.listaProfessores.get(indice))) {
				Professor.listaProfessores.remove(indice);
			}
			break;
		case 2:
			indice = validaAluno(Aluno.listaAlunos, matricula);
			if (confirmaExcluir((Pessoa) Aluno.listaAlunos.get(indice))) {
				Aluno.listaAlunos.remove(indice);
			}
			break;
		}
		menu();
	}

	public static void listar() {
		int opcaoTipo = selecionaTipo("Listar");
		switch (opcaoTipo) {
		case 1:
			for (Professor professor : Professor.listaProfessores) {
				System.out.println(professor.toString());
			}
			break;
		case 2:
			for (Aluno aluno : Aluno.listaAlunos) {
				System.out.println(aluno.toString());
			}
			break;
		case 3:
			for (Materia materia : Materia.listaMaterias) {
				System.out.println(materia.toString());
			}
		case 4:
			for(Turma turma : Turma.listaTurma) {
				System.out.println(turma.toString());
			}
		}
		menu();
	}

	private static boolean confirmaExcluir(Pessoa pessoa) {
		System.out.println(pessoa.toString());
		System.out.println("Deseja realemente removê-lo?" + "\n1 - Sim" + "\n2 - Não");
		int deleta = sc.nextInt();
		if (deleta == 1) {
			return true;
		}
		return false;
	}

	private static int validaAluno(ArrayList<Aluno> listaAlunos, int matricula) {
		for (int i = 0; i < listaAlunos.size(); i++) {
			if (listaAlunos.get(i).getMatricula() == matricula) {
				return i;
			}
		}
		return -1;
	}

	private static void editaAtributo(int atributo, int opcaoTipo, int indice, ArrayList<Professor> listaProfessores,
			ArrayList<Aluno> listaAlunos) {
		Pessoa pessoa = new Pessoa();
		if (opcaoTipo == 1) {
			pessoa = (Pessoa) listaProfessores.get(indice);
		} else {
			pessoa = (Pessoa) listaAlunos.get(indice);
		}
		switch (atributo) {
		case 1:
			pessoa.setNome(sc.next());
			break;
		case 2:
			pessoa.setCpf(sc.next());
			break;
		case 3:
			pessoa.setTelefone(sc.next());
			break;
		case 4:
			pessoa.setGenero(sc.next());
			break;
		case 5:
			pessoa.setIdade(sc.nextInt());
			break;
		case 6:
			pessoa.setMatricula(sc.nextInt());
			break;
		}
		switch (atributo) {
		case 7:
			listaProfessores.get(indice).setMateria(null);
			break;
		case 8:
			listaProfessores.get(indice).setTurno(sc.next());
			break;
		case 9:
			listaProfessores.get(indice).setSalario(sc.nextDouble());
			break;
		}
		switch (atributo) {
		case 7:
			break;
		case 8:
			listaProfessores.get(0).cadastrarNota(1, sc.nextDouble(), listaAlunos.get(indice));
			break;
		case 9:
			listaProfessores.get(0).cadastrarNota(2, sc.nextDouble(), listaAlunos.get(indice));
			break;
		case 10:
			listaProfessores.get(0).cadastrarNota(3, sc.nextDouble(), listaAlunos.get(indice));
			break;
		}
	}

	private static int selecionaAtributo(int opcaoTipo) {
		System.out.println("Qual atributo deseja editar?" + "\n1 - Nome" + "\n2 - CPF" + "\n3 - Telefone"
				+ "\n4 - Gênero" + "\n5 - Idade" + "\n6 - Matrícula");
		if (opcaoTipo == 1) {
			System.out.println("7 - Matéria" + "\n8 - Turno" + "\n9 - Salário");
		} else {
			System.out.println("7 - Turma");
		}
		return sc.nextInt();
	}

	private static int selecionaEditar() {
		System.out.println("Editar:" + "\n1 - Todos os atributos" + "\n2 - Um atributo");
		return sc.nextInt();
	}

	private static int validaProfessor(ArrayList<Professor> listaProfessores, int matricula) {
		for (int i = 0; i < listaProfessores.size(); i++) {
			if (listaProfessores.get(i).getMatricula() == matricula) {
				return i;
			}
		}
		return -1;
	}

	private static Aluno coletaDadosAluno() {
		Pessoa pessoa = coletaDadosPessoa();
		System.out.print("Turma: ");
		Turma turma = new Turma();
		Aluno aluno = new Aluno(pessoa.getNome(), pessoa.getCpf(), pessoa.getTelefone(), pessoa.getGenero(),
				pessoa.getIdade(), pessoa.getMatricula(), turma);
		return aluno;
	}

	private static Professor coletaDadosProfessor() {
		Pessoa pessoa = coletaDadosPessoa();
		System.out.print("Quantas Matérias você leciona?");
		int qtdMateria = sc.nextInt();
		ArrayList<Materia> listaMateria = new ArrayList<Materia>();
		for(int i = 0; i < qtdMateria; i++) {
			System.out.print("Codigo da Matéria: ");
			int materia = sc.nextInt();
			listaMateria.addAll(materia(materia, qtdMateria));
		}
		System.out.print("Turno: ");
		String turno = sc.next();
		System.out.print("Salário: ");
		double salario = sc.nextDouble();
		
		
		
		Professor professor = new Professor(pessoa.getNome(), pessoa.getCpf(), pessoa.getTelefone(), pessoa.getGenero(),
				pessoa.getIdade(), pessoa.getMatricula(), listaMateria , turno, salario);
		return professor;
	}
	
	private static ArrayList<Materia> materia(int materia, int qtdMateria) {
		ArrayList<Materia> listaMateriasTemporaria = new ArrayList<Materia>();
		for(int i = 0; i < qtdMateria; i++) {
			if(materia == Materia.listaMaterias.get(i).getCodigo()) {
				String nome = Materia.listaMaterias.get(i).getNome();
				String areaAtuacao = Materia.listaMaterias.get(i).getAreaAtuacao();
				
				Materia materiatemp = new Materia(materia, nome, areaAtuacao);
				listaMateriasTemporaria.add(materiatemp);
			}else {
				System.out.println("Essa materia não existe!!!!");
				materia(materia, qtdMateria);
			}
		}
		return listaMateriasTemporaria;
		
	}

	private static Pessoa coletaDadosPessoa() {
		System.out.print("Insira os dados" + "\nNome: ");
		String nome = sc.next();
		System.out.print("CPF: ");
		String cpf = sc.next();
		System.out.print("Telefone: ");
		String telefone = sc.next();
		System.out.print("Genero: ");
		String genero = sc.next();
		System.out.print("Idade: ");
		int idade = sc.nextInt();
		System.out.print("Matrícula: ");
		int matricula = sc.nextInt();
		Pessoa pessoa = new Pessoa(nome, cpf, telefone, genero, idade, matricula);
		return pessoa;
	}

	private static Materia coletaDadosMateria() {
		System.out.print("Insira os dados\nCodigo: ");
		int codigo = sc.nextInt();
		System.out.print("\nNome: ");
		String nome = sc.next();
		System.out.print("\nArea de Atuação: ");
		String area = sc.next();
		Materia materia = new Materia(codigo, nome, area);
		return materia;
	}

	private static Turma coletaDadosTurma() {
		System.out.print("Insira os dados" + "\nNome: ");
		String nome = sc.next();
		System.out.print("Codigo: ");
		int codigo = sc.nextInt();
		System.out.print("Materia: ");
		Turma turma = new Turma(nome, codigo);
		return turma;
	}

	private static int selecionaTipo(String opcaoMenu) {
		System.out.println(opcaoMenu + "\n1 - Professor" + "\n2 - Aluno" + "\n3 - Matéria" + "\n4 - Turma");
		return sc.nextInt();
	}

	private static int coletaMatricula() {
		System.out.println("Matrícula: ");
		return sc.nextInt();
	}
}