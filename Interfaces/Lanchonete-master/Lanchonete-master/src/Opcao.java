import java.util.ArrayList;
public abstract class Opcao implements Interface{
	
    public static ArrayList<Opcao> cardapio = new ArrayList<>();
    
    private int quantidade;
    private String descricao;
    private double preco;
    
    public Opcao(String descricao, double preco) {
        this.setQuantidade(0);
        this.descricao = descricao;
        this.preco = preco;
    }
    
    private static void reordenar() {
        ArrayList<Opcao> novoCardapio = new ArrayList<>();
        for (Opcao opcao: cardapio) {
            if (opcao instanceof Lanche) {
                novoCardapio.add(opcao);
            }
        }
        for (Opcao opcao: cardapio) {
            if (opcao instanceof Porcao) {
                novoCardapio.add(opcao);
            }
        }
        for (Opcao opcao: cardapio) {
            if (opcao instanceof Bebida) {
                novoCardapio.add(opcao);
            }
        }
        cardapio = novoCardapio;
    }

    public int getCodigo() {
        return cardapio.indexOf(this)+1;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    //-------------------------------------

    @Override
	public void inserir() {
	     cardapio.add(this);
	     reordenar();
	}
	
    @Override
	public void remover() {
	    cardapio.remove(this);
	    reordenar();
	}
	
    //-------------------------------------

    public static Opcao procurarOpcao(int codigo) {
        for (Opcao opcao : cardapio) {
            if (opcao.getCodigo() == codigo) {
                return opcao;
            }
        }
        throw new OpcaoInvalidaException();
    }

    public static String mostrarOpcoes() {
        String dadosOpcoes = "> > > > > > > > CARDÁPIO < < < < < < < <\nTIPO   COD DESCRIÇÃO           PREÇO\n";
        for (Opcao opcao : cardapio) {
            dadosOpcoes += opcao.toString() + "\n";
        }
        return dadosOpcoes;
    }

    @Override
    public abstract String toString();
    public abstract String toStringPedido();
}