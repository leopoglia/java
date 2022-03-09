import java.util.ArrayList;

public class Funcionario extends Pessoa{
	
	static ArrayList<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
	
	private String senha;
	private int matricula;
	
	
	public static void vender() {
	}
	
	public static void cadastrarCliente() {
		
	}
	
	public static void verificarEstoque() {
		
	}
	
	public static void cadastrarProduto() {
		
	}

	@Override
	public String toString() {
		return "Funcionario [senha=" + senha + ", matricula=" + matricula + "]";
	}

	public Funcionario(String nome, String cpf, String email, String telefone, String genero, int idade, String senha, int matricula) {
		super(nome, cpf, email, telefone, genero, idade);
		this.senha = senha;
		this.matricula = matricula;
	}

	public Funcionario() {
		super();
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	
	
	
}
