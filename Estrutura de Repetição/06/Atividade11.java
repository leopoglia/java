package Exercicios;

import javax.swing.JOptionPane;

public class Atividade11 {

	public static void main(String[] args) {
		int i=1, maisbaixo = 99999, maisalto = 0, numeromaisbaixo = 0, numeromaisalto = 0;
		
		do {
			i++;
			
			String stringnumero = JOptionPane.showInputDialog("Digite o seu número");
			int numero = (int) Double.parseDouble(stringnumero);
			
			String stringaltura = JOptionPane.showInputDialog("Digite a sua altura em cm");
			int altura = (int) Double.parseDouble(stringaltura);
			
			if(altura < maisbaixo) {
				maisbaixo = altura;
				numeromaisbaixo = numero;
			}
			
			if(altura > maisalto) {
				maisalto = altura;
				numeromaisalto = numero;
			}
			
		}while(i <= 10);
		
		JOptionPane.showMessageDialog(null, "Mais alto: Nº" + numeromaisalto + " Altura: " + maisalto);
		JOptionPane.showMessageDialog(null, "Mais baixo: Nº" + numeromaisbaixo + " Altura: " + maisbaixo);


	}

}
