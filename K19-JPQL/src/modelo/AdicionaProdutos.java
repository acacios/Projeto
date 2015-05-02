package modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Produto;

public class AdicionaProdutos {
	
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("jpql_bd");
		EntityManager manager = factory.createEntityManager();
		// ABRINDO A TRASACAO
		manager.getTransaction().begin();

		
		for (int i = 0; i < 100; i ++) {
			 Produto p = new Produto ();
			 p.setNome ("produto" + i);
			 p.setPreco (i * 10.0) ;
			 manager.persist (p);
			 }
				
		// SINCRONIZANDO E CONFIRMANDO A TRANSACAO
		manager.getTransaction().commit();

		manager.close();
		factory.close();

	}

}
	
	


