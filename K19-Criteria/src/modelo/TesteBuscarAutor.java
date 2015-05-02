package modelo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import entity.Autor;

/**
 * exemplo de consultas com criteria
 * 
 * @date 28/04
 * 
 * 
 * **/
public class TesteBuscarAutor {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("criteria");
		EntityManager manager = factory.createEntityManager();

		CriteriaBuilder cb = manager.getCriteriaBuilder();
		CriteriaQuery<Autor> c = cb.createQuery(Autor.class);
		Root<Autor> l = c.from(Autor.class);
		c.select(l);

		TypedQuery<Autor> query = manager.createQuery(c);
		List<Autor> autor = query.getResultList();

		for (Autor autores : autor) {
			System.out.println(autores.getNome());
		}
	}

}