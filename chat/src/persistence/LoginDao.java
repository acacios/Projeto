package persistence;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Login;

public class LoginDao {

	
	Session session;
	Transaction transaction;
	Query query;
	Criteria criteria;
	  
	 public void gravar(Login log)throws Exception{
		 session = HibernateUtil.getSessionFactory().openSession();
		   transaction = session.beginTransaction();
		     session.save(log);
		   transaction.commit();
		  session.close();
	 }
	 
	
	 //Busca o Usuário pelo codigo
	 public Login isDeQuem(Integer cod){
		 session = HibernateUtil.getSessionFactory().openSession();
	        Login login =(Login) session.get(Login.class, cod); //busca pela chave ...
		  session.close();
	 return login;
	 } //busca quem será que irá enviar
	 
	
	 public Login isLogar(Login log){
		  session = HibernateUtil.getSessionFactory().openSession();
		        query = session.createQuery("from Login l  where l.login= :param1  and l.senha=:param2");
		        query.setString("param1", log.getLogin());
		        query.setString("param2", log.getSenha());
		        Login login = (Login) query.uniqueResult(); //ele é Object
		        //sempre de Object para classe casting
		    session.close();
		 return login;
	 } //cheio logado senao null nao encontrado (verifica se existe ou nao)
	 
	 
	 
	 
	 public List <Login> findByAllException(String nome){
		  session = HibernateUtil.getSessionFactory().openSession();
	        query = session.createQuery("from Login l  where l.login <>:param1 ");
	        query.setString("param1",nome);
	        
	        List <Login> resp = query.list(); 
	        session.close();
	       return resp; 
	 } // eu irei enviar com exceção de mim mesmo ... (para quem será enviado)
	   
	 public Login isBuscaPeloNome(String nome){
		  session = HibernateUtil.getSessionFactory().openSession();
	        query = session.createQuery("from Login l  where l.login = :param1 ");
	        query.setString("param1",nome);
	        Login login = (Login) query.uniqueResult(); 
	        session.close();
	       return login; 
	 } 
	 
	 
	 public static void main(String[] args) {
		
		 System.out.println(new LoginDao().findByAllException("belem"));
	}
}
