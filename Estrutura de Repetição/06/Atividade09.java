package Exercicios;

import javax.swing.JOptionPane;

public class Atividade09 {

	public static void main(String[] args) {
		
		int codigo, altura, maisalto = 0, maisbaixo = 9999, totalaltura = 0, mediaaltura, codigomaisalto = 0, codigomaisbaixo = 0, pessoas = 0;
		double peso, maisgordo = 0, maismagro = 9999, totalpeso = 0, codigomaismagro = 0, codigomaisgordo = 0, mediapeso;
		do {

		String stringcodigo = JOptionPane.showInputDialog("Digite o seu código");
		codigo = (int) Double.parseDouble(stringcodigo);
		
		if(codigo == 0) {
			break;
		}
		
		pessoas ++;
		
		String stringaltura = JOptionPane.showInputDialog("Digite a sua altura em cm");
		altura = (int) Double.parseDouble(stringaltura);
		
		
		String stringpeso = JOptionPane.showInputDialog("Digite o seu peso");
		peso = Double.parseDouble(stringpeso);
		
		if(altura > maisalto) {
			maisalto = altura;
			codigomaisalto = codigo;
		}
		
		if(altura < maisbaixo) {
			maisbaixo = altura;
			codigomaisbaixo = codigo;

		}
		
		if(peso > maisgordo) {
			maisgordo = peso;
			codigomaisgordo = codigo;
		}
		
		if(peso < maismagro) {
			maismagro = peso;
			codigomaismagro = codigo;
		}
		
		totalpeso = totalpeso + peso;
		totalaltura = totalaltura + altura;
		
		}while(codigo != 0);
		
		mediaaltura = totalaltura / pessoas;
		mediapeso = totalpeso / pessoas;
		
		JOptionPane.showMessageDialog(null, "Pessoa mais alta: " +codigomaisalto+ " Altura: " +maisalto);
		JOptionPane.showMessageDialog(null, "Pessoa mais baixa: " +codigomaisbaixo+ " Altura: " +maisbaixo);
		JOptionPane.showMessageDialog(null, "Pessoa mais gorda: " +codigomaisgordo+ " Peso: " +maisgordo);
		JOptionPane.showMessageDialog(null, "Pessoa mais magra: " +codigomaismagro+ " Peso: " +maismagro);
		JOptionPane.showMessageDialog(null, "Média altura: " +mediaaltura);
		JOptionPane.showMessageDialog(null, "Média peso: " +mediapeso);

	}

}
