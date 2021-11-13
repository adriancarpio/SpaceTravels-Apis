package com.spacetravels.travels.ws.usuarios;

import java.util.List;

import javax.jws.WebService;

import com.spacetravels.travels.dao.UsuariosDAO;
import com.spacetravels.travels.dao.impl.UsuariosDAOImpl;
import com.spacetravels.travels.models.Usuarios;

@WebService(endpointInterface = "com.spacetravels.travels.ws.usuarios.UsuariosWS")
public class UsuariosWSImpl implements UsuariosWS {
	
	private UsuariosDAO dao = new UsuariosDAOImpl();

	@Override
	public Usuarios login(String username, String passwrod) {
		// TODO Auto-generated method stub
		return dao.login(username, passwrod);
	}

	@Override
	public Usuarios registerUser(Usuarios usuarios) {
		// TODO Auto-generated method stub
		return dao.registerUser(usuarios);
	}

	@Override
	public List<Usuarios> obtenerUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}

}
