package edu.es.eoi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MundoBancarioJPARepositoryTest {

	MundoBancarioJPARepository repository= new MundoBancarioJPARepository();
	
	@Test
	void testCreateClient() {
		
		Cliente cliente=new Cliente();
		cliente.setDni("11111111A");
		cliente.setNombre("Cliente TEST");
		
		repository.createClient(cliente);
		
		assertEquals("Cliente TEST", repository.findClienteByDni("11111111A").getNombre());
		
		repository.deleteCliente(cliente);
		
	}

	@Test
	void testCreateBanco() {
		fail("Not yet implemented");
	}

	@Test
	void testFindClienteByDni() {
		fail("Not yet implemented");
	}

	@Test
	void testFindBancoById() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdateCliente() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdateBanco() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteCliente() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteBanco() {
		fail("Not yet implemented");
	}

	@Test
	void testFindAllClientes() {
		fail("Not yet implemented");
	}

	@Test
	void testFindAllBancos() {
		fail("Not yet implemented");
	}

	@Test
	void testCreateCuentaCuenta() {
		fail("Not yet implemented");
	}

	@Test
	void testCreateCuentaStringIntDouble() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdateCuenta() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteCuenta() {
		fail("Not yet implemented");
	}

	@Test
	void testFindCuentasByIdBanco() {
		fail("Not yet implemented");
	}

	@Test
	void testFindCuentasByDni() {
		fail("Not yet implemented");
	}

}
