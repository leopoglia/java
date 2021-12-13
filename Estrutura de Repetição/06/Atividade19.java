package Exercicios;

import javax.swing.JOptionPane;

public class Atividade19 {

	public static void main(String[] args) {
		double notas[] = new double[7], melhorNota = 0, piorNota = 11, mediaNotas = 0;
		int vezes = 0;

		String pergunta = JOptionPane.showInputDialog("Quantos atletas participarão?");
		int resultado = (int) Double.parseDouble(pergunta);
		String nome[] = new String[resultado];

		do {
			melhorNota = 0; piorNota = 11; mediaNotas = 0; vezes++; int i = 0;
			nome[i] = JOptionPane.showInputDialog("Digite o seu nome:");

			for (i = 0; i < 7; i++) {
				String notasString = JOptionPane.showInputDialog("Qual a " + (i + 1) + "ª nota:");
				notas[i] = Double.parseDouble(notasString);
				if (notas[i] > melhorNota) {
					melhorNota = notas[i];
				}
				if (notas[i] < piorNota) {
					piorNota = notas[i];
				}
				mediaNotas = mediaNotas + notas[i];
			}
			mediaNotas = ((mediaNotas - melhorNota) - piorNota) / 5;

			JOptionPane.showMessageDialog(null, "Nome do candidato: " +nome[0] + " Melhor nota: " + melhorNota + " Pior nota: " + piorNota
					+ " Média: " + mediaNotas);

		} while (vezes < resultado);
	}
}