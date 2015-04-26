package br.com.agenda.dao;

import java.util.List;

import org.hibernate.Session;

import br.com.agenda.modelo.Contatos;
import br.com.agenda.util.HibernateUtil;

public class ContatosDao implements InterfaceContatos {

	@Override
	public Contatos getContatos(Long id) {

		Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
		return (Contatos) ss.load(Contatos.class, id);
	}

	@Override
	public void salvar(Contatos contatos) {
		Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
		ss.beginTransaction();
		ss.save(contatos);
		ss.beginTransaction().commit();
	}

	@Override
	public void remover(Contatos contatos) {
		Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
		ss.beginTransaction();
		ss.delete(contatos);
		ss.beginTransaction().commit();
	}

	@Override
	public void atualizar(Contatos contatos) {
		Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
		ss.beginTransaction();
		ss.update(contatos);
		ss.beginTransaction().commit();

	}

	@Override
	public java.util.List<Contatos> List() {
		Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
		ss.beginTransaction();
		List lista = ss.createQuery("From contatos").list();
		ss.beginTransaction().commit();
		return lista;
	}

}
