package com.spacetravels.travels.dao;

import java.util.List;

import com.spacetravels.travels.models.Reservas;


public interface ReservasDAO {
	
	String INSERT_RESERVAS = "INSERT INTO space_travels.v_reservados (id_usuario, id_viajes, fecha, asientos_reservados) VALUES(?, ?, ?, ?)";
	
    public Reservas crearReserva(Reservas reservas);
	
	public List<Reservas> obtenerTodasReservas();
	
	public List<Reservas> obtenerTodasReservasID(String id);
	
	public List<Reservas> obtenerTodasReservasIDUsuario(String id_usuario);

}
