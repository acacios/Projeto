package modelo;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Cliente;
import entity.Pedido;
/**exemplo de relacionamento de muitos telefones, ele cria uma nova tabela para add os mais de um telefone au automaticamente 
 * @date 28/04
 *  
 *  
 *  **/

public class Adicionar {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("cliPed");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();

		Cliente cli = new Cliente();

		cli.setNome("acacio");
		Pedido ped = new Pedido();
		ped.setData(Calendar.getInstance());
		ped.setCliente(cli);

		manager.persist(ped); 
		manager.persist(cli);

		manager.getTransaction().commit();

		manager.close();
		factory.close();

	}

}
