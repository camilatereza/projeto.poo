package ufpb.poo.livraria;

public class Usuario extends Pessoa {

	private Livro livroLocado;
	private String tempoLocado;
	private String contato;
	private Endereco end;

	public Usuario(String nome, String cpf, long senha, Livro locado, String duracao, String conta, Endereco ende) {
		super(nome, cpf, senha);
		this.livroLocado = locado;
		this.tempoLocado = duracao;
		this.contato = conta;
		this.end = ende;
	}

	public Livro getLivroLocado() {
		return livroLocado;
	}

	public void setLivroLocado(Livro livroLocado) {
		this.livroLocado = livroLocado;
	}

	public String getTempoLocado() {
		return tempoLocado;
	}

	public void setTempoLocado(String tempoLocado) {
		this.tempoLocado = tempoLocado;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public Endereco getEnd() {
		return end;
	}

	public void setEnd(Endereco end) {
		this.end = end;
	}

}