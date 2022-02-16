import java.util.Scanner;

public class Carro {

	String marca;

	String cor;
	String modelo;
	int aro;
	int placa;
	int motor;
	int portas;
	int ano;
	double km;
	double preco;

	public Carro cadastro() {
		Scanner sc = new Scanner(System.in);
		Carro carro = new Carro();
		System.out.println("\nPreencha as informações abaixo com suas características.");
		System.out.println("Marca: ");
		carro.marca = sc.next();
		System.out.println("Modelo: ");
		carro.modelo = sc.next();
		System.out.println("Ano: ");
		carro.ano = sc.nextInt();
		System.out.println("Aro: ");
		carro.aro = sc.nextInt();
		System.out.println("Cor: ");
		carro.cor = sc.next();
		System.out.println("Portas: ");
		carro.portas = sc.nextInt();
		System.out.println("Placas: ");
		carro.placa = sc.nextInt();
		System.out.println("Preço");
		carro.preco = sc.nextDouble();
		System.out.println("Motor: ");
		carro.preco = sc.nextDouble();
		System.out.println("Quilometragem: ");
		carro.km = sc.nextDouble();
		sc.close();
		return carro;
	}

	public void saida() {
		System.out.println("Marca: " + this.marca + "\nModelo: " + this.modelo + "\nAno: " + this.ano + "\nAro: "
				+ this.aro + "\nCor: " + this.cor + "\nPlaca: " + this.placa + "\nPortas: " + this.portas + "\nPreço: "
				+ this.preco + "\nQuilometragem: " + this.km + "\nMotor: " + this.motor);
	}
}
