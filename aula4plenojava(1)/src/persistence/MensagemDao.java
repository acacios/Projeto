package persistence;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Mensagem;

public class MensagemDao {

	Session session;
	Transaction transaction;
	
	public void cadastrar(Mensagem m)throws Exception{
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		session.save(m);
		transaction.commit();
		session.close();
	}
	
}
