package edu.es.eoi.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.es.eoi.entity.Alumno;

public class AlumnoService {

	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/beca?serverTimezone=UTC", "root", "root");
	}

	public Alumno findByDni(String dni) {

		Connection connection = null;
		try {
			connection = getConnection();

			PreparedStatement stm = connection.prepareStatement("SELECT * FROM alumno where dni=?");
			stm.setString(1, dni);

			ResultSet rs = stm.executeQuery();

			while (rs.next()) {

				Alumno alumno = new Alumno();
				alumno.setId(rs.getInt("id"));
				alumno.setDni(rs.getString("dni"));
				alumno.setName(rs.getString("nombre"));
				alumno.setSurname(rs.getString("apellidos"));
				alumno.setAge(rs.getInt("edad"));

				return alumno;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {			
				e.printStackTrace();
			}
		}

		return null;

	}

	public List<Alumno> findAll() {

		List<Alumno> alumnos = new ArrayList<Alumno>();
		Connection connection = null;
		try {

			connection = getConnection();

			PreparedStatement stm = connection.prepareStatement("SELECT * FROM alumno");

			ResultSet rs = stm.executeQuery();

			while (rs.next()) {

				Alumno alumno = new Alumno();
				alumno.setId(rs.getInt("id"));
				alumno.setDni(rs.getString("dni"));
				alumno.setName(rs.getString("nombre"));
				alumno.setSurname(rs.getString("apellidos"));
				alumno.setAge(rs.getInt("edad"));

				alumnos.add(alumno);
			}

			return alumnos;

		} catch (SQLException e) {
			e.printStackTrace();
			return alumnos;
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void createAlumno(Alumno alumno) {

		Connection connection = null;
		try {
			connection = getConnection();

			PreparedStatement stm = connection
					.prepareStatement("INSERT INTO alumno(apellidos,dni,nombre,edad) VALUES (?,?,?,?);");
			stm.setString(1, alumno.getSurname());
			stm.setString(2, alumno.getDni());
			stm.setString(3, alumno.getName());
			stm.setInt(4, alumno.getAge());

			stm.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
