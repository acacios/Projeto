package modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Pessoa;

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
				.createEntityManagerFactory("EntityManager");
		EntityManager manager = factory.createEntityManager();
		// ABRINDO A TRASACAO
		manager.getTransaction().begin();
		// OBJETO NO ESTADO NEW
		Pessoa p = new Pessoa();
		p.setNome(" acacio  ");

		// OBJETO NO ESTADO MANAGED
		manager.persist(p);
		// SINCRONIZANDO E CONFIRMANDO A TRANSACAO
		manager.getTransaction().commit();

		System.out.println(" Pessoa id: " + p.getId());

		manager.close();
		factory.close();

	}

}
