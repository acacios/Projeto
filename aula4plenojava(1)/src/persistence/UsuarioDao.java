package persistence;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import entity.Usuario;

public class UsuarioDao {

	Session session;
	Transaction transaction;
	Criteria criteria;
	
	public void cadastrar(Usuario user)throws Exception{
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		session.save(user);
		transaction.commit();
		session.close();
	}
	
	public Usuario logar(Usuario u)throws Exception{
		session = HibernateUtil.getSessionFactory().openSession();
		
		criteria = session.createCriteria(Usuario.class);
		criteria.add(Restrictions.and(
				Restrictions.eq("login", u.getLogin()), 
				Restrictions.eq("senha", u.getSenha())));
		Usuario user = (Usuario) criteria.uniqueResult();
		session.close();
		return user;
	}
	
	
	
	
	
	
	
	
}
