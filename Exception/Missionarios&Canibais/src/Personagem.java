
public class Personagem {

	private int posicao;
	
		static int M1P1 = 0, M2P1 = 0, M3P1 = 0, C1P1 = 0, C2P1 = 0, C3P1 = 0, M1P2 = 0, M2P2 = 0, M3P2 = 0, C1P2 = 0, C2P2 = 0, C3P2 = 0;
	
		static Missionario M1 = new Missionario(3);
		static Missionario M2 = new Missionario(3);
		static Missionario M3 = new Missionario(3);
		static Missionario C1 = new Missionario(3);
		static Missionario C2 = new Missionario(3);
		static Missionario C3 = new Missionario(3);
	
	public Personagem(int posicao) {
		super();
		this.posicao = posicao;
	}

	public Personagem() {
		super();
	}

	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}

	public static void posicao() {
		if(Missionario.M1.getPosicao() == 1) {
			M1P1 = 1;
		}else {
			M1P1 = 0;
		}
		
		if(Missionario.M2.getPosicao() == 1) {
			M2P1 = 2;
		}else {
			M2P1 = 0;
		}
		
		if(Missionario.M3.getPosicao() == 1) {
			M3P1 = 3;
		}else {
			M2P1 = 0;
		}
		
		if(Canibal.C1.getPosicao() == 1) {
			C1P1 = 4;
		}else {
			C1P1 = 0;
		}
		
		if(Canibal.C2.getPosicao() == 1) {
			C2P1 = 5;
		}else {
			C2P1 = 0;
		}
		
		if(Canibal.C3.getPosicao() == 1) {
			C3P1 = 6;
		}else {
			C3P1 = 0;
		}
				
		if(Missionario.M1.getPosicao() == 3) {
			M1P2 = 1;
		}else {
			M1P2 = 0;
		}
		
		if(Missionario.M2.getPosicao() == 3) {
			M2P2 = 2;
		}else {
			M2P2 = 0;
		}
		
		if(Missionario.M3.getPosicao() == 3) {
			M3P2 = 3;
		}else {
			M2P2 = 0;
		}
		
		if(Canibal.C1.getPosicao() == 3) {
			C1P2 = 4;
		}else {
			C1P2 = 0;
		}
		
		if(Canibal.C2.getPosicao() == 3) {
			C2P2 = 5;
		}else {
			C2P2 = 0;
		}
		
		if(Canibal.C3.getPosicao() == 3) {
			C3P2 = 6;
		}else {
			C3P2 = 0;
		}
		
	}
	
	public static void setarPosicao1(int posicao) {
		if(posicao == 1) {
			M1.setPosicao(1);
		}
		if(posicao == 2) {
			M2.setPosicao(1);
		}
		if(posicao == 3) {
			M3.setPosicao(1);
		}
		if(posicao == 4) {
			C1.setPosicao(1);
		}
		if(posicao == 5) {
			C2.setPosicao(1);
		}
		if(posicao == 6) {
			C3.setPosicao(1);
		}
	}

	public static void setarPosicao2(int posicao) {
		if(posicao == 1) {
			M1.setPosicao(2);
		}
		if(posicao == 2) {
			M2.setPosicao(2);
		}
		if(posicao == 3) {
			M3.setPosicao(2);
		}
		if(posicao == 4) {
			C1.setPosicao(2);
		}
		if(posicao == 5) {
			C2.setPosicao(2);
		}
		if(posicao == 6) {
			C3.setPosicao(2);
		}
	}
	
	public static void setarPosicao3(int posicao) {
		if(posicao == 1) {
			M1.setPosicao(3);
		}
		if(posicao == 2) {
			M2.setPosicao(3);
		}
		if(posicao == 3) {
			M3.setPosicao(3);
		}
		if(posicao == 4) {
			C1.setPosicao(3);
		}
		if(posicao == 5) {
			C2.setPosicao(3);
		}
		if(posicao == 6) {
			C3.setPosicao(3);
		}
	}
	
	
	public static int verificarPosicaoP1(int posicao) {
		if(posicao == M1P1) {
			return posicao;
		}
		if(posicao == M2P1) {
			return posicao;
		}
		if(posicao == M3P1) {
			return posicao;
		}
		if(posicao == C1P1) {
			return posicao;
		}
		if(posicao == C2P1) {
			return posicao;
		}
		if(posicao == C2P1) {
			return posicao;
		}
		return -1;
	}
	
	public static int verificarPosicaoP2(int posicao) {
		if(posicao == M1P2) {
			return posicao;
		}
		if(posicao == M2P2) {
			return posicao;
		}
		if(posicao == M3P2) {
			return posicao;
		}
		if(posicao == C1P2) {
			return posicao;
		}
		if(posicao == C2P2) {
			return posicao;
		}
		if(posicao == C2P2) {
			return posicao;
		}
		return -1;
	}

}