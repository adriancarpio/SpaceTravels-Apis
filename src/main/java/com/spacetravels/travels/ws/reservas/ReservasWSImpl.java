package com.spacetravels.travels.ws.reservas;

import java.util.List;

import javax.jws.WebService;

import com.spacetravels.travels.dao.ReservasDAO;
import com.spacetravels.travels.dao.impl.ReservasDAOImpl;
import com.spacetravels.travels.models.Reservas;

@WebService(endpointInterface = "com.spacetravels.travels.ws.reservas.ReservasWS")
public class ReservasWSImpl implements ReservasWS{
	
	private ReservasDAO dao = new ReservasDAOImpl();

	@Override
	public Reservas crearReserva(Reservas reservas) {
		// TODO Auto-generated method stub
		return dao.crearReserva(reservas);
	}

	@Override
	public List<Reservas> obtenerTodasReservas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reservas> obtenerTodasReservasID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reservas> obtenerTodasReservasIDUsuario(String id_usuario) {
		// TODO Auto-generated method stub
		return null;
	}

}
