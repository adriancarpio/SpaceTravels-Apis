package com.spacetravels.travels.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.spacetravels.travels.dao.ReservasDAO;
import com.spacetravels.travels.dao.connection.MariaDBConnection;
import com.spacetravels.travels.models.Reservas;

public class ReservasDAOImpl implements ReservasDAO {
	
	private MariaDBConnection mariaDBConnection = new MariaDBConnection();
	
	Date date = new Date();

	@Override
	public Reservas crearReserva(Reservas reservas) {
		try {
			Connection connection = mariaDBConnection.getConnection();
			
			PreparedStatement statement = connection.prepareStatement(INSERT_RESERVAS);
			
			statement.setInt(1, reservas.getId_usuario());
			statement.setInt(2, reservas.getId_viajes());
			statement.setString(3, new SimpleDateFormat("dd-MM-yyyy").format(date));
			statement.setString(4, reservas.getAsientoReservados());
			statement.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return reservas;
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
