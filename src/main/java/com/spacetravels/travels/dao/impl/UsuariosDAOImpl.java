package com.spacetravels.travels.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import com.spacetravels.travels.dao.UsuariosDAO;
import com.spacetravels.travels.dao.connection.MariaDBConnection;
import com.spacetravels.travels.models.Usuarios;

public class UsuariosDAOImpl implements UsuariosDAO {
	
	private MariaDBConnection mariaDBConnection = new MariaDBConnection();

	@Override
	public Usuarios login(String username, String passwrod) {
		
		Usuarios usuarios = null;
		
		try {
			
			Connection connection = mariaDBConnection.getConnection();
			
			String sqlSelect = "SELECT  id, nombre , apellidos FROM usuarios  WHERE  usuario = '" + username
					+ "' AND pasword ='" + passwrod + "'";
			
			Statement stmSelect = connection.createStatement();
			ResultSet rs = stmSelect.executeQuery(sqlSelect);
			
			while (rs.next()) {
				usuarios = new Usuarios();
				
				usuarios.setId(rs.getInt("id"));
				usuarios.setNombre(rs.getString("nombre"));
				usuarios.setApellidos(rs.getString("apellidos"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return usuarios;
	}

	@Override
	public Usuarios registerUser(Usuarios usuarios) {
		try {
			Connection connection = mariaDBConnection.getConnection();
			
			PreparedStatement statement = connection.prepareStatement(INSERT_USUARIO);
			
			statement.setString(1, usuarios.getNombre());
			statement.setString(2, usuarios.getApellidos());
			statement.setString(3, usuarios.getUsuario());
			statement.setString(4, usuarios.getPassword());
			statement.setString(5, usuarios.getEmail());
			statement.setString(6, usuarios.getTelefono());
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return usuarios;
	}

	@Override
	public List<Usuarios> obtenerUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}

}
