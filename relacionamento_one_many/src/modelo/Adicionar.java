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
import entity.Departamento;

public class Adicionar {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("depfunc");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();

		Funcionario func = new Funcionario();
		func.setNome("souza");

		Departamento dep = new Departamento();
		dep.setNome("finanças");
		dep.getFuncionarios().add(func);

		manager.persist(func);
		manager.persist(dep);

		manager.getTransaction().commit();

		manager.close();
		factory.close();

	}

}
