package ufpb.poo.livraria;

import java.util.ArrayList;

public interface Library {

	public void cadastrarFuncionario(Funcionario fun);

	public ArrayList<Livro> listarArcevo();

	public boolean verificarLogin();

	public void efetuarEmprestimo(Livro book, Usuario cliente);

	public void efetuarDevolucao(Livro book, Usuario cliente);

	public void cadastrarLivro(Livro book);

	public Livro alterarLivro(Livro book);

	public boolean excluirLivro(Livro book);

	public Usuario consultarUsuario(Usuario cliente);

	public void cadastrarUsuario(Usuario cliente);

	public Usuario alterarUsuario(Usuario cliente);

	public boolean excluirUsuario(Usuario Cliente);

	public Livro buscaLivro(Livro book);
}
