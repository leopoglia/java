package lanchonete;

public class Bebida extends Pedido {
    private double volume;
    
    public Bebida(int codigo, double preco, String descricao, double volume) {
    	super(codigo, descricao, preco);
    	this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return this.getCodigo() + "\t" + this.getDescricao() + "\t" + this.getVolume() + "\t" + this.getPreco();
    }
}
