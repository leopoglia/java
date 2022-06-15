package lanchonete;

public class Lanche extends Pedido {
    private double peso;

    public Lanche(int codigo, double preco, String descricao, double peso) {
        super(codigo, descricao, preco);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return this.getCodigo() + "\t" + this.getDescricao() + "\t" + this.getPeso() + "\t" + this.getPreco();
    }
}
