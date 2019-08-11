public class DiscoMusical {
	private String titulo;
	private String autor;
	private String formato;
	private int anioEdicion;
	private boolean digital;
	
	public DiscoMusical() {
		titulo = "";
		autor = "";
		formato = "";
	}
	
	public DiscoMusical(String titulo, String autor, int anioEdicion) {
		this.titulo = titulo;
		this.autor = autor;
		this.anioEdicion = anioEdicion;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String t) {
		titulo = t;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public int getAnioEdicion() {
		return anioEdicion;
	}

	public void setAnioEdicion(int anioEdicion) {
		this.anioEdicion = anioEdicion;
	}

	public boolean isDigital() {
		return digital;
	}

	public void setDigital(boolean digital) {
		this.digital = digital;
	}
	
	public String toString() {
		return 
				"Titulo: " + titulo + ", " + 
				"Autor: " + autor + ", " + 
				"Año de Edición: " + anioEdicion + ".";
	}
}