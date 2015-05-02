package modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * fazer um update em lote, em vez de buscar cada dado pra memoria e atualizar e
 * so atualizar em lote, veja como abaixo ou tb atualização em casacata
 * 
 * @date 30/04
 * 
 * 
 * **/
public class AumentaPrecoProdutoAumentar_lote {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("jpql_bd");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();

		Query query = manager
				.createQuery("UPDATE Produto p SET p. preco = p. preco * 1.1 ");
		query.executeUpdate();

		manager.getTransaction().commit();

		manager.close();
		factory.close();
	}

}
