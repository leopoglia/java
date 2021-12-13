package Exercicios;

import javax.swing.JOptionPane;

public class Atividade12 {

	public static void main(String[] args) {
		
		int maiorAcidentes = 0, menorAcidentes = 9999999, codigoMenor = 0, codigoMaior = 0,  i = 0, totalveiculos=0, mediaveiculos = 0, acidentesmenor2000 = 0, totalacidentesmenor2000 = 0; 
		int mediaacidentesmenor2000;
		
		do {
			i++;
			String stringcodigo = JOptionPane.showInputDialog("Digite o código da cidade");
			int codigo = (int) Double.parseDouble(stringcodigo);
		
			String stringveiculos = JOptionPane.showInputDialog("Digite o número de veículos passeios (em 1999)");
			int veiculos = (int) Double.parseDouble(stringveiculos);
		
			String stringacidentes = JOptionPane.showInputDialog("Digite o número de acidentes (em 1999)");
			int acidentes = (int) Double.parseDouble(stringacidentes);
			
			totalveiculos = totalveiculos + veiculos;
			
			if(acidentes < menorAcidentes) {
				menorAcidentes = acidentes;
				codigoMenor = codigo;
			}
			
			if(acidentes > maiorAcidentes) {
				maiorAcidentes = acidentes;
				codigoMaior = codigo;
			}
			
			if(veiculos < 2000) {
				acidentesmenor2000++;
				totalacidentesmenor2000 = totalacidentesmenor2000 + acidentes;
			}
		}while(i < 5);
		
		mediaveiculos = totalveiculos/i;
		mediaacidentesmenor2000 = totalacidentesmenor2000 / acidentesmenor2000;
		
		JOptionPane.showMessageDialog(null, "Cidade com maior quantidade de acidentes: " +codigoMaior+ " Quantidade: " +maiorAcidentes);
		JOptionPane.showMessageDialog(null, "Cidade com menor quantidade de acidentes: " +codigoMenor+ " Quantidade: " +menorAcidentes);
		JOptionPane.showMessageDialog(null, "Média de veículos: " +mediaveiculos);
		JOptionPane.showMessageDialog(null, "Média de acidentes em cidade com menor de 2000 carros: " +mediaacidentesmenor2000);




		
	}

}
