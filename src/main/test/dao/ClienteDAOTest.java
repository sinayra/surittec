package dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import model.dao.ClienteDAO;
import model.entity.Cliente;

public class ClienteDAOTest {

	ClienteDAO dao;

	@Before
	public void init() {
		dao = ClienteDAO.getInstance();
	}
	
	@Ignore
	@Test
	public void testCreate() {
		Cliente cliente = new Cliente("123456789", "Fulano");

		try {
			dao.create(cliente);
			assert (true);
			
			
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testRead() {
		List<Cliente> list;
		Cliente cliente = new Cliente("123456789", "Fulano");
		cliente.setId(1);
		
		try {
			list = dao.read();
			assert(list.contains(cliente));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Ignore
	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

}
