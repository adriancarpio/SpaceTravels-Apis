package com.spacetravels.travels.ws;

import java.util.List;

import javax.jws.WebService;

import com.spacetravels.travels.models.Viajes;

@WebService
public interface ViajesWS {
	
public Viajes crearViaje(Viajes viajes);
	
	public List<Viajes> obtenerTodosViajes();
	
	public List<Viajes> obtenerTodosViajesOrigen(String origen);
	
	public List<Viajes> obtenerTodosViajesDestino(String destino);

}
