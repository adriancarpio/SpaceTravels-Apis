package com.spacetravels.travels.ws.reservas;

import java.util.List;

import javax.jws.WebService;

import com.spacetravels.travels.models.Reservas;

@WebService
public interface ReservasWS {
	
public Reservas crearReserva(Reservas reservas);
	
	public List<Reservas> obtenerTodasReservas();
	
	public List<Reservas> obtenerTodasReservasID(String id);
	
	public List<Reservas> obtenerTodasReservasIDUsuario(String id_usuario);

}
