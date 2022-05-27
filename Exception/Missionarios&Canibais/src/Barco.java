
public class Barco {

		private int posicao, vaga1, vaga2;
		
		static Barco B = new Barco(2, 0, 0);


		public int getPosicao() {
			return posicao;
		}

		public void setPosicao(int posicao) {
			this.posicao = posicao;
		}

		public int getVaga1() {
			return vaga1;
		}

		public void setVaga1(int vaga1) {
			this.vaga1 = vaga1;
		}

		public int getVaga2() {
			return vaga2;
		}

		public void setVaga2(int vaga2) {
			this.vaga2 = vaga2;
		}

		public Barco(int posicao, int vaga1, int vaga2) {
			super();
			this.posicao = posicao;
			this.vaga1 = vaga1;
			this.vaga2 = vaga2;
		}

		public Barco() {
			super();
		}
}