package Exercicios;

import javax.swing.JOptionPane;

public class Atividade10 {

	public static void main(String[] args) {
		
		String stringsalario = JOptionPane.showInputDialog("Digite o salario inicial");
		double salario = Double.parseDouble(stringsalario);
		double aumentoSalario = salario * 0.015;
		
		for(int i = 1997; i <= 2021; i++) {
			salario = salario + aumentoSalario;
			aumentoSalario = aumentoSalario * 2;
			JOptionPane.showMessageDialog(null, "Ano: " + i + " Salario: " + salario);
		}
	}
}