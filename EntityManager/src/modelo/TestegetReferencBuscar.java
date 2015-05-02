package modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Pessoa;

public class TestegetReferencBuscar {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("EntityManager");
		EntityManager manager = factory.createEntityManager();

		// OBJETO NO ESTADO MANAGED
		Pessoa p = manager.getReference(Pessoa.class, 1L);
		System.out.println("Id: " + p.getId());
		System.out.println(" Nome : " + p.getNome());

		manager.close();
		factory.close();
	}
}