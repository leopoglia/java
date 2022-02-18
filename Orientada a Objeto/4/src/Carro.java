import java.util.ArrayList;
import java.util.Scanner;

public class Carro {

	static ArrayList<Carro> carros = new ArrayList<Carro>();

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

	public static Carro cadastro() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Carro carro = new Carro();
		System.out.println("\nPreencha as informações abaixo com suas características.");
		System.out.print("Marca: ");
		carro.marca = sc.next();
		System.out.print("Modelo: ");
		carro.modelo = sc.next();
		System.out.print("Ano: ");
		carro.ano = sc.nextInt();
		System.out.print("Aro: ");
		carro.aro = sc.nextInt();
		System.out.print("Cor: ");
		carro.cor = sc.next();
		System.out.print("Placas: ");
		carro.placa = sc.nextInt();
		System.out.print("Portas: ");
		carro.portas = sc.nextInt();
		System.out.print("Preço");
		carro.preco = sc.nextDouble();
		System.out.print("Quilometragem: ");
		carro.km = sc.nextDouble();
		System.out.print("Motor: ");
		carro.motor = sc.nextInt();
		Carro.carros.add(carro);

		return carro;
	}

	public void saida() {
		System.out.println( "Marca: " + this.marca + "\nModelo: " + this.modelo + "\nAno: " + this.ano + "\nAro: "
				+ this.aro + "\nCor: " + this.cor + "\nPlaca: " + this.placa + "\nPortas: " + this.portas + "\nPreço: "
				+ this.preco + "\nQuilometragem: " + this.km + "\nMotor: " + this.motor);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAro() {
		return aro;
	}

	public void setAro(int aro) {
		this.aro = aro;
	}

	public int getPlaca() {
		return placa;
	}

	public void setPlaca(int placa) {
		this.placa = placa;
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		this.motor = motor;
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
