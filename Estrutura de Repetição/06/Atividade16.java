package Exercicios;

import javax.swing.JOptionPane;

public class Atividade16 {

	public static void main(String[] args) {
		int voto, totalvoto = 0, porcNulo, porcBranco ,totalJose = 0, totalJoao = 0, totalLeonardo = 0, totalVytor = 0, totalNulo = 0, totalBranco = 0;
		JOptionPane.showMessageDialog(null, "1- Jose | 2- João | 3- Leonardo | 4- Vytor | 5- Nulo | 6- Em branco  ");

		do {
		String stringvoto = JOptionPane.showInputDialog("Digite em quem você deseja votar:");
		voto = (int) Double.parseDouble(stringvoto);
				
		if(voto == 1) {
			totalJose++;
			totalvoto++;
		}else if(voto == 2) {
			totalJoao++;
			totalvoto++;
		}else if(voto == 3) {
			totalLeonardo++;
			totalvoto++;
		}else if(voto == 4) {
			totalVytor++;
			totalvoto++;
		}else if(voto == 5) {
			totalNulo++;
			totalvoto++;
		}else if(voto == 6) {
			totalBranco++;
			totalvoto++;
		}else if(voto == 0) {
			JOptionPane.showMessageDialog(null, "VOTAÇÃO ENCERRADA");
		}else {
			JOptionPane.showMessageDialog(null, "ERRO");
		}
		}while(voto > 0);
		
		JOptionPane.showMessageDialog(null, "Total Jose: " + totalJose);
		JOptionPane.showMessageDialog(null, "Total João: " + totalJoao);
		JOptionPane.showMessageDialog(null, "Total Leonardo: " + totalLeonardo);
		JOptionPane.showMessageDialog(null, "Total Vytor: " + totalVytor);
		JOptionPane.showMessageDialog(null, "Total Nulo: " + totalNulo);
		JOptionPane.showMessageDialog(null, "Total Embranco: " + totalBranco);
		porcNulo = (totalNulo / totalvoto);
		porcBranco = (totalBranco / totalNulo);
		JOptionPane.showMessageDialog(null, "Porcentagem Nulo: " + porcNulo + "%");
		JOptionPane.showMessageDialog(null, "Porcentagem Nulo: " + porcBranco + "%");
	}
}