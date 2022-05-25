
public class Pessoa {

	private boolean caneca;
	
	public Pessoa(boolean caneca) {
		super();
		this.caneca = caneca;
	}

	public boolean getCaneca() {
		return caneca;
	}

	public void setCaneca(boolean caneca) {
		this.caneca = caneca;
	}
	
	public static String beberCafe() throws ErroCanecaVazia, ErroCafeFrio, ErroCafeQuente, ErroSemCaneca {
		if (Main.caneca.getCheia() == false) {
			if (Main.cafe.getTemperatura() == -1) {
				throw new ErroCanecaVazia();
			}
		} else if (Main.cafe.getTemperatura() > 100) {
			throw new ErroCafeQuente();
		} else if (Main.cafe.getTemperatura() <= 50) {
			throw new ErroCafeFrio();
		} else {
			Main.cafe.setTemperatura(-1);
			Main.caneca.setCheia(false);
			return "Você bebeu o café!";
		}
		Main.pegarCaneca();
		return null;
	}
	
	
	static String encherCafe() throws ErroCanecaVazia, ErroCafeFrio, ErroCafeQuente {
		if (Main.cafe.getTemperatura() == -1) {
			Main.caneca.setCheia(true);
			Main.cafe.setTemperatura(110);
			return "Você encheu a caneca de Café!";
		} else {
			return "A caneca já está cheia!";
		}
	}
	
	static String deixarCafeNaMesa() throws ErroSemCaneca {
		if(Main.caneca.getCheia() == false) {
			throw new ErroSemCaneca();
		}else {
			Main.cafe.setTemperatura(Main.cafe.getTemperatura() - 10);
			return "Você deixou o café na mesa e ele diminui 10 graus!";
		}
	}

	public static String escolheracao(int opcao) throws ErroCanecaVazia, ErroCafeFrio, ErroCafeQuente, ErroSemCaneca {
		switch (opcao) {
		case 1:
			return beberCafe();
		case 2:
			return encherCafe();
		case 3:
			return deixarCafeNaMesa(); 
		}
		return null;		
	}
}