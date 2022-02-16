
public class Pessoa {

	String nome;
	String genero;
	String corCabelo;
	String corOlho;
	int idade;
	int cpf;
	double altura;
	double peso;

	public void saida() {
		System.out.println("Nome: " + this.nome + "\nIdade: " + this.idade + "\nGenero:" + this.genero + "\nAltura: "
				+ this.altura + "\nPeso: " + this.peso + "\nCPF: " + this.cpf + "\nCor do Cabelo: " + this.corCabelo
				+ "\nCor do Olho: " + this.corOlho);
	}

}
