package Exercicios;

import javax.swing.JOptionPane;

public class Atividade14 {

	public static void main(String[] args) {
		int numero, de0a25 = 0, de26a50 = 0, de51a75 = 0, de76a100 = 0;
		
		do {
		String stringnumero = JOptionPane.showInputDialog("Digite um número: ");
		numero = (int) Double.parseDouble(stringnumero);
		
		if(numero >= 0 && numero <=25) {
			de0a25++;
		}else if(numero >= 26 && numero <=50) {
			de26a50++;
		}else if(numero >= 51 && numero <=75) {
			de51a75++;
		}else if(numero >= 76 && numero <=100) {
			de76a100++;
		}
		}while(numero > 0);
		
		JOptionPane.showMessageDialog(null, "DE 0 A 25: " +de0a25);
		JOptionPane.showMessageDialog(null, "DE 26 A 50: " +de26a50);
		JOptionPane.showMessageDialog(null, "DE 51 A 75: " +de51a75);
		JOptionPane.showMessageDialog(null, "DE 76 A 100: " +de76a100);
	}
}