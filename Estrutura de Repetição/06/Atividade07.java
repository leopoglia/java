package Exercicios;

import javax.swing.JOptionPane;

public class Atividade07 {

	public static void main(String[] args) {

		String stringnumero = JOptionPane.showInputDialog("Digite até quantos números primos você deseja ");
		int numeromaximo = (int) Double.parseDouble(stringnumero);
		
		for(int i = 0; i < numeromaximo; i++) {
			if(i == 1) {
				
			}else if((i % 2 != 0) && (i % 3 != 0) && (i % 5 != 0) && (i % 7 != 0) && (i % 11 != 0) && (i % 13 != 0) || (i == 2) || (i == 3) || (i == 5) || (i == 7) || (i == 11) || (i == 13)) {
				JOptionPane.showMessageDialog(null, i);
			}
		}
	}
}