import java.util.ArrayList;
import java.util.Scanner;

public class Funcionario extends Pessoa{
	
	ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

	private double salario;
	private int matricula;
	private String setor, cargo;

	public void trabalho() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Funcionario pessoa = new Funcionario();
		
		pessoa.cadastro();

		System.out.print("Setor: ");
		pessoa.setSetor(sc.next());
		
		System.out.print("Cargo: ");
		pessoa.setCargo(sc.next());

		System.out.println("Matricula: ");
		pessoa.setMatricula(sc.nextInt());

		System.out.print("Salário: ");
		pessoa.setSalario(sc.nextDouble());
		
		funcionarios.add(pessoa);
	}
	
	public double pagamento() {
		return this.getSalario();
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}