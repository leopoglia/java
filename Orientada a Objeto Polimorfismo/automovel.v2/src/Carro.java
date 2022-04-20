public class Carro extends Automovel {
	
	int portas;
	int cavalos;
	String estilo;
	
	public Carro() {
		super();
	}
	
	@Override
	public void excluir(int cod) {	
		if (cod != -1) {
			Main.listaAutomovel.remove(cod);
			System.out.println("CARRO REMOVIDO COM SUCESSO!\n");
		} else {
			System.out.println("ESSA PLACA NÃO EXISTE!\n");
		}
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
			System.out.println("CARRO VENDIDO!!!");
		}		
	}
	
	public void listar(int opcao) {	
	}

	public Carro(String modelo, String placa, int ano, int portas, int cavalos, String estilo, double preco) {
		super(modelo, placa, ano, preco);
		this.portas = portas;
		this.cavalos = cavalos;
		this.estilo = estilo;
	}
	
	@Override
	public String toString() {
		return super.toString() + "PORTAS: " + portas + "\nCAVALOS: " + cavalos + "\nESTILO: " + estilo;
	}
	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}
	public int getCavalos() {
		return cavalos;
	}
	public void setCavalos(int cavalos) {
		this.cavalos = cavalos;
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
}