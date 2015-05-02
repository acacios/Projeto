package modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Pessoa;

public class TesteManagedAltera {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("EntityManager");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();

		// OBJETO NO ESTADO MANAGED
		Pessoa p = manager.find(Pessoa.class, 1L);

		// ALTERANDO O CONTEUDO DO OBJETO
		p.setNome(" Marcelo Martins ");
		// SINCRONIZANDO E CONFIRMANDO A TRANSACAO
		manager.getTransaction().commit();

		manager.close();
		factory.close();
	}

}
