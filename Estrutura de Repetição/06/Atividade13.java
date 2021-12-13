package Exercicios;

import javax.swing.JOptionPane;

public class Atividade13 {

	public static void main(String[] args) {
		
		double juros = 0, valParcelas = 0, valJuros = 0;	
		int i;
		
		String stringdivida = JOptionPane.showInputDialog("Digite a sua divida");
		int divida = (int) Double.parseDouble(stringdivida);
		
		String stringparcelas = JOptionPane.showInputDialog("Digite a quantidade de parcelas");
		int parcelas = (int) Double.parseDouble(stringparcelas);
		
		for(i = 1; i <= parcelas; i++) {
			if(parcelas == 1) {
				juros = 0.0;
			}else if(parcelas == 3) {
				juros = 0.10;
			}else if(parcelas == 6) {
				juros = 0.15;
			}else if(parcelas == 9) {
				juros = 0.20;
			}else if(parcelas == 12) {
				juros = 0.25;
			}
			valParcelas = divida/parcelas;
			valJuros = divida * juros;
		}
		JOptionPane.showMessageDialog(null, "DIVIDA: " +divida);
		JOptionPane.showMessageDialog(null, "JUROS: "+ valJuros);
		JOptionPane.showMessageDialog(null, "PARCELAS: " +(i-1));
		JOptionPane.showMessageDialog(null, "VALOR  PARCELAS: " + valParcelas);
	}
}