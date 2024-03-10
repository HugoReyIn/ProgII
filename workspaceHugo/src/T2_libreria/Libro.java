package T2_libreria;

public class Libro {
	
	private String titulo;
	private String autor;
	private int anno;
	private String isbn;
	
	public Libro() {
		super();
	}

	public Libro(String titulo, String autor, int anno, String isbn) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anno = anno;
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Libro '"+ titulo + "' de " + autor + ". Año de escritura: " + anno + ". ISBN: " + isbn;
	}
	
}
