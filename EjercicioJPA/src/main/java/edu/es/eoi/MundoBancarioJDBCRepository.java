package edu.es.eoi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MundoBancarioJDBCRepository implements MundoBancarioRepositoryInterface{

	@Override
	public void createClient(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createBanco(Banco banco) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente findClienteByDni(String dni) {

		Cliente cliente= null;
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/beca?serverTimezone=UTC","root","root");
			PreparedStatement stm= con.prepareStatement("SELECT * FROM CLIENTES WHERE DNI=?");
			stm.setString(1, dni);
			
			ResultSet rs=stm.executeQuery();
			
			while (rs.next()) {
				
				cliente=new Cliente();
				cliente.setDni(rs.getString("dni"));
				cliente.setNombre(rs.getString("nombre"));			
			}
			
		} catch (SQLException e) {			
			e.printStackTrace();
		}		
	
		
		return cliente;
	}

	@Override
	public Banco findBancoById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBanco(Banco banco) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBanco(Banco banco) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cliente> findAllClientes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Banco> findAllBancos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createCuenta(Cuenta cuenta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createCuenta(String dni, int idbanco, double saldo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCuenta(Cuenta cuenta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCuenta(Cuenta cuenta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cuenta> findCuentasByIdBanco(int idbanco) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cuenta> findCuentasByDni(String dni) {
		// TODO Auto-generated method stub
		return null;
	}

}
