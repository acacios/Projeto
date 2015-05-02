package modelo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import entity.Livro;

/**
 * Supondo que exista uma grande quantidade de livros cadastrados no banco de
 * dados, buscar todos os livros sem nenhum filtro vai sobrecarregar o tráfego
 * da rede e a memória utilizada pela aplicação. Nesses casos, podemos aplicar o
 * conceito de paginação para obter os livros aos poucos. A paginação do
 * resultado de uma consulta é realizada através dos métodos setFirstResult() e
 * setMax- Results().
 * 
 * 
 * **/

public class TesteBuscaPaginada {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("jpql_bd");
		EntityManager manager = factory.createEntityManager();

		TypedQuery<Livro> query = manager.createQuery(
				"select livro from Livro livro", Livro.class);

		query.setFirstResult(2);
		query.setMaxResults(3);
		List<Livro> livros = query.getResultList();

		for (Livro livro : livros) {
			System.out.println(" Livro : " + livro.getNome());
		}

		manager.close();
		factory.close();
	}
}