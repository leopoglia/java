public class ContaCorrente extends ContaBancaria {
    private double taxaDeOperacao;
    private double limite;
    private int qtdOperacao = 0;

    public ContaCorrente(double taxaDeOperacao, double limite) {
        super();
        this.taxaDeOperacao = taxaDeOperacao;
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor != 0) {
            if (this.getSaldo() + this.limite >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                this.qtdOperacao++;
                if (this.qtdOperacao > 3) {
                    this.setSaldo(this.getSaldo() - this.taxaDeOperacao);
                }
            } else {
                throw new SaldoInsufucienteException();
            }
        } else {
            throw new OperacaoZeroException("sacar");
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor != 0) {
            this.setSaldo(this.getSaldo() + valor);
            this.qtdOperacao++;
            if (this.qtdOperacao > 3) {
                this.setSaldo(this.getSaldo() - this.taxaDeOperacao);
            }
        } else {
            throw new OperacaoZeroException("depositar");
        }
    }

    @Override
    public String mostrarDados() {
        return "Número: " + this.getNumeroConta() +
                "\nSaldo: R$ " + this.getSaldo() +
                "\nTaxa de Operação: R$ " + this.taxaDeOperacao +
                "\nLimite: " + this.limite;
    }
}
