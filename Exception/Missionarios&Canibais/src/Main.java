import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("=========Missionários e Canibais=========");
		System.out.println("Considere M - Missionários e C - Canibais");
		System.out.print("Deseja iniciar o jogo? (1) SIM (2) NÃO\n> ");
		int opcao = sc.nextInt();
		barco2();

		switch (opcao) {
		case 1:
			C2();
			break;
		case 2:
			System.exit(0);
			break;
		}
	}

	public static void barco1() {
		Personagem.posicao();
		System.out.println("=========================================");
		System.out.println("    M - " + Personagem.M1P1 + "  |              |  M - " + Personagem.M1P2);
		System.out.println("    M - " + Personagem.M2P1 + "  |              |  M - " + Personagem.M2P2);
		System.out.println("    M - " + Personagem.M3P1 + "  |              |  M - " + Personagem.M3P2);
		System.out.println("    C - " + Personagem.C1P1 + "  |              |  C - " + Personagem.C1P2);
		System.out.println("    C - " + Personagem.C2P1 + "  |              |  C - " + Personagem.C2P2);
		System.out.println("    C - " + Personagem.C3P1 + "  |  " + Barco.B.getVaga1() + "___" + Barco.B.getVaga2()
				+ "       |  C - " + Personagem.C3P2);
		System.out.println("=========================================");
	}

	public static void barco2() {
		Personagem.posicao();
		System.out.println("=========================================");
		System.out.println("    M - " + Personagem.M1P1 + "  |              |  M - " + Personagem.M1P2);
		System.out.println("    M - " + Personagem.M2P1 + "  |              |  M - " + Personagem.M2P2);
		System.out.println("    M - " + Personagem.M3P1 + "  |              |  M - " + Personagem.M3P2);
		System.out.println("    C - " + Personagem.C1P1 + "  |              |  C - " + Personagem.C1P2);
		System.out.println("    C - " + Personagem.C2P1 + "  |              |  C - " + Personagem.C2P2);
		System.out.println("    C - " + Personagem.C3P1 + "  |       " + Barco.B.getVaga1() + "___" + Barco.B.getVaga2()
				+ "  |  C - " + Personagem.C3P2);
		System.out.println("=========================================");
	}

	private static void C1() {
		escolherPersonagemC1P1();
		Personagem.posicao();
		moverC1();
		escolherPersonagemC1P2();
		tirarPersonagemC1();
		barco1();
		C1();
	}

	private static void escolherPersonagemC1P1() {
		if (Barco.B.getVaga1() == 0) {
			int posicao1, verificacao;
			do {
				System.out.println("Escolha o personagem para colocar na 1º posição do barco: ");
				posicao1 = sc.nextInt();

				verificacao = Personagem.verificarPosicaoP1(posicao1);

			} while ((posicao1 < 1 || posicao1 > 6) || verificacao == -1);

			Personagem.setarPosicao2(posicao1);
			Barco.B.setVaga1(posicao1);
		}
	}

	private static void moverC1() {
		System.out.println("Mover o barco para o outro lado? (1) Sim (2) Não");
		int mover = sc.nextInt();

		if (mover == 1) {
			barco2();
			C2();
		}
	}

	private static void escolherPersonagemC1P2() {
		if (Barco.B.getVaga2() == 0) {
			if (Personagem.M1P1 == 0 && Personagem.M2P1 == 0 && Personagem.M2P1 == 0 && Personagem.C1P1 == 0
					&& Personagem.C2P1 == 0 && Personagem.C3P1 == 0) {
				System.out.println("sem pessoas");
			} else {
				int posicao2, verificacao;
				do {
					System.out.println("Escolha o personagem para colocar na 2º posição do barco: ");
					posicao2 = sc.nextInt();

					verificacao = Personagem.verificarPosicaoP1(posicao2);
				} while ((posicao2 < 1 || posicao2 > 6) || verificacao == -1);

				Personagem.setarPosicao2(posicao2);
				Barco.B.setVaga2(posicao2);
			}
		}
	}

	private static void tirarPersonagemC1() {
		if (Barco.B.getVaga1() != 0) {
			System.out.println("Tirar o personagem da 1ª posição do barco? (1) Sim (2) Não");
			int tirarPosicao1 = sc.nextInt();

			if (tirarPosicao1 == 1) {
				Personagem.setarPosicao1(Barco.B.getVaga1());
				Barco.B.setVaga1(0);
			}

		}

		if (Barco.B.getVaga2() != 0) {
			System.out.println("Tirar o personagem da 2ª posição do barco? (1) Sim (2) Não");
			int tirarPosicao2 = sc.nextInt();

			if (tirarPosicao2 == 1) {
				Personagem.setarPosicao1(Barco.B.getVaga2());
				Barco.B.setVaga1(0);
			}
		}
	}

	private static void C2() {
		escolherPersonagemC2P1();
		Personagem.posicao();
		moverC2();
		escolherPersonagemC2P2();
		tirarPersonagemC2();
		barco2();
		C2();
	}

	public static void escolherPersonagemC2P1() {
		if (Barco.B.getVaga1() == 0) {
			int posicao1, verificacao;
			do {
				System.out.println("Escolha o personagem para colocar na 1º posição do barco: ");
				posicao1 = sc.nextInt();

				verificacao = Personagem.verificarPosicaoP2(posicao1);

			} while ((posicao1 < 1 || posicao1 > 6) || verificacao == -1);

			Personagem.setarPosicao2(posicao1);
			Barco.B.setVaga1(posicao1);
		}
	}

	public static void moverC2() {
		System.out.println("Mover o barco para o outro lado? (1) Sim (2) Não");
		int mover = sc.nextInt();

		if (mover == 1) {
			barco1();
			C1();
		}
	}

	public static void escolherPersonagemC2P2() {
		if (Barco.B.getVaga2() == 0) {
			if (Personagem.M1P2 == 0 && Personagem.M2P2 == 0 && Personagem.M2P2 == 0 && Personagem.C1P2 == 0
					&& Personagem.C2P2 == 0 && Personagem.C3P2 == 0) {
				System.out.println("sem pessoas");
			} else {
				int posicao2, verificacao;
				do {
					System.out.println("Escolha o personagem para colocar na 2º posição do barco: ");
					posicao2 = sc.nextInt();
					verificacao = Personagem.verificarPosicaoP2(posicao2);
				} while ((posicao2 < 1 || posicao2 > 6) || verificacao == -1);
				Personagem.setarPosicao2(posicao2);
				Barco.B.setVaga2(posicao2);
			}
		}
	}

	public static void tirarPersonagemC2() {
		if (Barco.B.getVaga1() != 0) {
			System.out.println("Tirar o personagem da 1ª posição do barco? (1) Sim (2) Não");
			int tirarPosicao1 = sc.nextInt();

			if (tirarPosicao1 == 1) {
				Personagem.setarPosicao3(Barco.B.getVaga1());
				Barco.B.setVaga1(0);
			}
		}

		if (Barco.B.getVaga2() != 0) {
			System.out.println("Tirar o personagem da 2ª posição do barco? (1) Sim (2) Não");
			int tirarPosicao2 = sc.nextInt();

			if (tirarPosicao2 == 1) {
				Personagem.setarPosicao3(Barco.B.getVaga2());
				Barco.B.setVaga2(0);
			}
		}
	}
}