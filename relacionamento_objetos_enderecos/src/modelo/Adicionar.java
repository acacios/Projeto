package modelo;

import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Candidato;
import entity.Endereco;

/**
 * exemplo de relacionamento de muitos telefones, ele cria uma nova tabela para
 * add os mais de um telefone au automaticamente
 * 
 * @date 28/04
 * 
 * 
 * **/

public class Adicionar {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("candEnd");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();

		Endereco end = new Endereco();

		end.setEstado("rj");
		end.setCidade("dc");
		end.setLogradouro("abv");
		end.setNumero(122);

		Candidato cad = new Candidato();
		cad.setNome("acaccio");
		cad.setNascimento(new GregorianCalendar(1984, 10, 30));
		cad.setEndereco(end);

		manager.persist(cad);
		
		manager.getTransaction().commit();

		manager.close();
		factory.close();

	}
}
