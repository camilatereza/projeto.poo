package ufpb.poo.livraria;

import java.util.ArrayList;

public interface Library {
	
	public void cadastrarFuncionario();

	public ArrayList<Livro> listarArcevo();

	public boolean verificarLogin();
}
