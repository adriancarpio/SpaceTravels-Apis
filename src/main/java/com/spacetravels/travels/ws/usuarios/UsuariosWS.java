package com.spacetravels.travels.ws.usuarios;

import java.util.List;

import javax.jws.WebService;

import com.spacetravels.travels.models.Usuarios;

@WebService
public interface UsuariosWS {
	
	public Usuarios login(String username, String passwrod);

	public Usuarios registerUser(Usuarios usuarios);
	
	public List<Usuarios> obtenerUsuarios();

}
