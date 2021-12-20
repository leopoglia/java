
public class Atividade06 {

	public static void main(String[] args) {
		procurarPerfeitos();
	}

	static void procurarPerfeitos() {
		double divisivel, perfeito, soma = 0;
		for (int ii = 1; ii < 500; ii++) {
			soma = 0;
			for (int i = 1; i < ii; i++) {
				divisivel = i % ii;
				perfeito = ii % i;
				if (perfeito == 0) {
					soma = soma + divisivel;
					if (soma == ii) {
						System.out.println(soma);
					}
				}
			}
		}

	}
}
