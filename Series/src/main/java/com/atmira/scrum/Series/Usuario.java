package com.atmira.scrum.Series;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Usuario {
	private String nombre_usuario;
	private String apellido_usuario;
	private Date nacimiento;
	private String email;
	private List<Serie> listaFavoritos;
	private HashMap<Integer, List<Temporada>> listaTemporada;// <-
																// serie.getId();
	private HashMap<Integer, List<Capitulo>> listaCapitulos;// <-
															// temporada.getId();
	private List<Critica> listaCriticas;

	public Usuario() {
		super();
	}

	public Usuario(String nombre_usuario, String apellido_usuario, Date nacimiento, String email,
			List<Serie> listaFavoritos, HashMap<Integer, List<Temporada>> listaTemporada,
			HashMap<Integer, List<Capitulo>> listaCapitulos, List<Critica> listaCriticas) {
		super();
		this.nombre_usuario = nombre_usuario;
		this.apellido_usuario = apellido_usuario;
		this.nacimiento = nacimiento;
		this.email = email;
		this.listaFavoritos = listaFavoritos;
		this.listaTemporada = listaTemporada;
		this.listaCapitulos = listaCapitulos;
		this.listaCriticas = listaCriticas;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getApellido_usuario() {
		return apellido_usuario;
	}

	public void setApellido_usuario(String apellido_usuario) {
		this.apellido_usuario = apellido_usuario;
	}

	public Date getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Serie> getListaFavoritos() {
		return listaFavoritos;
	}

	public void setListaFavoritos(List<Serie> listaFavoritos) {
		this.listaFavoritos = listaFavoritos;
	}

	public HashMap<Integer, List<Temporada>> getListaTemporada() {
		return listaTemporada;
	}

	public void setListaTemporada(HashMap<Integer, List<Temporada>> listaTemporada) {
		this.listaTemporada = listaTemporada;
	}

	public HashMap<Integer, List<Capitulo>> getListaCapitulos() {
		return listaCapitulos;
	}

	public void setListaCapitulos(HashMap<Integer, List<Capitulo>> listaCapitulos) {
		this.listaCapitulos = listaCapitulos;
	}

	public List<Critica> getListaCriticas() {
		return listaCriticas;
	}

	public void setListaCriticas(List<Critica> listaCriticas) {
		this.listaCriticas = listaCriticas;
	}

}
