package modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Autor;
import entity.Livro;

/**
 * exemplo de relacionamento de muitos telefones, ele cria uma nova tabela para
 * add os mais de um telefone au automaticamente
 * 
 * @date 28/04
 * 
 * 
 * **/

public class Adicionar {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("livroAutor");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();

		Autor a = new Autor();
		a.setNome(" Rafael Cosentino ");

		Livro l = new Livro();
		l.setNome(" JPA2 ");
		l.getAutores().add(a);

		manager.persist(a);
		manager.persist(l);

		manager.getTransaction().commit();

		manager.close();
		factory.close();

	}

}
