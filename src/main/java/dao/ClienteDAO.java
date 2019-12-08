package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Cliente;

public class ClienteDAO {

	private static ClienteDAO instance;
	private Session session;

	private ClienteDAO() {
		SessionFactory sessionFactory;

		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
	}

	public static ClienteDAO getInstance() {
		if (instance == null) {
			instance = new ClienteDAO();
		}

		return instance;
	}

	public void create(Cliente cliente) throws Exception {
		session.beginTransaction();

		try {
			session.save(cliente);
		} catch (Exception e) {
			throw new Exception(e);
		} finally {
			session.close();
		}
	}

	public void read(Cliente cliente) {
		// TO DO
	}

	public void update(Cliente cliente) {
		// TO DO
	}

	public void delete(Cliente cliente) {
		// TO DO
	}
}
