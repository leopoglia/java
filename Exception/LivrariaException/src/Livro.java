import java.util.ArrayList;

public class Livro {
	private String titulo, status, isbn, editora;
	private Autor autor;
	private int qtdPaginas, paginaRevisao;
	
	static ArrayList<Livro> listaLivro = new ArrayList<>();
	

	public Livro(String titulo, String status, int qtdPaginas, String isbn, Autor autor, String editora,  int paginaRevisao) {
		super();
		this.titulo = titulo;
		this.status = status;
		this.qtdPaginas = qtdPaginas;
		this.isbn = isbn;
		this.autor = autor;
		this.editora = editora;
		this.paginaRevisao = paginaRevisao;
	}

	@Override
	public String toString() {
		return "TITULO: " + titulo + " | STATUS: " + status + " | QUANTIDADE PAGINAS: " + qtdPaginas + " | ISBN: " + isbn
				+ " | AUTOR: " + autor + " | EDITORA: " + editora + " | PAGINAS REVISADAS: " + paginaRevisao + "%\n";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getQtdPaginas() {
		return qtdPaginas;
	}

	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}

	public String getisbn() {
		return isbn;
	}

	public void setisbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}


	public int getPaginaRevisao() {
		return paginaRevisao;
	}


	public void setPaginaRevisao(int paginaRevisao) {
		this.paginaRevisao = paginaRevisao;
	}
}