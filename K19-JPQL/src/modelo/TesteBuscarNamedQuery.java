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
 * exemplo de consultas com jpql c namedquerym com named query a consulta fica na clase em cima do nome da classe
 * e aqui no main so colocamos o nome dela "createQuery("Autor.findAll");, linha 28", veja na classe autror foi feito o select aqui so colocamos o nome dessa consulta
 * 
 * @date 28/04
 * 
 * 
 * **/
public class TesteBuscarNamedQuery {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("jpql_bd");
		EntityManager manager = factory.createEntityManager();

		Query query = manager.createQuery("Autor.findAll");
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