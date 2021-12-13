package Exercicios;

import javax.swing.JOptionPane;

public class Atividade17 {

	public static void main(String[] args) {
		String questoes[] = new String[10];
		int desicao = 0, pontos = 0, maiorAcerto=0, menorAcerto=11, totalNotas = 0, alunos = 0, mediaTurma;
		String resultado[] = {"A", "B", "C", "D", "E", "E", "D", "C", "B", "A"};

		
		do {
		pontos = 0;
		alunos++;
		for(int i = 0; i < 10; i++) {
		questoes[i]	 = JOptionPane.showInputDialog("Digite a sua " + (i + 1) + "ª nota: ");
			if(questoes[i].equals(resultado[i])) {
				pontos++;
			}
		}
		
		if(pontos > maiorAcerto) {
			maiorAcerto = pontos;
		}
		
		if(pontos < menorAcerto) {
			menorAcerto = pontos;
		}
		
		totalNotas = totalNotas + pontos;
			
		String stringdesicao = JOptionPane.showInputDialog("Você deseja inserir mais um usuário? (1) Sim (0) Não");
		desicao = (int) Double.parseDouble(stringdesicao);
		
		}while(desicao != 0);
		
		mediaTurma = totalNotas / alunos;
		
		JOptionPane.showMessageDialog(null, "Maior ponto: " +maiorAcerto+ " Menor ponto: " +menorAcerto+ " Média Turma: " +mediaTurma);

	}
}