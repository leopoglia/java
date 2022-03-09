import java.util.ArrayList;

public class Cliente extends Pessoa {
	
	static ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
	
	
	private int cadastro;

	@Override
	public String toString() {
		return super.toString() + "CADASTRO: " + cadastro + "\n";
	}

	public Cliente(int cadastro) {
		super();
		this.cadastro = cadastro;
	}

	public Cliente(String nome, String cpf, String email, String telefone, String genero, int idade, int cadastro) {
		super(nome, cpf, email, telefone, genero, idade);
		this.cadastro = cadastro;
	}
	
}
