package persistence;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class GenericDao <Entity , ID extends Serializable>{
 
	 Session session;
	 Transaction transaction;
	 Query query;
	 Criteria criteria;
	 
	 Entity entity;
	 
	 public GenericDao(Entity entity){ //genericDao buscou quanto eu estou subindo com os dados
		 this.entity = entity;
	 }

	 public void save(Entity entity)throws Exception{
		    session = HibernateUtil.getSessionFactory().openSession();
		    transaction = session.beginTransaction();
		     session.save(entity);
		    transaction.commit(); 
		    session.close();
	 }
	 public void update(Entity entity)throws Exception{
		    session = HibernateUtil.getSessionFactory().openSession();
		    transaction = session.beginTransaction();
		     session.update(entity);
		    transaction.commit(); 
		    session.close();
	 }
	 public void delete(Entity entity)throws Exception{
		    session = HibernateUtil.getSessionFactory().openSession();
		    transaction = session.beginTransaction();
		     session.delete(entity);
		    transaction.commit(); 
		    session.close();
	 }
	 
	 public List <Entity> findAll(){
		    session = HibernateUtil.getSessionFactory().openSession();
	          List <Entity> lista = session.createCriteria(entity.getClass()).list();
		    session.close();
		    return lista;
	 }
	 
	 public Entity findByCode(ID cod){
		    session = HibernateUtil.getSessionFactory().openSession();
	          Entity ent =(Entity) session.get(entity.getClass(),cod);
		    session.close();
		    return ent;
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	
	
}
