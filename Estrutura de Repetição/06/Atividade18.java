package Exercicios;

import javax.swing.JOptionPane;

public class Atividade18 {

	public static void main(String[] args) {
		double saltos[] = new double[5], melhorSalto = 0, piorSalto = 99, mediaSaltos = 0;
		int vezes = 0;

		String pergunta = JOptionPane.showInputDialog("Quantos atletas participarão?");
		int resultado = (int) Double.parseDouble(pergunta);
		String nome[] = new String[resultado];

		do {
			melhorSalto = 0; piorSalto = 99; mediaSaltos = 0; vezes++; int i = 0;
			nome[i] = JOptionPane.showInputDialog("Digite o seu nome:");

			for (i = 0; i < 5; i++) {
				String saltosString = JOptionPane.showInputDialog("Qual o seu " + (i + 1) + "º salto:");
				saltos[i] = Double.parseDouble(saltosString);
				if (saltos[i] > melhorSalto) {
					melhorSalto = saltos[i];
				}
				if (saltos[i] < piorSalto) {
					piorSalto = saltos[i];
				}
				mediaSaltos = mediaSaltos + saltos[i];
			}
			mediaSaltos = ((mediaSaltos - melhorSalto) - piorSalto) / 3;

			JOptionPane.showMessageDialog(null, nome[0] + " Melhor salto: " + melhorSalto + " Pior Salto : " + piorSalto
					+ " Resultado Final: " + mediaSaltos);

		} while (vezes < resultado);
	}
}