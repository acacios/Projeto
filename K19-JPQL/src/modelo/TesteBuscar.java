package modelo;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entity.Autor;
import entity.Livro;

/**
 * exemplo de consultas com jpql
 * 
 * @date 28/04
 * 
 * 
 * **/
public class TesteBuscar {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("jpql_bd");
		EntityManager manager = factory.createEntityManager();

		Query query = manager.createQuery(" select a from Autor a");
		List<Autor> autores = query.getResultList();
		for (Autor autor : autores) {
			System.out.println(" Autor : " + autor.getNome());
			Collection<Livro> livros = autor.getLivros();

			for (Livro livro : livros) {
				System.out.println(" Livro : " + livro.getNome());
				System.out.println(" Preço : " + livro.getPreco());
				System.out.println();
			}
			System.out.println();
		}
		manager.close();
		factory.close();
	}
}