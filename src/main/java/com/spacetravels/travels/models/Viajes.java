package com.spacetravels.travels.models;

import java.io.Serializable;

public class Viajes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String origen;
	private String destino;
	private String nave;
	private String fecha;
	private String precio;
	private String asientoDisponibles;

	public Viajes() {

	}

	public Viajes(Integer id, String origen, String destino, String nave, String fecha, String precio,
			String asientoDisponibles) {
		this.id = id;
		this.origen = origen;
		this.destino = destino;
		this.nave = nave;
		this.fecha = fecha;
		this.precio = precio;
		this.asientoDisponibles = asientoDisponibles;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getNave() {
		return nave;
	}

	public void setNave(String nave) {
		this.nave = nave;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getAsientoDisponibles() {
		return asientoDisponibles;
	}

	public void setAsientoDisponibles(String asientoDisponibles) {
		this.asientoDisponibles = asientoDisponibles;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Viajes [id=" + id + ", origen=" + origen + ", destino=" + destino + ", nave=" + nave + ", fecha="
				+ fecha + ", precio=" + precio + ", asientoDisponibles=" + asientoDisponibles + "]";
	}

}
