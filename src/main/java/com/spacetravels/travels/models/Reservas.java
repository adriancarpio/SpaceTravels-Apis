package com.spacetravels.travels.models;

import java.io.Serializable;

public class Reservas implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6768371874581726962L;
	
	private Integer id;
	
	private Integer id_usuario;
	
	private Integer id_viajes;
	
	private String fecha;
	
	private String asientoReservados;
	
	public Reservas() {
		
	}

	public Reservas(Integer id, Integer id_usuario, Integer id_viajes, String fecha, String asientoReservados) {
		this.id = id;
		this.id_usuario = id_usuario;
		this.id_viajes = id_viajes;
		this.fecha = fecha;
		this.asientoReservados = asientoReservados;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public Integer getId_viajes() {
		return id_viajes;
	}

	public void setId_viajes(Integer id_viajes) {
		this.id_viajes = id_viajes;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getAsientoReservados() {
		return asientoReservados;
	}

	public void setAsientoReservados(String asientoReservados) {
		this.asientoReservados = asientoReservados;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Reservas [id=" + id + ", id_usuario=" + id_usuario + ", id_viajes=" + id_viajes + ", fecha=" + fecha
				+ ", asientoReservados=" + asientoReservados + "]";
	}
	
	
	
	

}
