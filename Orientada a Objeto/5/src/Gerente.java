
public class Gerente extends Funcionario {
	
	String cargo = "Gerente";
	
	public double pagamento() {
		return this.getSalario() * 1.5;
	}
	
	
}
