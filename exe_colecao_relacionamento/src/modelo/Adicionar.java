package modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**exemplo de relacionamento de muitos telefones, ele cria uma nova tabela para add os mais de um telefone au automaticamente 
 * @date 28/04
 *  
 *  
 *  **/
import entity.Funcionario;

public class Adicionar {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("colecao");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();

		Funcionario usuario = new Funcionario();
		usuario.setNome("acacio");

		manager.persist(usuario);
		manager.getTransaction().commit();

		manager.close();
		factory.close();

	}

}
