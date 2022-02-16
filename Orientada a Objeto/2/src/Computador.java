import java.util.Scanner;

public class Computador {
	
	String Processador;
	String RAM;
	String SSD;
	String PlacadeVideo;
	String SistemaOperacional;
	String Monitor;
	String Fonte;
	String PlacaMae;
	
	
	public Computador cadastro() {
		Computador computador = new Computador();
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o setup do seu PC: ");
		
		System.out.print("Processador: ");
		computador.Processador = sc.next();
		System.out.print("RAM: ");
		computador.RAM = sc.next();
		System.out.print("SSD: ");
		computador.SSD = sc.next();
		System.out.print("Placa de Vídeo: ");
		computador.PlacadeVideo = sc.next();
		System.out.print("Sistema Operacional: ");
		computador.SistemaOperacional = sc.next();
		System.out.print("Monitor: ");
		computador.Monitor = sc.next();
		System.out.print("Fonte: ");
		computador.Fonte = sc.next();
		System.out.print("Placa Mãe: ");
		computador.PlacaMae = sc.next();
		sc.close();
		return computador;
	}
	
	public void saida() {
		System.out.println("\nProcessador: " + this.Processador + "\nRAM: " + this.RAM + "\nSSD: " + this.SSD + "\nPlaca de Vídeo: " 
	    + this.PlacadeVideo + "\nSistema Operacional: " + this.SistemaOperacional + "\nMonitor:" + this.Monitor + "\nFonte: " +this.Fonte
	    + "Placa Mãe: " + this.PlacaMae);
	}
}