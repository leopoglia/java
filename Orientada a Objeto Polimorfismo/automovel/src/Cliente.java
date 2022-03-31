
public class Cliente extends Pessoa {

	@Override
	public String toString() {
		return super.toString() + "Cliente []";
	}
	
	public Cliente(String nome, String cpf, String telefone, String genero, int idade, int matricula) {
		super(nome, cpf, telefone, genero, idade, matricula);
	}
	
}