import java.util.ArrayList;

public class Cliente extends Pessoa {
	
	static ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
	
	

	
	private int cadastro;

	@Override
	public String toString() {
		return "Cliente [cadastro=" + cadastro + "]";
	}

	public Cliente(int cadastro) {
		super();
		this.cadastro = cadastro;
	}

	public Cliente() {
		super();
	}
	
	

}
