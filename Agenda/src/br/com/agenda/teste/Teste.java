package br.com.agenda.teste;

import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.agenda.dao.ContatosDao;
import br.com.agenda.dao.InterfaceContatos;
import br.com.agenda.modelo.Contatos;
import br.com.agenda.util.HibernateUtil;

public class Teste {

	public static void main(String[] args) {

		
		
		Contatos c = new Contatos();
		
		c.setNome("andre");
		c.setEmail("ahaa@gmail.com");
		c.setTelefone("2243");
		c.setCelular("fgdh");
		
		InterfaceContatos dao = new ContatosDao();
		dao.salvar(c);
		

	}

}
