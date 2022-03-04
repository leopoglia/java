import java.util.ArrayList;
import java.util.Scanner;

public class Corrente extends Conta {
	static Scanner sc = new Scanner(System.in);

	static ArrayList<Corrente> listaCorrente = new ArrayList<Corrente>();

	private double limite;

	public void pagamento(int conta) {
		System.out.print("------------------\nQUANTO VOCÊ DESEJA PAGAR? ");
		double pagamento = sc.nextDouble();

		if(Corrente.listaCorrente.get(conta).getLimite() < pagamento) {
			System.out.println("------------------\nSEU LIMITE NÃO PERMITE PAGAR ESSA QUANTIDADE!");
		}else {
		if (Corrente.listaCorrente.get(conta).getSaldo() < pagamento) {
			System.out.println("------------------\nVOCÊ NÃO TEM DINHEIRO PARA PAGAR!");
		} else {
			Corrente.listaCorrente.get(conta).setSaldo(Corrente.listaCorrente.get(conta).getSaldo() - pagamento);
			System.out.println("------------------\nVOCÊ PAGOU R$" + pagamento);

			}
		}
	}

	public void deposito(int conta) {
		System.out.print("------------------\nQUANTO VOCÊ DESEJA DEPOSITAR?");
		double quantidade = sc.nextDouble();
		
			Corrente.listaCorrente.get(conta).setSaldo(Corrente.listaCorrente.get(conta).getSaldo() + quantidade);
			System.out.println("------------------\nFOI DEPOSITADO EM SUA CONTA R$" + quantidade);

	}

	public void transferencia(int conta) {
		System.out.print("------------------\nPARA QUAL CONTA VOCÊ DESEJA TRANSFERIR?");
		int contaTransferir = sc.nextInt();
		
	    int contaTransf = validatransferencia(contaTransferir);


		System.out.print("------------------\nQUANTO VOCÊ QUER TRANSFERIR?");
		double quantidade = sc.nextDouble();
		
		if(Corrente.listaCorrente.get(conta).getLimite() < quantidade) {
			System.out.println("------------------\nSEU LIMITE NÃO PERMITE TRANSFERIR ESSA QUANTIDADE!");
		}else {
		if (Corrente.listaCorrente.get(conta).getSaldo() < quantidade) {
			System.out.println("------------------\nVOCÊ NÃO TEM DINHEIRO PARA TRANSFERIR!");
		} else {
			Corrente.listaCorrente.get(conta).setSaldo(Corrente.listaCorrente.get(conta).getSaldo() - quantidade);
			Corrente.listaCorrente.get(contaTransf).setSaldo(quantidade);
			System.out.println("------------------\nVOCÊ TRANSFERIU PARA A CONTA " + contaTransferir + " R$" + quantidade);

		}
		
		}
	}
	
	public static int validatransferencia(int contaTransferir) {
		
		for(int i = 0; i < Corrente.listaCorrente.size(); i++) {
			if(contaTransferir == Corrente.listaCorrente.get(i).getNumero()) {
				return i;
			}
		}
		return -1;
	}

	public String toString() {
		return super.toString() + "\nLIMITE: " + limite;
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