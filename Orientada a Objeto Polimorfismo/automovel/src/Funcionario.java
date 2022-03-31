
public class Funcionario extends Pessoa {
	    int senha;

		public Funcionario(String nome, String cpf, String telefone, String genero, int idade, int matricula,
				int senha) {
			super(nome, cpf, telefone, genero, idade, matricula);
			this.senha = senha;
		}

		@Override
		public String toString() {
			return super.toString() + "Funcionario [senha=" + senha + "]";
		}

		public int getSenha() {
			return senha;
		}

		public void setSenha(int senha) {
			this.senha = senha;
		}
}