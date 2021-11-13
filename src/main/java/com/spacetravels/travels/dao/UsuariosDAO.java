package com.spacetravels.travels.dao;

import java.util.List;
import com.spacetravels.travels.models.Usuarios;

public interface UsuariosDAO {
	
	String INSERT_USUARIO = "INSERT INTO space_travels.usuarios (nombre, apellidos, usuario, pasword, email, telefono)\n"
			+ "VALUES( ?, ?, ?, ?, ?, ?)";
	
	public Usuarios login(String username, String passwrod);

	public Usuarios registerUser(Usuarios usuarios);
	
	public List<Usuarios> obtenerUsuarios();

}
