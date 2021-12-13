package Exercicios;

import javax.swing.JOptionPane;

public class Atividade04 {

	public static void main(String[] args) {		
		String numero = JOptionPane.showInputDialog("DIGITE O NÚMERO: ");
		int nummero = (int) Double.parseDouble(numero);
	
		for(int i = (nummero - 1); i  >= 1 ; i --) {
			nummero = nummero * i;
		}
		JOptionPane.showMessageDialog(null, nummero);
	}
}