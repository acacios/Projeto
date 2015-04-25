package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Chat;
import entity.Login;

public class ChatDao {

	Session session;
	Transaction transaction;
	Query query;
	Criteria criteria;

	public void create(Chat chat, Login login) {
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		chat.setLogin(login); // quem tem a chave estrangeira seta o mais forte
		session.save(chat);
		transaction.commit();
		session.close();
	}

	public List<Chat> findAll() {
		session = HibernateUtil.getSessionFactory().openSession();
		query = session.createQuery("from Chat c  ");
		List<Chat> lista = query.list();
		session.close();
		return lista;
	}

	public List<Chat> findAllByLogin(Integer cod) throws Exception {
		Connection con = HibernateUtil.getSessionFactory().openSession()
				.connection();
		PreparedStatement stmt = con
				.prepareStatement("select * from chat c where c.id_login = ?");
		stmt.setInt(1, cod);
		ResultSet rs = stmt.executeQuery();
		List<Chat> lista = new ArrayList<Chat>();
		while (rs.next()) {
			Chat c = new Chat();
			c.setLogin(new Login());
			c.setIdChat(rs.getInt(1));
			c.setCodigoDe(rs.getInt(2));
			c.setDe(rs.getString(3));
			c.setMensagem(rs.getString(4));
			c.getLogin().setIdLogin(rs.getInt(5));
			lista.add(c);
		}
		con.close();
		return lista;
	}

}
