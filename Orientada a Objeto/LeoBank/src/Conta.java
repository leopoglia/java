import java.util.Scanner;

public class Conta {

	static Scanner sc = new Scanner(System.in);

	private double saldo;
	private String titular, senha;
	private boolean status;
	private int numero;

	public static void saque(int conta, int opcao) {
		System.out.print("------------------\nQUANTO VOCÊ DESEJA SACAR? ");
		double saque = sc.nextDouble();

		switch (opcao) {
		case 1:
			if (Corrente.listaCorrente.get(conta).getSaldo() < saque) {
				System.out.println("------------------\nVOCÊ NÃO TEM ESSE VALOR!");
			} else {
				Corrente.listaCorrente.get(conta).setSaldo(Corrente.listaCorrente.get(conta).getSaldo() - saque);
				System.out.println("------------------\nVOCÊ SACOU R$" + saque);

			}
			break;
		case 2:
			if (Credito.listaCredito.get(conta).getSaldo() < saque) {
				System.out.println("------------------\nVOCÊ NÃO TEM ESSE VALOR!");
			} else {
				Credito.listaCredito.get(conta).setSaldo(Credito.listaCredito.get(conta).getSaldo() - saque);
				System.out.println("------------------\nVOCÊ SACOU R$" + saque);
			}
			break;
		case 3:
			System.out.println("POUPANCA");
			if (Poupanca.listaPoupanca.get(conta).getSaldo() < saque) {
				System.out.println("------------------\nVOCÊ NÃO TEM ESSE VALOR!");
			} else {
				Poupanca.listaPoupanca.get(conta).setSaldo(Poupanca.listaPoupanca.get(conta).getSaldo() - saque);
				System.out.println("------------------\nVOCÊ SACOU R$" + saque);
			}
			break;
		}
	}

	public static void saldo(int conta, int opcao) {
		switch (opcao) {
		case 1:
			System.out.println("------------------\nSALDO: R$" + Corrente.listaCorrente.get(conta).getSaldo());
			break;
		case 2:
			System.out.println("------------------\nSALDO: R$" + Credito.listaCredito.get(conta).getSaldo());
			break;
		case 3:
			System.out.println("------------------\nSALDO: R$" + Poupanca.listaPoupanca.get(conta).getSaldo());
			break;
		}
	}

	public Conta() {
		super();
	}

	@Override
	public String toString() {
		return 		"------------------\n" + "TITULAR: " + titular + "\nNUMERO: " + numero + "\nSALDO: R$" + saldo + "\nSENHA: " + senha
				+ "\nSTATUS: " + status;
	}

	public Conta(double saldo, String titular, String senha, boolean status, int numero) {
		super();
		this.saldo = saldo;
		this.titular = titular;
		this.senha = senha;
		this.status = status;
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}