package lanchonete;

public class VolumeInvalido extends RuntimeException{

	private static final long serialVersionUID = 3356510800128259685L;

	public VolumeInvalido() {
		super("Volume inválido!");
	}
}
