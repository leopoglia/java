public class Lanche extends Opcao {
    private double peso;

    public Lanche(String descricao, double preco, double peso) {
        super(descricao, preco);
        this.peso = peso;
    }

    @Override
    public String toString() {
        return String.format("%-6s %-3d %-19s R$ %.2f",this.getClass().getSimpleName(),this.getCodigo(),this.getDescricao()+String.format(" %.3fkg",this.peso), this.getPreco());
    }
    @Override
    public String toStringPedido(){
        return String.format("%-3d %-20s %-3d R$ %.2f",this.getCodigo(),this.getDescricao()+String.format(" %.3fkg",this.peso), this.getQuantidade(), (this.getQuantidade()*this.getPreco()));
    }
}