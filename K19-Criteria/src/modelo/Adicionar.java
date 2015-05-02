package modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Autor;
import entity.Livro;

/**
 * exemplo de consultas com jpql
 * 
 * @date 28/04
 * 
 * 
 * **/

public class Adicionar {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("criteria");
		EntityManager manager = factory.createEntityManager();
		// ABRINDO A TRASACAO
		manager.getTransaction().begin();

		// OBJETO NO ESTADO NEW
		Livro l1 = new Livro();
		l1.setNome(" acacio  ");
		l1.setPreco(2.4);

		Livro l2 = new Livro();
		l2.setNome(" souza  ");
		l2.setPreco(2.2);

		Livro l3 = new Livro();
		l3.setNome(" santos  ");
		l3.setPreco(2.6);

		Autor autor1 = new Autor();
		autor1.setNome(" Patrick Cullen ");
		autor1.getLivros().add(l2);
		autor1.getLivros().add(l3);
		manager.persist(autor1);

		Autor autor2 = new Autor();
		autor2.setNome(" Fraser Seitel ");
		autor2.getLivros().add(l3);
		manager.persist(autor2);

		Autor autor3 = new Autor();
		autor3.setNome("Al Ries ");
		autor3.getLivros().add(l1);
		manager.persist(autor3);

		Autor autor4 = new Autor();
		autor4.setNome(" Jack Trout ");
		autor4.getLivros().add(l1);
		autor4.getLivros().add(l2);
		autor4.getLivros().add(l3);
		manager.persist(autor4);

		Autor autor5 = new Autor();
		autor5.setNome(" Steve Rivkin ");
		autor5.getLivros().add(l2);
		autor5.getLivros().add(l3);
		autor5.getLivros().add(l1);
		manager.persist(autor5);

		// OBJETO NO ESTADO MANAGED
		manager.persist(l2);
		manager.persist(l1);
		manager.persist(l3);

		// SINCRONIZANDO E CONFIRMANDO A TRANSACAO
		manager.getTransaction().commit();

		manager.close();
		factory.close();

	}

}
