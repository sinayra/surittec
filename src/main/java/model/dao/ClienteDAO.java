package model.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.entity.Cliente;

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

	public List<Cliente> read() throws Exception {
		List<Cliente> list = new ArrayList<Cliente>();
		
		session.beginTransaction();

		try {
			list = session.createQuery("SELECT c FROM Cliente c", Cliente.class).getResultList();
		} catch (Exception e) {
			throw new Exception(e);
		} finally {
			session.close();
		}
		
		return list;
	}

	public void update(Cliente cliente) {
		// TO DO
	}

	public void delete(Cliente cliente) {
		// TO DO
	}
}
