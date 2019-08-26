package ufpb.poo.livraria;

public class Livro {

	private String codigo;
	private int ano;
	private int genero;
	private int idioma;
	private String titulo;
	private String autor;
	private boolean disponivel;
	private int quantidade;

	public Livro(String codigo, int ano, int genero, int idioma, String titulo, String autor, int quantidade) {
		this.codigo = codigo;
		this.ano = ano;
		this.genero = genero;
		this.idioma = idioma;
		this.titulo = titulo;
		this.autor = autor;
		this.disponivel = true;
		this.quantidade = quantidade;
	}

	public void gerarCodigo() {
		 
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getGenero() {
		return genero;
	}

	public void setGenero(int genero) {
		this.genero = genero;
	}

	public int getIdioma() {
		return idioma;
	}

	public void setIdioma(int idioma) {
		this.idioma = idioma;
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

}
