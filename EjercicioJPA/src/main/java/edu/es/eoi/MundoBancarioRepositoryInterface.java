package edu.es.eoi;

import java.util.List;

public interface MundoBancarioRepositoryInterface {

	void createClient(Cliente cliente);

	void createBanco(Banco banco);

	Cliente findClienteByDni(String dni);

	Banco findBancoById(int id);

	void updateCliente(Cliente cliente);

	void updateBanco(Banco banco);

	void deleteCliente(Cliente cliente);

	void deleteBanco(Banco banco);

	List<Cliente> findAllClientes();

	List<Banco> findAllBancos();

	void createCuenta(Cuenta cuenta);

	void createCuenta(String dni, int idbanco, double saldo);

	void updateCuenta(Cuenta cuenta);

	void deleteCuenta(Cuenta cuenta);

	List<Cuenta> findCuentasByIdBanco(int idbanco);

	List<Cuenta> findCuentasByDni(String dni);

}