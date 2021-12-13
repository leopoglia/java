package Exercicios;

public class Atividade05 {

	public static void main(String[] args) {
		
		int ano = 0;
		double  populacaoA = 90000000, populacaoB = 200000000;
;
		
		while(populacaoA < populacaoB) {
			ano++;
			populacaoA = (populacaoA+(populacaoA*0.03));
			populacaoB = (populacaoB+(populacaoB*0.015));
			
		}
		System.out.println("Quantidade de anos: " + ano);
	}
}