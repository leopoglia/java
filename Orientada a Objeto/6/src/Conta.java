
public class Conta {

	private double saldo;
	private String titular, senha;
	private boolean status;
	private int numero;

	public void saque() {
	}

	public void saldo() {
	}
	
	

	public Conta() {
		super();
	}

	@Override
	public String toString() {
		return "TITULAR: " + titular + "\nNUMERO: " + numero +"\nSALDO: R$" + saldo +"\nSENHA: " + senha + "\nSTATUS: " + status;
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

	public boolean isStatus() {
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