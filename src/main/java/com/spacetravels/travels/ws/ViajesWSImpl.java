package com.spacetravels.travels.ws;

import java.util.List;

import javax.jws.WebService;

import com.spacetravels.travels.dao.ViajesDAO;
import com.spacetravels.travels.dao.impl.ViajesDAOImpl;
import com.spacetravels.travels.models.Viajes;


@WebService(endpointInterface = "com.spacetravels.travels.ws.ViajesWS")
public class ViajesWSImpl implements ViajesWS {
	
	private ViajesDAO dao = new ViajesDAOImpl();

	@Override
	public Viajes crearViaje(Viajes viajes) {
		
		return dao.crearViaje(viajes);
	}

	@Override
	public List<Viajes> obtenerTodosViajes() {
		
		return dao.obtenerTodosViajes();
	}

	@Override
	public List<Viajes> obtenerTodosViajesOrigen(String origen) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Viajes> obtenerTodosViajesDestino(String destino) {
		// TODO Auto-generated method stub
		return null;
	}

}
