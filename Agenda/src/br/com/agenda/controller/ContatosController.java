package br.com.agenda.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import br.com.agenda.dao.ContatosDao;
import br.com.agenda.dao.InterfaceContatos;
import br.com.agenda.modelo.Contatos;

@ManagedBean(name = "mb")
@SessionScoped
public class ContatosController {

	private Contatos contatos;
	private DataModel ListaContatos;

	public Contatos getContatos() {

		if ((contatos == null)) {

			contatos = new Contatos();

			System.out.println(contatos);
		}

		return contatos;
	}

	public void setContatos(Contatos contatos) {
		this.contatos = contatos;
	}

	public DataModel getListaContatos() {
		List<Contatos> lista = new ContatosDao().List();

		ListaContatos = new ListDataModel(lista);

		return ListaContatos;
	}

	public void prepararAdicionarContato() {
		contatos = new Contatos();
	}

	public void prepararAlterarContato() {
		contatos = (Contatos) (ListaContatos.getRowData());
		contatos = new Contatos();
	}

	public void adicionar() {
		InterfaceContatos dao = new ContatosDao();
		dao.salvar(contatos);

	}

	public void alterar() {
		InterfaceContatos dao = new ContatosDao();
		dao.atualizar(contatos);
	}

	public String excluir() {

		Contatos contato = (Contatos) (ListaContatos.getRowData());

		InterfaceContatos dao = new ContatosDao();
		dao.remover(contato);
		return "index";

	}

}
