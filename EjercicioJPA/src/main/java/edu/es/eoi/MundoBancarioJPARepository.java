package edu.es.eoi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MundoBancarioJPARepository implements MundoBancarioRepositoryInterface {

	EntityManager manager = Persistence.createEntityManagerFactory("MIBASEDEDATOS").createEntityManager();

//	Crear Cliente

	@Override
	public void createClient(Cliente cliente) {

		manager.getTransaction().begin();
		manager.persist(cliente);
		manager.getTransaction().commit();
	}

//	Crear Banco

	@Override
	public void createBanco(Banco banco) {

		manager.getTransaction().begin();
		manager.persist(banco);
		manager.getTransaction().commit();
	}

//	Recuperar un Cliente por su Clave Principal

	@Override
	public Cliente findClienteByDni(String dni) {

		return manager.find(Cliente.class, dni);
	}

//	Recuperar un Banco por su Clave Principal

	@Override
	public Banco findBancoById(int id) {

		return manager.find(Banco.class, id);
	}

//	Modificaremos un Cliente por parametro (Cliente cliente) el cliente tiene que venir con id informada
	@Override
	public void updateCliente(Cliente cliente) {

		manager.getTransaction().begin();
		manager.merge(cliente);
		manager.getTransaction().commit();

	}

//	Modificaremos un Banco

	@Override
	public void updateBanco(Banco banco) {

		manager.getTransaction().begin();
		manager.merge(banco);
		manager.getTransaction().commit();

	}

//	Eliminaremos un Cliente 

	@Override
	public void deleteCliente(Cliente cliente) {

		manager.getTransaction().begin();
		manager.remove(cliente);
		manager.getTransaction().commit();

	}

//	Eliminaremos un Banco

	@Override
	public void deleteBanco(Banco banco) {

		manager.getTransaction().begin();
		manager.remove(banco);
		manager.getTransaction().commit();

	}

//	Obtendremos la lista de todos los clientes
	@Override
	@SuppressWarnings("unchecked")
	public List<Cliente> findAllClientes() {
		Query query = manager.createQuery("FROM Cliente");
		return query.getResultList();
	}

	// Obtendremos la lista de todos los bancos

	@Override
	@SuppressWarnings("unchecked")
	public List<Banco> findAllBancos() {
		Query query = manager.createQuery("FROM Banco");
		return query.getResultList();
	}

//	Crearemos cuenta 

	@Override
	public void createCuenta(Cuenta cuenta) {

		manager.getTransaction().begin();
		manager.persist(cuenta);
		manager.getTransaction().commit();
	}

	@Override
	public void createCuenta(String dni, int idbanco, double saldo) {

		Cuenta cuenta = new Cuenta();
		cuenta.setSaldo(saldo);
		cuenta.setCliente(manager.find(Cliente.class, dni));
		cuenta.setBanco(manager.find(Banco.class, idbanco));

		manager.getTransaction().begin();
		manager.persist(cuenta);
		manager.getTransaction().commit();
	}

//	Modificaremos cuenta

	@Override
	public void updateCuenta(Cuenta cuenta) {

		manager.getTransaction().begin();
		manager.merge(cuenta);
		manager.getTransaction().commit();
	}

//	Eliminaremos cuenta

	@Override
	public void deleteCuenta(Cuenta cuenta) {

		manager.getTransaction().begin();
		manager.remove(cuenta);
		manager.getTransaction().commit();

	}
//	Obtendremos las cuentas por banco
	
	@Override
	public List<Cuenta> findCuentasByIdBanco(int idbanco){
		
		return manager.find(Banco.class, idbanco).getCuentas();
		
	}
	
//	Obtendremos las cuentas por cliente

	@Override
	public List<Cuenta> findCuentasByDni(String dni){
		
		return manager.find(Cliente.class,dni).getCuentas();
		
	}
}
