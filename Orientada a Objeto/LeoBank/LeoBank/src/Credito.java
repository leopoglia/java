import java.util.ArrayList;
import java.util.Scanner;

public class Credito extends Conta {
	static Scanner sc = new Scanner(System.in);

	static ArrayList<Credito> listaCredito = new ArrayList<Credito>();

	private double limite;
	private int dataFatura;

	public void pagamento(int conta) {
		System.out.print("------------------\nQUANTO VOCÊ DESEJA PAGAR? ");
		double pagamento = sc.nextDouble();
		
		if(Credito.listaCredito.get(conta).getLimite() < pagamento) {
			System.out.println("------------------\nSEU LIMITE NÃO PERMITE PAGAR ESSA QUANTIDADE!");
		}else {

		if (Poupanca.listaPoupanca.get(conta).getSaldo() < pagamento) {
			System.out.println("------------------\nVOCÊ NÃO TEM DINHEIRO PARA PAGAR!");
		} else {
			Corrente.listaCorrente.get(conta).setSaldo(Poupanca.listaPoupanca.get(conta).getSaldo() - pagamento);
		}
		}
	}

	@Override
	public String toString() {
		return super.toString() + "\nLIMITE: " + limite + "\nDATA DA FATURA: " + dataFatura;
	}

	public Credito(double limite, int dataFatura) {
		super();
		this.limite = limite;
		this.dataFatura = dataFatura;
	}

	public Credito() {
		super();
	}

	public Credito(double saldo, String titular, String senha, boolean status, int numero, double limite,
			int dataFatura) {
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
