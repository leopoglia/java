import java.util.Scanner;

public class Motor {

	String Tipo;
	String Modelo;
	int Potencia;
	int Tensao;
	int Carcaca;
	int Polos;
	String Isolamento;
	int Protecao;
	String Construcao;
	String Mancal;
	String Rotor;
	
	public Motor cadastro() {
		Scanner sc = new Scanner(System.in);
		Motor motor = new Motor();
		
		System.out.println("Espesificações do Motor: ");
		System.out.print("Tipo de Motor: ");
		motor.Tipo = sc.next();
		System.out.print("Modelo: ");
		motor.Modelo = sc.next();
		System.out.print("Potência: ");
		motor.Potencia = sc.nextInt();
		System.out.print("Tensão: ");
		motor.Tensao = sc.nextInt();
		System.out.print("Carcaca: ");
		motor.Carcaca = sc.nextInt();
		System.out.print("Polos: ");
		motor.Polos = sc.nextInt();
		System.out.print("Isolamento: ");
		motor.Isolamento = sc.next();
		System.out.print("Proteção: ");
		motor.Protecao = sc.nextInt();
		System.out.print("Contrução: ");
		motor.Construcao = sc.next();
		System.out.print("Mancal: ");
		motor.Mancal = sc.next();
		System.out.print("Rotor: ");
		motor.Rotor = sc.next();
		
		sc.close();
		return motor;
	}
	
	public void saida() {
		System.out.println("\nTipo de de Motor: " +this.Tipo + "\nModelo: " +this.Modelo+ "\nPotência: " +this.Potencia+ "\nTensão: " + this.Tensao+
				"\nCarcaca: " + this.Carcaca+ "\nPolos: "+ this.Polos + "\nIsolamento: " +this.Isolamento+ "\nProteção: " +this.Protecao+
				"\nContrução: " + this.Construcao + "\nMancal: " + this.Mancal + "\nRotor: " + this.Rotor);
	}
}
