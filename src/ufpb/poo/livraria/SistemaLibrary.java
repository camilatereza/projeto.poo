package ufpb.poo.livraria;

import java.util.ArrayList;

public class SistemaLibrary implements Library {

	ArrayList<Livro> listaLivro;
	ArrayList<Funcionario> listaFuncionario;
	ArrayList<Usuario> listaUsuario;

	public void efetuarEmprestimo(Livro book, Usuario cliente) {
		cliente.setLivroLocado(book);
		book.setDisponivel(false);
	}

	public void efetuarDevolucao(Livro book, Usuario cliente) {
		cliente.setLivroLocado(book);
		book.setDisponivel(true);
	}

	public void cadastrarLivro(Livro book) {
		listaLivro.add(book);
	}

	public Livro alterarLivro(Livro book) {
		return this.buscaLivro(book);
	}

	public Livro buscaLivro(Livro book) {
		for (Livro l : listaLivro) {
			if (l.getCodigo().equals(book.getCodigo())) {
				return l;
			}
		}
		return null;
	}

	public boolean excluirLivro(Livro book) {
		boolean tmp = false;
		for (Livro l : listaLivro) {
			if (l.getCodigo().equals(book.getCodigo())) {
				tmp = true;
				listaLivro.remove(book);
			}
		}
		return tmp;
	}

	public Usuario consultarUsuario(Usuario cliente) {
		for (Usuario u : listaUsuario) {
			if (u.getCpf().equals(cliente.getCpf())) {
				return u;
			}
		}
		return null;
	}

	public void cadastrarUsuario(Usuario cliente) {
		listaUsuario.add(cliente);
	}

	public Usuario alterarUsuario(Usuario cliente) {
		return this.consultarUsuario(cliente);
	}

	public boolean excluirUsuario(Usuario cliente) {
		boolean tmp = false;
		for (Usuario c : listaUsuario) {
			if (c.getCpf().equals(cliente.getCpf())) {
				tmp = true;
				listaUsuario.remove(cliente);
			}
		}
		return tmp;
	}

	@Override
	public void cadastrarFuncionario(Funcionario fun) {
		this.listaFuncionario.add(fun);
	}

	@Override
	public ArrayList<Livro> listarArcevo() {
		return this.listaLivro;
	}

	@Override
	public boolean verificarLogin() {
		return false;
	}

	public ArrayList<Usuario> buscaUsu(String nome) {
		ArrayList<Usuario> usuariosEncontrados = new ArrayList<Usuario>();
		for (Usuario c : listaUsuario) {
			if (c.getNome().equals(nome)) {
				usuariosEncontrados.add(c);
			}
		}
		return usuariosEncontrados;
	}

	public Usuario buscaCpf(String cpf) {
		for (Usuario c : listaUsuario) {
			if (c.getCpf().equals(cpf)) {
				return c;
			}
		}
		return null;
	}
}
