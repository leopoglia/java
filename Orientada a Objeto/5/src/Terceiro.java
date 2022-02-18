import java.util.ArrayList;
import java.util.Scanner;

public class Terceiro extends Pessoa {

	ArrayList<Terceiro> terceiros = new ArrayList<Terceiro>();

	String empresa, setor;
	int matricula, tempo;
	double valorHora, pagamento;

	public void trabalho() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Terceiro pessoa = new Terceiro();

		System.out.println("Qual o departamento solicitante? ");
		pessoa.setSetor(sc.next());

		System.out.println("Qual o valor por hora defenido no contrato? ");
		pessoa.setValorHora(sc.nextDouble());

		System.out.println("Quanto tempo previsto de serviço (em dias)?");
		pessoa.setTempo(sc.nextInt());

		System.out.println("Com realação ao FUNCIONÁRIO TERCEIRO, insira as informações abaixo: ");
		
		pessoa.cadastro();

		System.out.print("Empresa: ");
		pessoa.setEmpresa(sc.next());

		System.out.println("Matricula: ");
		pessoa.setMatricula(sc.nextInt());

		terceiros.add(pessoa);
	}
	
	public double pagamento(int posicao) {
		terceiros.get(posicao).setPagamento( valorHora / 2 * 8 * tempo);
		return pagamento;
	}

	public double getPagamento() {
		return pagamento;
	}

	public void setPagamento(double pagamento) {
		this.pagamento = pagamento;
	}
	
	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
}