package edu.es.eoi;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MundoBancario {

	public static void main(String[] args) {		
		
		EntityManager manager=Persistence.createEntityManagerFactory("MIBASEDEDATOS").createEntityManager();
		
		Cliente cliente= new Cliente();
		cliente.setDni("12334534A");
		cliente.setNombre("Pedro");
		cliente.setDireccion("C/San Vicente 5");
		
		Banco banco= new Banco();
		banco.setCiudad("Alicante");
		banco.setNombre("Santander");
		
//		Cuenta cuenta= new Cuenta();
//		cuenta.setDni("23434545T");
//		cuenta.setIdbanco(1);
//		cuenta.setSaldo(1000);
		
		Cuenta cuenta= new Cuenta();
		cuenta.setSaldo(500);
		cuenta.setCliente(manager.find(Cliente.class,"12334534A"));
		cuenta.setBanco(manager.find(Banco.class, 2));
		
//		manager.getTransaction().begin();
//		manager.persist(cuenta);
//		manager.getTransaction().commit();

		Cliente c1=manager.find(Cliente.class, "23434545T");
		Cliente c2=manager.find(Cliente.class, "12334534A");
	
//		System.out.println(c1.getCuentas());
//		System.out.println(c2.getCuentas());
		
		for (Cuenta cuentaTemp : c2.getCuentas()) {			
			System.out.println(cuentaTemp.getBanco().getCiudad());
		}
		
		//todas las cuentas
		
		Query query=manager.createQuery("FROM Cuenta");
		@SuppressWarnings("unchecked")
		List<Cuenta> cuentas=query.getResultList();
		
		for (Cuenta cuenta2 : cuentas) {
			System.out.println(cuenta2.getSaldo());
			System.out.println(cuenta2.getBanco().getCiudad());
		}
		
	}

}
