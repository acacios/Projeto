package br.com.agenda.dao;

import java.util.List;

import br.com.agenda.modelo.Contatos;

public interface InterfaceContatos {

	public Contatos getContatos(Long id);

	public void salvar(Contatos contatos);

	public void remover(Contatos contatos);

	public void atualizar(Contatos contatos);
	
	public List<Contatos>List();
	

}
