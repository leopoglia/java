package Exercicios;

import javax.swing.JOptionPane;


public class Atividade06 {

	public static void main(String[] args) {
		
		
		String stringnumero = JOptionPane.showInputDialog("Digite um número para saber se ele é primo: ");
		int numero = (int) Double.parseDouble(stringnumero);


		if((numero % 2 != 0) && (numero % 3 != 0) && (numero % 5 != 0) && (numero % 7 != 0) && (numero % 11 != 0) && (numero % 13 != 0) || (numero == 2) || (numero == 3) || (numero == 5) || (numero == 7) || (numero == 11) || (numero == 13)) {
			JOptionPane.showMessageDialog(null, "O número é primo!");
		}else {
			JOptionPane.showMessageDialog(null, "O número não é primo!");
		}
	}

}
