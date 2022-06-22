public class Porcao extends Opcao {
    private String tamanho;

    public Porcao(String descricao, double preco, String tamanho) {
        super(descricao, preco);
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return String.format("%-6s %-3d %-19s R$ %.2f",this.getClass().getSimpleName(),this.getCodigo(),this.getDescricao()+" "+this.tamanho, this.getPreco());
    }
    @Override
    public String toStringPedido(){
        return String.format("%-3d %-20s %-3d R$ %.2f",this.getCodigo(),this.getDescricao()+" "+this.tamanho, this.getQuantidade(), (this.getQuantidade()*this.getPreco()));
    }
}
