import java.util.ArrayList;
import java.util.Scanner;

public class Corrente extends Conta{
	static Scanner sc = new Scanner(System.in);
	
	static ArrayList<Corrente> listaCorrente = new ArrayList<Corrente>();
	
	private double limite;
	
	
	
	public void pagamento(int conta) {
		System.out.println("QUANTO VOCÊ DESEJA PAGAR? ");
		double pagamento = sc.nextDouble();
		
		Corrente.listaCorrente.get(conta).setSaldo(Corrente.listaCorrente.get(conta).getSaldo() - pagamento);;
	}
	
	public void deposito(int conta) {
		System.out.print("QUANTO VOCÊ DESEJA DEPOSITAR? ");
		double quantidade = sc.nextDouble();
		
		Corrente.listaCorrente.get(conta).setSaldo(quantidade);
	}
	
	public void transferencia() {
	}
	

	
	public String toString() {
	return super.toString() + "\nLIMITE: " + limite + '\n';
	}
	 
	public Corrente() {
		super();
	}

	public Corrente(double saldo, String titular, String senha, boolean status, int numero, double limite) {
		super(saldo, titular, senha, status, numero);
		this.limite = limite;
	}


	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}
