package edu.es.eoi;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class MundoBancarioRepository {

	EntityManager manager=Persistence.createEntityManagerFactory("MIBASEDEDATOS").createEntityManager();
		
//	Crear Cliente
	
	public void createClient(Cliente cliente) {
		
		manager.getTransaction().begin();
		manager.persist(cliente);
		manager.getTransaction().commit();
	}
	
//	Crear Banco
//	Recuperar un Cliente por su Clave Principal
//	Recuperar un Banco por su Clave Principal
//	Modificaremos un Cliente por parametro (Cliente cliente)
//	Modificaremos un Banco
//	Eliminaremos un Cliente 
//	Eliminaremos un Banco
//	Obtendremos la lista de todos los clientes
//	Obtendremos la lista de todos los bancos
//	Crearemos cuenta 
//	Modificaremos cuenta
//	Eliminaremos cuenta
//	Obtendremos las cuentas por banco
//	Obtendremos las cuentas por cliente

	
}
