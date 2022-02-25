import java.util.ArrayList;
import java.util.Scanner;

public class Poupanca extends Conta {
	static Scanner sc = new Scanner(System.in);

	static ArrayList<Poupanca> listaPoupanca = new ArrayList<Poupanca>();

	private double rendimento;

	public void deposito(int conta) {
		System.out.print("QUANTO VOCÊ DESEJA DEPOSITAR? ");
		double quantidade = sc.nextDouble();

		Poupanca.listaPoupanca.get(conta).setSaldo(Poupanca.listaPoupanca.get(conta).getSaldo() + quantidade);
		System.out.println("\nFOI DEPOSITADO EM SUA CONTA R$" + quantidade + '\n');
	}

	public void transferencia(int conta) {
		System.out.print("PARA QUAL CONTA VOCÊ DESEJA TRANSFERIR? ");
		int contaTransferir = sc.nextInt();

		System.out.print("QUANTO VOCÊ QUER TRANSFERIR? ");
		double quantidade = sc.nextDouble();

		if (Poupanca.listaPoupanca.get(conta).getSaldo() < quantidade) {
			System.out.println("VOCÊ NÃO TEM DINHEIRO PARA TRANSFERIR!");
		} else {
			Poupanca.listaPoupanca.get(conta).setSaldo(Poupanca.listaPoupanca.get(conta).getSaldo() - quantidade);
			Poupanca.listaPoupanca.get(contaTransferir).setSaldo(quantidade);
			System.out.println("\nVOCÊ TRANSFERIU PARA A CONTA " + contaTransferir + " R$" + quantidade + '\n');

		}
	}

	@Override
	public String toString() {
		return super.toString() + "\nRENDIMENTO: " + rendimento;
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