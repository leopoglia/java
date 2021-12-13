package Exercicios;

import javax.swing.JOptionPane;

public class Atividade15 {

	public static void main(String[] args) {
		int pedido, quantidade;
		double preco = 0, total = 0;
		
		do {
		String stringpedido = JOptionPane.showInputDialog("Digite oque você quer pedir:");
		pedido = (int) Double.parseDouble(stringpedido);
		
		String stringquantidade = JOptionPane.showInputDialog("Digite a quantidade:");
		quantidade = (int) Double.parseDouble(stringquantidade);
		
		if(pedido == 100 || pedido == 103) {
			preco = 1.20 * quantidade;
		}else if(pedido == 101 || pedido == 104) {
			preco = 1.30 * quantidade;
		}else if(pedido == 102) {
			preco = 1.50 * quantidade;
		}else if(pedido == 105) {
			preco = 1.0 * quantidade;
		}
		total = total + preco;
		}while(pedido > 0);
		
		JOptionPane.showMessageDialog(null, "PREÇO TOTAL: " +total);
	}
}