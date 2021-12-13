package Exercicios;

import javax.swing.JOptionPane;

public class Atividade05 {

	public static void main(String[] args) {
		
		double temp = 0, maiortemp=-99999, menortemp= 99999, totaltemp = 0, mediatemp = 0, i=0;
		
		do {
			String temperatura = JOptionPane.showInputDialog("Digite a temperatura: ");
			temp = (double) Double.parseDouble(temperatura);
			
			if(temp == 666) {
				break;
			}
			
			if(temp > maiortemp) {
				maiortemp = temp;
			}
			
			if(temp < menortemp) {
				menortemp = temp;
			}
			
			totaltemp = totaltemp + temp;
			
			i++;
			
			

		}while(temp != 666);
		
		mediatemp = totaltemp / i;
		
		JOptionPane.showMessageDialog(null, "Menor temperatura:" + menortemp);
		JOptionPane.showMessageDialog(null, "Maior temperatura:" + maiortemp);
		JOptionPane.showMessageDialog(null, "Média da temperatura:" + mediatemp);



	}

}
