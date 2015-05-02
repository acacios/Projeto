package modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * fazer um delete em lote, em vez de remover cada dado pra memoria e remover e
 * so atualizar em lote, veja como abaixo ou tb atualização em casacata
 * 
 * @date 30/04
 * 
 * 
 * **/
public class RemoverPrecoProduto_lote {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("jpql_bd");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();

		Query query = manager
				.createQuery("Delete Produto p WHERE p.preco <50");
		query.executeUpdate();

		manager.getTransaction().commit();

		manager.close();
		factory.close();
	}

}
