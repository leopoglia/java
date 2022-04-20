public class Moto extends Automovel {
	
	String tipo;
	double suspensao;
	String tamanho;
	
	public Moto() {
		super();
	}
	
	@Override
	public void excluir(int cod) {	
		if (cod != -1) {
			Main.listaAutomovel.remove(cod);
			System.out.println("MOTO REMOVIDA COM SUCESSO!\n");
		} else {
			System.out.println("ESSA PLACA NÃO EXISTE!\n");
		}
	}
	
	public void listar(int opcao) {	
	}
	
	@Override
	public void vender(int donoNovo, int funcionario, int cod) {
		if (cod != -1) {
			Funcionario funcionario1 = new Funcionario(null, null, null, null, 0, funcionario, 0, 0);
			funcionario1.mudarSalario(Main.listaAutomovel.get(cod).getPreco());
			double salario = ((Funcionario) Main.listaPessoa.get(funcionario)).getSalario();
			((Funcionario) Main.listaPessoa.get(funcionario)).setSalario((salario + funcionario1.getSalario()));
			Main.listaAutomovelvendido.add(Main.listaAutomovel.get(cod));
			Main.listaAutomovel.remove(cod);
			Main.listaAutomovelvendido.get(cod).setDono(Main.listaPessoa.get(donoNovo).getNome());
			System.out.println("MOTO VENDIDO!!!");
		}		
	}


	public Moto(String modelo, String placa, int ano, double preco) {
		super(modelo, placa, ano, preco);
	}

	public Moto(String modelo, String placa, int ano, String tipo, double suspensao, String tamanho, double preco) {
		super(modelo, placa, ano, preco);
		this.tipo = tipo;
		this.suspensao = suspensao;
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		return super.toString() + "TIPO: " + tipo + "\nSUSPENSÃO: " + suspensao + "\nTAMANHO: " + tamanho;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSuspensao() {
		return suspensao;
	}
	public void setSuspensao(double suspensao) {
		this.suspensao = suspensao;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}	
}