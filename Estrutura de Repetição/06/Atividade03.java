package Exercicios;

import javax.swing.JOptionPane;

public class Atividade03 {

	public static void main(String[] args) {
		double troco, precoTotal = 0;
		String preco, precoDado;

		for (int i = 1; i > 0; i++) {
			

			preco = JOptionPane.showInputDialog("DIGITE O PREÇO DA MARCADORIA " + i + " : ");
			double precco = Double.parseDouble(preco);
			
			if (precco == 0) {
				break;
			}
			
			precoTotal = precoTotal + precco;
		}
		precoDado = JOptionPane.showInputDialog("DIGITE O PREÇO PAGO: ");
		double precoDaddo = Double.parseDouble(precoDado);
		
		troco = precoDaddo - precoTotal;
		JOptionPane.showMessageDialog(null, "TROCO: " + troco);
	}
}