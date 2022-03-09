
public class Endereco {
	
	private String pais;
	private String estado;
	private String bairro;
	private String rua;
	private int numero;
	private String complemento;
	private int cep;
	
	@Override
	public String toString() {
		return "Endereco [pais=" + pais + ", estado=" + estado + ", bairro=" + bairro + ", rua=" + rua + ", numero="
				+ numero + ", complemento=" + complemento + ", cep=" + cep + "]";
	}

	public Endereco(String pais, String estado, String bairro, String rua, int numero, String complemento, int cep) {
		super();
		this.pais = pais;
		this.estado = estado;
		this.bairro = bairro;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.cep = cep;
	}

	public Endereco() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}
	
	
	
}
