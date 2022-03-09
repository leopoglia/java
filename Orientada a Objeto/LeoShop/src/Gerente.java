import java.util.ArrayList;

public class Gerente extends Funcionario{
	
	static ArrayList<Gerente> listaGerente = new ArrayList<Gerente>();
	


	public static void cadastrarFuncionario() {
		
	}



	public Gerente() {
		super();
	}

	public Gerente(String nome, String cpf, String email, String telefone, String genero, int idade, String senha, int matricula) {
		super(nome, cpf, email, telefone, genero, idade, senha, matricula);
	}
}