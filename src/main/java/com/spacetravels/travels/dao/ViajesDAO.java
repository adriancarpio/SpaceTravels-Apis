package com.spacetravels.travels.dao;

import java.util.List;

import com.spacetravels.travels.models.Viajes;

public interface ViajesDAO {
	
	String INSERT = "INSERT INTO space_travels.viajes ( origen, destino, nave, fecha, precio, asiento_disponibles) \r\n"
			+ "VALUES( ?, ?, ?, ?, ?, ?)";
	
	String SELECT = "select * from viajes";
	
	public Viajes crearViaje(Viajes viajes);
	
	public List<Viajes> obtenerTodosViajes();
	
	public List<Viajes> obtenerTodosViajesOrigen(String origen);
	
	public List<Viajes> obtenerTodosViajesDestino(String destino);

}
