package escole;

public class Porcao extends Pedido {
    private String tamanho;

    public Porcao() {
    }

    public Porcao(int codigo, double preco, String descricao, String tamanho) {
    	super(codigo, descricao, preco);
    	this.tamanho = tamanho;
    }
    
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return this.getCodigo() + "\t" + this.getDescricao() + "\t" + this.getTamanho() + "\t" + this.getPreco();
    }
}
