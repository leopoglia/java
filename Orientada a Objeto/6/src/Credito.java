import java.util.ArrayList;

public class Credito extends Conta{
	
	
	static ArrayList<Credito> listaCredito = new ArrayList<Credito>();
 
	private double limite;
	private int dataFatura;
	
	
	public void pagamento() {
	}
	
	@Override
	public String toString() {
		return super.toString()  + "\nLIMITE: " + limite + "\nDATA DA FATURA: " + dataFatura + '\n';
	}

	public Credito(double limite, int dataFatura) {
		super();
		this.limite = limite;
		this.dataFatura = dataFatura;
	}
	
	public Credito() {
		super();
	}

	public Credito(double saldo, String titular, String senha, boolean status, int numero, double limite, int dataFatura) {
		super(saldo, titular, senha, status, numero);
		this.dataFatura = dataFatura;
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
	this.limite = limite;
	}
	public int getDataFatura() {
		return dataFatura;
	}
	public void setDataFatura(int dataFatura) {
		this.dataFatura = dataFatura;
	}

}
