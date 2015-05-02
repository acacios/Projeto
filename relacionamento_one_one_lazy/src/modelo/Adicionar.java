package modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**exemplo de relacionamento de muitos telefones, ele cria uma nova tabela para add os mais de um telefone au automaticamente 
 * @date 28/04
 *  
 *  
 *  **/
import entity.Estado;
import entity.Governador;

public class Adicionar {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("estgovlazy");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();

		Governador gov = new Governador();

		gov.setNome("acacio");

		Estado estado = new Estado();
		estado.setNome("souza");

		gov.setEstado(estado);
		estado.setGovernador(gov);

		manager.persist(estado);
		manager.persist(gov);

		manager.getTransaction().commit();

		manager.close();
		factory.close();

	}

}
