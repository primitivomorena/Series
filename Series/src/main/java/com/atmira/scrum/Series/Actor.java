package com.atmira.scrum.Series;

import java.util.ArrayList;

public class Actor {

	private String nombre_actor;
	private String nacionalidad;
	private int edad;

	ArrayList<Personaje> lista_personaje = new ArrayList<Personaje>();

	public Actor(String nombre_actor, String nacionalidad, int edad) {
		this.nombre_actor = nombre_actor;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
	}

	public String getNombre_actor() {
		return nombre_actor;
	}

	public void setNombre_actor(String nombre_actor) {
		this.nombre_actor = nombre_actor;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
