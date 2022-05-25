
public class Caneca {

	private boolean cheia, pegouCaneca;

	public boolean getCheia() {
		return cheia;
	}

	public void setCheia(boolean cheia) {
		this.cheia = cheia;
	}

	public Caneca(boolean cheia, boolean pegouCaneca) {
		super();
		this.cheia = cheia;
		this.pegouCaneca = pegouCaneca;
	}

	public boolean getPegouCaneca() {
		return pegouCaneca;
	}

	public void setPegouCaneca(boolean pegouCaneca) {
		this.pegouCaneca = pegouCaneca;
	}
}