package com.spacetravels.travels.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.spacetravels.travels.dao.ViajesDAO;
import com.spacetravels.travels.dao.connection.MariaDBConnection;
import com.spacetravels.travels.models.Viajes;

public class ViajesDAOImpl implements ViajesDAO {
	
	private static List<Viajes> viajesList = new ArrayList<Viajes>();
	
	private MariaDBConnection mariaDBConnection = new MariaDBConnection();
    
	Date date = new Date();
	
	@Override
	public Viajes crearViaje(Viajes viajes) {
		try {
			Connection connection = mariaDBConnection.getConnection();
			
			PreparedStatement statement = connection.prepareStatement(INSERT);
			
			statement.setString(1, viajes.getOrigen());
			statement.setString(2, viajes.getDestino());
			statement.setString(3, viajes.getNave());
			statement.setString(4, new SimpleDateFormat("dd-MM-yyyy").format(date));
			statement.setString(5, viajes.getPrecio());
			statement.setString(6, viajes.getAsientoDisponibles());
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return viajes;
	}

	@Override
	public List<Viajes> obtenerTodosViajes() {
		viajesList.clear();
		Viajes viajes  = null;
		Connection connection;
		try {
			connection = mariaDBConnection.getConnection();
			
			Statement stmt = connection.createStatement();
			
			ResultSet resultado = stmt.executeQuery(SELECT);
			
			while (resultado.next()) {
				viajes  = new Viajes();
				viajes.setId(resultado.getInt("id"));
				viajes.setOrigen(resultado.getString("origen"));
				viajes.setDestino(resultado.getString("destino"));
				viajes.setNave(resultado.getString("nave"));
				viajes.setFecha(resultado.getString("fecha"));
				viajes.setPrecio(resultado.getString("precio"));
				viajes.setAsientoDisponibles(resultado.getString("asiento_disponibles"));
				viajesList.add(viajes);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return viajesList;
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
