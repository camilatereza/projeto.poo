package ufpb.poo.livraria;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private long senha;

	public String getNome() {
		return nome;
	}

	public Pessoa(String nome, String cpf, long senha) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public long getSenha() {
		return senha;
	}

	public void setSenha(long senha) {
		this.senha = senha;
	}

}
