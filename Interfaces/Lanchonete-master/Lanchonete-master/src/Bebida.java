public class Bebida extends Opcao {
    private double volume;

    public Bebida(String descricao, double preco, double volume) {
        super(descricao, preco);
        this.volume = volume;
    }


    @Override
    public String toString() {
        return String.format("%-6s %-3d %-19s R$ %.2f",this.getClass().getSimpleName(),this.getCodigo(),this.getDescricao()+String.format(" %.3fl",this.volume), this.getPreco());
    }
    public String toStringPedido(){
        return String.format("%-3d %-20s %-3d R$ %.2f",this.getCodigo(),this.getDescricao()+String.format(" %.3fl",this.volume), this.getQuantidade(), (this.getQuantidade()*this.getPreco()));
    }
}
