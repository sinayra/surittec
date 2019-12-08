package dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import entity.Cliente;

public class ClienteDAOTest {
	
	ClienteDAO dao;
	
	@Before
    public void init() {
        dao = ClienteDAO.getInstance();
    }
	
	@Test
	public void testCreate() {
		Cliente cliente = new Cliente("123456789", "Fulano");
		
		try {
			dao.create(cliente);
			assert(true);
		}
		catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Ignore
	@Test
	public void testRead() {
		fail("Not yet implemented");
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
