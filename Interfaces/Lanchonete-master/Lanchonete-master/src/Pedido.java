import java.util.ArrayList;

public class Pedido implements Interface{
	private ArrayList<Opcao> pedido = new ArrayList<>();

	@Override
	public void inserir() {
		Opcao escolha = Executavel.escolherOpcao();
		
		if(pedido.contains(escolha)) {
			int posicao = pedido.indexOf(escolha);
			Opcao opcao = pedido.get(posicao);
			opcao.setQuantidade(opcao.getQuantidade()+1);
		}else {
			escolha.setQuantidade(1);
			pedido.add(escolha);
		}
	
	}

	@Override
	public void remover() {
		pedido.remove(Executavel.escolherOpcao());
	}

	@Override
	public String toString() {
		double total = 0;
		String cupom = "> > > > > > > > PEDIDO < < < < < < < <\nCOD DESCRIÇÃO            QTD PREÇO\n";
		for (Opcao opcao : pedido) {
			cupom += opcao.toStringPedido() + "\n";
			total += opcao.getPreco() * opcao.getQuantidade();
		}
		cupom += String.format("TOTAL:       \t\t     R$ %.2f", total);
		return cupom;
	}
}