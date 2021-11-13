package com.spacetravels.travels.models;

import java.io.Serializable;

public class Usuarios implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7669500400622623950L;

	private Integer id;

	private String nombre;

	private String apellidos;
	
	private String usuario;
	
	private String password;
	
	private String email;

	private String telefono;
	
	public Usuarios() {
		
	}

	public Usuarios(Integer id, String nombre, String apellidos, String usuario, String password, String email,
			String telefono) {
	
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.usuario = usuario;
		this.password = password;
		this.email = email;
		this.telefono = telefono;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", usuario=" + usuario
				+ ", password=" + password + ", email=" + email + ", telefono=" + telefono + "]";
	}
	
	

}
