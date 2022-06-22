public abstract class ContaBancaria {

    private int numeroConta;
    private double saldo = 0;
    private static int qtdContas = 0;

    public ContaBancaria() {
        qtdContas++;
        this.numeroConta = qtdContas;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void sacar(double valor);

    public abstract void depositar(double valor);

    public abstract String mostrarDados();

    public void transferir(ContaBancaria conta, double valor) {
        this.sacar(valor);
        conta.depositar(valor);
    }

}
