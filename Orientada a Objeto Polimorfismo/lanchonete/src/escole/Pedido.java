package escole;

public class Pedido {

    private int codigo;
    private String descricao;
    private double preco;

    public Pedido(){
    }

    public Pedido(int codigo, String descricao, double preco){
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

	@Override
	public String toString() {
		return "Pedido [codigo=" + codigo + ", descricao=" + descricao + ", preco=" + preco + "]";
	}
    
    
}