import java.util.ArrayList;

public class Poupanca extends Conta{
	
	static ArrayList<Poupanca> listaPoupanca = new ArrayList<Poupanca>();

	private double rendimento;
	
	
	public void deposito() {
	}
	
	public void transferencia() {
	}

	@Override
	public String toString() {
		return super.toString() + "RENDIMENTO: " + rendimento + '\n';
	}
	
	

	public Poupanca(double rendimento) {
		super();
		this.rendimento = rendimento;
	}
	

	public Poupanca() {
		super();
	}

	public Poupanca(double saldo, String titular, String senha, boolean status, int numero, double rendimento) {
		super(saldo, titular, senha, status, numero);
		this.rendimento = rendimento;
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
}